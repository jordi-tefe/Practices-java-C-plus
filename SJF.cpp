#include<iostream>
using namespace std;

struct process {
    int PID;
    int WT, TT, WL; 
    process *next;
    
    public:
    int getWT() { return WT; }
    int getTT() { return TT; } 
    int getWL() { return WL; }
    void assignTT() { TT = WL + WT; }
};

process *pList = NULL;

void initialize();
void simulate();
void summarize();

void add_process(process *t);
void display() {
    process *temp;
    temp = pList;
    if (pList == NULL)
        cout << "\nempty list\n";
    else {
        while (temp != NULL) {
            cout << endl << temp->WL << " " << temp->WT << " " << temp->TT;
            temp = temp->next;
        }
    }
}

void calculateWTTT();
int main() {
    initialize();
    simulate();
    //summarize();
    display();
    getchar();
}

void initialize() {
    int N;
    cout << "Enter the number of processes: ";
    cin >> N;
    process *temp;
    for (int i = 1; i <= N; i++) {
        temp = new process;
        temp->next = NULL;
        temp->PID = i;
       cout<<"\n enter Work Load(WL)\n";
        cin >> temp->WL;
        add_process(temp);
    }
}

void add_process(process *t) {
    process *temp1;
    temp1 = pList;
    if (pList == NULL)
        pList = t;
    else if (pList->WL > t->WL) {
        t->next = pList;
        pList = t;
    }
    else {
        while (temp1->next != NULL && temp1->next->WL <= t->WL)
            temp1 = temp1->next;
        t->next = temp1->next;
        temp1->next = t;
    }
}

void calculateWTTT() {
    process *temp1, *temp2;
    if (pList == NULL)
        cout << "\nNothing to do.\n";
    else if (pList->next == NULL) {
        pList->WT = 0;
        pList->TT = pList->WL;
    }
    else {
        pList->WT = 0;
        pList->TT = pList->WL;
        temp1 = pList;
        temp2 = temp1->next;
        while (temp2 != NULL) {
            temp2->WT = temp1->WT + temp1->WL;
            temp2->TT = temp2->WT + temp2->WL;
            temp1 = temp2;
            temp2 = temp2->next;
        }
    }
}

void simulate() {
    calculateWTTT();
  cout<<"p w t";
    
}

//Shortest job first(SJF) algorithm C++ Code
#include<iostream>
using namespace std;

struct process{
	int PID;
	int CT,WT,TT,WL,AT;
	process *next;
	public:
	int getWT(){return WT;}
	int getTT(){return TT;} 
	int getWL(){return WL;}
	void assignTT(){TT=WL+WT;}
	
	};
	process *pList=NULL;
	
	void intialize();
	void simulate();
	void sumarize();
	void DEVELOPERS();
	void addlast(process*t);
	void display();
void calculateWTTT();
	int main(){
		DEVELOPERS();
		intialize();
		
		simulate();
//summarize();
display();
 
getchar();
}
void intialize(){
	int N;
	cout<<"enter the no of process\n";
	cin>>N;
	
	process *temp;
	
	for(int i=1;i<=N;i++){
		temp=new process;
		temp->next=NULL;
		temp->PID=i;
		cout<<"\n enter Work Load(WL)\n";
		cin>>temp->WL;
		temp->AT=1;
	//	cout<<"Enter Arrival Time of Each Process(AT)\n";
	//	cin>>temp->AT;
		addlast(temp);
		
	}
}
void addlast(process*t){
	process *temp1;
	temp1=pList;
	if(pList==NULL)
	pList=t;
	else if (pList->next==NULL)
	pList->next=t;
	else
	{
		temp1=pList;
		while(temp1->next!=NULL)
		temp1=temp1->next;
		temp1->next=t;
	}
	
}
void calculateWTTT(){
	process *temp1,*temp2,*temp3;
	if (pList==NULL)
	cout<<"\n nothing to do\n";
	else if (pList->next==NULL){
		pList ->WT=0;
		pList ->TT= pList->WL;
		pList->CT=pList->WL+pList->AT;
	}
	else{
		pList->WT=0;
		pList->CT=1+pList->WL+pList->WT;
		pList->TT=pList->CT-pList->AT;
	
		temp1=pList;
		temp2=temp1->next;
		temp3=temp2->next;
		while (temp3!=NULL){
			if(temp2->WL>temp3->WL){
			int tem =temp2->WL;
				temp2->WL=temp3->WL;
				temp3->WL=tem;
				
				 tem =temp2->TT;
				temp2->TT=temp3->TT;
				temp3->TT=tem;
				
				tem=temp2->AT;
				temp2->AT=temp3->AT;
				temp3->AT=tem;
			
			}
			temp2->CT=temp1->CT+temp2->WL;
			temp2->TT=temp2->CT-temp2->AT;
			temp2->WT=temp2->TT-temp2->WL;
			temp3->CT=temp2->CT+temp3->WL;
		    temp3->TT=temp3->CT-temp3->AT;
		    temp3->WT=temp3->TT-temp3->WL;
				
			temp2 = temp3;
			temp3 = temp3->next;
			
		}
		
	}
}
	void display()	{	
		process *temp;
		temp = pList;
		if (pList ==NULL)
		cout<<"\n empty list";
		else {
			while (temp!= NULL){
				cout<<endl<<temp->CT<<"    "<<temp->WL<<"    "<<temp->WT<<"    "<<temp->TT<<"    "<<temp->AT;
				temp = temp->next;
			}
		}
	}
	void DEVELOPERS(){
	system("cls");
   	cout<<"\n\n\t\t\t--DEVELOPERS-----\n";
	cout<<"\n\n\tNAME------------------------\n";
	cout<<"\n\n\tYORDANOS TEFERI-------------\n";

	cout<<endl;
	system("pause");
	system("cls");
}
void simulate(){
	calculateWTTT();
	cout<<endl<<"CT   WL   WT   TT   AT";
}

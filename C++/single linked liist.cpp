#include<iostream>
using namespace std;
void create();
void display();
void insert_begin();
void insert_end();
void insert_pos();
void delete_begin();
void delete_end();
void delete_pos();
struct node {
    int info;
    node *next;
};
node *start=NULL;
int main()
{
    int choice;
    while(1) {
        cout<<"\n                      MENU\n";
        cout<<"\n 1.Create     \n";
        cout<<"\n 2.Display    \n";
        cout<<"\n 3.Insert at the beginning    \n";
        cout<<"\n 4.Insert at the end  \n";
        cout<<"\n 5.Insert at specified position       \n";
        cout<<"\n 6.Delete from beginning      \n";
        cout<<"\n 7.Delete from the end       \n";
        cout<<"\n 8.Delete from specified position     \n";
        cout<<"\n 9.Exit      \n";
        cout<<"\n--------------------------------------\n";
        cout<<"Enter your choice:\t ";
        cin>>choice;
        switch(choice) {
        case 1:
            create();
            break;
        case 2:
            display();
            break;
        case 3:
            insert_begin();
            break;
        case 4:
            insert_end();
            break;
        case 5:
            insert_pos();
            break;
        case 6:
            delete_begin();
            break;
        case 7:
            delete_end();
            break;
        case 8:
            delete_pos();
            break;
        case 9:
            exit(0);
            break;
        default:
            cout<<"n Wrong Choice:n";
            break;
        }
    }
    return 0;
}
void create()
{
    node *temp,*ptr;
    temp= new node;//(struct node *)malloc(sizeof(struct node));
    if(temp==NULL) {
        cout<<"\nOut of Memory Space:\n";
        exit(0);
    }
    cout<<"\nEnter the data value for the node:\t";
    cin>>temp->info;
    temp->next=NULL;
    if(start==NULL) {
        start=temp;
    } else {
        ptr=start;
        while(ptr->next!=NULL) {
            ptr=ptr->next;
        }
        ptr->next=temp;
    }
}
void display()
{
    node *ptr;
    if(start==NULL) {
        cout<<"\nList is empty:\n";
        return;
    } else {
        ptr=start;
        cout<<"\nThe List elements are:\n";
        while(ptr!=NULL) {
            printf("%d\t",ptr->info );
            ptr=ptr->next ;
        }
    }
}
void insert_begin()
{
    node *temp;
    temp=new node;//(struct node *)malloc(sizeof(struct node));
    if(temp==NULL) {
        cout<<"\nOut of Memory Space:\n";
        return;
    }
    cout<<"\nEnter the data value for the node:\t" ;
    cin>>temp->info;
    temp->next =NULL;
    if(start==NULL) {
        start=temp;
    } else {
        temp->next=start;
        start=temp;
    }
}
void insert_end()
{
    node *temp,*ptr;
    temp= new node;//(struct node *)malloc(sizeof(struct node));
    if(temp==NULL) {
        cout<<"\nOut of Memory Space:\n";
        return;
    }
    cout<<"\nEnter the data value for the node:\t" ;
    cin>>temp->info;
    temp->next =NULL;
    if(start==NULL) {
        start=temp;
    } else {
        ptr=start;
        while(ptr->next !=NULL) {
            ptr=ptr->next ;
        }
        ptr->next =temp;
    }
}
void insert_pos()
{
    node *ptr,*temp;
    int i,pos;
    temp=new node;//(struct node *)malloc(sizeof(struct node));
    if(temp==NULL) {
        cout<<"\nOut of Memory Space:\n";
        return;
    }
    cout<<"\nEnter the position for the new node to be inserted:\t";
    cin>>pos;
    cout<<"\nEnter the data value of the node:\t";
    cin>>temp->info;

    temp->next=NULL;
    if(pos==0) {
        temp->next=start;
        start=temp;
    } else {
        for(i=0,ptr=start; i<pos-1; i++) {
            ptr=ptr->next;
            if(ptr==NULL) {
                cout<<"\nPosition not found:[Handle with care]\n";
                return;
            }
        }
        temp->next =ptr->next ;
        ptr->next=temp;
    }
}
void delete_begin()
{
    node *ptr;
    if(ptr==NULL) {
        cout<<"\nList is Empty.\n";
        return;
    } else {
        ptr=start;
        start=start->next ;
        cout<<"\nThe deleted element is :\t"<<ptr->info;
    delete(ptr);
   }
}
void delete_end()
{
    node *temp,*ptr;
    if(start==NULL) {
        cout<<"\nList is Empty:";
        exit(0);
    } else if(start->next ==NULL) {
        ptr=start;
        start=NULL;
        cout<<"\nThe deleted element is:\t"<<ptr->info;
    delete(ptr);
    } else {
        ptr=start;
        while(ptr->next!=NULL) {
            temp=ptr;
            ptr=ptr->next;
        }
        temp->next=NULL;
        cout<<"\nThe deleted element is:\t"<<ptr->info;
        delete(ptr);
    }
}
void delete_pos()
{
    int i,pos;
    node *temp,*ptr;
    if(start==NULL) {
        cout<<"\nThe List is Empty:\n";
        exit(0);
    } else {
        cout<<"\nEnter the position of the node to be deleted:\t";
        cin>>pos;
        if(pos==0) {
            ptr=start;
            start=start->next ;
            cout<<"\nThe deleted element is:\t"<<ptr->info;
            delete(ptr);
        } else {
            ptr=start;
            for(i=0; i<pos; i++) {
                temp=ptr;
                ptr=ptr->next ;
                if(ptr==NULL) {
                    cout<<"\nPosition not Found:\n";
                    return;
                }
            }
            temp->next =ptr->next ;
            cout<<"\nThe deleted element is:\t"<<ptr->info;
            delete(ptr);
        }
    }
}


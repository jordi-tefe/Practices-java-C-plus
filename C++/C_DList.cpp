//header files
#include<iostream>
#include<cstdio>
#include<cstdlib>
using namespace std;
//define node
struct nod {
   int info;
   struct nod *n;
   struct nod *p;
}*start, *last;
int count = 0;
class c_doublylist {
   public:
      nod *C_node(int);//function that used to create new node
      void insert_begin();//function to insert at the begin
      void insert_end();////function to insert at the end
      void insert_pos();//function to insert at any position
      void delete_pos();//function to delete at any position
      void display();////function that used to display all
      void delete_begin();//function to delete at the begin
      void delete_end();//function to delete at the end
      //function of constracter
      c_doublylist() {
         start = NULL;
         last = NULL;
      }
};
//function that used to create new node
nod* c_doublylist::C_node(int v) {
   count++;
   struct nod *t;
   t = new(struct nod);
   t->info = v;
   t->n = NULL;
   t->p = NULL;
   return t;
}
//function to insert at the begin
void c_doublylist::insert_begin() {
   int v;
   cout<<endl<<"Enter the element to be inserted: ";
   cin>>v;
   struct nod *t;
   t = C_node(v);
   if (start == last && start == NULL) {
      cout<<"Element inserted in empty list"<<endl;
      start = last = t;
      start->n = last->n = NULL;
      start->p = last->p = NULL;
   } else {
      t->n = start;
      start->p = t;
      start = t;
      start->p = last;
      last->n = start;
      cout<<"Element inserted"<<endl;
   }
}
//function to insert at the end
void c_doublylist::insert_end() {
   int v;
   cout<<endl<<"Enter the element to be inserted: ";
   cin>>v;
   struct nod *t;
   t = C_node(v);
   if (start == last && start == NULL) {
      cout<<"Element inserted in empty list"<<endl;
      start = last = t;
      start->n= last->n = NULL;
      start->p = last->p= NULL;
   } else {
      last->n= t;
      t->p= last;
      last = t;
      start->p = last;
      last->n= start;
   }
}
//function of insert at any position
void c_doublylist::insert_pos() {
   int v, pos, i;
   cout<<endl<<"Enter the element to be inserted: ";
   cin>>v;
   cout<<endl<<"Enter the position of element inserted: ";
   cin>>pos;
   struct nod *t, *s, *ptr;
   t = C_node(v);
   if (start == last && start == NULL) {
      if (pos == 1) {
         start = last = t;
         start->n = last->n = NULL;
         start->p = last->p = NULL;
      } else {
         cout<<"Position out of range"<<endl;
         count--;
         return;
      }
   } else {
      if (count < pos) {
         cout<<"Position out of range"<<endl;
         count--;
         return;
      }
      s = start;
      for (i = 1;i <= count;i++) {
         ptr = s;
         s = s->n;
         if (i == pos - 1) {
            ptr->n = t;
            t->p= ptr;
            t->n= s;
            s->p = t;
            cout<<"Element inserted"<<endl;
            break;
         }
      }
   }
}
//function of delete at any position
void c_doublylist::delete_pos() {
   int pos, i;
   nod *ptr, *s;
   if (start == last && start == NULL) {
      cout<<"List is empty, nothing to delete"<<endl;
      return;
   }
   cout<<endl<<"Enter the position of element to be deleted: ";
   cin>>pos;
   if (count < pos) {
      cout<<"Position out of range"<<endl;
      return;
   }
   s = start;
   if(pos == 1) {
      count--;
      last->n = s->n;
      s->n->p = last;
      start = s->n;
      free(s);
      cout<<"Element Deleted"<<endl;
      return;
   }
   for (i = 0;i < pos - 1;i++ ) {
      s = s->n;
      ptr = s->p;
   }
   ptr->n = s->n;
   s->n->p = ptr;
   if (pos == count) {
      last = ptr;
   }
   count--;
   free(s);
   cout<<"Element Deleted"<<endl;
}
//display function
void c_doublylist::display() {
   int i;
   struct nod *s;
   if (start == last && start == NULL) {
      cout<<"The List is empty, nothing to display"<<endl;
      return;
   }
   s = start;
   for (i = 0;i < count-1;i++) {
      cout<<s->info<<"<->";
      s = s->n;
   }
   cout<<s->info<<endl;
}
//function of delete at the begin
void c_doublylist::delete_begin()
{
    struct nod *ptr;
    if(start==NULL) {
        cout<<"\nList is Empty.\n";
        return;
    } else{
    ptr=start;
    	
    	ptr->n->p = last;
      start =ptr->n;
    		free(ptr);
    		cout<<"Element Deleted"<<endl;
    	return ;
    }
}
//function of delet at the end
void c_doublylist::delete_end()
{
    struct nod *temp,*ptr;
    if(start==NULL) {
        cout<<"\nList is Empty:";
        return;
    } else if(start->n ==NULL) {
        ptr=start;
        start=NULL;
        free(ptr);
        cout<<"\nThe deleted element is:\t"<<ptr->info;
    } else {
        ptr=start->n;
        while(ptr->n==last) 
            
            ptr=ptr->n;
        ptr=last;  
        ptr-> p =last;    
        
        cout<<"\nThe element is deleted :\t";
        free(ptr);
    }
}
//main function 
int main() {
   int c;
   c_doublylist cdl;
   while (1){ //perform switch operation {
      cout<<"1.Insert at Beginning"<<endl;
      cout<<"2.Insert at End"<<endl;
      cout<<"3.Insert at Position"<<endl;
      cout<<"4.Delete at Position"<<endl;
      cout<<"5.delete at begin"<<endl;
      cout<<"6.Delete at the end"<<endl;
      cout<<"7.Display List"<<endl;
      cout<<"8.Exit"<<endl;
      cout<<"Enter your choice : ";
      cin>>c;
      switch(c) {
         case 1:
            cdl.insert_begin();
            system("cls");
         break;
         case 2:
            cdl.insert_end();
            system("cls");
         break;
         case 3:
            cdl.insert_pos();
            system("cls");
         break;
         case 4:
            cdl.delete_pos();
            system("cls");
         break;
         case 5:
            cdl.delete_begin();
            system("cls");
         break;
         case 6:
            cdl.delete_end();
            system("cls");
         break;
         case 7:
         	system("cls");
            cdl.display();
         break;
         case 8:
            exit(1);
         default:
            cout<<"Wrong choice"<<endl;
      }//end of switch
  }//end of while loop
   return 0;
}//end of main function

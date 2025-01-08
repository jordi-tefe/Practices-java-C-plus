#include <iostream>
#include<cstdio>
#include<cstdlib>

using namespace std;
  
// class to represent a stack node
class StackNode {
   public:
   int data;
   StackNode* next;
   };
  
StackNode* newNode(int data) {
   StackNode* stackNode = new StackNode();
   stackNode->data = data;
   stackNode->next = NULL;
   return stackNode;
   }
  
int isEmpty(StackNode *root) {
   return !root;
   }
  
int push(StackNode** root, int new_data){
	int i,top;
   StackNode* stackNode = newNode(new_data);
   for(i=0;i<=top;i++)
   cout<<"Enter the data:";
   cin>>stackNode->data;
   stackNode->next = *root;
   *root = stackNode;
   cout<<new_data<<endl;
   }
  
int pop(StackNode** root){
   if (isEmpty(*root))
   return -1;
   StackNode* temp = *root;
   *root = (*root)->next;
   int popped = temp->data;
   free(temp);
  
   return popped;
}
int peek(StackNode* root)
{
   if (isEmpty(root))
   return -1;
   return root->data;
}
  
int main()
{
   StackNode* root = NULL;
   cout<<"Stack Push:"<<push(&root)<<endl;
   cout<<"\nTop element is "<<peek(root)<<endl;
   cout<<"\nStack Pop:"<<endl;
   while(!isEmpty(root)){
   cout<<pop(&root)<<endl;
}
  
cout<<"Top element is "<<peek(root)<<endl;
  
return 0;
}

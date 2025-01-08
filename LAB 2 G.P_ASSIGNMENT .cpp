#include<iostream>
#include <conio.h>
using namespace std;
//DECLARATION OF MENU FUNCTION
int Menu();
//DECLARATION OF INPUT FUNCTION
int Input(int n,int a[]);
//DECLARATION OF SUM FUNCTION
int Sum(int n,int a[]);
//DECLARATION OF PRINT FUNCTION
int Print(int sum);
//DECLARATION OF MATRIX INPUT FUNCTION
int M_Input(int[100][100],int[100][100],int,int);
//DECLARATION OF MATRIX MULTIPLY FUNCTION FUNCTION
int M_Multip(int[100][100],int[100][100],int[100][100],int,int );
//DECLARATION OF MATRIX PRINT FUNCTION
int M_Print(int[100][100],int,int);
//DECLARATION OF STUDENT PROFILE FUNCTION
int Profile();
//DECLARATION OF VARIABLE AND ARRAYS
int sumt,i,n,k,j,R,C;
int M1[100][100],M2[100][100],M[100][100];
int a[100];
int sum=0;
//MAIN FUNCTION
int main(){
//CALL MENU FUNCTION
	Menu();
	
	return 0;
}//END OF MAIN FUNCTION
//MENU FUNCTION
int Menu(){
		int n,a[n],sum;
	    int choice,OP,ch;
     do{ 
         //MENU
         cout<<"\n\n\t\t\t\tMENU";
         cout<<"\n\t\t\t\t----\n";
         cout<<"\t\t\t\t==========================\n";
	     cout<<"\n\n\t\t\t\t1.SUMMUTION OF ARRAY";
	     cout<<"\n\n\t\t\t\t2.PRODUCT OF MATRIX";
	     cout<<"\n\n\t\t\t\t3.PROFILE\n";
	     cout<<"\t\t\t\t==========================\n";
		 cout<<"ENTER YOUR CHOICE:";
	     cin>>OP;
	      system("cls");
	     switch(OP){
	     	
	     	case 1:
	         do{
	         	 //INNER MENU
	         	 cout<<"\t\t\t\t==========================\n";
	             cout<<"\n\t\t\t\t1.INPUT\n";
	             cout<<"\n\t\t\t\t2.SUM\n";
	             cout<<"\n\t\t\t\t3.PRINT\n";
	             cout<<"\n\t\t\t\t4.BACK TO MENU\n";
	             cout<<"\t\t\t\t==========================\n";
	             cout<<"\nENTER YOUR CHOICE:";
	             cin>>choice;
	             system("cls");
	             switch(choice){
	     	case 1:
	     		//array size
	     		 cout<<"\n ENTER ARRAY SIZE=";
                 cin>>n;
			     Input(n,a);
			     system("cls");
	     	     break;
	     	case 2:
			     sumt=Sum(n,a);
	     	     system("cls");
	     	     break;
	     	case 3: 
	     	
			     Print(sumt);
			          break;
			case 4: Menu();
			         break;
			}//END OF INNER SWITCH
	}
	while(choice!=4);
	system("cls");
				  break;
			case 2:
				do{
					//INNER MENU
				 cout<<"\t\t\t\t==========================\n";
				 cout<<"\n\t\t\t\t\t1.M_INPUT\n";
	             cout<<"\n\t\t\t\t\t2.M_MULTIPLICATION\n";
	             cout<<"\n\t\t\t\t\t3.M_PRINT\n";
	             cout<<"\n\t\t\t\t\t4.BACK TO MENU\n";
	             cout<<"\t\t\t\t==========================\n";
	             cout<<"ENTER YOUR CHOICE:";
	             cin>>ch;
	             system("cls");
	               switch(ch){
	               	case 1:
	               		cout<<"INPUT ROW=";
	                    cin>>R;
	                    cout<<"INPUT COLUMN=";
	                    cin>>C;
	                    M_Input(M1,M2,R,C);
	                     system("cls");
	                     break;
	                case 2:
	                	M_Multip(M1,M2,M,R,C );
	                	 system("cls");
	                	 break;
	                case 3:
	                	 system("cls");
	                	 M_Print(M,R,C);
	                     break;
	                case 4:
	                	 system("cls");
	                	 Menu();
	                	 break;
				   }//END OF INNER SWITCH
		        }
		        while(ch!=4);
		        break;
		     case 3:
			     system("cls"); 
			     Profile();
		     	  break;
		        
         }//END OF OUTER SWITCH 
     }
         while(OP!=3);
}
//INPUT FUNCTION
int Input(int n,int a[]){
    //use single for loop
	     for(i=0;i<n;i++){
	     	 cout<<"\nENTER ELEMENTS OF ARRAY["<<i+1<<"]:";
		     cin>>a[i];
	}
	return a[n];
}
//SUM FUNCTION
int Sum(int n,int a[]){
	    //use single for loop 
	     for(i=0;i<n;i++){
		     sum+=a[i];
            
		 }
     return sum;
}
//PRINT SUM FUNCTION
int Print(int sum){
	 cout<<"\nTHE SUMUTION OF THE GIVEN ARRAY ELEMENTS=="<<sum<<endl;
     }//end of the print function
//INPUT MATRIX FUNCTION 
int M_Input(int M1[100][100],int M2[100][100],int R,int C){
         for(i=0;i<R;i++){
             for(j=0;j<C;j++){
             	  cout<<" ENTER THE SECOND MATRIX OF ELEMENTS:["<<i+1<<"]["<<j+1<<"]:";
                  cin>>M1[i][j];
                     }
                 }
                 cout<<endl;
         for(i=0;i<R;i++){
             for(j=0;j<C;j++){
             	  cout<<" ENTER THE SECOND MATRIX OF ELEMENTS:["<<i+1<<"]["<<j+1<<"]:";
                  cin>>M2[i][j];
                     }
                 }
}//end of the Input  function
//MULTIPLE FUNCTIION
int M_Multip(int M1[100][100],int M2[100][100],int M[100][100],int R,int C ){
	  cout<<"MULTIPLY OF THE MATRIX=\n";
         for(i=0;i<R;i++){
             for(j=0;j<C;j++){	
                 M[i][j]=0;
                  for(k=0;k<C;k++){
                     M[i][j]+=M1[i][k]*M2[k][j];
                         }//end of the third for loop
                      }//end of the second for loop
                 }//end of the first for loop
            return M[i][j];
}//end of the M_Multiple function
//PRINT MATRIX FUNCTION
int M_Print(int M[100][100],int R,int C){
	//for printing result
         for(i=0;i<R;i++){
             for(j=0;j<C;j++){
                 cout<<M[i][j]<<"\t";
				     }//end of the second for loop
				     cout<<endl;
                 }//end of the first for loop
                 cout<<endl;

}//end of the M_Print function
//STUDENT PROFILE FUNCTION
int Profile(){
	cout<<"\n\n\tNAME------------------------Assignment\n";
	cout<<"\n\n\tYORDANOS TEFERI-------------\n";

	cout<<endl;
}//END OF PROFILE FUNCTION


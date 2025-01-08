#include<iostream>//header file
#include <ctime>//header file for sleep
#include <windows.h>//heder file for secret number
#include <conio.h>//header get()
using namespace std;
//struct player 1
struct player1 { 
  int info1; 
  int boundary1;
  player1 *next;
  player1 *prev;
   
};
player1*start1=NULL;
player1*last1=NULL;
//struct player 2
struct player2 { 
  int info2; 
  int boundary2;
  player2 *next;
  player2 *prev;
};
player2 *start2=NULL;
player2 *last2=NULL;
//Declaration and initializing the variables
int TD1,TD2;
float PA1,PA2,PT1,PT2,PA1_Sum,PA1_S,PA2_Sum,PA2_S,G_P1,G_P2;
int max_num_1=0,max_num_2=0;
int Arr_1[5],Arr_2[5],n=0;
int data_1=0,data_2=0;

///Declaration of Menu function 
int Menu();
void store(int data_1,int data_2){
	cout<<"!!!!!!!!!!!!!!!!!!!!!!!!!!!"<<n<<endl;
	Arr_1[n]=data_1;
	Arr_2[n]=data_2;
	++n;
}	

//Difficult Game level function
int DIFFICULTGAME(){
	//secret number
		srand(time(0));
		int Sn = 1 + (rand() % 100);
		//declaration and initializing variables
		int i,T=0,chance=2;
		last1=NULL;
		//if statement  
		for(i=2;i>0;i--){
			//PLAYER 1 PREVIOUS
			if(chance!=0){

		if(last1!=NULL){
			cout<<"question of a player 1:>="<<last1->boundary1<<endl;
	     if (Sn>=last1->boundary1){
   	         cout<<"Answer of the computer is yes!! "<<endl; 
         }
         else {
             cout<<"Answer of the computer is No!!"<<endl;
         }
               cout<<"guess of a player :"<<last1->info1<<endl;
               cout<<chance<<"----chance left"<<endl;
      }
         else{
	         cout<<"NO,Prev"<<endl;
     }
 }

   
//player 1 
//CREATE NODE
    player1 *ptr=new player1;
    //input Boundary
    	cout<<"Player 1 please Enter the boundary:";
    cin>>ptr->boundary1;
    //compared boundary with secret no
    if (Sn>=ptr->boundary1){
   	cout<<"yes!!It is greater than or equal to-> "<<ptr->boundary1<<endl; 
   }
   else {
   cout<<"No!!it is less than->"<<ptr->boundary1<<endl;
}
//input guess number 
    cout<<"\nEnter ur guess no:\t";
    cin>>ptr->info1;
     if(ptr->info1<1 || ptr->info1>100){
    	cout<<"Your Number is out of scale Please Enter B/n 1-100!!!\n";
    	break;
}
//summation of total difference
    TD1+=Sn-ptr->info1;
    //maximum guess No of player 1
    if(max_num_1<ptr->info1){
			max_num_1=ptr->info1;
		}
		data_1=ptr->info1;

//store data
    if (last1 == NULL)
    {
        start1 = last1 = ptr;
        last1->next = NULL;
        last1->prev = NULL;
    }
    else 
    {
        ptr->prev = last1;
        ptr->next = NULL;
        last1->next = ptr;
        last1 = ptr;   
    }
    //compare guess no with secret no
    if (ptr->info1==Sn){
    	cout<<"\nRIGHT!!!!!!!!['__']" ;
	}
	else{
		cout<<"\nWRONG!!!!!!!!['-']\n";
			Sleep(500);
		}

		system("cls");
//Player 2 & previous
//Player 2 previous
if(chance!=0){
	if(last2!=NULL){
			cout<<"question of a player 2:>="<<last2->boundary2<<endl;
	 if (Sn>=last2->boundary2){
   	cout<<"Answer of the computer is yes!! "<<endl; 
   }
   else {
   cout<<"Answer of the computer is No!!"<<endl;
}
    cout<<"guess of a player :"<<last2->info2<<endl;
    cout<<chance<<"----chance left"<<endl;
}
   else{
	cout<<"NO,Prev"<<endl;
}
}

//Player 2
//CREATE NODE
		player2 *temp=new player2;
		
    	cout<<"Player 2 please Enter the boundary:";
        cin>>temp->boundary2;

        chance--;
        T++;
        
    if (Sn>=temp->boundary2){
   	cout<<"yes!!It is greater than or equal to "<<temp->boundary2<<endl; 
   }
   else {
   cout<<"No!!it is less than"<<temp->boundary2<<endl;
}
    cout<<"\nEnter ur guess no:\t";
    cin>>temp->info2;
     if(temp->info2<1 || temp->info2>100){
    	cout<<"Your Number is out of scale Please Enter B/n 1-100!!!\n";
    	break;
}
//summation of total difference

    TD2+=Sn-temp->info2;
    //maximum guess No of player 2
    if(max_num_2<temp->info2){
    	max_num_2=temp->info2;
	}
	data_2=temp->info2;
	//function to store linked list data in to array
	store(data_1,data_2);

    if (last2 == NULL)
    {
        start2 = last2 = temp;
        last2->next = NULL;
        last2->prev = NULL;
    }
    else 
    {
        temp->prev = last2;
        temp->next = NULL;
        last2->next = temp;
        last2 = temp;   
    }
    //performance in trail
    PT1=(100-((T/2)*100));
	PT2=(100-((T/2)*100));
	//performance in accuracy player 1
				for(i=1;i<max_num_1;++i){
			PA1_S+=(-((Sn-max_num_1)*Sn+Sn));
		}
		PA1_Sum=(TD1/PA1_S)*100;
		PA1=100-PA1_Sum;
		////performance in accuracy player 2
			for(i=1;i<max_num_2;++i){
			PA2_S+=(-((Sn-max_num_2)*Sn+Sn));
		}
		PA2_Sum=(TD1/PA2_S)*100;
		PA2=100-PA2_Sum;
		//Guessing Performance
		G_P1=(PT1+PA1)/2;
		G_P2=(PT2+PA2)/2;

    system("cls");
    //end of a game if player 2 win the gamme
      if (temp->info2==Sn){
    	cout<<"\nRIGHT!!!!!!!!['__']" ;
    		if(last2->info2==Sn){
		cout<<"THE WINNER IS PLAYER 2!!!!!---with[__"<<G_P2<<"%__]Guessing Performance"<<endl;
		cout<<"The secret Number is="<<Sn<<endl;
			cout<<"Total Diff player 1="<<TD1<<"& Secret Number->"<<Sn<<endl;
				cout<<"Total Diff player 2="<<TD2<<"& Secret Number->"<<Sn<<endl;
				cout<<"Total Trail="<<T<<endl;
				cout<<"Max guess number:->"<<max_num_1<<endl;
				cout<<"Max guess number:->"<<max_num_2<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA1<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA2<<endl;
				cout<<"guess Performance of player 1->"<<G_P1<<"%"<<endl;
				cout<<"guess Performance of player 2->"<<G_P2<<"%"<<endl;
				cout<<"Performance in trail="<<PT1<<endl;
				cout<<"Performance in trail="<<PT2<<endl;

		cout<<"------GAME OVER--------\n";
		system("pause");
		chance=0;
		break;
}

	}
	else{
		cout<<"\nWRONG!!!!!!!!['-']\n";
			Sleep(500);
		}

		system("cls");
		//end of if chance is 0
			if(chance==0){
				cout<<"Total Diff player 1="<<TD1<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Diff player 2="<<TD2<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Trail="<<T<<endl;
			    PT1=(100-((T/2)*100));
				PT2=(100-((T/2)*100));
				cout<<"Max guess number:->"<<max_num_1<<endl;
				cout<<"Max guess number:->"<<max_num_2<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA1<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA2<<endl;
				cout<<"guess Performance of player 1->"<<G_P1<<"%"<<endl;
				cout<<"guess Performance of player 2->"<<G_P2<<"%"<<endl;
				cout<<"Performance in trail="<<PT1<<endl;
				cout<<"Performance in trail="<<PT2<<endl;
			 cout << "Too much trail!!!\n";
             cout << "Game over!\n";
             cout << "Both of you lose the game with game-performace of player 1 "<< G_P1 <<"%..& player 2 "<<G_P2<<"%.\n";
    system("pause");
     chance=0;
     break;
}
//game over
	if(last1->info1==Sn){
		cout<<"THE WINNER IS PLAYER 1!!!!!---with[__"<<G_P1<<"%__]Guessing Performance"<<endl;
		cout<<"The secret Number is="<<Sn<<endl;
			cout<<"Total Diff player 1="<<TD1<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Diff player 2="<<TD2<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Trail="<<T<<endl;
				cout<<"Max guess number:->"<<max_num_1<<endl;
				cout<<"Max guess number:->"<<max_num_2<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA1<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA2<<endl;
				cout<<"guess Performance of player 1->"<<G_P1<<"%"<<endl;
				cout<<"guess Performance of player 2->"<<G_P2<<"%"<<endl;
				cout<<"Performance in trail="<<PT1<<endl;
				cout<<"Performance in trail="<<PT2<<endl;
		cout<<"------GAME OVER--------\n";
		system("pause");
		chance=0;
		break;
	}

		}
	
}
//medium game level function
int MIDIUMGAME(){
			//secret number
		srand(time(0));
		int Sn = 1 + (rand() % 100);
		//declaration and initializing variables
		int i,T=0,chance=4;
		last1=NULL;
		//if statement  
		for(i=4;i>0;i--){
			//PLAYER 1 PREVIOUS	
			if(chance!=0){

		if(last1!=NULL){
			cout<<"question of a player 1:>="<<last1->boundary1<<endl;
	     if (Sn>=last1->boundary1){
   	         cout<<"Answer of the computer is yes!! "<<endl; 
         }
         else {
             cout<<"Answer of the computer is No!!"<<endl;
         }
               cout<<"guess of a player :"<<last1->info1<<endl;
               cout<<chance<<"----chance left"<<endl;
      }
         else{
	         cout<<"NO,Prev"<<endl;
     }
 }
//player 1
//create node
    player1 *ptr=new player1;
    	cout<<"Player 1 please Enter the boundary:";
    cin>>ptr->boundary1;
    if (Sn>=ptr->boundary1){
   	cout<<"yes!!It is greater than or equal to-> "<<ptr->boundary1<<endl; 
   }
   else {
   cout<<"No!!it is less than->"<<ptr->boundary1<<endl;
}
    cout<<"\nEnter ur guess no:\t";
    cin>>ptr->info1;
     if(ptr->info1<1 || ptr->info1>100){
    	cout<<"Your Number is out of scale Please Enter B/n 1-100!!!\n";
    	break;
}
///summation of total difference
    TD1+=Sn-ptr->info1;
    //maximum guess no of player 1 
     if(max_num_1<ptr->info1){
			max_num_1=ptr->info1;
		}
		data_1=ptr->info1;
		
    if (last1 == NULL)
    {
        start1 = last1 = ptr;
        last1->next = NULL;
        last1->prev = NULL;
    }
    else 
    {
        ptr->prev = last1;
        ptr->next = NULL;
        last1->next = ptr;
        last1 = ptr;   
    }
    if (ptr->info1==Sn){
    	cout<<"\nRIGHT!!!!!!!!['__']" ;
	}
	else{
		cout<<"\nWRONG!!!!!!!!['-']\n";
			Sleep(500);
		}

		system("cls");
//Player 2
//Player 2 prev
if(chance!=0){
	if(last2!=NULL){
			cout<<"question of a player 2:>="<<last2->boundary2<<endl;
	 if (Sn>=last2->boundary2){
   	cout<<"Answer of the computer is yes!! "<<endl; 
   }
   else {
   cout<<"Answer of the computer is No!!"<<endl;
}
    cout<<"guess of a player :"<<last2->info2<<endl;
    cout<<chance<<"----chance left"<<endl;
}
   else{
	cout<<"NO,Prev"<<endl;
}
}


		player2 *temp=new player2;
    	cout<<"Player 2 please Enter the boundary:";
        cin>>temp->boundary2;

        chance--;
        T++;
        
    if (Sn>=temp->boundary2){
   	cout<<"yes!!It is greater than or equal to "<<temp->boundary2<<endl; 
   }
   else {
   cout<<"No!!it is less than"<<temp->boundary2<<endl;
}
    cout<<"\nEnter ur guess no:\t";
    cin>>temp->info2;
     if(temp->info2<1 || temp->info2>100){
    	cout<<"Your Number is out of scale Please Enter B/n 1-100!!!\n";
    	break;
}
   //total difference
    TD2+=Sn-temp->info2;
    //maximum guess no of player 1
     if(max_num_2<temp->info2){
    	max_num_2=temp->info2;
	}
	data_2=temp->info2;
	
	store(data_1,data_2);

    if (last2 == NULL)
    {
        start2 = last2 = temp;
        last2->next = NULL;
        last2->prev = NULL;
    }
    else 
    {
        temp->prev = last2;
        temp->next = NULL;
        last2->next = temp;
        last2 = temp;   
    }
    PT1=(100-((T/4)*100));
	PT2=(100-((T/4)*100));
				for(i=1;i<max_num_1;++i){
			PA1_S+=(-((Sn-max_num_1)*Sn+Sn));
		}
		PA1_Sum=(TD1/PA1_S)*100;
		PA1=100-PA1_Sum;
		//
			for(i=1;i<max_num_2;++i){
			PA2_S+=(-((Sn-max_num_2)*Sn+Sn));
		}
		PA2_Sum=(TD1/PA2_S)*100;
		PA2=100-PA2_Sum;
		G_P1=(PT1+PA1)/2;
		G_P2=(PT2+PA2)/2;
    system("cls");
    //end of a game if player 2 win the game
      if (temp->info2==Sn){
    	cout<<"\nRIGHT!!!!!!!!['__']" ;
    		if(last2->info2==Sn){
		cout<<"THE WINNER IS PLAYER 2!!!!!---with[__"<<G_P2<<"%__]Guessing Performance"<<endl;
		cout<<"The secret Number is="<<Sn<<endl;
			cout<<"Total Diff player 1="<<TD1<<"& Secret Number->"<<Sn<<endl;
				cout<<"Total Diff player 2="<<TD2<<"& Secret Number->"<<Sn<<endl;
				cout<<"Total Trail="<<T<<endl;
				cout<<"Max guess number:->"<<max_num_1<<endl;
				cout<<"Max guess number:->"<<max_num_2<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA1<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA2<<endl;
				cout<<"guess Performance of player 1->"<<G_P1<<"%"<<endl;
				cout<<"guess Performance of player 2->"<<G_P2<<"%"<<endl;
				cout<<"Performance in trail="<<PT1<<endl;
				cout<<"Performance in trail="<<PT2<<endl;
		cout<<"------GAME OVER--------\n";
		system("pause");
	chance=0;
		break;
}
	}
	else{
		cout<<"\nWRONG!!!!!!!!['-']\n";
			Sleep(500);
		}

		system("cls");
		//end of if chance is 0
			if(chance==0){
				cout<<"Total Diff player 1="<<TD1<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Diff player 2="<<TD2<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Trail="<<T<<endl;
				cout<<"Max guess number:->"<<max_num_1<<endl;
				cout<<"Max guess number:->"<<max_num_2<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA1<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA2<<endl;
				cout<<"guess Performance of player 1->"<<G_P1<<"%"<<endl;
				cout<<"guess Performance of player 2->"<<G_P2<<"%"<<endl;
				cout<<"Performance in trail="<<PT1<<endl;
				cout<<"Performance in trail="<<PT2<<endl;
			 cout << "Too much trail!!!\n";
             cout << "Game over!\n";
             cout << "Both of you lose the game with game-performace of player 1 "<< G_P1<<"%..& player 2 "<<G_P2<<"%.\n";
    system("pause");
    chance=0;
    break;
}
//end of a game if player 1 win the game
	if(last1->info1==Sn){
		cout<<"THE WINNER IS PLAYER 1!!!!!---with[__"<<G_P1<<"%__]Guessing Performance"<<endl;
		cout<<"The secret Number is="<<Sn<<endl;
			cout<<"Total Diff player 1="<<TD1<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Diff player 2="<<TD2<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Trail="<<T<<endl;
				cout<<"Max guess number:->"<<max_num_1<<endl;
				cout<<"Max guess number:->"<<max_num_2<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA1<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA2<<endl;
				cout<<"guess Performance of player 1->"<<G_P1<<"%"<<endl;
				cout<<"guess Performance of player 2->"<<G_P2<<"%"<<endl;
				cout<<"Performance in trail="<<PT1<<endl;
				cout<<"Performance in trail="<<PT2<<endl;
		cout<<"------GAME OVER--------\n";
		system("pause");

		break;
	}

		}
	
}
//easy game level function
int EASYGAME(){
	m:
			//secret number
		srand(time(0));
		int Sn = 1 + (rand() % 100);
		//declaration and initializing variables
		int i,T=0,chance=6;
		last1=NULL;
		//if statement  
		for(i=6;i>0;i--){
			//PLAYER 1 PREVIOUS
			if(chance!=0){

		if(last1!=NULL){
			cout<<"question of a player 1:>="<<last1->boundary1<<endl;
	     if (Sn>=last1->boundary1){
   	         cout<<"Answer of the computer is yes!! "<<endl; 
         }
         else {
             cout<<"Answer of the computer is No!!"<<endl;
         }
               cout<<"guess of a player :"<<last1->info1<<endl;
               cout<<chance<<"----chance left"<<endl;
      }
         else{
	         cout<<"NO,Prev"<<endl;
     }
 }
   
//player 1
//create node
    player1 *ptr=new player1;
    	cout<<"Player 1 please Enter the boundary:";
    cin>>ptr->boundary1;
    if (Sn>=ptr->boundary1){
   	cout<<"yes!!It is greater than or equal to-> "<<ptr->boundary1<<endl; 
   }
   else {
   cout<<"No!!it is less than->"<<ptr->boundary1<<endl;
}
    cout<<"\nEnter ur guess no:\t";
    cin>>ptr->info1;
     if(ptr->info1<1 || ptr->info1>100){
    	cout<<"Your Number is out of scale Please Enter B/n 1-100!!!\n";
    	break;
}
//summation of total difference

    TD1+=Sn-ptr->info1;
      if(max_num_1<ptr->info1){
			max_num_1=ptr->info1;
		}
		data_1=ptr->info1;

    if (last1 == NULL)
    {
        start1 = last1 = ptr;
        last1->next = NULL;
        last1->prev = NULL;
    }
    else 
    {
        ptr->prev = last1;
        ptr->next = NULL;
        last1->next = ptr;
        last1 = ptr;   
    }
    if (ptr->info1==Sn){
    	cout<<"\nRIGHT!!!!!!!!['__']" ;
	}
	else{
		cout<<"\nWRONG!!!!!!!!['-']\n";
			Sleep(500);
		}

		system("cls");
//Player 2
//Player 2 prev
if(chance!=0){
	if(last2!=NULL){
			cout<<"question of a player 2:>="<<last2->boundary2<<endl;
	 if (Sn>=last2->boundary2){
   	cout<<"Answer of the computer is yes!! "<<endl; 
   }
   else {
   cout<<"Answer of the computer is No!!"<<endl;
}
    cout<<"guess of a player :"<<last2->info2<<endl;
    cout<<chance<<"----chance left"<<endl;
}
   else{
	cout<<"NO,Prev"<<endl;
}
}

//player 2
//create node
		player2 *temp=new player2;
    	cout<<"Player 2 please Enter the boundary:";
        cin>>temp->boundary2;
//decrement of chance and no of trail
        chance--;
        T++;
        
    if (Sn>=temp->boundary2){
   	cout<<"yes!!It is greater than or equal to "<<temp->boundary2<<endl; 
   }
   else {
   cout<<"No!!it is less than"<<temp->boundary2<<endl;
}
    cout<<"\nEnter ur guess no:\t";
    cin>>temp->info2;
     if(temp->info2<1 || temp->info2>100){
    	cout<<"Your Number is out of scale Please Enter B/n 1-100!!!\n";
    	break;
}
    TD2+=Sn-temp->info2;
      if(max_num_2<temp->info2){
    	max_num_2=temp->info2;
	}
	data_2=temp->info2;
	store(data_1,data_2);

    if (last2 == NULL)
    {
        start2 = last2 = temp;
        last2->next = NULL;
        last2->prev = NULL;
    }
    else 
    {
        temp->prev = last2;
        temp->next = NULL;
        last2->next = temp;
        last2 = temp;   
    }
      PT1=(100-((T/6)*100));
	PT2=(100-((T/6)*100));
				for(i=1;i<max_num_1;++i){
			PA1_S+=(-((Sn-max_num_1)*Sn+Sn));
		}
		PA1_Sum=(TD1/PA1_S)*100;
		PA1=100-PA1_Sum;
		//
			for(i=1;i<max_num_2;++i){
			PA2_S+=(-((Sn-max_num_2)*Sn+Sn));
		}
		PA2_Sum=(TD1/PA2_S)*100;
		PA2=100-PA2_Sum;
		G_P1=(PT1+PA1)/2;
		G_P2=(PT2+PA2)/2;
    system("cls");
      if (temp->info2==Sn){
      	//end of a game if player 2 win the game
    	cout<<"\nRIGHT!!!!!!!!['__']" ;
    	if(last2->info2==Sn){
		cout<<"THE WINNER IS PLAYER 2!!!!!---with[__"<<G_P2<<"%__]Guessing Performance"<<endl;
		cout<<"The secret Number is="<<Sn<<endl;
			cout<<"Total Diff player 1="<<TD1<<"& Secret Number->"<<Sn<<endl;
				cout<<"Total Diff player 2="<<TD2<<"& Secret Number->"<<Sn<<endl;
				cout<<"Total Trail="<<T<<endl;
				cout<<"Max guess number:->"<<max_num_1<<endl;
				cout<<"Max guess number:->"<<max_num_2<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA1<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA2<<endl;
				cout<<"guess Performance of player 1->"<<G_P1<<"%"<<endl;
				cout<<"guess Performance of player 2->"<<G_P2<<"%"<<endl;
				cout<<"Performance in trail="<<PT1<<endl;
				cout<<"Performance in trail="<<PT2<<endl;
		cout<<"------GAME OVER--------\n";
		system("pause");
		break;
}

	}
	else{
		cout<<"\nWRONG!!!!!!!!['-']\n";
			Sleep(500);
		}

		system("cls");
		//end of the game if chance is 0
			if(chance==0){
				cout<<"Total Diff player 1="<<TD1<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Diff player 2="<<TD2<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Trail="<<T<<endl;
				cout<<"Max guess number:->"<<max_num_1<<endl;
				cout<<"Max guess number:->"<<max_num_2<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA1<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA2<<endl;
				cout<<"guess Performance of player 1->"<<G_P1<<"%"<<endl;
				cout<<"guess Performance of player 2->"<<G_P2<<"%"<<endl;
				cout<<"Performance in trail="<<PT1<<endl;
				cout<<"Performance in trail="<<PT2<<endl;
			 cout << "Too much trail!!!\n";
             cout << "Game over!\n";
             cout << "Both of you lose the game with game-performace of player 1 "<< G_P1 <<"%..& player 2 "<< G_P2<<"%.\n";
    system("pause");

    break;
}
//end of a game if player 1 win the game
	if(last1->info1==Sn){
		cout<<"THE WINNER IS PLAYER 1!!!!!---with[__"<<G_P1<<"%__]Guessing Performance"<<endl;
		cout<<"The secret Number is="<<Sn<<endl;
			cout<<"Total Diff player 1="<<TD1<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Diff player 2="<<TD2<<"Secret Number->"<<Sn<<endl;
				cout<<"Total Trail="<<T<<endl;
				cout<<"Max guess number:->"<<max_num_1<<endl;
				cout<<"Max guess number:->"<<max_num_2<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA1<<endl;
				cout<<"Performance in accuraccy player 1->"<<PA2<<endl;
				cout<<"guess Performance of player 1->"<<G_P1<<"%"<<endl;
				cout<<"guess Performance of player 2->"<<G_P2<<"%"<<endl;
				cout<<"Performance in trail="<<PT1<<endl;
				cout<<"Performance in trail="<<PT2<<endl;
		cout<<"------GAME OVER--------\n";
		system("pause");

		break;
	}
	
		}
	
}
//functio of developers profile
void DEVELOPERS(){
	system("cls");
   	cout<<"\n\n\t\t\t--DEVELOPERS-----\n";
	cout<<"\n\n\tNAME-----------------------\n";
	cout<<"\n\n\tYORDANOS TEFERI------------\n";
	cout<<endl;
	
	system("pause");
	system("cls");
}
//Menu function
int Menu(){
	int choice;
 while(1){
 	//levels option
 cout<<"\n\n\n\t\t\t----LEVEL-----";
 cout<<"\n\n\t1->DIFFICULT LEVEL\n";
 cout<<"\n\n\t2->MEDIUM LEVEL\n";
 cout<<"\n\n\t3->EASY LEVEL\n";
 cout<<"\n\n\t4->PROFILE \n";
 cout<<"\n\n\t5->EXIT\n";
 cout<<"\nINPUT YOUR CHOICE\n";
 cin>>choice;
 //switch 
 switch(choice){
 	case 1 : DIFFICULTGAME();
 	system("cls");
 	   break;
 	case 2 : MIDIUMGAME();
 	system("cls");
 		break;
 	case 3 : EASYGAME();
 	system("cls");
 		break;
 	case 4 : DEVELOPERS();
 		break;
 	case 5 : exit(0);
 	     Menu();
 		break;

 }
}
	
}
//main function
int main(){
	//intro
	cout << "\n\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n";
	cout << "\t\t@@ _______________________________________________________________________________________ @@\n";
	cout << "\t\t@@|                                           		                                  |@@\n";
	cout << "\t\t@@|                                           		                                  |@@\n";
	cout << "\t\t@@|                                           		                                  |@@\n";
	cout << "\t\t@@|                                           		                                  |@@\n";
	cout << "\t\t@@|                                           		                                  |@@\n";
	cout << "\t\t@@|                                 WELCOME TO                                            |@@\n";
	cout << "\t\t@@|                                                                                       |@@\n";
	cout << "\t\t@@|                             Guess The Numeber Game                                    |@@\n";
	cout << "\t\t@@|                                                                                       |@@\n";
	cout << "\t\t@@|                                                                                       |@@\n";
	cout << "\t\t@@|                                                                                       |@@\n";
	cout << "\t\t@@|                                                                                       |@@\n";
	cout << "\t\t@@|                                                                                       |@@\n";
	cout << "\t\t@@|_______________________________________________________________________________________|@@\n";
	cout << "\t\t@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\n\n\n\t\t\t\t\t";
	cout << "Press any key to continue...";
		getch();
	system("cls");
	cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\tLoading ||||||                                                  | 12% ....";
	Sleep(500);
	system("cls");
	cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\tLoading |||||||||||||||||||||||||||||||||                       | 61% ....";
	Sleep(500);
	system("cls");
	cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\tLoading ||||||||||||||||||||||||||||||||||||||||||||||||        | 95% ....";
	Sleep(500);
	system("cls");
	cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\tLoading ||||||||||||||||||||||||||||||||||||||||||||||||||||||||| 100% \n";
	Sleep(2000);
 system("cls");
//menu function call
	Menu();
	return 0;
	}
	//end of main function



#include<iostream>
using namespace std;



struct resource{
int rid;
int amount;
resource *Free  = NULL;
resource *next= NULL;	
};


resource *totallist= NULL ;  // number of resource type
 resource *freelist = NULL;
  resource *tempresourcelist = NULL; // not used for now, nor total or free
  
  
 struct process { //it contain all the following
 	int pid;
 	resource *needlist  = NULL;  // each single node
 	resource *allocatedlist= NULL; // each single node
 	resource *maxlist= NULL;	// each single linked list node
 	process *next= NULL ;
 	
 };
 
 process *plist = NULL;  // total PROCESS ACESSOR 
 void initialize();
 //adding checkpoint
 void addprocesslist(process *temp); //addibg at the end
 void addlasttotempresourcelist(resource *temp); // related with *tempresourcelist = NULL; //build resource linked list
 void displaysystemstate(); //displaying tables
 void calculateneed();
 void isSafe();
 int n,m; //declared globally b/c of  initialize();
 
 
 
 int main(){ // just invokes
 
 	initialize();	
 	calculateneed();
 	cout<<"\ncurrent system detail is "; 
 	displaysystemstate();
    //isSafe();
 	 
 	return 0;
 	
 	
 }
 

  void addlasttempresourcelist(resource *temp){
 	resource *temp1;
 	temp1 = tempresourcelist;
 	if(temp1==NULL)
 	tempresourcelist=temp;
 	else{
 		while(temp1->next !=NULL)
 		temp1=temp1->next;
 		temp1->next=temp;
	 }
 }//end of this functionn
 
 void addprocesslist(process *temp){
 	process *temp1;
 	temp1 = plist;
 	if(temp1==NULL)
 	plist= temp;
 	else {
 		while(temp1->next!=NULL)
 		temp1=temp1->next;
 		temp1->next=temp;
	 }
 }
 
 
 
 
// void displaysystemstate(){
// 	process *ptemp;
// 	resource *rtemp;
// 	ptemp=plist;
// 	cout<<endl;
// 	cout<<"max list \t"<<"allocated list"<<endl;
// 	for(int i=1; i<=n; n++){
// 		rtemp=ptemp->maxlist;
// 		while (rtemp!=NULL){
// 			cout<<rtemp->amount<<" ";
// 			rtemp=rtemp->next;
//		 }
//		 cout<<"\t\t";
//		 rtemp=ptemp->allocatedlist;
//		 
//		 	while (rtemp!=NULL){
// 			cout<<rtemp->amount<<" ";
// 			rtemp=rtemp->next;
//		 }
//		 
//		 ptemp=ptemp->next;
//		 cout<<endl;
//	 }
// }


void displaysystemstate() {
    process *ptemp = plist;
    resource *rtemp,Free;
    
    cout << "\nNeed list \tMax list \tAllocated list\n";
    
    while (ptemp != NULL) {
        rtemp = ptemp->needlist;
        
        while (rtemp != NULL) {
        	
			
            cout << rtemp->amount << " ";
            rtemp = rtemp->next;
            
        }
        
        cout << "\t\t";
        
        rtemp = ptemp->maxlist;
        while (rtemp != NULL) {
            cout << rtemp->amount << " ";
            rtemp = rtemp->next;
        }
        
        cout << "\t\t";
        
        rtemp = ptemp->allocatedlist;
        while (rtemp != NULL) {
            cout << rtemp->amount << " ";
            rtemp = rtemp->next;
        }
        
        
         
        /*
        Free = freelist->amount; // ptemp->maxlist -ptemp->allocatedlist;
        while (Free != NULL) {
            cout << Free->amount<< " ";
            rtemp = Free->next;
        }
       */
        cout << "\t\t";
        
       
        cout << endl;
         
        ptemp = ptemp->next;
       
    }
     for(int x =1; x<=m; x++){
		
    cout<<"Free resource :="<<freelist->amount<<endl;
    freelist=freelist->next;
}
}
 
 
 void initialize(){
    process *temp;
		resource *currentresource,* allocatedtemp,*totaltemp,*freetemp ;
 	cout<<"\nenter total process ....";
 	cin>>n;
 	cout<<"\nNow enter total resource type...";
 	cin>>m;
 	 for(int x =1; x<=m; x++){
    	cout<<" Enter total number of instances for Resource Type "<<x<<endl;
    totaltemp= new resource;
	totaltemp->rid=x;
	cin>>totaltemp->amount;
	addlasttempresourcelist(totaltemp);
    	
	}
	totallist=tempresourcelist;
   // freelist=new resource;
  //  freelist=tempresourcelist;
	tempresourcelist=NULL;
	
	totaltemp=totallist;
	 	for(int j =1; j<=m; j++){
  
    freetemp= new resource;
	freetemp->rid=j;
freetemp->amount=totaltemp->amount;
 totaltemp=totaltemp->next;	
	addlasttempresourcelist(freetemp);

   
	}
	
		freelist=tempresourcelist;
      
		tempresourcelist=NULL;
		
		
			for(int i = 1; i<=n; i++){
 		cout<<"\nEnter max for process "<<i ;
 		temp = new process;
 		temp->pid=i;
 		
		 totaltemp=totallist;
 	
 		for( int k=1; k<=m;k++){ // build max list
 		cout<<"\nResource type "<<k<<":";
 			currentresource = new resource; // new object unless it takes the previous
 	  max:		cin>>currentresource->amount;
 			
			 if(currentresource->amount>totaltemp->amount)  {
          	cout<<"please enter number less than"<<totaltemp->amount<<endl;
goto max;
		  }
		 
 		addlasttempresourcelist(currentresource);
 		  totaltemp=totaltemp->next;
		 }
		 temp->maxlist=tempresourcelist;
		 tempresourcelist=NULL;
	  	 
		 
		 
		 
		 
		 
		 
		 
		 
		 cout<<endl<<"now insert allocated list";
		 cout<<endl;
		  allocatedtemp= temp->maxlist;
	// freetemp=new resource;

	freetemp=freelist;
		 for( int d=1; d<=m;d++){
		 	currentresource= new resource;
		 	cout<<"enter resourse type  "<<d<<":";
		
			 
	
	alloc :  	cin>>currentresource->amount;
	
	 if((currentresource->amount > allocatedtemp->amount)||(currentresource->amount > freetemp->amount)){
          	cout<<"please enter number less than : "<<allocatedtemp->amount<<" and  free : "<<freetemp->amount<<endl;
        
goto alloc;
		  }
		   else{
		   		freetemp->amount=	freetemp->amount-currentresource->amount;
		   		
		   }
		
	
	
	
		    
		      
		addlasttempresourcelist(currentresource);
		  allocatedtemp=allocatedtemp->next;
		 		freetemp=freetemp->next;
		 }
		 
		 temp->allocatedlist=tempresourcelist;
		 tempresourcelist=NULL;
	
		 //cout<<"Freeeee :="<<freetemp->amount;
		 addprocesslist(temp);
		 
		 
		
	 } 
	
  
 } 

 
// void calculateneed() {
//    process *ptemp = plist;
//    while (ptemp != NULL) {
//        resource *max = ptemp->maxlist;
//        resource *allocated = ptemp->allocatedlist;
//
//        resource *need;
//        resource *needTemp;
//
//
//
//        while (max != NULL && allocated != NULL){
//            resource *newResource = new resource;
//            newResource->rid = max->rid;
//            newResource->amount = max->amount - allocated->amount;
//
//			
//			if(need==NULL){
//			 	needTemp = newResource;	
//			}else{
//				needTemp->next=newResource;
//			}
//           
//            if(need==NULL){
//            	need=needTemp;	
//			}
//            //needTemp = needTemp->next;
//
//            max = max->next;
//            allocated = allocated->next;
//        }
//
//        needTemp= NULL;
//        
//        ptemp->needlist = need;
//        need=NULL;
//
//        ptemp = ptemp->next;
//    }
//}

  void calculateneed() {
 	resource *maxrtemp,*allocatedrtemp,*needtemp,*rtemp;
 	process *ptemp;
 	ptemp=plist;
 	for(int i=1; i<=n; i++){
 	maxrtemp=ptemp->maxlist;
	 allocatedrtemp=ptemp->allocatedlist;
	 for(int k=1; k<=m; k++){
	 rtemp=new resource;
	 rtemp->rid=k;
	 rtemp->amount=maxrtemp->amount-allocatedrtemp->amount;
	 addlasttempresourcelist(rtemp);	
	 maxrtemp=maxrtemp->next;
	 allocatedrtemp=allocatedrtemp->next;
	 }
	 ptemp->needlist=tempresourcelist;
	 tempresourcelist=NULL;
	 ptemp=ptemp->next;
	 
	 
	 
 } 
}
 
 //in initialize before closing the  brace calculateneed yemil fun define arg
 //void calculaateneed(); yemil above int main
//define maxrtemp, allocaatedrtemp, needrtemp 
 


/* void isSafe(){
 	//resource *maxrtemp,*allocatedrtemp,*needtemp,*Work,*FreeR;
 	
 	process *ptemp;
 	ptemp=plist;
 int*  allocation=new int [n];
 int*  Max=new int[n];
 int*  need=new int[n];
 	for(int i=1; i<=n; i++){
 
    
    ptemp->pid = i;
     ptemp->allocatedlist=allocation[i];
     //allocation[i]=plist->allocatedlist;
      ptemp->needlist=need[i];
    ptemp->maxlist= Max[i];
    

}
	  int* work = new int[m];
    bool* finished = new bool[n];
    
    for(int x =1; x<=m; x++){
	
     work[x] = freelist->amount;
     freelist->next;
       
    }
    
	 while(true){
	 bool found = false;
	 
	 while(ptemp != NULL){
        if(!finished[ptemp->pid]){
            bool canfinish= true;
           
			
            
             for(int j = 0; j < m; j++){
             	
                if(need[j] > work[j]){
                    canfinish = false;
                    cout<<"It can not finish .";
                    break;
                }
            }
			if(canfinish){
                found = true;
                //update work and finish
                for(int j = 0; j < m; j++){
                    work[j] += allocation[j];
                }
                finished[ptemp->pid] = true;
                continue;
            }
             }
        ptemp = ptemp->next;
    }
    if(!found){
        //no process exists that can be executed, go to step 4
        goto n;
    
    }
    
}
n:
//step 4
bool safe_state = true;
for(int i = 0; i < n; i++){
    if(!finished[i]){
        safe_state = false;
        break;
    }
}
if(safe_state){
	cout<<"System is in safe state============"<<endl;
    //system is in a safe state
} else {
	cout<<"Not in Safe State+++++++++++++++++"<<endl;
    //wait for resources to become available or terminate some processes
}
				
        
    
}
         
 */

 
 
 
 
 
 
 
 
 
 
 
 
 
 

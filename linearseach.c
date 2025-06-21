#include<stdio.h>
int linearsearch(int*,int,int);
int main(){
	int element;
	int arr[]={15,7,9,25,8,39,54,79};
	int len=sizeof(arr)/sizeof(arr[0]);
	printf("Enter a element\n");
	scanf("%d",&element);
	int k=linearsearch(arr,len,element);
	if(k == -1){
		printf("element is not found\n");
	}else{
		printf("element is  found at index %d\n",k);
	}
	return 0;
}
int linearsearch(int*a,int len ,int element){
//	int result=-1;
	for(int i=0;i<len;i++){
		if(a[i]==element){
			//result=i;
			//break;
			return i;
		}
	}
	return -1;
}

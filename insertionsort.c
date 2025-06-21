#include<stdio.h>
void printArray(int*,int);
void insertionsort(int*,int);
int main(){
	int arr[]={3,5,2,1,7,6};
	int len=sizeof(arr)/sizeof(arr[0]);
	printArray(arr,len);
	insertionsort(arr,len);
	printArray(arr,len);
	return 0;
}
void printArray(int*a,int len){
	for(int i=0;i<len;i++){
		printf("%d\t",a[i]);
	}
	printf("\n");
}
void insertionsort(int*a,int len){
	int temp,j;
	for(int i=1;i<len;i++){
		temp=a[i];
		j=i-1;
		while(j>=0&&a[j]>temp){
			a[j+1]=a[j];
			j--;
		}
	a[j+1]=temp;
	}
}

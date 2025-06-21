#include<stdio.h>
void printArray(int*,int);
void insertion(int*,int);
int main(){
	int arr[]={2,5,1,7,6,9,4};
	int len=sizeof(arr)/sizeof(arr[0]);
	printArray(arr,len);
	insertion(arr,len);
	printArray(arr,len);
	return 0;
}
void printArray(int*a,int len){
	for(int i=0;i<len;i++){
		printf("%d\t",a[i]);
	}
	printf("\n");
}
void insertion(int*a,int len){
	int temp;
	for(int i=1;i<len;i++){
		temp=a[i];
		int j=i-1;
		while(j>=0 && temp<a[j]){
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=temp;
	}
}

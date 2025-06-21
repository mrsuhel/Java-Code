#include<stdio.h>
void swap(int*,int*);
void printArray(int*,int);
void selectionsort(int*,int);
int main(){
	int arr[]={5,7,2,3,8,6};
	int len=sizeof(arr)/sizeof(arr[0]);
	printArray(arr,len);
	selectionsort(arr,len);
	printArray(arr,len);
	return 0;
}
void swap(int*a,int*b){
	int temp=*a;
	*a=*b;
	*b=temp;
}
void printArray(int * a,int len){
	for(int i=0;i<len;i++){
		printf("%d\t",a[i]);
	}
	printf("\n");
}
void selectionsort(int*a,int len){
	int min;
	for(int i=1;i<len;i++){
		min=i-1;
		for(int j=i;j<len;j++){
			if(a[j]<a[min]){
				min=j;
			}
		}
		swap(&a[i-1],&a[min]);
	}
}

#include<stdio.h>
int binearysearch(int*,int,int,int);
int main(){
	//int element;
	int arr[]={2,4,6,8,22,44,78,99,114};
	int element;
	printf("Enter a number\n");
        scanf("%d",&element);
	int len=sizeof(arr)/sizeof(arr[0]);
	int result=binearysearch(arr,0,len-1,element);
	if(result ==-1){
		printf("data not found\n");
	}else{
		printf("data found at index of %d\n",result);
	}
	return 0;
}
int binearysearch(int*a,int si,int li,int element){
		if(si<=li){
			int mid=(si+li)/2;
			if(a[mid]==element){
				return mid;
			}else if(a[mid]<element){
				return binearysearch(a,mid+1,li,element);
			}else{
				return binearysearch(a,si,mid-1,element);
			}
		}
		return -1;
}

#include<stdio.h>
#include<stdlib.h>
int main(int argc,char**agrv,char**envp){
	printf("path=%s\n",getenv("PATH"));
	return 0;
}

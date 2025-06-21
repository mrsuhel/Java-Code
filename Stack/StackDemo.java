import java.util.Scanner;
class StackDemo{
	private int top;
	private int []stack;
	StackDemo(int len){
		top=-1;
		stack=new int[len];
	}
	public boolean push(int data){
		if(top==stack.length-1){
			return false;
		}
		stack[++top]=data;
		return true;
	}
	public int pop(){
		if(top==-1)return -1;
		return stack[top--];
	}
}
class StackDemoTester{
	public static void main(String[] args){
		StackDemo sd=new StackDemo(10);
		sd.push(10);
		sd.push(20);
		sd.push(30);
		int x;
		while((x=sd.pop())!=-1){
			System.out.println(x);
		}
	}
}

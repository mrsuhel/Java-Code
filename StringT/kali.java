class kali{
	public static void main(String[] args){
		String kalibhai="Suhail Shaikh";
		System.out.println(kalibhai);
		char[] ch=kalibhai.toCharArray();
		char temp;
		int i=0,j=ch.length-1;
		while(i<j){
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		kalibhai=new String(ch);
		System.out.println(kalibhai);
	}
}

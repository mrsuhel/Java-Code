class BitwiseOperator{
	public static void main(String[] args){
		int x=64;
		if((x&(x-1))==0){
			int pos=1;
			while(x!=0){
				if((x&1)==1){
					if((pos&1)==1){
						System.out.println("Yes");
					}else{
						System.out.println("no");
					}
				}
				x=x>>1;
				pos++;
			}
		}else{
			System.out.println("No");
		}
	}
}

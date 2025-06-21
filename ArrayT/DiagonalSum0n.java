class DiagonalSum0n{
	public static void main(String[] args){
		int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int pd=0;
		int sd=0;
		for(int i=0;i<a.length;i++){
			pd=pd+a[i][i];
			sd=sd+a[i][a[i].length-1-i];
		}
		System.out.println(pd+" ");
		System.out.println(sd+" ");
	}
}

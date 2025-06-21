class DiagonalSum{
	public static void main(String[] args){
		int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int pd=0;
		int sd=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(i==j){
					pd=pd+a[i][j];
				}
				if(i+j==a.length-1){
					sd=sd+a[i][j];
				}
			}
		}
		System.out.println(pd+" ");
		System.out.println(sd+" ");
	}
}

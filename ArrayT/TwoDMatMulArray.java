class TwoDMatMulArray{
	public static void main(String[] args){
		int[][]a={{3,4,5},{7,2,9}};
		int[][]b={{5,7},{8,4},{2,6}};
		int[][]c=new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				c[i][j]=0;
				for(int k=0;k<3;k++){
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		for(int l=0;l<2;l++){
			for(int m=0;m<2;m++){
				System.out.print(c[l][m]+" ");
			}
			System.out.println();
		}
	}
}

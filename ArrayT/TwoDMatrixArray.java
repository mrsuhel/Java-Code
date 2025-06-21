class TwoDMatrixArray{
	public static void main(String[] args){
		int [][]a={{2,3,5},{7,9,8},{1,4,6}};
		int [][]b={{3,7,10},{11,15,21},{6,4,2}};
		int [][]c=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int k=0;k<3;k++){
			for(int l=0;l<3;l++){
				System.out.print(c[k][l]+" ");
			}
		System.out.println();
		}
	}

}

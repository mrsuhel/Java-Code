class QuickSorting{
        public int lomutoAlgo(int[]a,int low,int high){
                int pivot=high;
                int i=low-1;
                int temp;
               for(int j=low;j<=high;j++){
                        if(a[j]<=a[pivot]){
                                i++;
                                temp=a[j];
                                a[j]=a[i];
                               a[i]=temp;
                        }
                }
                return i;
        }
        public void quickShort(int[]a,int low,int high){
                if(low<high){
                        int pivot=lomutoAlgo(a,low,high);
                        quickShort(a,low,pivot-1);
                        quickShort(a,pivot+1,high);
                }
        }
}
class PrintArrayy{
        public void printArray(int[]a){
                for(int i=0;i<a.length;i++){
                        System.out.print(a[i]+" ");
                }
                System.out.println();
        }
}
class QuickTester{
        public static void main(String[] args){
                int a[]={5,3,4,1,2,8,9,7};
                PrintArrayy pa=new PrintArrayy();
                QuickSorting qs=new QuickSorting();
                pa.printArray(a);
                qs.quickShort(a,0,a.length-1);
              	pa.printArray(a);
	}
}

class SplitString{
	public static void main(String[] args){
		String s="Lucknow/Kanpur/Jaunpur/Barabanki";
		String[] sa=s.split("/");
		for(int i=0;i<sa.length;i++){
			System.out.println(sa[i]);
		}
	}
}

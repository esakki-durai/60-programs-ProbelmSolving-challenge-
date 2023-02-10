class RemDupliArrEle{	
	public static void main(String[] args) {
		int a[]={10,20,30,10,50,20,60};
		int x=0,f=0;
		int[] b=new int[10];
		for(int i=0;i<a.length;i++){
			f=0;
			for(int j=0;j<=x;j++){
				if(b[j]==a[i]){
					f=1;
					break;}}
			if(f==0){
				b[x]=a[i];
				x++;}}
	for(int i=0;i<b.length;i++){
			if(b[i]>0){
				System.out.print(b[i]+" ");
			}}	
}}
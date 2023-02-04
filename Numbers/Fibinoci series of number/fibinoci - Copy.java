class fibinoci{
	public static void main(String[] args) {
		int a=0,b=1,n=10,c;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=n;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;}}}
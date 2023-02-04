class palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int r,sum=0,t=n;
		while(n>0){
			r=n%10;
			sum=sum*10+r;
			n=n/10;}
		if(t==sum){
			System.out.println(t+" "+"is palindrome");}
		else{
			System.out.println(t+" "+"is not palindrome");}}}
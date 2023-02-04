class factorial{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int f=sc.nextInt();
		int num=1,a=f;
		while(f>=1){
			num=num*f;
			f--;}
		System.out.println("The factorial of "+a+" is "+num);}}
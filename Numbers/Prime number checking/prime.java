class prime{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int f=0;
		for(int i=n-1;i>=2;i--){
			if(n%i == 0){
				f=1;
				break;}}


    if (f==0) {
    	System.out.println("The "+n+" is a prime number");}
    else{
    	System.out.println("The "+n+" is  not a prime number");
    }
    }}
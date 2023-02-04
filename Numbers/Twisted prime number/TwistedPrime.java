import java.util.Scanner;
class TwistedPrime{
	public static int rev(int n){
		int r,sum=0;
		while(n>0){
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		return sum;
	}
	public static int CheckPrime(int m){
		int f=0;
		for(int i=m-1;i>=2;i--){
			if(m%i == 0){
				f=1;
				break;}}
		return f;

	}


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int a=sc.nextInt();
	int b=rev(a);
	int x=CheckPrime(a);
	if(x==0){int y=CheckPrime(b);
		if(y==0){
			System.out.println("The "+a+" is TwistedPrime");}
		else{
			System.out.println("The "+a+" is  NOT TwistedPrime");}}	
	else{
		System.out.println("The "+a+" is  NOT TwistedPrime");
	}}}
import java.util.Scanner;
class GCDofNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		int g=0;
		for(int i=1;i<=a&&i<=b;i++){
			if(a%i==0 && b%i==0){g=i;}}
		System.out.println("The gcd of "+a+" , "+b+" is "+g);}}
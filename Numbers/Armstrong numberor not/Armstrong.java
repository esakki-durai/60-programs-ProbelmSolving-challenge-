import java.util.Scanner;
class Armstrong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0,r,t=n;
		while(n>0){
			r=n%10;
			r=r*r*r;
			sum=sum+r;
			n=n/10;}
		if(t==sum){
			System.out.println(t+" "+" is Armstrong number");}
	    else{
	    	System.out.println(t+" "+" is not Armstrong number");}}}
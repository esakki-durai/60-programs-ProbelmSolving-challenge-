import java.util.Scanner;
class FindFactors{
	static void getFactors(int n){
		System.out.println("The factors of "+n+" is");
		for(int i=1;i<=n;i++){
			if(n%i==0)
				System.out.println(i);}}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		getFactors(num);}}

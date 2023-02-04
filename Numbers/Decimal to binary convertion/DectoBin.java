import java.util.Scanner;
class DectoBin{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int size;
		if(n<=15){size=4;}
		else{size=10;}
		int[] bn=new int[size];
		int i=0;
		while(n>0){
			bn[i]=n%2;
			n=n/2;
			i++;}
		for(i=bn.length-1;i>=0;i--){
			System.out.print(bn[i]);
		}}}
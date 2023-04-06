/*The armstrong number is the actual number is equals to the 
reversed number

case:1
Enter the number 
151 
151 is Armstrong number

case:2
Enter the number
234
234 is not Armstrong number

*/

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

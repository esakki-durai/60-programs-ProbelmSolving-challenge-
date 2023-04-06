/*
The automorphic number is autual number's double's last digits is equals the actual number.

case:1
Enter the number :25
25*25=625
25 is the automorphic number


case:2
12*12=144
12 is not automorphic number*/

import java.util.Scanner;
class Automorphic{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int m=n*n;
		int p=m%100;
		if(p==n){System.out.println("The "+n+" is a Automorphic number the "+n+"*"+n+"="+m);}
		else{System.out.println("The "+n+" is NOT Automorphic number the "+n+"*"+n+"="+m);}
	}}

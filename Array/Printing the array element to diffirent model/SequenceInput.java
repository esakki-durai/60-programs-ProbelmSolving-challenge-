/* The program is a array operations in java
   Get a array and enter the specify number(element of a array)
   And printing operation start's a  from entering number to last 
   and printing a numbers in from start's a first number to previous number of entering number    */

import java.util.Scanner;
class SequenceInput{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5};
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				k=i;
				break;}}
		for(int i=k;i<arr.length;i++){
			System.out.print(arr[i]+" ");}
		for(int i=0;i<=k-1;i++){
			System.out.print(arr[i]+" ");}
		}}
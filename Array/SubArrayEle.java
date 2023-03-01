import java.util.*;
class SubArrayEle{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9};
		System.out.println("Enter the sum");
		int f=0;
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==n)
					System.out.println(arr[i]+"+ "+arr[j]+"= "+n);f=1;}}
		if(f==0)
			System.out.println("The sum of elements in not found");
		}}
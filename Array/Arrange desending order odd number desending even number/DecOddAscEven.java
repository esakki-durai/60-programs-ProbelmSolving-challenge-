import java.util.Scanner;
class DecOddAscEven{
	static int[] Assending(int[] m,int z){
		int[] x=new int[10];
		int j=0;
		for(int i=0;i<z;i++){
			if(m[i]%2==0){
					x[j]=m[i];
				    j++;}}
		return x;
	}
	static int[] desending(int[] m,int z){
		int[] y=new int[10];
		int j=0;
		for(int i=0;i<z;i++){
			if(m[i]%2 !=0){
				y[j]=m[i];
			    j++;}}
	    return y;
	}

	public static void main(String[] args) {
		int [] arr=new int[10];
		Scanner bc=new Scanner(System.in);
		System.out.println("Enter the number of element in a Array");
		int n=bc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter"+i+" th element");
			arr[i]=bc.nextInt();}
			int[] even=new int[10];
		    even=Assending(arr,n);
		    int[] odd=new int[10];
		    odd=desending(arr,n);
		    System.out.println();
		for(int i=odd.length-1;i>=0;i--){
			if(odd[i]!=0){
			System.out.print(odd[i]+" ,");}}
		for(int i=0;i<even.length;i++){
			if(even[i]!=0){
			System.out.print(even[i]+" ,");}}


	}}
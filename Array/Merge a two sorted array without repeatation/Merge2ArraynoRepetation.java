import java.util.*;
class Merge2ArraynoRepetation{
	public static void main(String[] args) {
		int[] c=new int[20];
		int a[]={1,2,3,4,5,6};
		int n=a.length;
		int b[]={4,5,6,7,8,9};
		int f=0;
		System.out.println("Enter the highest value of  both array");
		int x=new Scanner(System.in).nextInt();
		for(int i=0;i<a.length;i++){
			c[i]=a[i];}
		for(int i=0;i<b.length;i++){
			f=0;
			for(int j=0;j<n;j++){
				if(b[i]==c[j]){
					f=1;
					break;}}
			if(f==0){
				c[n]=b[i];
			    n++;}}
		 for(int i=0;i<c.length;i++){
        	System.out.print(c[i]+" ");
            if(c[i]==x){break;}}}}
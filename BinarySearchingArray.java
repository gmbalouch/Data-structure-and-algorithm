import java.util.*;
public class BinarySearchingArray {

	public static void main(String[] args) {
	 Scanner ob=new Scanner(System.in);
	
	 try {
		 int a[]= {4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,24,25,26,27,28,29,30,31};
	 
		 System.out.println("Enter no to search from the given array:");
		 int search=ob.nextInt();
	 
		 int s =0; 
		 int e=a.length;
		 
			 
			 for(int i=s; i<e; i++) {
				 int mid=(s+e)/2;
			
				 if(search==a[mid]) {
					 System.out.println("No: is at index:"+ mid);
					e=mid;
				 }
				 else if(search>a[mid]){
					 s=mid;
					 mid=(s+e)/2;
				 }else {
					 e=mid;
					 mid=(s+e)/2;
				 }
			 }
		
	 
	 }catch(Exception ex){
		 System.out.println(ex);
	 }
		  
	}
}

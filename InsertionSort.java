
public class InsertionSort {

	public static void main(String[] args) {
		int a[]= {6,3,5,2,1,8,9};
			int j;
		for(int i=1; i<a.length; i++) {
			j=i-1;
			int key=a[i];
			
			while(j>=0 && key<a[j]) {
				a[j+1]=a[j];
				j=j-1;
				
			}
			a[j+1]=key;
		}
		
		for(int sort: a) {
			System.out.print(sort+" ");
		}
		
		
	}

}

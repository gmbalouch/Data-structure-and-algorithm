
public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {2,4,1,5,3,10,6,7};
		int min=-1;
		int temp=0;
		
		for(int i=0; i<a.length; i++){
			min=i; 
			for(int j=i+1; j<a.length; j++) {
				
				if(a[min]>a[j]) {
					min=j;
				}
			
			}
			
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}

	}

}


public class linearSearch {

	public static void main(String[] args) {
		int elements[]= {3,2,5,6,7,8,4,6,4};
		int search=8;
		int result=search(elements, search);
		if(result!=-1)
			System.out.println("Elements is at index: "+result);
		else
			System.out.println("Elements not found ");
	}
	
	public static int search(int elements[], int search) {
		for(int i=0; i<elements.length; i++) {
			if(search==elements[i]) {
				return i;
			}
		}
		return -1;
	}

}

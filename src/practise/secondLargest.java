package practise;

public class secondLargest {
	
	public static void main(String[] args) {
		
		int[] a = {2,4,6,8,9,3};
		
		//o/p=8
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i+1]);
			break;
		}
		
	}

}

public class SelectionSort {
	public static void main(String[] args) {
		int[] A = new int[] {17,114,10,8,3,1};
		for(int i = 0; i < A.length-1; i++) {
			int min = i;
			for(int j= i+1; j< A.length; j++) {
				if(A[min] > A[j]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = A[i];
				A[i] = A[min];
				A[min] = temp;
		}
		
}
		for(int n: A) {
			System.out.println(n);
		}
		
}
}

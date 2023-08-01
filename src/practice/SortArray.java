package practice;

public class SortArray {
	public static void main(String[] args) {
		int [] arr= {6,9,7,2,4,5,10,12};
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					System.out.print(arr[i]+" ");
				}
			}
		
			}
		
		}
}

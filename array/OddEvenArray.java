package array;

public class OddEvenArray {
	public static void main(String[]args) {
int arr[]= {1,2,3,4,5,6,7,8,9,10};
int count1=1;
int count2=1;
   System.out.println("even number");
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		System.out.print(arr[i]+" ");
		count1=count1*arr[i];
	}
}
    System.out.println();
  System.out.println("odd number");
	for(int j=0;j<arr.length;j++) {
		if(arr[j]%2!=0) {
			System.out.print(arr[j]+" ");
			count2=count2*arr[j];
		}
	}
	System.out.println();
	System.out.println("multiplication of even and odd array:");
	System.out.println("even array multiplication: " +count1);
	System.out.println("odd array multiplication: " +count2);
}
	}




public class TestRevArrStack {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		Stack st =new Stack(5);
		System.out.print("\nBefore using stack to reverse array is : ");
		for (int ele:arr) {
			st.push(ele);
			System.out.print(ele+"	");
		}
		
		for(int i=0;i<5;i++) {
			arr[i]=st.pop();
		}
		
		System.out.print("\nAfter using stack to reverse array is : ");
		for (int ele:arr) {
			System.out.print(ele+"	");
		}
		
	}

}

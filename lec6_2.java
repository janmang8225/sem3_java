public class lec6_2 {
	public static void main(String[] args) {
		int[] arr = {10,15,20,25,30,35,40,45,50,55};
		int[] arr2 = new int[10];
		for(int i=0; i<10; i++)
		{
			if(arr[i]%2 != 0) arr2[i] = (arr[i]*2);
			else arr2[i] = arr[i];
		}
		for(int a : arr2) 
			System.out.println(a);
	}
}

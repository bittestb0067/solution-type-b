package problem01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		int MaxProduct = arr[0] * arr[1];
		int arr2[] = new int[] {arr[0],arr[1]};
		for(int i = 0 ; i < arr.length-1; ++i)
		{
			for(int j = i+1; j < arr.length; ++j)
			{
				if(MaxProduct < arr[i]*arr[j])
				{
					MaxProduct = arr[i]*arr[j];
					arr2[0] = arr[i];
					arr2[1] = arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}

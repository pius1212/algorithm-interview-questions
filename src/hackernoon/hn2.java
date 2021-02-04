package hackernoon;

import java.util.Arrays;
import java.util.Random;

//How do you find the duplicate number on a given integer array?
//assume theres only one duplicate

//solved on 2/4/2021

public class hn2 {
	public static void main(String[] args) {
		int[] x = generateData();

		//ALGORITHM STARTS HERE
		//COMPLEXITY O(N)
		int ans = 0;
		Arrays.sort(x);

		for(int i = 1; i <= x.length; i++){
			if(x[i - 1] == x[i]){
				ans = x[i];
				break;
			}
		}

		System.out.println("Algorithm Answer: " + ans);
	}

	private static int[] generateData(){
		//NOT PART OF THE ALGORITHM, JUST DATA GENERATION
		int[] x = new int[101];

		//get random numbers
		int offset = 0;
		Random r = new Random();
		int duplicate = r.nextInt((100 - 1) + 1) + 1;

		//put values in array
		for(int i = 1; i < x.length; i++){
			x[i - 1 + offset] = i;

			if(i == duplicate){
				offset = 1;
				x[i - 1 + offset] = i;
			}
		}
		//randomize array
		x = shuffleArray(x);

		System.out.println("Duplicate Num: " + duplicate);

		return x;
	}

	//not my code, thanks stack overflow
	private static int[] shuffleArray(int[] array)
	{
		int index;
		Random random = new Random();
		for (int i = array.length - 1; i > 0; i--)
		{
			index = random.nextInt(i + 1);
			if (index != i)
			{
				array[index] ^= array[i];
				array[i] ^= array[index];
				array[index] ^= array[i];
			}
		}

		return array;
	}
}

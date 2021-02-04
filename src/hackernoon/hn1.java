package hackernoon;

import java.util.Random;
import java.util.stream.IntStream;

//completed on 2/4/2021

//How do you find the missing number in a given integer array of 1 to 100?
//assume there's only one missing number.
public class hn1 {
	public static void main(String[] args) {
		int[] x = generateData();

		//ALGORITHM STARTS HERE
		//COMPLEXITY: O(1)
		int ans = 5050 - IntStream.of(x).sum();
		System.out.println("Algorithm 1 Answer: " + ans);

	}

	private static int[] generateData(){
		//NOT PART OF THE ALGORITHM, JUST DATA GENERATION
		int[] x = new int[99];

		//get random numbers
		int offset = 0;
		Random r = new Random();
		int removedNum = r.nextInt((100 - 1) + 1) + 1;

		//put values in array
		for(int i = 1; i <= 100; i++){
			if(i == removedNum){
				offset = 1;
			} else {
				x[(i - 1) - offset] = i;
			}
		}
		//randomize array
		x = shuffleArray(x);
		System.out.println("Removed Number: " + removedNum);

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

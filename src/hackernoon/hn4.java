package hackernoon;

//How do you find all pairs of an integer array whose sum is equal to a given number?
//desc: if an array is {2, 6, 3, 9, 11}, and the given number is 9, it will return {6,3}

import java.util.Random;

public class hn4 {
	public static void main(String[] args) {
		int givenNumber = 10;
		int[] x = generateData(givenNumber);


	}

	//three pairs will be generated
	private static int[] generateData(int givenNumber){
		//NOT PART OF ALGORITHM, JUST DATA CREATION
		int[] x = new int[15];
		Random r = new Random();

		for(int i = 0; i <= 2; i++){
			x[i * 2] = r.nextInt((givenNumber - 1) + 1) + 1;
			x[(i * 2) + 1] = givenNumber - x[i * 2];
			System.out.println("Pair: (" + (r.nextInt((givenNumber - 1) + 1) + 1) + "," + (givenNumber - x[i * 2]) + ")");
		}

		//put values in array
		for(int i = 6; i <= x.length; i++){
			x[i] = (givenNumber - 2) - r.nextInt((givenNumber - 1) + 1) + 1;

			System.out.println("RNGed: " + x[i]);
		}

		return shuffleArray(x);
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

package hackernoon;

//How do you find the largest and smallest number in an unsorted integer array?
//completed on 2/4/21

import java.util.Random;

public class hn3 {
	public static void main(String[] args) {
		int[] x = generateData();

		//ALGORITHM STARTS HERE
		//COMPLEXITY: O(n)
		int min = x[0];
		int max = x[0];

		for(int i : x){
			if(i < min){
				min = i;
			}

			if(i > max){
				max = i;
			}
		}

		System.out.println("Min: " + min + ", Max: " + max);
	}

	private static int[] generateData(){
		//NOT PART OF ALGORITHM, JUST DATA CREATION
		int[] x = new int[30];

		//get random numbers
		Random r = new Random();

		//put values in array
		for(int i = 0; i < x.length; i++){
			x[i] = r.nextInt((100 - 1) + 1) + 1;

			System.out.println("RNGed: " + x[i]);
		}

		return x;
	}
}

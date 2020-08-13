package YEF;

import java.util.*;

public class InternshipQues {

	public static void main(String[] args) {
		
		int arrSize = 10;
		Integer[] result = generateRandom(arrSize);
		System.out.print("Before Sorting : ");
		for(int x : result) {
			System.out.print(x+" ");
		}
		System.out.println();
		Arrays.sort(result);
		System.out.print("After Sorting : ");
		for(int x : result) {
			System.out.print(x+" ");
		}

	}

	private static Integer[] generateRandom(int s) {
		Integer[] ans = new Integer[s];
		Random r = new Random();
		for (int i = 0; i < s; i++) {
			int x = r.nextInt(500);
			if(i>0) {
				if(Arrays.asList(ans).contains(x)) {
					x = r.nextInt(500);
				}
			}
			ans[i] = x;			
		}
		return ans;
	}

}

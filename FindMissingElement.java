package week1.day2.HomeAssignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] findMissingElement = {1,4,3,2,8,6,7};

		Arrays.sort(findMissingElement);

		for (int i = 0; i < findMissingElement.length; i++) {

			if(findMissingElement[i]!=i+1) {
				System.out.println("The missing value is : "+(i+1));
				break;	
			}		

		}
	}
}

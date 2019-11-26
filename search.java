
public class search {
	
	public static int binarySearch(int[] arrayIn, int numIn)
	{
		
		for(int i = 0; i < arrayIn.length; i++)		//Trace what arrayIn is
		{
			System.out.print(arrayIn[i]);
		}
		System.out.println();
		
		int pointerIndex = (arrayIn.length / 2);	//put pointer half way in the array
		
		if(arrayIn[pointerIndex] != numIn && numIn >= arrayIn[0])		//if pointer is not numIn AND if numIn is not less than smallest number
		{
			if(arrayIn[pointerIndex] > numIn)	//If index is greater than numIn, Make a new array with left half of original array, return index
			{
				int[] newArray = new int[(arrayIn.length / 2)];
				
				for(int i = 0; i < newArray.length; i++)
				{
					newArray[i] = arrayIn[i];
				}
				
				return binarySearch(newArray, numIn);	//run binarySearch with the left half of the original array
			}
			else if(arrayIn[pointerIndex] < numIn && numIn <= arrayIn[arrayIn.length -1])	//If index is less than than numIn AND if numIn is not larger than the largest number, 
			{
				int[] newArray = new int[arrayIn.length - pointerIndex];					//Make a new array with right half of original array
				
				for(int i = 0; i < newArray.length; i++)
				{
					newArray[i] = arrayIn[pointerIndex + i];
				}
				return pointerIndex + binarySearch(newArray, numIn);	//run binarySearch with the left half of the original array, return index
			}
		}
		else if(arrayIn[pointerIndex] == numIn)		//if pointer is numIn
		{
			return pointerIndex;
		}
		return -1;	//if number is not found, return -1
	}
	public static void main(String[] args) {
		int[] myArray = new int[] {0, 1, 2, 3, 4, 5, 6};//ARRAY TO SEARCH THROUGH

		
		System.out.println("SOLUTION TO ALL POSSIBILITIES:");
		System.out.println("\n" + -100 + " is in index " + binarySearch(myArray, -100));
		System.out.println("\n" + 0 + " is in index " + binarySearch(myArray, 0));
		System.out.println("\n" + 1 + " is in index " + binarySearch(myArray, 1));
		System.out.println("\n" + 2 + " is in index " + binarySearch(myArray, 2));
		System.out.println("\n" + 3 + " is in index " + binarySearch(myArray, 3));
		System.out.println("\n" + 4 + " is in index " + binarySearch(myArray, 4));
		System.out.println("\n" + 5 + " is in index " + binarySearch(myArray, 5));
		System.out.println("\n" + 6 + " is in index " + binarySearch(myArray, 6));
		System.out.println("\n" + 100 + " is in index " + binarySearch(myArray, 100));

		
	}

}

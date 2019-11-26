
public class search {
	
	public static int binarySearch(int[] arrayIn, int numIn)
	{
		
		for(int i = 0; i < arrayIn.length; i++)
		{
			System.out.print(arrayIn[i]);
		}
		System.out.println();
		
		int pointerIndex = (arrayIn.length / 2);
		
		if(arrayIn[pointerIndex] != numIn)
		{
			if(arrayIn[pointerIndex] > numIn)
			{
				int[] newArray = new int[(arrayIn.length / 2)];
				
				for(int i = 0; i < newArray.length; i++)
				{
					newArray[i] = arrayIn[i];
				}
				
				return binarySearch(newArray, numIn);
			}
			else if(arrayIn[pointerIndex] < numIn)
			{
				int[] newArray = new int[arrayIn.length - pointerIndex];
				
				for(int i = 0; i < newArray.length; i++)
				{
					newArray[i] = arrayIn[pointerIndex + i];
				}
				return pointerIndex + binarySearch(newArray, numIn);
			}
		}
		else if(arrayIn[pointerIndex] == numIn)
		{
			return pointerIndex;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] myArray = new int[] {1, 2, 3, 4, 5, 6, 7};
		int searchNum = 1;
		System.out.println("Searching for " + searchNum + "...");
		
		int solutionIndex = binarySearch(myArray, searchNum);
		System.out.println("\n" + searchNum + " is in index " + solutionIndex);
	}

}

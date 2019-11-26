import java.util.*;
public class MinHeap {
	
	ArrayList<Integer> data;
	
public MinHeap()
{
	
	data = new ArrayList<Integer>();
}

private int getLeft(int index)
{
	return (2 * index) + 1;
}

private int getRight(int index)
{
	return (2 * index) + 2;
}

public void add(int dataIn)	//add function
{
	data.add(dataIn);
	minHeapify();
}

public int remove()		//remove function
{
	int dataOut = data.get(0);
	swap(0, 1);		//swap the first element with the second and delete the first. This works because ArrayLists manage their own data
	data.remove(1);
	minHeapify();	//re organize.
	return dataOut;
}


public int top()	//return number in index 0
{
	return data.get(0);
}

private void minHeapify() {
    int smallestIndex = -1;
    
    //look for the smallest int between everything
    if (getLeft(0) <= data.size() - 1 && data.get(getLeft(0)) < data.get(0)) //look left
    {
    	smallestIndex = getLeft(0);
    } 
    else 
    {
    	smallestIndex = 0;
    }

    if (getRight(0) <= data.size() - 1 && data.get(getRight(0)) < data.get(smallestIndex)) //look right
    {
    	smallestIndex = getRight(0);
    }

    if (smallestIndex != 0) //switch 0 with the smallest found index and go again
    {
        swap(0, smallestIndex);
        minHeapify();
    }
    
    if(data.get(data.size() -1) < data.get(0) )		//if last number is smaller than first, switch them.
    {
    	swap(0, data.size()-1);
    }
}

private void swap(int a, int b) //swap function
{	
    int temp = data.get(b);
    data.set(b, data.get(a));
    data.set(a, temp);
}

public void print()
{

	for (int i = 0; i < data.size(); i++)
	{
		System.out.print(data.get(i) + " ");
	}
	System.out.println();
}

public static void main(String[] args) {
	MinHeap testHeap = new MinHeap();
	MinHeap testHeap2 = new MinHeap();
	
	
	testHeap2.add(13);
	testHeap2.add(16);
	testHeap2.add(41);
	testHeap2.add(51);
	testHeap2.add(100);
	testHeap2.add(41);
	testHeap2.add(31);
	
	
	testHeap.add(3);
	testHeap.add(2);
	testHeap.add(5);
	testHeap.add(6);
	testHeap.add(1);
	testHeap.add(4);
	testHeap.add(0);
	


	
	 System.out.print("TESTING TESTHEAP WITH SMALLER NUMBERS-----------------------------------\n");	
		System.out.print("Heap starting out: ");
		testHeap.print();
		System.out.println("Current size: " + testHeap.data.size() + "\tCurrent top: " + testHeap.top() + "\n");
		
	 
	System.out.println("Removing : " + testHeap.remove());
	testHeap.print();
	System.out.println("Current size: " + testHeap.data.size() + "\tCurrent top: " + testHeap.top() + "\n");
	
	System.out.println("Removing : " + testHeap.remove());
	testHeap.print();
	System.out.println("Current size: " + testHeap.data.size() + "\tCurrent top: " + testHeap.top() + "\n");
	
	System.out.println("Removing : " + testHeap.remove());
	testHeap.print();
	System.out.println("Current size: " + testHeap.data.size() + "\tCurrent top: " + testHeap.top() + "\n");
	
	System.out.println("Removing : " + testHeap.remove());
	testHeap.print();
	System.out.println("Current size: " + testHeap.data.size() + "\tCurrent top: " + testHeap.top() + "\n");
	
	System.out.println("Removing : " + testHeap.remove());
	testHeap.print();
	System.out.println("Current size: " + testHeap.data.size() + "\tCurrent top: " + testHeap.top() + "\n");
	
	System.out.println("Removing : " + testHeap.remove());
	testHeap.print();
	System.out.println("Current size: " + testHeap.data.size() + "\tCurrent top: " + testHeap.top() + "\n");
	
	
	System.out.print("TESTING TESTHEAP WITH LARGER NUMBERS-----------------------------------\n");
	System.out.print("Heap starting out: ");
	 testHeap2.print();
	 System.out.println("Current size: " + testHeap2.data.size() + "\tCurrent top: " + testHeap2.top() + "\n");

	 
	System.out.println("Removing : " + testHeap2.remove());
	testHeap2.print();
	System.out.println("Current size: " + testHeap2.data.size() + "\tCurrent top: " + testHeap2.top() + "\n");
	
	System.out.println("Removing : " + testHeap2.remove());
	testHeap2.print();
	System.out.println("Current size: " + testHeap2.data.size() + "\tCurrent top: " + testHeap2.top() + "\n");
	
	System.out.println("Removing : " + testHeap2.remove());
	testHeap2.print();
	System.out.println("Current size: " + testHeap2.data.size() + "\tCurrent top: " + testHeap2.top() + "\n");
	
	System.out.println("Removing : " + testHeap2.remove());
	testHeap2.print();
	System.out.println("Current size: " + testHeap2.data.size() + "\tCurrent top: " + testHeap2.top() + "\n");
	
	System.out.println("Removing : " + testHeap2.remove());
	testHeap2.print();
	System.out.println("Current size: " + testHeap2.data.size() + "\tCurrent top: " + testHeap2.top() + "\n");
	
	System.out.println("Removing : " + testHeap2.remove());
	testHeap2.print();
	System.out.println("Current size: " + testHeap2.data.size() + "\tCurrent top: " + testHeap2.top() + "\n");


	
	


}

}


import java.util.*;
public class MinHeap {
	ArrayList<Integer> data;
	
	
public MinHeap()
{
	
	data = new ArrayList<Integer>();
}

private int getParent(int index)
{
    if (index % 2 == 1) {
        return index / 2;
    }

    return (index - 1) / 2;
}

private int getLeft(int index)
{
	return (2 * index) + 1;
}

private int getRight(int index)
{
	return (2 * index) + 2;
}

public void add(int dataIn)
{
	data.add(dataIn);
	int i = data.size() - 1;
	int parent = getParent(i);
	
	while(parent != i && data.get(i) < data.get(parent))	
	{
		swap(i, parent);
		i = parent;
		parent = getParent(i);
	}
}

public int remove()
{
	int popped = data.get(1);
	data.set(1, data.get(data.size() - 1) );
	minHeapify(1);
	return popped;
}

public int top()
{
	return data.get(0);
}

private void minHeapify(int i) {

    int left = getLeft(i);
    int right = getRight(i);
    int smallest = -1;

    // find the smallest key between current node and its children.
    if (left <= data.size() - 1 && data.get(left) < data.get(i)) {
        smallest = left;
    } else {
        smallest = i;
    }

    if (right <= data.size() - 1 && data.get(right) < data.get(smallest)) {
        smallest = right;
    }

    // if the smallest key is not the current key then bubble-down it.
    if (smallest != i) {

        swap(i, smallest);
        minHeapify(smallest);
    }
}

private void swap(int i, int parent) {

    int temp = data.get(parent);
    data.set(parent, data.get(i));
    data.set(i, temp);
}

//public void print() 
//{ 
//    for (int i = 1; i <= data.size() / 2; i++) { 
//        System.out.print(" PARENT : " + Heap[i] 
//                         + " LEFT CHILD : " + Heap[2 * i] 
//                         + " RIGHT CHILD :" + Heap[2 * i + 1]); 
//        System.out.println(); 
//} 

public void displayHeap()
{
System.out.print("heapArray: ");    // array format
for(int m=0; m<data.size(); m++)
   if(data.get(m) != null)
      System.out.print( data.get(m) + " ");
   else
      System.out.print( "-- ");
System.out.println();
                                    // heap format
int nBlanks = 32;
int itemsPerRow = 1;
int column = 0;
int j = 0;                          // current item
String dots = "...............................";
System.out.println(dots+dots);      // dotted top line

while(data.size() > 0)              // for each heap item
   {
   if(column == 0)                  // first item in row?
      for(int k=0; k<nBlanks; k++)  // preceding blanks
         System.out.print(' ');
                                    // display item
   System.out.print(data.get(j));

   if(++j == data.size())           // done?
      break;

   if(++column==itemsPerRow)        // end of row?
      {
      nBlanks /= 2;                 // half the blanks
      itemsPerRow *= 2;             // twice the items
      column = 0;                   // start over on
      System.out.println();         //    new row
      }
   else                             // next item on row
      for(int k=0; k<nBlanks*2-2; k++)
         System.out.print(' ');     // interim blanks
   }  // end for
System.out.println("\n"+dots+dots); // dotted bottom line
}  // end displayHeap()



public static void main(String[] args) {
	MinHeap testHeap = new MinHeap();
//	testHeap.add(13);
//	testHeap.add(16);
//	testHeap.add(41);
//	testHeap.add(51);
//	testHeap.add(100);
//	testHeap.add(41);
//	testHeap.add(31);
	
	testHeap.add(0);
	testHeap.add(1);
	testHeap.add(3);
	testHeap.add(4);
	testHeap.add(5);
	testHeap.add(6);
	testHeap.add(2);

	testHeap.minHeapify(0);
	System.out.println(" top of the heap: " + testHeap.top());
	testHeap.displayHeap();
}

}


package sorts;

public class ArrayMethods3 {

	public static void main(String[] args) {
		int[]test1= {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		printIntArray(test1);
		ArrayMethods3.insertionSort(test1);
		System.out.println();
		printIntArray(test1);
		
		System.out.println();
		System.out.println();
		
		double[]test2= {9.8, 7.6, 6.5, 6.5, 3.2, 2.1, 5.4, 4.3, 1.2, 8.7};
		printDoubleArray(test2);
		ArrayMethods3.selectionSort(test2);
		System.out.println();
		printDoubleArray(test2);
		
		System.out.println();
		System.out.println();
		
		String[]test3= {"The", "Quick", "Brown", "Fox", "Jumped", "Over", "A", "Lazy", "Dog"};
		printStringArray(test3);
		ArrayMethods3.bubbleSort(test3);
		System.out.println();
		printStringArray(test3);
	}
	public static void insertionSort(int[] list1)
	{
		for(int i=1;i<list1.length;i++)
			for(int j=i;j>0;j--)
			{
				if(list1[j]<list1[j-1])
					intSwap(list1, j, j-1);
			}
			
	}
	public static void selectionSort(double [] list1)
	{
		
		for(int i=0;i<list1.length-1;i++)
		{
			int key=i;
		
			for(int j=i+1;j<list1.length;j++)
			{
				if(list1[j]<list1[key])
					key= j;
			}
			doubleSwap(list1,key,i);
		}
	}
	public static void bubbleSort(String [] list1)
	{
		 int n = list1.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (list1[j].compareToIgnoreCase(list1[j+1])> 0)
	                {
	                    stringSwap(list1,j,j+1);
	                }
	}
	private static void printIntArray(int[]list)
	{
		for(int i=0;i<list.length;i++)
		{
			System.out.print("["+list[i]+"] ");
		}
	}
	private static void printDoubleArray(double[]list)
	{
		for(int i=0;i<list.length;i++)
		{
			System.out.print("["+list[i]+"] ");
		}
	}
	private static void printStringArray(String[]list)
	{
		for(int i=0;i<list.length;i++)
		{
			System.out.print("["+list[i]+"] ");
		}
	}
	private static void intSwap(int[] arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	private static void doubleSwap(double[] arr, int i, int j)
	{
		double temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	private static void stringSwap(String[] arr, int i, int j)
	{
		String temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

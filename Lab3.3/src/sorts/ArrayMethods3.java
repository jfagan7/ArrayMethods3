package sorts;
public class ArrayMethods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]test1= {9,8,7,6,5,4,3,2,1,0};
		int[]sort1=insertionSort(test1);
		//double[]test2= {9,7,6,6,3,2,5,4,1,8};
		//String[]test3= {9,8,7,6,5,4,3,2,1,0};
		printNumArray(test1);
		System.out.println();
		printNumArray(insertionSort(sort1));
	}
	public static int[] insertionSort(int[] list1)
	{
		for(int i=1;i<list1.length;i++)
		{
			int refNum=list1[0];
			for(int j=i-1;j>=0;j--)
			{
				if(refNum<list1[j])
					swap(list1[j],refNum);
			}
		}
		
		return list1;
	}
	public static void selectionSort(double [] list1)
	{
		
	}
	public static void bubbleSort(String [] list1)
	{
		
	}
	private static void printNumArray(int[]list)
	{
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]);
		}
	}
	private static void printDoubleArray(double[]list)
	{
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]);
		}
	}
	private static void printStringArray(String[]list)
	{
		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]);
		}
	}
	private static void swap(int i, int j)
	{
		int temp=i;
		i=j;
		j=temp;
	}
}

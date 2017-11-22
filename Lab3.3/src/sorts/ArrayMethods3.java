package sorts;
import java.util.Arrays;

public class ArrayMethods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]test1= {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[]sort1=insertionSort(test1);
		double[]test2= {9.8, 7.6, 6.5, 6.5, 3.2, 2.1, 5.4, 4.3, 1.2, 8.7};
		double[]sort2= selectionSort(test2);
		//String[]test3= {9,8,7,6,5,4,3,2,1,0};
		printDoubleArray(test2);
		System.out.println();
		System.out.print(Arrays.toString(sort2));
	}
	public static int[] insertionSort(int[] list1)
	{
		
		
		return list1;
	}
	public static double[] selectionSort(double [] list1)
	{
		double[] newList = populate(list1);
		for(int i=0;i<list1.length;i++)
		{
			for(int j=i+1;j<list1.length;j++)
			{
				if(list1[j]<list1[i])
					doubleSwap(list1,list1[j],list1[i]);
			}
		}
		return newList;
	}
	public static void bubbleSort(String [] list1)
	{
		
	}
	private static void printNumArray(int[]list)
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
	private static void swap(int i, int j)
	{
		int temp=i;
		i=j;
		j=temp;
	}
	private static void doubleSwap(double[] arr, double i, double j)
	{
		double temp=i;
		i=j;
		j=temp;
	}
	private static double[] populate(double[]a)
	{
		double []copy=new double[a.length];
		for(int i=0;i<a.length;i++)
		{
			copy[i]=a[i];
		}
		return copy;
	}
}

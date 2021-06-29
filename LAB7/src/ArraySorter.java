public class ArraySorter 
{
	public static void sort(int[] a) 
	{
		int temp[] = new int[a.length];

		for (int i = 0; i < temp.length; ++i) 
		{

			int item = a[i];

			int index = i;

			while (index > 0 && temp[index - 1] > item) 
			{
				temp[index] = temp[index - 1];
				index--;
			}

			temp[index] = item;
		}

		for (int index = 0; index < temp.length; index++) 
		{
			a[index] = temp[index];
		}

	}

	public static void selectionSort(int[] anArray) {

		for (int index = 0; index < anArray.length - 1; index++) {
			int indexOfnextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfnextSmallest, anArray);
		}
	}

	private static int getIndexOfSmallest(int startIndex, int[] a) {
		int min = a[startIndex];
		int indexOfMin = startIndex;

		for (int index = startIndex + 1; index < a.length; index++) {
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
				indexOfMin = index;
			}
		}

		return indexOfMin;
	}

	private static void interchange(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
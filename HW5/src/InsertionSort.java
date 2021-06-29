/**
 Program do insertion sort.
 Author: Oh ChanHee
 E-mail Address: dhcksgml98@gc.gachon.ac.kr
 HW5 Problem7
 Last changed: May 31, 2020.
 */

public class InsertionSort//삽입 정렬을 해줄 클래스 InsertionSort를 정의한다.
{
	public static void sort(int[] a)//삽입 정렬을 해줄 메소드 sort를 정의한다. 
	{
		int temp[] = new int[a.length];
		//배열된 수들을 저장해줄 int형 array temp를 선언하여 new로 0 ~ a.length-1 번의 인덱스를 할당하여준다.
		for (int index = 0; index < a.length; index++)//a.length의 크기만큼 반복하는 for문을 선언한다.
		{
			int value = a[index];//배열할 값을 저장해줄 변수 value를 선언하고 a[index]의 값을 저장한다.
			int valueIndex = index;//배열할 값의 인덱스의 값을 저장해줄 변수 valueIndex를 선언하고 index의 값을 저장한다.

			while (valueIndex > 0 && temp[valueIndex - 1] > value)
			//valueIndex가 0보다 크고(temp[0] = temp[-1]인 상황을 회피)
			//temp[valueIndex - 1]가 value보다 크면(비교값이 더 크므로 배열할 필요가 없으면) 반복한다.				
			{
				temp[valueIndex] = temp[valueIndex - 1];//temp[valueIndex]에  temp[valueIndex - 1]의 값을 저장한다.
				valueIndex--;//valueIndex를 1 뺀다.
			}

			temp[valueIndex] = value;//temp[valueIndex]에 value의 값을 저장한다.
		}

		for (int index = 0; index < a.length; index++)//a.length의 크기만큼 반복하는 for문을 선언한다.
		{
			a[index] = temp[index];//a[index]의 값에 temp[index]의 값을 저정한다.(어레이 a가 리턴되는것이므로 배열된 어레이를 a에 저장해줘야한다.)
		}

	}
	
	public static void selectionSort(int[] anArray) 
	{

		for (int index = 0; index < anArray.length - 1; index++) 
		{
			int indexOfnextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfnextSmallest, anArray);
		}
	}

	private static int getIndexOfSmallest(int startIndex, int[] a) 
	{
		int smallest = a[startIndex];
		int smallestIndex = startIndex;
		
		for (int index = startIndex + 1; index < a.length; index++) 
		{
			if (a[index] < smallest) 
			{
				smallest = a[index];
				smallestIndex = index;
			}
		}
		return smallestIndex;
	}
	
	private static void interchange(int i, int j, int[] a) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
 


}
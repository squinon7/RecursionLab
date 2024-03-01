
public class ArraySum 
{
	public int sumOfArray(Integer[] a, int index)
	{
		int sum = 0; 
		
		//base case
		if(index < 0)
		{
			return 0; 
		}
		else
		{
			//adds element at current index and continues to
			//add the element at the previous index. 
			sum = a[index] + sumOfArray(a, index - 1); 
		}
		return sum; 
	}

}

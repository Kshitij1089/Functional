class Arraymin
{
	public static void main(String args[])
	{
		int i,min;
		int arr[]=new int[4];
		arr[0]=3;
		arr[1]=2;
		arr[2]=1;
		arr[3]=4;	
		min=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum element is "+min);
	}
}




Testing is gud
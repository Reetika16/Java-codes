
// find duplicate String.

import java.util.*;
class duparray
{
	public static void main(String[] args) 
	{
		String[] strArray = {"Ritu","Gargi","Sahil","Kedar","Josh","Ritu"};
		for(int i=0; i<strArray.length-1;i++)
		{
			for(int j=i+1;j<strArray.length;j++)
			{
				if((strArray[i].equals(strArray[j])) && (i !=j))
				{
					System.out.println("DuplicateString: "+strArray[j]);
				}
			}
		}

	}
}
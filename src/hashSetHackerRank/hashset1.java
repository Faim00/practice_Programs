/* Question : - In computer science, a set is an abstract data type that can store certain values, without any particular order, and no repeated values(Wikipedia).  is an example of a set, but  is not a set. Today you will learn how to use sets in java by solving this problem.

You are given  pairs of strings. Two pairs  and  are identical if  and . That also implies  is not same as . After taking each pair as input, you need to print number of unique pairs you currently have.

Complete the code in the editor to solve this problem.

Input Format

In the first line, there will be an integer  denoting number of pairs. Each of the next  lines will contain two strings seperated by a single space.

Constraints:

Length of each string is atmost  and will consist lower case letters only.
Output Format

Print  lines. In the  line, print number of unique pairs you have after taking  pair as input.*/


package hashSetHackerRank;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class hashset1 {

	public static void main(String [] arg) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many names pair you want :");
		
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right= new String[t];
		
		for(int i =0; i<t; i++)
		{
			pair_left[i]  = s.next();
			pair_right[i] = s.next();
		}
		Set<String> myHashSet = new HashSet<String>();
		for(int i = 0; i<t; i++)
		{
			myHashSet.add(pair_left[i] + "," + pair_right[i]);
			System.out.println(myHashSet.size());
		}
		Iterator<String> itr = myHashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
 	}
}

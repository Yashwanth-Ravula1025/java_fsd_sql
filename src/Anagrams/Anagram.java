package Anagrams;
import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		int count=0;
		int count2=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			for(int j=0;j<s2.length()-1;j++)
			{
				char ch1=s2.charAt(j);
				if(ch==ch1)
				{
					ch++;
					count++;
				}
			}
			count2++;
			
		}
		if(count==count2)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}

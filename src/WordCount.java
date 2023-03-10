/**
 * 
 */
package count;
import java.util.*;
/**
 * @author Administrator
 *
 */
public class WordCount {


	public static void  main(String[] args) {
			
		
		ArrayList<String> s=new ArrayList<>(Arrays.asList("hi","ji","hi","hlo","hi"));
		WordCount w=new WordCount();
//		String[] s= {"hi","hello","hlo","hi","hi"};
		String s1="hi";
        System.out.println(countWords(s,s1));
	}
	
	
		public static int countWords(ArrayList<String> s , String s1) {
			
			int count=0;
			String[] s3=s.toArray(new String[0]);
			for(int i=0;i<s3.length;i++)
			{
				String s2=s3[i];
				
			if(s2.equals(s1))
			{
				count++;
			}
		}
			return count;
		}
			

	

}

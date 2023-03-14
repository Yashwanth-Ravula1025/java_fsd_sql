package UST_BATCHNO_3.JUNIT5_TESTCASES;

public class CountVowels {

	public static void main(String[] args) {
		
		CountVowels v=new CountVowels();
		String s="AEiou";
		System.out.println(v.vowlesCount(s));
		
		
		
		
	}
		public static int vowlesCount(String s) {
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' ||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )
		{
			count++;
		}
			
		}
		return count;
		}

		}	



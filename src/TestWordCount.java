package counttest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import count.WordCount;

public class TestWordCount {
	
	
	@Test
	public void wordsCounting()
	{
		ArrayList<String> input1=new  ArrayList(Arrays.asList("ji","ij","ji"));
		String input2="ji";
		int expected=2;
		int actual=WordCount.countWords(input1,input2);
		assertEquals(expected,actual);
	}

}

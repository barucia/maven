package cc.ncnu.maven;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;

public class DiffDemoTest {
    private DiffDemo diffdemo;
	
	@Before
	public void setup(){
		diffdemo=new DiffDemo();
	}
	@Test
	public void testGetDiff() {
        String str1="abcde";
        String str2="abcxy";
        
        String expected="xy";
        try{
        	String diffResult=diffdemo.getDiff(str1, str2);
        	assertEquals(expected,diffResult);
        }catch (Exception e){
        	e.printStackTrace();
        }

	}

}

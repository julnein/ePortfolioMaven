package palindrom;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromTest {
	
	@Test
	public void isPalindromTest(){
		Assert.assertTrue(Palindrom.isPalindrom("Otto"), "Ist kein Palindrom");
	}
	
	@Test
	public void isNoPalindromTest(){
		Assert.assertFalse(Palindrom.isPalindrom("Test"), "Ist ein Palindrom");
	}

}

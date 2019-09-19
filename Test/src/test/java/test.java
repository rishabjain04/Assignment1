import org.testng.Assert;
import org.testng.annotations.Test;

public class test extends lengthcal
{	
	/*
	 Assumptions:
	 -- No Empty String is checked.
	 -- No string has two words of same length.
	 */
	
	// Annotation of TestNG or JUnit are used (@Test)
	// Assertions used to validate our tests.
	
	@Test 
	public void TestWord(){
		String output = maxWord("The cow jumped over the moon.");
		Assert.assertEquals(output, "jumped");// 
		
		int outputLength = maxLength("The cow jumped over the moon.");
		Assert.assertEquals(outputLength, 6);
		
		
	}
	
	@Test
	public void Testlength(){
		int outputLength = maxLength("The cow jumped over the moon.");
		Assert.assertEquals(outputLength, 6);
		
	}
	
}


public class lengthcal
{
	// functions to found word with maximum length and return its length
	public int maxLength(String s) 
	{
		String [] word = s.split(" "); //function to seperate sentence into array of words
		String maxLengthWord = "";
		Integer maxLength = 0;
		for(int i = 0; i< word.length; i++ ) //loop through array aize
			{
			if (word[i].length() >= maxLengthWord.length()) 
				{
				maxLengthWord = word[i]; //saves largest word found atm
				maxLength = word[i].length(); //saves length of the word
				}
			}
		return maxLength;
		
	
	}
	
	// function to found word with maximum length and return the word
	public String maxWord(String s) 
		{
		String [] word = s.split(" ");//function to seperate sentence into array of words
		String maxLengthWord = "";
		for(int i = 0; i< word.length; i++ ) 
		{
			if (word[i].length() >= maxLengthWord.length()) 
				maxLengthWord = word[i];//saves largest word found atm
		}
		return maxLengthWord;
		}
}

public class Translator {
	
	public String str = "";
	private final String BLANK = " ", ADDCON = "ay", ADDVOW = "yay";
	private String[] vowels = {"a", "e", "i", "o", "u"};
	private String[] wordArray;
	private boolean hasConsonant = false, hasVowel = false;
	
	//Default constructor
	public Translator()	{
		str = "";
	}
	
	//Constructor
	public Translator (String userInput, int num)	{
		str = userInput;
		wordArray = new String[num];
	}
	
	//Method to separate words of the string entered by the user
	public void separateWords()	{
		
		for (int i = 0; i < wordArray.length; i++)	{
			wordArray[i] = "";
		}
		
		for (int i = 0; i < wordArray.length; i++)	{
			
			for (int k = 0; k < str.length(); k++)	{
				if (!(str.substring(k, k+1).equals(BLANK)))
					wordArray[i] = wordArray[i] + str.substring(k, k+1);
				else	{
					str = str.substring(k);
					break;
				}
			}
		}
		
		for (int i = 0; i < wordArray.length; i++)	{
			
			if (this.checkConsonant(wordArray[i]))
				wordArray[i] = this.translateConsonant(wordArray[i]);
			else if (this.checkVowels(wordArray[i]))
				wordArray[i] = this.translateVowel(wordArray[i]);
		}
		
		this.toString(wordArray);
	}
	
	//Checks whether a word starts with a consonant
	public boolean checkConsonant(String word)	{
		
		for (int i = 0; i < 5; i++)	{
			
			if (word.substring(0,1).equals(vowels[i]))	{
				hasConsonant = false;
				break;
			}
			else if (i == 4)
				hasConsonant = true;
		}
		return hasConsonant;
	}
	
	//Checks whether a word starts with a vowel
	public boolean checkVowels(String word)	{
		
		for (int i = 0; i < 5; i++)	{
			
			if (!(word.substring(0, 1).equals(vowels[i])))	{
				hasVowel = false;
				break;
			}
			else if (i == 4)
				hasVowel = true;
				
		}
		return hasVowel;
	}
	
	//Translates words starting with consonants
	public String translateConsonant(String word)	{
		return (word.substring(1) + word.substring(0, 1) + ADDCON);
	}
	
	//Translates words starting with vowels
	public String translateVowel(String word) {
		return (word + ADDVOW);
	}
	
	//toString method to print the translated string
	public void toString (String[] words)	{
		
		for (int i = 0; i < words.length; i++)	{
			System.out.println(words[i] + " ");
		}
	}
}

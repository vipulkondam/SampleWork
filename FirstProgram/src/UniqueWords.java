import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {

	public static void main(String[] args)
	{
		UniqueWords words = new UniqueWords();
		Scanner fileScanner = words.getScanner();
		
		Set<String> uniqueWords = new HashSet<String>();
		Map<String, Integer> occurenceOfWords = new HashMap<String,Integer>();
		
		while(fileScanner.hasNext())
		{
			String word = fileScanner.next();
			if(!uniqueWords.contains(word))
			{
				uniqueWords.add(word);
				occurenceOfWords.put(word, new Integer(1));
			}
			else
			{
				Integer wordOccurence =  occurenceOfWords.get(word)+1;
				occurenceOfWords.put(word,wordOccurence);
			}
		}
		
		System.out.println("Unique words in a file" + uniqueWords);
		Integer numOfWords = new Integer(0);
		
		System.out.println("Enter the string you want to search");
		Scanner obj = new Scanner(System.in);
		
		String str = obj.next();
		System.out.format("The given %s is repeated %d", str,occurenceOfWords.get(str));
		fileScanner.close();
	}
	
	private Scanner getScanner()
	{
		Scanner fileScanner = null;
		try
		{
			fileScanner = new Scanner(new File("C:\\Users\\vipul\\Desktop\\Text.txt"));
			fileScanner.useDelimiter("[^A-Za-z0-9]");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return fileScanner;
	}
}

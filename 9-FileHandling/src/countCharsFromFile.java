/*2) Create a function in Java to count the number of embedded white spaces and
Punctuation present in a text file named "Sample.txt".
*/
import java.io.*; 
import java.util.Scanner;

public class countCharsFromFile {	
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)throws IOException{
	    int character = 0;
	    int whitespace = 0;
	    int punctuation = 0;
	    
	    System.out.println("WHITESPACES AND PUNCTUATIONS ARE..");
	
		String string = ("Hello, This is Ruban Gino Singh, Check out my website: www.rubangino.in and Follow me on Instagram, @ruban_gino_.");
		
	    File writeFile = new File("D:\\OOP Lab\\Exp-9-FileHandling\\CountChars.txt");
	    FileWriter fileWriter = new FileWriter(writeFile);
	    
	    fileWriter.write(string);
	    
	    fileWriter.flush();
	    fileWriter.close();
	    
	    try {
	    	  File readFile = new File("D:\\OOP Lab\\Exp-9-FileHandling\\CountChars.txt");
		      BufferedReader bufferReader = new BufferedReader(new FileReader(readFile));
		      
		      System.out.println("The file content is: " + string);			    
		      while ((character = bufferReader.read()) != -1) {
		    	  if(character == 32){
			    		whitespace = whitespace +1;
			    	}
			    	else if (character == 44 || character == 45 || character == 46 || character == 58 || character == 59 || character == 63 || character == 33 ){
			    		punctuation = punctuation+1;
			    	}
		      }
		      System.out.println("The number of white spaces:" + whitespace );
		  	  System.out.println("The number of punctuations:" + punctuation);
		    }
		    catch(Exception e) {
		      e.printStackTrace();
		    }  
	}
}


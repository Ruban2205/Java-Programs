/*1) Perform the following operations on file using menu-driven application,
• Opening a existing file
• Creating a new file
• Renaming a file
• Deleting a file
• Creating a directory
• Finding the absolute path of a file
• Get the file names of a directory
*/

import java.io.*;
import java.util.*;

public class fileHandlingApp {
	
	public static boolean isRunning = true; 
	public static Scanner scanner = new Scanner(System.in);
	
	public static void Open() throws IOException {
		String fileLocation = "D:\\OOP Lab\\Exp-9-FileHandling\\";
		String fileName;
		String below = "👇";
		
		System.out.println("\nOPENING A EXISTING FILE\n");
		System.out.print("Enter the file name with Extension: ");
		fileName = scanner.nextLine(); 
		
		try { 
		      File file = new File(fileLocation + fileName); 
		      BufferedReader bufferReader = new BufferedReader(new FileReader(file));
		      
		      System.out.println("The file content is " + below);
		      int r = 0;
		      while ((r = bufferReader.read()) != -1) {
		        System.out.print((char) r);
		      }
		    }
		    catch(Exception e) {
		      e.printStackTrace();
		    }
		System.out.println();
		
	}
	
	public static void Create() throws IOException {
		String fileLocation = "D:\\OOP Lab\\Exp-9-FileHandling\\";
		String fileName; 
		
		System.out.println("\nCREATING A NEW FILE\n");
		System.out.print("Enter the file name with Extension: ");
		fileName = scanner.nextLine(); 
		
		File fileobj=new File(fileLocation + fileName);
		fileobj.createNewFile();
		System.out.println("\nThe file CREATED Successfully");
	}
	
	public static void Rename() throws IOException{
		String fileLocation = "D:\\OOP Lab\\Exp-9-FileHandling\\";
		String oldFileName; 
		String newFileName;
		
		System.out.println("\nRENAMING A FILE\n");
		System.out.print("Enter the Old File name: ");
		oldFileName = scanner.nextLine(); 
		
		File oldFile = new File(fileLocation + oldFileName);
		
		if(oldFile.exists()) {
			System.out.print("Enter the New File name: ");
			newFileName = scanner.nextLine();
			
			File newFile = new File(fileLocation + newFileName);
			
			oldFile.renameTo(newFile);
			System.out.println("\nFile RENAMED Successfully!!");	
		}
		else {
			System.out.println("\n" + oldFile + " is NOT available in the Location!!" + "\n");
		}
	}
	
	public static void Delete() throws IOException{
		String fileLocation = "D:\\OOP Lab\\Exp-9-FileHandling\\";
		String fileName; 
		
		System.out.println("\nDELETING A FILE\n");
		System.out.print("Enter the File name to DELETE: ");
		fileName = scanner.nextLine(); 
				
		File fileToDelete = new File(fileLocation + fileName);
		
		if(fileToDelete.exists()) {
			fileToDelete.delete();
			System.out.println("\nFile DELETED Successfully!!");
		}
		else {
			System.out.println("\n" + fileToDelete + " is NOT available in the Location!!" + "\n");
		}
		
		
	}
	
	public static void CreateDirectory() throws IOException {
		String fileLocation = "D:\\OOP Lab\\Exp-9-FileHandling\\";
		String folderName; 
		
		System.out.println("\nCREATING A DIRECTORY\n");
		System.out.print("Enter the Directory name to CREATE: ");
		folderName = scanner.nextLine(); 
		
		File createDirectory = new File(fileLocation + folderName); 
		
		if(createDirectory.mkdir()) {
			System.out.println("\nDirectory CREATED Successfully!!");
		}
		else {
			System.out.println("\nWe Found an ERROR in Creating Directory!! Please Try Again!!");
		}
	}
	
	public static void FindingPath() throws IOException {
		String fileLocation = "D:\\OOP Lab\\Exp-9-FileHandling\\";
		String fileName;
		
		System.out.println("\nFINDING THE ABSOLUTE PATH OF A FILE\n");
		System.out.print("Enter the file name to Know the Path: ");
		fileName = scanner.nextLine();
		
		File filePath = new File(fileLocation + fileName);
		
		if(filePath.exists()) {
			System.out.println("\nTHE FILE PATH IS DOWN BELOW");
			System.out.println("\n" + filePath.getAbsolutePath());
		} else {
			System.out.println("\nThere is NO File exists!!");
		}
		
	}
	
	public static void GetFileNames() throws IOException {
		String fileLocation = "D:\\OOP Lab\\Exp-9-FileHandling\\";
		String below = "👇";
//		String directoryName;
//		System.out.println("Enter the directory name: ");
//		directoryName = scanner.nextLine();

		File folder = new File(fileLocation);
		File[] listOfFiles = folder.listFiles();

		System.out.println("\nFILES AND DIRECTORIES BELOW " + below);
		
		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("File: " + listOfFiles[i].getName());
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory: " + listOfFiles[i].getName());
		  }
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		int userChoice;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nFILE HANDLING OPERATIONS");
		
		while(isRunning) {
			System.out.println();
			System.out.println("1. Opening a existing file");
			System.out.println("2. Creating a new file");
			System.out.println("3. Renaming a file");
			System.out.println("4. Deleting a file");
			System.out.println("5. Creating a directory");
			System.out.println("6. Finding the absolute path of a file");
			System.out.println("7. Get the file names of a directory");
			System.out.println("8. Exit\n");
			
			System.out.print("Enter your choice: ");
			userChoice = scanner.nextInt(); 
			
			if(userChoice == 1) {
				Open(); 
			}
			else if(userChoice == 2) {
				Create(); 
			}
			else if(userChoice == 3) {
				Rename(); 
			}
			else if(userChoice == 4) {
				Delete(); 
			}
			else if(userChoice == 5) {
				CreateDirectory();  
			}
			else if(userChoice == 6) {
				FindingPath(); 
			}
			else if(userChoice == 7) {
				GetFileNames(); 
			}
			else if(userChoice == 8) { 
				System.out.println("\nThanks for performing File Handling Operations!! By URK20CS2001\n");
				isRunning = false; 
				break; 
			}
			else {
				System.out.println("\nINVALID INPUT\n");
			}	
		}
	}
}

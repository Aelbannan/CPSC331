package lists;

import java.io.File;
import java.util.Scanner;

public class FileReading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int counter = 0;   
		String[] names = new String[1000];
		
	    try{
		    	Scanner fileScanner = new Scanner(new File("/home/justin/355/git/CPSC331/Lists/poki.txt"));
		        	
		    	while (fileScanner.hasNext()){
		    		names[counter] = fileScanner.next();
		    		System.out.println(names[counter]);
		    		counter++;
		    		
		    		}
		    	
	        }
	    catch(Exception e){
	                System.out.println("Error while reading file line by line:" 
	                + e.getMessage());                      
	        }
		
		
		
	}

}

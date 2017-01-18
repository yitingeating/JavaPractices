package biofindframe;

import java.io.File;

import org.biojava3.core.sequence.DNASequence;

import biojava.SequenceLoader;
import cse131.ArgsProcessor;

public class FindTheFrame {
	
	//
	// Do not change any code from here....
	//

	public static void main(String[] args) {
		File file = ArgsProcessor.chooseFile("genomes");
		System.out.println("For " + file + ", best reading frame is " + runsolution(file));
	}
	
	public static int runsolution(File file) {
		//
		// Load the sequence into a DNASequence object
		//
		SequenceLoader sequenceLoader = new SequenceLoader();
		DNASequence dnaSequence = sequenceLoader.loadDNASequence(file);
		
		//
		// Convert the sequence to a string and then a char array
		//
		String dnaAsString = dnaSequence.getSequenceAsString().toUpperCase();
		char[] dnaAsCharArray = dnaAsString.toCharArray();
		
		//
		// Call your solution to compute the result
		//
		int frame = bestReadingFrame(dnaAsCharArray);
		
		return frame;
	}
	
	//
	// ... to here, so we can unit test your solution
	//
	
	
	
	
	
	
	
	/**
	 * 
	 * @param dna an array of char.  Each element is a nucleotide:  one of A, T, C, or G.
	 * @return the index at which the best reading frame occurs.  This would be 0, 1, or 2.
	 */
	public static int bestReadingFrame(char[] dna) {
		

		// Below, define each of the three Stop Codons as a separate array of char,
		//     named ochre, amber, and opal
		//     See http://en.wikipedia.org/wiki/Genetic_code#Start.2Fstop_codons
         char []ochre=new char[]{'T','A','A'};
         char []amber=new char[]{'T','A','G'};
         char []opal=new char[]{'T','G','A'};
         

		// Below, define the Start Codon (Methionine) as an array of char
		//Start Codon
		char []methionine=new char[]{'A','T','G'};
	//	int ans = -1;  // returned if no appropriate sequences was found
		
		
		int length=dna.length;
        String temp0=check(0,dna);
        int max0=max(temp0);
		//start from 1
        String temp1=check(1,dna);
        int max1=max(temp1);
	//start from 2
        String temp2=check(2,dna);
        int max2=max(temp2);
        
    //  System.out.println(max0+max1+max2);  

    	
        if(max0==-1&&max1==-1&&max2==-1)
        	return -1;
        	else

      if(max0>max1&&max0>max2)
    	  return 0;
      else if(max1>max0&&max1>max2)
    	  return 1;
      else 
    	  return 2;
       

	}
	
	public static String check(int i,char []dna ){
		   char []ochre=new char[]{'T','A','A'};
	         char []amber=new char[]{'T','A','G'};
	         char []opal=new char[]{'T','G','A'};
			char []methionine=new char[]{'A','T','G'};
		int length=dna.length;
		String temp="";
		  for(int j=i;j<=length-3;j+=3){
	        	if(dna[j]==methionine[0]&&dna[j+1]==methionine[1]&&dna[j+2]==methionine[2])
	        		temp+="1";
	        	else if((dna[j]==ochre[0]&&dna[j+1]==ochre[1]&&dna[j+2]==ochre[2])||(dna[j]==amber[0]&&dna[j+1]==amber[1]&&dna[j+2]==amber[2])||dna[j]==opal[0]&&dna[j+1]==opal[1]&&dna[j+2]==opal[2])
	        		temp+="2";
	        	else
	        		temp+="0";
	            }
		  return temp;
	}
	public static int max(String temp){
		  int max1=-1;
	        for(int i=0;i<temp.length();i++){
	     	   if(temp.charAt(i)=='1'){
	     		   for(int j=i;j<temp.length();j++){
	     			   if(temp.charAt(j)=='2'){
	     				   if(j-i>max1){
	     					   max1=j-i;
	     					  }
	     				   break;
	     			   }		   
	     		   }  
	           }
	       }
		return max1;
	}
}

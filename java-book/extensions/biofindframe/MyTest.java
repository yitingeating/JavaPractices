package biofindframe;

public class MyTest {
	public static void main(String []args){
	    char []ochre=new char[]{'T','A','A'};
        char []amber=new char[]{'T','A','G'};
        char []opal=new char[]{'T','G','A'};
        

		// Below, define the Start Codon (Methionine) as an array of char
		//Start Codon
		char []methionine=new char[]{'A','T','G'};
		//int ans = -1;  // returned if no appropriate sequences was found
		
		char []dna=new char[]{'A','A','A','A','T','G','T','T','T','A','T','G','T','T','T','T','G','A','A','A','A','A','T','G','T','T','T','T','T','T','T','T','T','T','G','A'};
		int length=dna.length;
       String temp0="";
       for(int j=0;j<=length-3;j+=3){
       	if(dna[j]==methionine[0]&&dna[j+1]==methionine[1]&&dna[j+2]==methionine[2])
       		temp0+="1";
       	else if((dna[j]==ochre[0]&&dna[j+1]==ochre[1]&&dna[j+2]==ochre[2])||(dna[j]==amber[0]&&dna[j+1]==amber[1]&&dna[j+2]==amber[2])||dna[j]==opal[0]&&dna[j+1]==opal[1]&&dna[j+2]==opal[2])
       		temp0+="2";
       	else
       		temp0+="0";
           }
       
       int max0=0;
       for(int i=0;i<temp0.length();i++){
    	   if(temp0.charAt(i)=='1'){
    		   for(int j=i;j<temp0.length();j++){
    			   if(temp0.charAt(j)=='2'){
    				   if(j-i>max0){
    					   max0=j-i;
    					  }
    				   break;
    			   }
    				   
    		   }
    			   
    			   
    	   }
    		  
       }
       System.out.println(temp0+" "+max0);
       	
	}

}

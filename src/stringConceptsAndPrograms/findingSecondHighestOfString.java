package stringConceptsAndPrograms;

public class findingSecondHighestOfString {
	static String temp;
	public static void main(String[] args) {
		
		    String str = "Vijay Govindrao Vyas";
		    String[] stringArray = str.split(" ");
		      
		    for (int i=0; i<stringArray.length; i++)   
		    {
		                for (int j=i+1; j<stringArray.length; j++)   
		                {  
  		                   if(stringArray[i].length() >  stringArray[j].length()) {
  		                	   temp = stringArray[i];
  		                	   stringArray[i] = stringArray[j];
  		                	   stringArray[j] = temp;
  		                	   
  		                   }
		                }  
		    }
		    System.out.println(stringArray[1]);
		    
		    /*
			Arrays.sort(stringArray);
			System.out.println(stringArray[stringArray.length-2]);
			*/
	} 
		    
}  
package Sampl_Practise;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String sample = "(id,created,employee(id,firstname, employeeType(id), lastname),location)";
		sample = sample.replaceAll(" ", "");
	//	System.out.print(sample);
		String[] stringArray = sample.split("(?<!^)(?=[,()])");
	//	Arrays.sort(stringArray);
		int hyphenCount = -1;
		String hyphen = "";
		String finalString = "";
        String[] str=new String[20];
        int i=0;
		for (String item : stringArray) {			
			if (item.startsWith("(")) {
				hyphenCount++;
				hyphen = updateHyphenString(hyphenCount);
			} else if (item.endsWith(")")) {
				hyphenCount--;
				hyphen = updateHyphenString(hyphenCount);
			}
			
			finalString = hyphen + item.replaceAll("[(),]", "");
			
			if (!finalString.equals("-") && !finalString.equals(")") && !finalString.equals("")) {
			    
				str[i]=finalString;
				i++;
				//System.out.println(finalString);
				
			}
			
			// Add Logic to print the o/p in Alphabetical order.
			
			// Save this and send to Ace.
		}
		
		//swapping part
	
		String temp;
		for(i=0; i<5; i++)
        {
            for(int j=1; j<7; j++)
            {
                if(str[j-1].compareTo(str[j])>0)
                {
                    if(!str[j].startsWith("-"))
                    {
                        temp=str[j-1];
                        str[j-1]=str[j];
                        str[j]=temp;
                    }
                    
                    //System.out.println(temp);
                }
               
            }
        }
		for(i=0;i<str.length;i++)
        {
            if(str[i]!=null)
		    {
                System.out.println(str[i]);
		    }
        }
	}
	
	private static String updateHyphenString(int iterations) {
		String hyphenString = "";
		for (int count = 0; count < iterations; count++) {
			hyphenString += "-";
		}
		return hyphenString;
	}

}

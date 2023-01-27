/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Address
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     	String[] addressBook = {"Dave","Smith","123 main st.","seattle","wa","43",
                                    "Alice","Smith","123 Main St.","Seattle","WA","45",
                                    "bOb","Williams","234 2nd Ave.","Tacoma","WA","26",
                                    "Carol","Johnson","234 2nd Ave","Seattle","WA","67",
                                    "TOm","Bombadillo","1212 Maple Street","Florida","GA","520",
                                    "Jimbo","Jones","82 Pine Street","Atlanta","GA","2",
                                    "Jackie","Jones","82 Pine Street","Atlanta","GA","6",
                                    "Tommy","Jones","82 Pine Street","Atlanta","GA","29",
                                    "tammy","Jones","82 Pine Street","Atlanta","GA","27",
                                    "EvE","Smith","234 2nd Ave.","Tacoma","WA","25",
                                    "Frank","Jones","234 2nd Ave.","Tacoma","FL","23",
                                    "george","Brown","345 3rd Blvd., Apt. 200","Seattle","WA","19",
                                    "Helen","Brown","345 3rd Blvd. Apt. 200","Seattle","WA","18",
                                    "Ian","smith","123 main st ","Seattle","Wa","18",
                                     "Jane","Smith","123 Main St.","Seattle","WA","13"};
    
	       System.out.println(search(addressBook));

	}
	
	
	 public static String search(String[] addressBook) { 
        
                    Map<String,Integer> mp=new HashMap<>();
        
                   for(int i=0;i<addressBook.length;i++){
                     if (mp.containsKey(addressBook[i]))
                        {
                          return addressBook[i];
                         // mp.put(arr[i], mp.get(arr[i]) + 1);
                       }
                     else
                        {
                         mp.put(addressBook[i], 1);
                     }
              }
            return "no contact matched from address book";
        
    }
}




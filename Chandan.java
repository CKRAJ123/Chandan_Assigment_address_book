
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Address
{
	JSONArray addressBook=[{
                                fName : 'John',
                                lName : 'Smith',
				address : '123 street,xyz',
		                city : 'Patna'
                                state : 'Abc',
                                postCode : '823443'
		              },
			       {
                                fName : 'Darmendra',
                                lName : 'Singh',
				address : 'Kanchanpur',
				city : 'Gaya',      
                                state : 'Bihar',
                                postCode : '123443'
		              },
			       {
                                fName: 'Chandan',
                                lName: 'Kumar',
				address: 'Kanchanpur',
				city : 'Gaya',     
                                state: 'Bihar',
                                postCode: '123443'
		              },
			       {
                                fName: 'Tommy',
                                lName: 'Singh',
				address: '123 Main St.',
				city : 'Gaya',
                                state: 'Seattle',
                                postCode: '43'
		              },
			       fName : 'Alice',
                                lName : 'Smith',
				address : '123 main st.',
		                city : 'seattle'
                                state : 'wa',
                                postCode : '45'
		              },
			       {
                                fName : 'bOb',
                                lName : 'Williams',
				address : '234 2nd Ave.',
				city : 'Tacoma',      
                                state : 'WA',
                                postCode : '26'
		              },
			       {
                                fName: 'Carol',
                                lName: 'Johnson',
				address: '234 2nd Ave',
				city : 'Seattle',     
                                state: 'WA',
                                postCode: '67'
		              },
			       {
                                fName: 'TOm'
                                lName: 'Bombadillo',
				address: '1212 Maple Street',
				city : 'Florida',
                                state: 'GA',
                                postCode: '49'
		              }
                      ];
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in); 
		String contact = sc.nextLine();
	     
	       System.out.println(search(contact));
	}
	
	
	 public static String search(String contact) { 
       
                   for(int i=0;i<addressBook.length;i++){
                      if(addressBook[i]['fName']==contact || addressBook[i]['lName']==contact ||
			 addressBook[i]['address']==contact || addressBook[i]['city']==contact|| 
			 addressBook[i]['state']==contact || addressBook[i]['postCode']==contact ){
			     return addressBook[i];
		      }
                   }
		 
            return "no contact data matched from address book";  
       }
}




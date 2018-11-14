package genericvalidationfunction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Filerecord {
	private static BufferedReader reader;
	private static int customerId = 0;
public static void main(String[] args) throws IOException, SQLException {
String   CustomerCode,  CustomerName,  CustomerAddress1, CustomerAddress2, CustomerPinCode, Emailaddress, ContactNumber, PrimaryContactPerson, RecordStatus, ActiveInactiveFlag,   CreateDate,  CreatedBy, ModifiedDate,  ModifiedBy, AuthorizedDate, AuthorizedBy ;
try {
String file = "D:\\ninka.txt";
if (file.endsWith(".txt")) {
System.out.println("Correct");
BufferedReader reader = new BufferedReader(new FileReader(file));


String l;
			
			while ((l = reader.readLine()) != null) {
				l += "~";
			String[] lines = l.split("(?<=~)");
for (int ctr = 0; ctr < lines.length; ctr++) {
					while (lines[ctr].length() >= 1 && lines[ctr].charAt(lines[ctr].length() - 1) == '~') {
						lines[ctr] =lines[ctr].substring(0,lines[ctr].length() - 1);
					}
	
				}
			for(String line:lines)
			{
		System.out.println(line);
			}
			
			CustomerName=lines[1];
			Emailaddress=lines[5];
			CustomerPinCode=lines[4];
			RecordStatus=lines[8];
			ActiveInactiveFlag=lines[9];
			CustomerAddress1=lines[2];
			CustomerAddress2=lines[3];
			ContactNumber=lines[6];
			PrimaryContactPerson=lines[7];
			CreateDate=lines[10];
			CreatedBy=lines[11];
			ModifiedDate=lines[12];
			 ModifiedBy=lines[13];
			 AuthorizedDate=lines[14];
			 AuthorizedBy=lines[15];
			 
			 CustomerCode=lines[0];
//			System.out.println(CustomerNamevalidation( lines[1]));
			//System.out.println(E_mailaddress( lines[5])) ;
//			System.out.println(CustomerPinCode(lines[4] ));
//			System.out.println(RecordStatus(lines[8]));
//			System.out.println(ActiveInactiveFlag(lines[9]));
			 if( checker(lines)==true)
				 customerId++;
//			System.out.println(checker(lines));
			 {
			javaconn.insertFile( customerId, CustomerCode, CustomerName,  CustomerAddress1, CustomerAddress2, CustomerPinCode, Emailaddress, ContactNumber,PrimaryContactPerson, RecordStatus, ActiveInactiveFlag, CreateDate, CreatedBy,ModifiedDate, ModifiedBy, AuthorizedDate,AuthorizedBy); 
			}
			}
			reader.close();
				
				
	
}
else
	
{
		System.out.println("Invalid");
		 }
}catch(FileNotFoundException exception)
{
	 System.out.println(exception);
	}	
}

	
	public static boolean  CustomerNamevalidation(String lines)
			 	  {
			 		  Pattern p= Pattern.compile(("^[a-zA-Z\\s]*$"));
			 		  if(p.matcher(lines).find())
			 		  {
			 			  return true;
			 		  }
			 		  return false;
			 	  }
			 	 public static boolean CustomerPinCode(String lines )
		 	 {
			 		 if(lines.length()<=6)
			 		 {
			 			 return true;
			 			 
			 		 }
			 		 return false;
			 	 }
			 	public static boolean E_mailaddress(String lines) 
			 	{
			 		Pattern p= Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
                    if(p.matcher(lines).find())
                     {
                    	
                  	 return true;
			 		  }
			 		  return false;
                     }
              
			 	public static boolean RecordStatus(String lines) 
			 	{ 
			 		 if(lines.equals("N") || lines.equals("M")||lines.equals("D")||lines.equals("A")||lines.equals("R"))
			 		
		 	{
			return true;		
						
			 	}
		 	return false;
			 	}


			 	public static boolean ActiveInactiveFlag(String lines)
			 	{
		 	
			 		 if(lines.equals("A") || lines.equals("I")){
				return true;
			}
			return false;
		 		
		 			
			 			
			 	
		 			
			 	}
			 	
			 	public static boolean checker(String[] lines)
			 	{
			 		if(CustomerNamevalidation(lines[1])&& E_mailaddress(lines[5])&& CustomerPinCode(lines[4]) && RecordStatus(lines[8])&&ActiveInactiveFlag(lines[9]))
			 	{
			 			//System.out.println(E_mailaddress(lines[5]));
			 			return true;
			 	}
			 		return false;
		 	}
}


			 	

		
	




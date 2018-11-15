package genericvalidationfunction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.DocFlavor.STRING;

import brd.emicalculator;

public class Validationfunction {


	public static boolean validateDataType(Object object, String datatype){
//		if(object instanceof Number) {
//		System.out.println("Number");
//			return true;
//		}
//System.out.println(object.getClass().getSimpleName());
		if(object.getClass().getSimpleName().equals("String")) {
			return true;
		}
		else if(object.getClass().getSimpleName().equals("Integer"))
		{
			return true;
		}
		else if(object.getClass().getSimpleName().equals("Float"))
		{
			return true;
		}
		else if(object.getClass().getSimpleName().equals("Char"))
		{
			return true;
			
		}
		else if(object.getClass().getSimpleName().equals("Boolean"))
		{
			return true;
		}
		return false;
	}
		public static boolean DataTypelength(Object object, short length){
			if(((String)object).length()<=length){
				return true;
			}
			return false;
		
	}	
		public static final Pattern VALID_Character_REGEX = 
			    Pattern.compile("[a-z0-9]*$",Pattern.CASE_INSENSITIVE);

			public static boolean validatecharacter(String character) {
			        Matcher matcher = VALID_Character_REGEX.matcher(character);
			        return matcher.matches();
			}
 //		public static boolean formatValidation(String date, String format)
//	{
//		SimpleDateFormat SimpleDateFormat = new SimpleDateFormat(format);
//	 SimpleDateFormat.parse(date)toString();
//	
			static	SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

			public static boolean isValidDate(SimpleDateFormat date,String input) {
			    date.setLenient(false);
				try {
			          date.parse(input);
			          return true;
			     }
			     catch(ParseException e){
			          return false;
			     }
			}
		public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

			public static boolean validate(String emailStr) {
			        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
			        return matcher.find();
			}
	public static boolean domainValue()
			{
				ArrayList<String> domain1=new ArrayList<String> ();
				domain1.add("monday");
				domain1.add("tuesday");
				domain1.add("wednesday");
				domain1.add("thrusday");
				domain1.add("saturday");
				domain1.add("friday");
				domain1.add("sunday");
				if(domain1.contains("monday"))
						{
					return true;
						}
				else
				{
				return false;
			}
			}
	public static void main(String[] args) {
//		// TODO Auto-generated method 
	Scanner valiation=new Scanner(System.in);
		System.out.println("Data type Validation:");
	    Object object=valiation.nextLine();
		String datatype=valiation.nextLine();
		Validationfunction	 mi=new Validationfunction();
		System.out.println(mi.validateDataType(object,datatype));
		//System.out.println(validateDataType(5,"Integer"));
		System.out.println("Data type Length Validation:");
		Short length=valiation.nextShort();
		valiation.nextLine();
		System.out.println(mi.DataTypelength(object,length));
		System.out.println("Validate E-mail:");
		String emailStr =valiation.nextLine();
//		System.out.println(emailStr + ":");
		System.out.println(mi.validate(emailStr));
		System.out.println("Special Characters:");
	    String character =valiation.nextLine();
		System.out.println(mi.validatecharacter(character));
//		System.out.println(validatecharacter("ninka123"));	
		System.out.println("Domain value:");
		System.out.println(domainValue());
		System.out.println(isValidDate(date, "1996-08-24"));
	}

}

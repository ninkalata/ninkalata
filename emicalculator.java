package brd;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Calculate the Installment Amount of a loan given the following terms of the loan
//· Loan Amount
//· Rate of Interest
//· Tenure
//· Number of Installments in a Year

public class emicalculator {
	

	float getEMI(float loanAmount,float rateofInterest, float tenure,  float numberofInstallmentsIInAYear)
	{
   float Y,T,S,I,x;
    rateofInterest=rateofInterest/100;
I=rateofInterest/numberofInstallmentsIInAYear;
	Y=1+I;
	T=(float) Math.pow(Y,tenure);
	S=1/T;
	x=(loanAmount*I)/(1-S);
return x;

}
//	Generate the Repayment Schedule for the entire loan period ie. calculate and return Principal
//			and Interest component of each Installment given :
//			· The same parameters as above
	
	void repaymentSchedule(float emii,float loanAmount,float rateofInterest, float tenure, float numberofInstallmentsIInAYear)
	{ 
		System.out.println("******The Repayment Schedule for the entire loan period************");
		int j;
		float OPn[]=new float[100];
		float Pn[]=new float[100];
		float In[]=new float[100];
		OPn[1]=loanAmount;
	System.out.println( "# No\t" +  "outstanding\t " + "Installment No\t\t" +  "Principal component\t " + "EMI\t");
		for(j=1;j<=numberofInstallmentsIInAYear;j++)
		{	
			In[j]=(OPn[j]*(rateofInterest/(1200)));
			Pn[j]=emii-In[j];
			OPn[j+1]=OPn[j]-Pn[j];
		
			System.out.println(j+"\t " +OPn[j]+ " \t"+In[j]+" \t\t "+Pn[j]+ "\t\t"+emii);
					
		}	
	
	       

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Installmentnumber");
		int output=sc.nextInt();
		int g=output;
		if(g==output)
		{
			System.out.println(g+"\t " +OPn[g]+ " \t"+In[g]+" \t\t "+Pn[g]+ "\t\t"+emii);
			 System.out.println("****THANKYOU*****");
				
		}
	}
		
//		Function 3: Calculate the Principal and Interest component of an Installment given
//		· The same parameters as above
//		· The installment number for which the breakup is required
//		
//		
		

	

	
	
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
	
		
	    System.out.println("****Run program to calculate EMI for*****");
		System.out.println("Original Loan Principal Amount:"+"Rs");
		float loanAmount=sc.nextFloat();
		System.out.println(loanAmount);
		System.out.println("Interest Rate:");
		float rateofInterest=sc.nextFloat();
		System.out.println(rateofInterest+"%");
		System.out.println("Tenure:");
		float tenure=sc.nextFloat();
		System.out.println(tenure+"month");
		float numberofInstallmentsIInAYear=sc.nextFloat();
		System.out.println(numberofInstallmentsIInAYear);
        emicalculator mi=new emicalculator();
		float emii=mi.getEMI(loanAmount,rateofInterest,tenure,numberofInstallmentsIInAYear);
	

        
	 System.out.println("the Installment Amount of a loan :  Rs "+emii);
		
	   
		mi. repaymentSchedule(emii,loanAmount,rateofInterest,tenure,numberofInstallmentsIInAYear);
	
	
		
		
	}
}
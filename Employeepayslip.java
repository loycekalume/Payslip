package employee;
import java.util.Scanner;

public class Employeepayslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		

		
			
                 Scanner input=new Scanner(System.in);
				int employeeNo,daysWorked,payrate;
				int basicPay,p;
				double prof;
				String name,generationDate;
				String designation;
				System.out.print("Employee name:");
				name=input.next();
				System.out.print("Designation");
				designation=input.next();
				System.out.print("Days worked");
				daysWorked=input.nextInt();
				System.out.print("Pay rate:");
				payrate=input.nextInt();
				System.out.print("Generation date:");
				generationDate=input.next();
				
			basicPay=daysWorked*payrate;
				System.out.print("ENTER EMPLOYEE NUMMBER TO GENERATE PAYSLIP:");
				employeeNo=input.nextInt();
				System.out.println("");
				System.out.println("");
				System.out.println("\t\t\tSHREE KRISHNA CHEMIST AND DRUGGIST");
				System.out.println("\t\t\t\tSALARY MONTH 9 2013");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.print("EMP.NO:"+employeeNo);
				System.out.print("\t\t\tEMP.NAME:"+name);
				System.out.println("\t\t\tDesignation:"+designation);
				System.out.print("DAYS WORKED:"+daysWorked);
				System.out.print("\t\t\tPAY RATE:"+payrate);
				System.out.println("\t\t\tGEN.DATE:"+generationDate);
				System.out.println("____________________________________________________________________________________________");
				System.out.print("EARNINGS");
				System.out.print("\t\tAMOUNT(RS.)");
				System.out.print("\t\tDEDUCTIONS");
				System.out.println("\t\tAMOUNT(RS.)");
				System.out.println("____________________________________________________________________________________________");
				System.out.print("BASIC PAY");
				System.out.print("\t\t"+basicPay);
				System.out.print("\t\t\tP.F");
				
				
				p=basicPay/10;
				System.out.println("\t\t\t"+p);
				System.out.print("\t\t\t\t\t\tPROF.TAX");
				
				prof=0.20*basicPay;
				int pro=(int) prof;
				int deduct=pro-p;
				int netpay=basicPay-deduct;
				
				System.out.println("\t\t"+pro);
				System.out.println("____________________________________________________________________________________________");
				System.out.print("GROSS EARN.\t\t"+basicPay);
				System.out.println("\t\t\tTOTAL DEDUCT.\t\t"+deduct);
				System.out.print("\t\t\t\t\t\tNET PAY");
				System.out.println("\t\t\t"+netpay);
				System.out.println("");
				System.out.println("____________________________________________________________________________________________");
				
				
				
				
				
				
			
				
				
				
				
				
				
				
				
				

			}

		}
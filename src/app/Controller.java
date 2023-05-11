//=============================================================================
// PROGRAMMER: Roberto Callejas
// PANTHER ID: 6360177
//
// CLASS: COP2210
// SECTION: U02C
// SEMESTER: Summer 2023
// CLASSTIME: 10:00 AM - 12:50 PM
//
// Project: Lab 1.5
// DUE: May 14, 2023 @ 11:59 PM
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//                                          own and that none of it is the work of any other person.
//=============================================================================

package app;

public class Controller {

    public static void main (String[] args){
        yourInfoHeader();

        int x = 10;
        double y = 20.3;
        double z = x + y;
        String name = "John Doe";
        double hourlyWage = 35.50;
        double hoursWorked = 38.25;
        double weekPay = 35.50*38.25;
        //Using println()
        System.out.println("The Value of x = " + x );
        System.out.println("The Value of y = " + y );
        System.out.println("The Value of z = " + z);

        //Using printf()
        System.out.printf("name: \t\t\t %-20s \n", name);
        System.out.printf("hourlyWage: \t %-20.1f\n", hourlyWage);
        System.out.printf("hoursWorked \t %-20.2f\n", hoursWorked);

        System.out.printf("name: %s\n", name);

        System.out.printf("name: %s", name);
        System.out.printf("\thourlyWage: %2.4f\n", hourlyWage);

        System.out.printf("name: %s", name);
        System.out.printf("\t\thourlyWage: %2.4f", hourlyWage);
        System.out.printf("\t\thoursWorked: %2.3f\n", hoursWorked);

        System.out.printf("name: %20s\n", name);
        System.out.printf("hourlyWage: \t  %2.1f\n", hourlyWage);
        System.out.printf("hoursWorked \t  %2.2f\n", hoursWorked);

        System.out.printf("Employ: %s", name);
        System.out.printf("\tweekly pay is: $%4.2f", weekPay);


    }//end main

    //-----------------------------------------------------------
    // Beginning of yourInfoHeader() method
    public static void yourInfoHeader(){
        System.out.println("================================");
        System.out.println("PROGRAMMER:  " + "Replace Text");
        System.out.println("PANTHER ID:  " + "Replace Text");
        System.out.println();
        System.out.println("CLASS \t\t COP2210 ");
        System.out.println("SECTION: \t " + "Replace Text");
        System.out.println("SEMESTER: \t " + "Replace Text");
        System.out.println("CLASSTIME: \t " + "Replace Text");
        System.out.println();
        System.out.println("Assignment:  " + "Replace Text");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies and i certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("================================");
        System.out.println();
    }//end yourInfoHeader
}//end of class

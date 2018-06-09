package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

	// write your code here
        Scanner input = new Scanner(System.in);
        double saleAmount, amountDue = 0;
        String name, taxCode;
        int customerID;

        System.out.println("Customer ID:  ");
        customerID = input.nextInt();

        System.out.println("Customer Name:  ");
        name = input.next();

        System.out.print("Sales Amount:  ");
        saleAmount = input.nextDouble();

        System.out.println("Tax Code: ");
        taxCode = input.next();

      if (taxCode.equals("NRM") ) {
            amountDue= (saleAmount * 0.06) /100;
        }else if (taxCode.equals("NPF")){
          amountDue=saleAmount;
        }else if (taxCode.equals("BIZ")){
          amountDue=(saleAmount * 4.5)/100 ;
        }
       System.out.println("Customer ID : " + customerID);
       System.out.println("Customer Name: " + name);
       System.out.println("Sales Amount " + saleAmount);
       System.out.println("Tax Code: " + taxCode  );
       System.out.println("Total Amount Due: " + amountDue);

    }
}

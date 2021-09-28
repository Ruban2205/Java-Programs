// INHERITANCE IN JAVA
// 1) -> Develop a java application using Inheritance concept to automate the salary calculation of
// employee in an organization as per the salary band given below. Create a super class called
// Employee and derive sub classes as per the given table. Apply method overriding (Run
// time Polymorphism) to implement the following services via menu driven interface.

// a) Calculate Gross Salary
// b) Calculate Net Salary
// c) Calculate Tax
// d) Print the Pay Details

// Salary Band    Manager   Engineer
// Basic Salary   30000     20000
// DA Pay         95%       80%
// HRA            20%       15%
// TAX            25%       15%
// EPF            3000      2000

//Gross = basic+(basic*DA)+(basic*TAX)
//NetSal = basic+(basic*HRA)+(basic*DA)+EPF
//TaxVal = (basic*TAX)

import java.util.*;

class Employee {
  int basicSalary;
  float DA;
  float HRA;
  float TAX;
  int EPF;

  float NetSal;
  float Gross;
  float TaxVal;

  public void GrossSalary() {
    System.out.println("This Method will calculate the Gross Salary!!");
  }

  public void NetSalary() {
    System.out.println("This Method will calculate the Net Salary!!");
  }

  public void TaxPay() {
    System.out.println("This Method will calculate the Tax!!");
  }

  public void Display() {
    System.out.println("This Method act as a Display Method!!");
  }
}

class Manager extends Employee {
  public void GrossSalary() {
    Gross = basicSalary + (basicSalary * 95 / 100) + (basicSalary * 25 / 100);
  }

  public void NetSalary() {
    NetSal = basicSalary + (basicSalary * 20 / 100) + (basicSalary * 95 / 100) + 3000;
  }

  public void TaxPay() {
    TaxVal = (basicSalary * 25 / 100);
  }

  public void Display() {
    System.out.println(); 
    System.out.println("<-----THE PAY DETAILS OF A MANAGER----->");
    System.out.println("The Gross Salary of a MANAGER: " + Gross);
    System.out.println("The Net Salary of a MANAGER: " + NetSal);
    System.out.println("The Tax Pay of a MANAGER: " + TaxVal);
    System.out.println();
  }
}

class Engineer extends Employee {
  public void GrossSalary() {
    Gross = basicSalary + (basicSalary * 80 / 100) + (basicSalary * 15 / 100);
  }

  public void NetSalary() {
    NetSal = basicSalary + (basicSalary * 15 / 100) + (basicSalary * 15 / 100) + 2000;
  }

  public void TaxPay() {
    TaxVal = (basicSalary * 15 / 100);
  }

  public void Display() {
    System.out.println(); 
    System.out.println("<-----PAY DETAILS OF AN ENGINEER----->");
    System.out.println("The Gross Salary of a ENGINEER: " + Gross);
    System.out.println("The Net Salary of a ENGINEER: " + NetSal);
    System.out.println("The Tax Pay of a ENGINEER: " + TaxVal);
    System.out.println();
  }
}

public class SalaryCalc {

  public static Scanner scanner = new Scanner(System.in);
  public static int userInput;
  public static char isContinue; 
  public static boolean isCalculating = true;

  public static void manager() {
    Manager manager = new Manager();
    manager.basicSalary = 30000;
    manager.GrossSalary();
    manager.NetSalary();
    manager.TaxPay();
    manager.Display();
  }

  public static void engineer() {
    Engineer engineer = new Engineer();
    engineer.basicSalary = 20000;
    engineer.GrossSalary();
    engineer.NetSalary();
    engineer.TaxPay();
    engineer.Display();
  }

  public static void MenuDriven() {
    System.out.println("<=====AVAILABLE OPTIONS=====>");
    System.out.println("1. MANAGER");
    System.out.println("2. ENGINEER");
    System.out.println("3. Exit");

    System.out.print("Whose salary do you want to calculate?(1 or 2): ");
    userInput = scanner.nextInt();

    switch (userInput) {
      case 1:
        manager();
        System.out.print("Would you like to continue?(y/n): ");
        isContinue = scanner.next().charAt(0);
        System.out.println(); 

        if (isContinue == 'y'){
          MenuDriven(); 
        }
        else{
          System.out.println();
          System.out.println("Thanks for using SALARY CALCULATOR by URK20CS2001");
          System.out.println();
          isCalculating = false; 
          break;  
        }
        break;

      case 2:
        engineer();
        System.out.print("Would you like to continue?(y/n): ");
        isContinue = scanner.next().charAt(0);
        System.out.println(); 

        if (isContinue == 'y'){
          MenuDriven(); 
        }
        else{
          System.out.println();
          System.out.println("Thanks for using SALARY CALCULATOR by URK20CS2001");
          System.out.println();
          isCalculating = false; 
          break; 
        }
        break;

      case 3:
        System.out.println();
        System.out.println("Thanks for using SALARY CALCULATOR by URK20CS2001");
        System.out.println();
        isCalculating = false; 
        break;

      default:
        System.out.println(); 
        System.out.println("<xxxxx-INVALID OPTION SELECTED-xxxxx>");
        System.out.println();
        break;
    }
  }

  public static void main(String[] args) {
    System.out.println("\n<=====SALARY CALCULATOR=====>\n");

    while (isCalculating) {
      MenuDriven();
    }
  }
}
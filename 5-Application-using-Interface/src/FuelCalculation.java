/* 5) -> Consider the fuel rates in state wise as per the given table below. Create a Java application 
to calculate the fuel cost consumed by the customer. Create a super class called FUEL 
with few attributes such as fuel_name, state, cost. Add a function to calculate the cost for 
the fuel consumption required by customer. Derive sub classes as per the table given 
below. Provide an interface which prompts the user to give name, no. of litters required, 
etc. Finally print the name of the customer, state, no. of litter consumed and the total cost of 
the fuel. Complete the above scenario using Inheritance, Run Time Polymorphism with 
Menu driven options

                      TAMILNADU KERALA    KARNATAKA
Petrol (per liter)    Rs.97.46  Rs. 98.35 Rs.99.61
Diesel (per liter)    Rs. 96.08 Rs.97.37  Rs.98.61
Kerosene (per liter)  Rs. 25.7  Rs.26.4   Rs.27.6
Auto LPG Gas (per kg) Rs.70.33  Rs. 71.27 Rs. 72.0 */


import java.util.*;

class Fuel {
    String fuel_name;
    String state;
    double cost;

    void calculateCost(String username){
        System.out.println("\n<==========YOUR CONSUMED RESULT BELOW==========>");
        System.out.println();
        System.out.println("Name: " + username);
        System.out.println("State: " + state);
        System.out.println("Fuel Name: " + fuel_name);
        System.out.println("Cost per litre: ₹" + cost);
        System.out.println(); 
    }

}

class Petrol extends Fuel{

    String username;
    String state;
    double litres;

    Petrol(String username, String state, double litres){
        this.username = username;
        this.state = state;
        super.fuel_name = "Petrol";
        this.litres = litres;
    }

    void calculateCost(){

        if (this.state.equals("tn")){
            super.state = "Tamil Nadu";
            super.cost = 97.46;
        }
        else if (this.state.equals("kl")){
            super.state = "Kerala";
            super.cost = 98.35;
        }
        else if (this.state.equals("ka")){
            super.state = "Karnataka";
            super.cost = 99.61;
        }

        else{
            System.out.println("Please check your entries!!");
        }

        super.calculateCost(this.username);
        double total_cost = super.cost * this.litres;
        System.out.println("Total cost: ₹" + (double) Math.round(total_cost * 100) / 100);
        System.out.println("<==========THANKS FOR CALCULATING THE FUEL CONSUMPTION==========>");
    }

}

class Diesel extends Fuel{

    String username;
    String state;
    double litres;

    Diesel(String username, String state, double litres){
        this.state = state;
        super.fuel_name = "Diesel";
        this.litres = litres;
        this.username = username;
    }

    void calculateCost(){

        if (this.state.equals("tn")){
            super.state = "Tamil Nadu";
            super.cost = 96.08;
        }
        else if (this.state.equals("kl")){
            super.state = "Kerala";
            super.cost = 97.37;
        }
        else if (this.state.equals("ka")){
            super.state = "Karnataka";
            super.cost = 98.61;
        }

        else{
            System.out.println("Please check your entries!!");
        }

        super.calculateCost(this.username);
        double total_cost = super.cost * this.litres;
        System.out.println("Total cost: " +  (double) Math.round(total_cost * 100) / 100);
        System.out.println("<==========THANKS FOR CALCULATING THE FUEL CONSUMPTION==========>");
    }

}

class Kerosene extends Fuel{

    String username;
    String state;
    double litres;

    Kerosene(String username, String state, double litres){
        this.state = state;
        super.fuel_name = "Kerosene";
        this.litres = litres;
        this.username = username;
    }

    void calculateCost(){

        if (this.state.equals("tn")){
            super.state = "Tamil Nadu";
            super.cost = 25.7;
        }
        else if (this.state.equals("kl")){
            super.state = "Kerala";
            super.cost = 26.4;
        }
        else if (this.state.equals("ka")){
            super.state = "Karnataka";
            super.cost = 27.6;
        }

        else{
            System.out.println("Please check your entries!!");
        }

        super.calculateCost(this.username);

        double total_cost = super.cost * this.litres;
        System.out.println("Total cost: " + (double) Math.round(total_cost * 100) / 100);
        System.out.println("<==========THANKS FOR CALCULATING THE FUEL CONSUMPTION==========>");
    }

}

class LPG extends Fuel{

    String username;
    String state;
    double litres;

    LPG(String username, String state, double litres){
        this.state = state;
        super.fuel_name = "LPG";
        this.litres = litres;
        this.username = username;
    }

    void calculateCost(){

        if (this.state.equals("tn")){
            super.state = "Tamil Nadu";
            super.cost = 70.33;
        }
        else if (this.state.equals("kl")){
            super.state = "Kerala";
            super.cost = 71.27;
        }
        else if (this.state.equals("ka")){
            super.state = "Karnataka";
            super.cost = 72.08;
        }

        else{
            System.out.println("Please check your entries!!");
        }

        super.calculateCost(this.username);

        double total_cost = super.cost * this.litres;
        System.out.println("Total cost: " + (double) Math.round(total_cost * 100) / 100);
        System.out.println("<==========THANKS FOR CALCULATING THE FUEL CONSUMPTION==========>");
    }

}

public class FuelCalculation {

    static String name;
    static String state;
    static String fuel_name;
    static double litres;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n<-----AVAILABLE FUELS----->");
        System.out.println("+ PETROL");
        System.out.println("+ DIESEL");
        System.out.println("+ KEROSENE");
        System.out.println("+ LPG");

        System.out.print("Name of the fuel you want? : ");
        fuel_name = scanner.next().toLowerCase();

        if (fuel_name.equals("petrol")){

            try{

                System.out.print("How many amount of litres ?: ");
                litres = scanner.nextDouble();

                System.out.print("What's you're name?: ");
                name = scanner.next();

                System.out.print("Where are you from (tn/kl/ka) ?: ");
                state = scanner.next().toLowerCase();

                Petrol petrol = new Petrol(name, state, litres);
                petrol.calculateCost();

            }

            catch (InputMismatchException e){
                System.out.println("\nPlease check your INPUT!");
            }


        }

        else if (fuel_name.equals("diesel")){

            try {

                System.out.print("How many amount of litres ?: ");
                litres = scanner.nextDouble();

                System.out.print("What's you're name ?: ");
                name = scanner.next();

                System.out.println();

                System.out.print("Where are you from (tn/kl/ka) ?: ");
                state = scanner.next().toLowerCase();

                Diesel diesel = new Diesel(name, state, litres);
                diesel.calculateCost();

            }

            catch (InputMismatchException e){
                System.out.println("Please check your INPUT!");
            }

        }

        else if(fuel_name.equals("kerosene")){

            try {

                System.out.print("How many amount of litres ?: ");
                litres = scanner.nextDouble();

                System.out.print("What's you're name ?: ");
                name = scanner.next();

                System.out.print("Where are you from (tn/kl/ka) ?: ");
                state = scanner.next().toLowerCase();

                Kerosene kerosene = new Kerosene(name, state, litres);
                kerosene.calculateCost();

            }

            catch (InputMismatchException e){
                System.out.println("Please check your INPUT!");
            }

        }

        else if (fuel_name.equals("lpg")){

            try {

                System.out.print("How many amount of litres ?: ");
                litres = scanner.nextDouble();

                System.out.print("What's you're name ?: ");
                name = scanner.next();

                System.out.print("Where are you from (tn/kl/ka) ?: ");
                state = scanner.next().toLowerCase();

                LPG lpg = new LPG(name, state, litres);
                lpg.calculateCost();

            }

            catch (InputMismatchException e){
                System.out.println("Please check your INPUT!");
            }

        }

        else {
            System.out.println("Please check your INPUT!!!");
        }

    }

}
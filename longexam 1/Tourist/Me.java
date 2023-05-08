package Tourist;

import Locations.Boracay;
import Locations.Baguio;
import Locations.Tagaytay;
import Locations.Cebu;
import Locations.Locations;
import Locations.Bataan;
import Locations.Vigan;


public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        
        if (budget<100) {
        System.out.print("You don't have the budget to visit the next location.");
        System.exit(0); }
        else
        System.out.println("Enjoying my stay");
        
    }

    public void visit(Boracay boracay) {

        System.out.println("The air fare is " + boracay.airFare + " in Boracay");
        visit();
        budget -= boracay.airFare;
        checkBudget();

    }

    public void visit(Bataan bataan) {

        System.out.println("The air fare is " + bataan.airFare + " in Bataan");
        visit();
        budget -= bataan.airFare;
        checkBudget();
 
    }

    public void visit(Tagaytay tagaytay) {
        
        System.out.println("The air fare is " + tagaytay.airFare + " in Tagaytay");
        visit();
        budget -= tagaytay.airFare;  
        checkBudget();

    }

    public void visit(Cebu cebu) {

        System.out.println("The air fare is " + cebu.airFare + " in Cebu");
        visit();
        budget -= cebu.airFare;
        checkBudget();
   
    }

    public void visit(Vigan vigan) {

        System.out.println("The air fare is " + vigan.airFare + " in Vigan");
        visit();
        budget -= vigan.airFare;
        checkBudget();
   
    }
    
    public void visit(Baguio baguio) {

        System.out.println("The air fare is " + baguio.airFare + " in Baguio");
        visit();
        budget -= baguio.airFare;  
        checkBudget();
    }

    public void checkBudget() {
        budget -= Locations.airFare;
        System.out.println("my budget is " + budget + "\n");
    }

}
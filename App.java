import Tourist.*;
import Locations.*;


public class App {
    public static void main(String[] args) throws Exception {

        Tourist me = new Me();

        Locations boracay = new Boracay();
        Locations baguio = new Baguio();
        Locations tagaytay = new Tagaytay();
        Locations bataan = new Bataan();
        Locations cebu = new Cebu();
        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod


        boracay.accept(me);
        cebu.accept(me);
        tagaytay.accept(me);
        bataan.accept(me);
        baguio.accept(me);

        
        
    }
}
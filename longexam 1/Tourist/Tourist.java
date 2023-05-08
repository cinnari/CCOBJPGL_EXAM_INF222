package Tourist;

import Locations.Boracay;
import Locations.Baguio;
import Locations.Tagaytay;
import Locations.Cebu;
import Locations.Bataan;
import Locations.Locations;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Baguio baguio);

    void visit(Tagaytay tagaytay);

    void visit(Cebu cebu);

    void visit(Bataan bataan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
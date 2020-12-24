package carpetcostcalc;

import java.util.HashMap;

public class LivingSituation {
    String living;
    HashMap<Character, Double> map;
    public LivingSituation(String living) {
        this.living = living;
        map = new HashMap<Character, Double>();
        map.put('A', 1.00); // Apartment or rental: $1.00 sq.ft.
        map.put('M', 1.50); // Middle class: $1.50 sq.ft.
        map.put('D', 4.50); // Durable home: $4.50 sq.ft.
        map.put('L', 10.00); // Luxury home: $10 sq.ft.
    }
    public double getCost(double cost) {
        living = living.toUpperCase();
        char firstChar = living.charAt(0);
        double livingPrice = map.get(firstChar);
        return cost * livingPrice;
    }
}

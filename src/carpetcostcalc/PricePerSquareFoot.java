package carpetcostcalc;

import java.util.HashMap;

public class PricePerSquareFoot {
    String carpetType;
    HashMap<Character, Double> map;
    public PricePerSquareFoot(String carpetType) {
        this.carpetType = carpetType;
        map = new HashMap<Character, Double>();
        map.put('W', 10.00); // Wool Carpet: $10 sq.ft
        map.put('N', 5.00); // Nylon Carpet: $5 sq.ft
        map.put('S', 4.00); // Smartstrand Carpet: $4 sq.ft
        map.put('P', 2.50); // Polyester Carpet: $2.50 sq.ft
        map.put('O', 1.00); // Olefin Carpet: $1.00 sq.ft
    }
    public double getCost(double cost) {
        carpetType = carpetType.toUpperCase();
        char firstChar = carpetType.charAt(0);
        double pricePerSquareFoot = map.get(firstChar);
        return cost * pricePerSquareFoot;
    }
}

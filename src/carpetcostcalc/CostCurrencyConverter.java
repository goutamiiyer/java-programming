package carpetcostcalc;

import java.util.HashMap;

public class CostCurrencyConverter {
    String currency;
    HashMap<String, Double> map;
    public CostCurrencyConverter(String currency) {
        this.currency = currency;
        map = new HashMap<String, Double>();
        map.put("INR", 0.014);
        map.put("EUR", 0.82);
        map.put("CAD", 1.28);
        map.put("MXN", 20.03);
        map.put("GBP", 0.74);
    }
    public double convert(double cost) {
        double convertedCost = map.get(currency);
        return cost * convertedCost;
    }
}

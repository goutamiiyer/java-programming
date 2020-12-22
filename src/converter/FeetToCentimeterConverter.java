package converter;

public class FeetToCentimeterConverter {
    /* Problem Statement
    * Convert Inches, Feet to Centimeter using method overloading
    * */
    public static void main(String[] args) {
        double inches = 11.5;
        double feet = 8.0;
        printInchesToCentimeter(inches);
        printFeetToCentimeter(feet, inches);
    }
    private static double feetToCentimeter(double inches) {
        if (inches >= 0) {
            double inchesToFeet = inches / 12;
            double inchesRemaining = inches - (inchesToFeet * 12);
            return feetToCentimeter(inchesToFeet, inchesRemaining);
        }
        return -1;
    }
    private static double feetToCentimeter(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double feetToInches = feet * 12;
            double centimeter = (feetToInches + inches) * 2.54;
            return centimeter;
        }
        return -1;
    }
    private static void printInchesToCentimeter(double inches) {
        double centimeter = feetToCentimeter(inches);
        if (centimeter < 0) {
            System.out.println("Invalid Input - Input less than 0");
        } else {
            System.out.println("The value in centimeter after conversion is " + Math.round(centimeter));
        }
    }
    private static void printFeetToCentimeter(double feet, double inches) {
        double centimeter = feetToCentimeter(feet, inches);
        if (centimeter < 0) {
            System.out.println("Invalid Input - Input less than 0");
        } else {
            System.out.println("The value in centimeter after conversion is " + Math.round(centimeter));
        }
    }
}

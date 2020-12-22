package converter;

public class SpeedConverter {
    /* Problem Statement
     * Convert Kilometers per hour to Miles per hour
     * */
    public static void main(String[] args) {
        double kilometersPerHour = 100;
        printSpeed(kilometersPerHour);
    }
    private static long toMilesPerHour(double kilometersPerHour) {
        return Math.round((long) (kilometersPerHour/1.609));
    }
    private static void printSpeed(double kilometersPerHour) {
        if (kilometersPerHour < 0.0) {
            System.out.println("Speed is less than 0");
        }
        else {
            System.out.println(toMilesPerHour(kilometersPerHour));
        }
    }
}

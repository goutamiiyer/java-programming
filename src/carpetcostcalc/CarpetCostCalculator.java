package carpetcostcalc;

import java.util.Scanner;

public class CarpetCostCalculator {
    /* Problem Statement
     * A carpet company has asked you to write an application that calculates the price of carpeting for rectangular rooms.
     * To calculate the price, you multiply the area of the floor(width times length) by the price per square foot of carpet.
     * For example, the area of floor that is 12 feet long and 10 feet wide is 120 square feet.
     * To cover that floor with carpet that costs $8 per square foot would cost $960 (12x10x8=960).
     * First, you should create a class named RoomDimension that has two Fields: one for the length of the room and one for the width.
     * The RoomDimension class should have a method that returns the area of the room (the area of the room is the room's length multiplied by the room's width).
     * Next, you should create a RoomCarpet class that has a RoomDimension object as a field.
     * It should also have a field for the cost of the carpet per square foot.
     * The RoomCarpet class should have a method that returns the total cost of the carpet.
     * Once you have written these classes, use them in an application that asks the user to enter the dimensions of a room and the price per square foot of the desired carpeting.
     * The application should display the total cost of the carpet.
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the dimensions of the room and the the price per square foot of the desired carpeting");
        System.out.print("Enter the length of the room: ");
        double lengthOfRoom = sc.nextDouble();

        System.out.print("Enter the width of the room: ");
        double widthOfRoom = sc.nextDouble();

        System.out.print("Enter the price per square foot of the desired carpeting: ");
        double costOfCarpet = sc.nextDouble();

        sc.close();

        RoomDimension roomDimension = new RoomDimension(lengthOfRoom, widthOfRoom);
        RoomCarpet roomCarpet = new RoomCarpet(lengthOfRoom, widthOfRoom, costOfCarpet);

        System.out.println("Total Cost of the Carpet is $" + String.format("%.2f", roomCarpet.getTotalCostOfCarpet()));
    }
    /* Input/Output
    * Please enter the dimensions of the room and the the price per square foot of the desired carpeting
    * Enter the length of the room: 12
    * Enter teh width of the room: 10
    * Enter the price per square foot of the desired carpeting: 8
    * Total Cost of the Carpet is $960.00
    * */
}

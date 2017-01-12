// Day 2 - Operators

import java.util.*;
public class Arithmetic {

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt();
        scan.close();

        double tip = mealCost * ((tipPercent + 0.0)/100);
        double tax = mealCost * ((taxPercent + 0.0)/100);
        mealCost = mealCost + tip + tax;

        int totalCost = (int) Math.round(mealCost);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
}
}

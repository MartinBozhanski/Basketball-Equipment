import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double shoesPrice = annualFee - (annualFee * 0.4);
        double basketballOutfit = shoesPrice - (shoesPrice * 0.2);
        double basketballBall = basketballOutfit / 4;
        double accessories = basketballBall / 5;

        double finalPrice = annualFee + shoesPrice + basketballOutfit
                + basketballBall + accessories;

        System.out.println(finalPrice);
    }
}

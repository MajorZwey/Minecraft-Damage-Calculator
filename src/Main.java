

import java.util.Scanner;
public class Main {
   static void main(String[] args) {





        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the damage?: ");
        double damage = scanner.nextDouble();

        System.out.print("How much armor points? (1-20) ");
        int armor_points = Math.min(20,scanner.nextInt());

        System.out.print("How much armor toughness? (1-20) ");
        int toughness = Math.min(20,scanner.nextInt());

        double damage_taken = (damage * (1 - Math.min(20, Math.max(armor_points / 5, armor_points - (4 * damage) / (toughness + 8))) / 25));
        System.out.println("The damage taken without enchants is " + damage_taken);

        System.out.println("How much protection? (1-20) ");
        double protection = Math.min(20,scanner.nextDouble());

        double damage_taken_prot = damage_taken * (1 - protection / 25);

        System.out.println("The damage taken with protection is " + damage_taken_prot);


        scanner.close();


    }








}

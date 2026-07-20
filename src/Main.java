

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("What is the damage?: ");
          double damage = scanner.nextDouble();

          System.out.print("How much armor points? (0-20): ");
          int armorPoints = scanner.nextInt();

          System.out.print("How much armor toughness? (0-20): ");
          int toughness = scanner.nextInt();

          double epf = armorPoints - (4.0 * damage) / (toughness + 8);
          double reduction = Math.min(20, Math.max(armorPoints / 5.0, epf));
          double damageTaken = damage * (1 - reduction / 25);

          System.out.println("The damage taken without enchants is " + damageTaken);

          System.out.print("How much total Protection EPF? (0-20): ");
          double protection = Math.min(20, Math.max(0, scanner.nextDouble()));

          double damageTakenProt = damageTaken * (1 - protection / 25);
          System.out.println("The damage taken with protection is " + damageTakenProt);

          scanner.close();
     }
}










}

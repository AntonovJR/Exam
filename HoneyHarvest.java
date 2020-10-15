import java.util.Scanner;
//by Alex Antonov
public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine().toLowerCase();
        int amountFlower = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        double honey = 0;
        if (flowerType.equals("sunflower")) {
            if (season.equals("spring")) {
                honey = 10;
            }
            if (season.equals("summer")) {
                honey = 8*1.1;
            }
            if (season.equals("autumn")) {
                honey = 12*0.95;
            }
        }
        if (flowerType.equals("daisy")) {
            if (season.equals("spring")) {
                honey = 12*1.1;
            }
            if (season.equals("summer")) {
                honey = 8*1.1;
            }
            if (season.equals("autumn")) {
                honey = 6*0.95;
            }
        }
        if (flowerType.equals("lavender")) {
            if (season.equals("spring")) {
                honey = 12;
            }
            if (season.equals("summer")) {
                honey = 8*1.1;
            }
            if (season.equals("autumn")) {
                honey = 6*0.95;
            }
        }
        if (flowerType.equals("mint")) {
            if (season.equals("spring")) {
                honey = 10*1.1;
            }
            if (season.equals("summer")) {
                honey = 12*1.1;
            }
            if (season.equals("autumn")) {
                honey = 6*0.95;
            }
        }
        double totalHoney = honey * amountFlower;
        System.out.printf("Total honey harvested: %.2f", totalHoney);
    }
}

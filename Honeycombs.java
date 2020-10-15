import java.util.Scanner;

public class Honeycombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bees = Integer.parseInt(scanner.nextLine());
        int flowers = Integer.parseInt(scanner.nextLine());
        double honey = bees*flowers*0.21;
        double honeyCombs = honey/100;
        double grams = honey%100;
        System.out.printf("%.0f honeycombs filled.",Math.floor(honeyCombs));
        System.out.printf("%n%.2f grams of honey left.",grams);
    }
}

import java.util.Scanner;

public class HoneyWinterReserves2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountHoney = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        double honey = 0;
        String input = scanner.nextLine();
        while (!input.equals("Winter has come")) {
            for (int i = 0; i <= 6; i++) {
                honey += Double.parseDouble(scanner.nextLine());
            }
            input = scanner.nextLine();
            if (!input.equals("Winter has come")) {
                name = input;
            }
        }
        if (honey < 0) {
            System.out.printf("%s was banished for gluttony", name);
        }
        if (honey < amountHoney) {
            System.out.printf("Hard Winter! Honey needed %.2f.", amountHoney - honey);
        }
        if (honey > amountHoney) {
            System.out.printf("Well done! Honey surplus %.2f.", honey - amountHoney);
        }

    }
}


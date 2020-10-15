import java.util.Scanner;

public class BeehiveDefense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bees = Integer.parseInt(scanner.nextLine());
        int health = Integer.parseInt(scanner.nextLine());
        int attack = Integer.parseInt(scanner.nextLine());
        while (bees >= 100) {
            bees -= attack;
            health -= bees * 5;

            if (bees <= 100) {
                if(bees<=0){
                    System.out.println("The bear stole the honey! Bees left 0.");
                }else {
                    System.out.println("The bear stole the honey! Bees left " + bees + ".");
                }
            }else if(health<=0){
                System.out.println("Beehive won! Bees left " + bees+".");
                return;
            }

        }
    }
}
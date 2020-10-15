import java.util.Scanner;

public class BeehivePopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double currentPopulation = Double.parseDouble(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());
        double population = 0;
        for (int i = 1; i <= years; i++) {


             if (i % 5 == 0) {
                 currentPopulation += Math.floor(currentPopulation / 10) * 2;
                 currentPopulation -=  Math.floor(currentPopulation/50)*5;
                 currentPopulation -=  Math.floor(currentPopulation/20)*2;

            }else{
                 currentPopulation += Math.floor(currentPopulation / 10) * 2;
                 currentPopulation -= Math.floor(currentPopulation/20)*2;
             }


        }
        System.out.printf("Beehive population: %.0f",currentPopulation);
    }
}

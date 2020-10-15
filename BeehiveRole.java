import java.util.Scanner;

public class BeehiveRole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intelligence = Integer.parseInt(scanner.nextLine());
        int strength = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine().toLowerCase();

        if(intelligence>=80&&strength>=80&&gender.equals("female")){
            System.out.println("Queen Bee");
        } else if(intelligence>=80){
            System.out.println("Repairing Bee");
        }else if(intelligence>=60){
            System.out.println("Cleaning Bee");
        }else if(strength>=80&&gender.equals("male")){
            System.out.println("Drone Bee");
        }else if(strength>=60){
            System.out.println("Guard Bee");
        }else{
            System.out.println("Worker Bee");
        }

    }
}
//https://judge.softuni.bg/Contests/2459/Programming-Basics-Online-Exam-6-and-7-June-2020
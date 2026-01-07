import java.util.Scanner;

public class Mains {
    public static void main(String[] args){

        //WEIGHT CONVERSION PROGRAM USING JAVA

        Scanner scanner = new Scanner(System.in);

        int choice;
        double weight;
        double converted_weight;

        //1 lbs = 0.45kg
        //1 kg = 2.20 lbs

        System.out.println("-----UNIT CONVERTER-----");

        System.out.println("Choose your desired unit : ");
        System.out.println("1. LBS to KG");
        System.out.println("2. KG to LBS");
        choice =  scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in pounds : ");
            weight = scanner.nextDouble();
            converted_weight = weight * 0.453;
            System.out.printf("Your weight in KG's is %.2f kgs: ", converted_weight);
        }

        else if(choice == 2){
            System.out.print("Enter your weight in kgs : ");
            weight = scanner.nextDouble();
            converted_weight = weight * 2.204;
            System.out.printf("Your weight in pounds is %.2f lbs : ", converted_weight);
        }

        else{
            System.out.println("Invalid choice");
        }

        scanner.close();


    }
}

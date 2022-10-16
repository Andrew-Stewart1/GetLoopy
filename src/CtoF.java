import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        double celcius = 0;
        double fahrinehit = 0;
        String trash;

        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter your temperature in celcius");
            celcius = Double.parseDouble(in.nextLine());
            if(in.hasNextDouble()){
                celcius = in.nextDouble();
                in.nextLine();

                fahrinehit = (celcius * 1.8) + 32;

                System.out.println("The temerature in fahrenheit is: " + fahrinehit);

            }else {
                trash = in.nextLine();
                System.out.println("You entered an invalid temperature: " + trash);
            }
        }while((celcius <= 0));



    }
}

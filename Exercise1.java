import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temperature;
        System.out.print("Enter temperature: ");
        temperature = scan.nextDouble();
        if (temperature < 0) {
            System.out.println("The temperature can be compared to ICE");
        } else if (temperature <= 100) {
            System.out.println("The temperature can be compared to WATER");
        } else {
            System.out.println("The temperature can be compared to STEAM");
        }
    }
}

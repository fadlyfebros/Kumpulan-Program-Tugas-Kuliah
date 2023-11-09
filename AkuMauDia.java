import java.util.Scanner;

public class AkuMauDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah dia maunya sama aku? (ya/tidak): ");
        String jawaban = scanner.next();

        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.println("Selalu Bersamanya");
        } else {
            System.out.println("Sadar Diri lah");
        }
        scanner.close();
    }
}

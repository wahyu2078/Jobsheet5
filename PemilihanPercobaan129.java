import java.util.Scanner;

public class PemilihanPercobaan129 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input29.nextInt();
        String message = angka % 2 == 0 ? " bilangan genap" : " bilangan ganjil";
        System.out.println("Angka " + angka + message);

        // if (angka % 2 == 0)
        // System.out.println("Angka "+angka+" bilangan genap");
        // else
        // System.out.println("Angka"+angka+" bilangan ganjil");
    }

}

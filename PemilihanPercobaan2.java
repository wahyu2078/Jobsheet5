import java.util.Scanner;

public class PemilihanPercobaan2 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
    System.out.print("Nilai uas      :  ");
    float uas = input29.nextFloat();
    System.out.print("Nilai uts      :  ");
    float uts = input29.nextFloat();
    System.out.print("Nilai kuis     :  ");
    float kuis = input29.nextFloat();
    System.out.print("Nilai tugas    :  ");
    float tugas = input29.nextFloat();

    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

    String message = total < 65 ? "Remidi" : "Tidak Remidi";
    System.out.println("Nilai Akhir = "+ total + " Sehingga " + message);
    }
}

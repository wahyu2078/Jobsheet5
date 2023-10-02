import java.util.Scanner;

public class PemilihanPercobaan229 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        String huruf = "";
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

        if (80 < total)
            huruf = "A";
        else if (73 < total)
            huruf = "B+";
        else if (65 < total)
            huruf = "B";
        else if (60 < total)
            huruf = "C+";
        else if (50 < total)
            huruf = "C";
        else if (39 < total)
            huruf = "D";
        else if (total < 39)
            huruf = "E";

        System.out.println("Nilai Akhir = " + total + " " + huruf + " Sehingga " + message);
    }
}

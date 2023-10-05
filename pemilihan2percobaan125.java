import java.util.Scanner;

public class pemilihan2percobaan125 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.println("Masukan tahun");
int tahun = input25.nextInt();

String hasil = "bukan tahun Kabsiat";
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            hasil = "Tahun Kabsiat";
        else {
            if ((tahun % 400) == 0)
hasil = "Tahun kabsiat";
System.out.println(hasil);
        }
        }
    }
}
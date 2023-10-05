import java.util.Scanner;

public class pemilihan2percobaan125 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.println("Masukan tahun");
int tahun = input25.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
            System.out.println("Tahun Kabsiat");
        else 
System.out.println("Bukan Tahun Kabsiat");
        }
    }
}
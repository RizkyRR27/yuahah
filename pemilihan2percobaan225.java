import java.util.Scanner;
public class pemilihan2percobaan225 {
    public static void main(String[] args) {
      Scanner input25 = new Scanner(System.in);
      System.out.println("Masukan sudut 1");
      int sudut1 = input25.nextInt();
      int totalSudut;
System.out.println("Masukan sudut 2");
int sudut2 = input25.nextInt();
System.out.println("Masukan sudut 3");
int sudut3 = input25.nextInt();

totalSudut = sudut1 + sudut2 + sudut3;

if (totalSudut == 180){
if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
System.out.println("Segitiga tersebut adalah segitiga siku siku");
else if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60))
System.out.println("Segitiga tersebut adalah segitiga sisi");
else if ((sudut1 == 70) || (sudut2 == 70) || (sudut3 == 40))
System.out.println("Segitiga tersebut adalah segitiga sama kaki");
else 
System.out.println("Segitiga tersebut adalah segitiga sembarang");
} else 
System.out.println("Bukan segitiga");
}
}

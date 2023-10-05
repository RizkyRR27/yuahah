import java.util.Scanner;
public class kelompokjs625 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        System.out.println("Pencatatan Stok Barang");
        System.out.print("Masukkan jumlah stok awal: ");
        int stokAwal = input25.nextInt();
        
        if (stokAwal <= 0) {
            System.out.println("Stok kosong atau tidak valid.");
        } else {
            System.out.println("Stok awal: " + stokAwal);
            
            System.out.print("Apakah Anda ingin menambah atau mengurangi stok? (tambah/kurang): ");
            String operasi = input25.next();
            
            if (operasi.equalsIgnoreCase("tambah")) {
                System.out.print("Masukkan jumlah yang ingin ditambahkan: ");
                int tambahStok = input25.nextInt();
                int stokAkhir = stokAwal + tambahStok;
                System.out.println("Stok akhir: " + stokAkhir);
            } else if (operasi.equalsIgnoreCase("kurang")) {
                System.out.print("Masukkan jumlah yang ingin dikurangkan: ");
                int kurangStok = input25.nextInt();
                int stokAkhir = stokAwal - kurangStok;
                
                if (stokAkhir < 0) {
                    System.out.println("Stok tidak dapat menjadi negatif.");
                } else {
                    System.out.println("Stok akhir: " + stokAkhir);
                }
            } else {
                System.out.println("Operasi tidak valid.");
            }
        }
        
        input25.close();
    }
}
    


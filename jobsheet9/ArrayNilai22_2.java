import java.util.Scanner;
public class ArrayNilai22_2 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner (System.in);
        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {  
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc22.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70){
                 System.out.println("Nilai akhir ke-"+i+"lulus");                 
            } else {
                 System.out.println("Nilai akhir ke-"+i+"Tidak lulus");
            }
           
        }
    }
}

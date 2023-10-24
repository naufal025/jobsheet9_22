import java.util.Scanner;
public class ArrayRataNilai22_2 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner (System.in);
        int [] nilaiMhs = new int [10];
        double totalLulus = 0;
        double totalTLulus = 0;
        double rataLulus,rataTLulus;
        int jmlMhs = 0;
        int countLulus = 0;
        int countTLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMhs = sc22.nextInt();

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc22.nextInt();

            if (nilaiMhs[i] > 70){
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTLulus += nilaiMhs[i];
                countTLulus++;
            }
        }

        if (countLulus > 0) {
            rataLulus = totalLulus / countLulus;
            System.out.println("Rata-rata nilai yang lulus : " +rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus");
        }

        if (countTLulus > 0){
            rataTLulus = totalTLulus / countTLulus;
            System.out.println("Rata-rata nilai yang Tidak lulus : " +rataTLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus");
        }

       

        
}
}

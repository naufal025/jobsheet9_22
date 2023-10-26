import java.util.Scanner;
public class SearchBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kodeBuku [] = {111,112,113,114};
        int key;
        

        System.out.println("Masukkan kode buku yang ingin anda cari : ");
        key = sc.nextInt();
        int hasil = 0;
        for(int i = 0; i < kodeBuku.length; i++){
            if(key == kodeBuku[i]){
                hasil = 1;
                System.out.println("Kode buku yang anda masukkan valid");
                break;
            } else {
                continue;
            }
        }
        if (hasil != 1){
            System.out.println("Kode Buku Invalid");
        }
    }
}

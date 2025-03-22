import java.util.Scanner;

public class MahasiswaDemo18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer

        MahasiswaBerprestasi list = new MahasiswaBerprestasi(jumlahMahasiswa);

        // Memasukkan data mahasiswa secara dinamis
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Membersihkan buffer setelah nextDouble()

            Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }


        //System.out.println("Data Mahasiswa sebelum sorting : ");
        //list.tampil();

        //list.bubbleSort();

        //System.out.println("Data yang sudah terurut enggunakan SELECTION SORT (ASC) : ");
        //list.selectionSort();
        //list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
        
    }
}

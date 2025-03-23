import java.util.Scanner;

public class MainDosen18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen18 data = new DataDosen18();

        // **Tambahkan Data Dosen secara manual**
        System.out.print("Masukkan jumlah dosen yang ingin ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i + 1));
            System.out.print("Masukkan kode: ");
            String kode = sc.nextLine();
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Masukkan usia: ");
            int usia = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            Dosen18 dsn = new Dosen18(kode, nama, jenisKelamin, usia);
            data.tambah(dsn);
        }

        // **Tampilkan Data Dosen**
        System.out.println("\nData Dosen Sebelum Sorting:");
        data.tampil();

        // **Sorting ASC (Muda ke Tua - Bubble Sort)**
        System.out.println("\nData Dosen Setelah Sorting Usia ASC (Bubble Sort):");
        data.SortingASC();
        data.tampil();

        // **Sorting DSC (Tua ke Muda - Selection Sort)**
        System.out.println("\nData Dosen Setelah Sorting Usia DSC (Selection Sort):");
        data.sortingDSC();
        data.tampil();

        // **Sorting DSC (Tua ke Muda - Insertion Sort)**
        System.out.println("\nData Dosen Setelah Sorting Usia DSC (Insertion Sort):");
        data.insertionSort();
        data.tampil();

    }
}

public class DataDosen18 {
    
    Dosen18[] dataDosen = new Dosen18[10];
    int idx = 0;

    // Method untuk menambahkan data dosen
    public void tambah(Dosen18 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    // Method untuk menampilkan semua data dosen
    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // **Sorting ASCENDING (Bubble Sort - usia muda ke tua)**
    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    // Swap
                    Dosen18 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data dosen berhasil diurutkan (ASC - Usia Muda ke Tua).");
    }

    // **Sorting DESCENDING (Selection Sort - usia tua ke muda)**
    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            // Swap
            Dosen18 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data dosen berhasil diurutkan (DSC - Usia Tua ke Muda).");
    }

    // **Insertion Sort (Descending - usia tua ke muda)**
    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen18 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
        System.out.println("Data dosen berhasil diurutkan menggunakan Insertion Sort (DSC - Usia Tua ke Muda).");
    }
}

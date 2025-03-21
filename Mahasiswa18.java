public class Mahasiswa18 {
    
    String nim;
    String nama;
    String kelas;
    double ipk;

    //konstruktor default
    Mahasiswa18() {

    }

    //konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    Mahasiswa18 (String nm, String name, String kls, double  ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInfromasi() {
        System.out.println("nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}

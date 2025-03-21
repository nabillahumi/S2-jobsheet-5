

public class SortingMain18 {

    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12} ;

    Sorting18 dataurut1 = new Sorting18 (a, a.length);

    System.out.println("Data awal 1");
    dataurut1.tampil();
    dataurut1.bubbleSort();
    System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
    dataurut1.tampil();

    int b[] = {30, 20, 2, 8, 14} ;

    Sorting18 dataururt2 = new Sorting18(b, b.length);

    System.out.println("Data awal 2");
    dataururt2.tampil();
    dataururt2.SelectionSort();
    System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC) ");
    dataururt2.tampil();

    int c[] = {40, 10, 4, 9, 3} ;

    Sorting18 dataururt3 = new Sorting18 (c, c.length);

    System.out.println("Data awal 3");
    dataururt3.tampil();
    dataururt3.insertionSort();
    System.out.println("data sudah diurutkan dengn INSERTION SORT (ASC)");
    dataururt3.tampil();
    }   
}
    
    

package Tugas;

public class Penilaian {
    public static void main(String[] args) {
        int i,jum = 0,data=3,tot = 0;
        double rata;
        int[] l = new int[5];
        int[] j = new int[5];
        j[1] = 90;
        j[2] = 75;
        j[3] = 70;

        l[1] = 75;
        l[2] = 80;
        l[3] = 90;

        for (i = 1; i <= data; i++ ) {
            System.out.println("-----------------------------");
            System.out.println("Nilai Test" + i + "= " + j[i]);
            System.out.println("Nilai Test" + i + "= " + l[i]);

            tot = jum + (j[i]+l[i]);
            rata = tot / 2;

            System.out.println("total Nilai = " + tot);
            System.out.println("Rata rata nilai = " + rata);
        }
    }
}

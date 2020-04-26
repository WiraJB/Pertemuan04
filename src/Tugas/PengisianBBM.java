package Tugas;

public class PengisianBBM {
    public static void main(String[] args) {
        int bbm = 0;
        int isiBBM = 10;
        int perliter =7000;
        int harga;

        System.out.println("BBM yg keluar saat ini " +bbm+ "L");
        System.out.println("Harga BBM perliter " +perliter+ "-Rp" );
        System.out.println("BBM yg ingin di isi " +isiBBM +"L");

        for (bbm =0 ; bbm <= isiBBM ; bbm++){
            System.out.println("Sedang Mengisi..");
            System.out.println("BBM yg keluar saat ini " +bbm +"L");
        }

        System.out.println("BBM sudah terisi : " +bbm +"L");
        harga=isiBBM * perliter;

        System.out.println("Harga BBM = " +harga+ "-Rp" );

    }
}

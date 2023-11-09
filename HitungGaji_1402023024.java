public class HitungGaji_1402023024 {
    public static void main(String[] args) {

        String nama = args[0];
        int jamKerja = Integer.parseInt(args[1]);
        int tarifPerJam = Integer.parseInt(args[2]);
        int kursRupiahKeDollar = Integer.parseInt(args[3]);

        // Menghitung gaji
        int gajiRupiah = jamKerja * tarifPerJam;
        double gajiDollar = (double) gajiRupiah / kursRupiahKeDollar;

        // Menampilkan hasil
        System.out.println("===================================================");
        System.out.println("              Program Menghitung Gaji              ");
        System.out.println("===================================================");
        System.out.println("Nama                             : " + nama);
        System.out.println("Jam Kerja                        : " + jamKerja + " jam");
        System.out.println("Tarif Per Jam                    : Rp " + tarifPerJam);
        System.out.println("Kurs Mata Uang Rupiah ke Dollar  : Rp " + kursRupiahKeDollar);
        System.out.println("---------------------------------------------------");
        System.out.println("                 Sedang Menghitung                 ");
        System.out.println("---------------------------------------------------");
        System.out.println("Saudara/i " + nama + " total gaji Anda adalah : Rp " + gajiRupiah);
        System.out.println("Dalam Kurs Dollar gaji Anda adalah : $ " + gajiDollar);
        System.out.println("---------------------------------------------------");
        System.out.println("Terimakasih telah menggunakan Program ini.");
    }
}

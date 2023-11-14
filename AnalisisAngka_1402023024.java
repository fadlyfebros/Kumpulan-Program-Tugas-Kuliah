/* 
Fadly Febro Surya Pratama
1402023024 
 */
public class AnalisisAngka_1402023024 {
    public static void main(String[] args) {
         // Mengambil input dari command line arguments dan menyimpannya dalam array
        String[] iniArgumen = {args[0], args[1], args[2], args[3]};
        int namaPanjang = args[0].length();
        String npm = args[1].substring(8, 10);
        /* =========================================================== */
        // Mengkonversi string menjadi double untuk angka pertama dan kedua
        double angkaPertama = Double.parseDouble(args[2]);
        double angkaKedua = Double.parseDouble(args[3]);
        // Mengambil dua digit terakhir dari NPM dan menjadikannya integer
        int duaDigitNpmTerakhir = Integer.parseInt(npm.substring(npm.length() - 2));
        // Menghitung angka unik sebagai hasil penjumlahan panjang nama dan dua digit terakhir NPM
        int angkaUnik = namaPanjang + duaDigitNpmTerakhir;        
        /* ========================================================== */
        // Mengevaluasi beberapa kondisi untuk angka pertama
        boolean angkaPertamaPositif = (angkaPertama > 0);
        boolean angkaPertamaDecimal = (angkaPertama % 1 != 0);
        double angkaPertamaTambahAngkaUnik = (angkaPertama + angkaUnik);
        /* =========================================================== */
        // Mengevaluasi beberapa kondisi untuk angka kedua
        boolean angkaKeduaDecimal = (angkaKedua % 1 != 0);
        boolean angkaKeduaPositif = (angkaKedua > 0);
        // Membuat array of double untuk menyimpan hasil perhitungan angkaKeduaTambahAngkaUnik
        double[] angkaKeduaTambahAngkaUnik = new double[1];
        // Mengisi elemen pertama dari array dengan hasil perhitungan angkaKedua + angkaUnik
        angkaKeduaTambahAngkaUnik[0] = angkaKedua + angkaUnik;
        /* =========================================================*/
        // Membuat array of boolean untuk menyimpan hasil evaluasi kondisi mencariFalse dan mencariFalseKedua
        boolean[] hasilFalse = new boolean[2];
        // Mengisi elemen pertama dari array dengan hasil evaluasi kondisi pertama
        hasilFalse[0] = (duaDigitNpmTerakhir > angkaPertama && duaDigitNpmTerakhir < (double) angkaKedua);
        // Mengisi elemen kedua dari array dengan hasil evaluasi kondisi kedua
        hasilFalse[1] = (duaDigitNpmTerakhir > angkaPertama && duaDigitNpmTerakhir < (double) angkaKedua);
        /* ============================================================================================= */
        // Mencetak hasil analisis
System.out.println("****************************************************************");
System.out.println("\t\t\tANALISIS ANGKA\t\t\t");
System.out.println("Program ini Dibuat oleh: Fadly Febro Surya Pratama / 1402023024");
System.out.println("****************************************************************");
System.out.println("Nama Panggilan\t\t: " + iniArgumen[0]);
System.out.println("Npm\t\t\t: " + iniArgumen[1]);
System.out.println("================================================================");
System.out.println("Angka ke-1\t\t: " + angkaPertama);
System.out.println("Angka ke-2\t\t: " + angkaKedua);;
System.out.println("Angka Unik\t\t: " + angkaUnik);
System.out.println("Dua Digit NPM terakhir\t: " + duaDigitNpmTerakhir);
System.out.println("================================================================");
System.out.println("Angka ke-1 Positif\t: " + angkaPertamaPositif);
System.out.println("Angka ke-1 Desimal\t: " + angkaPertamaDecimal);
System.out.println("Angka ke-1 + Angka Unik\t: " + angkaPertamaTambahAngkaUnik);
System.out.println("================================================================");
System.out.println("Angka ke-2 Positif\t: " + angkaKeduaPositif);
System.out.println("Angka ke-2 Desimal\t: " + angkaKeduaDecimal);
System.out.println("Angka ke-2 + Angka Unik\t: " + angkaKeduaTambahAngkaUnik[0]);
System.out.println("================================================================");
System.out.println("Dua digit NPM terakhir milik " + iniArgumen[0] + " Berada diantara " + angkaPertama + " dan " + angkaKedua + ": " + hasilFalse[0]);
System.out.println("Angka unik milik " + iniArgumen[0] + " Berada diantara " + angkaPertama + " dan " + angkaKedua + ": " + hasilFalse[1]);
    }
}
/* Copyright © dlyy 2023 */
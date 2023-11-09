public class MekanismeBalistik_1402023024 {
    public static void main(String[] args) {
        // Mengambil input dari baris perintah
        double kecepatanAwalan = Double.parseDouble(args[0]);
        double kecepatanAkhiran = Double.parseDouble(args[1]);
        double waktuTempuhBenda = Double.parseDouble(args[2]);
        double gravitasiBenda = Double.parseDouble(args[3]);

        // Menghitung percepatan benda
        double percepatanBenda = (kecepatanAkhiran - kecepatanAwalan) / waktuTempuhBenda;
        // Menghitung jarak tempuh benda menggunakan rumus gerak lurus beraturan
        double jarakTempuh = (kecepatanAwalan * waktuTempuhBenda) + (0.5 * percepatanBenda * waktuTempuhBenda * waktuTempuhBenda);
        // Menghitung mekanisme balistik benda
        double mekanismeBalistik = jarakTempuh / gravitasiBenda;

        // Menampilkan output dengan informasi yang dihitung
        System.out.println("====================================================");
        System.out.println("            Program Mekanisme Balistik              ");
        System.out.println("Dibuat oleh [Fadly Febro Surya Pratama]/[1402023024]");
        System.out.println("====================================================");
        System.out.println("Kecepatan Awal benda       : " + kecepatanAwalan + " m/s.");
        System.out.println("Kecepatan Akhir benda      : " + kecepatanAkhiran + " m/s.");
        System.out.println("Waktu Tempuh benda        : " + waktuTempuhBenda + " sekon.");
        System.out.println("Gravitasi pada benda       : " + gravitasiBenda + " m/s.");
        System.out.println("-------------------------------------------------");
        System.out.println("Percepatan benda           : " + (kecepatanAkhiran - kecepatanAwalan) / waktuTempuhBenda + " m/s.");
        System.out.println("Jarak tempuh benda         : " + jarakTempuh + " m.");
        System.out.println("Mekanisme Balistik benda   : " + mekanismeBalistik + " m.");
        System.out.println("-------------------------------------------------");
        System.out.println("Jadi, Jarak tempuh benda adalah " + jarakTempuh + " m.");
        System.out.println("Mekanisme balistik benda terjadi pada " + mekanismeBalistik + " m.");
    }
}

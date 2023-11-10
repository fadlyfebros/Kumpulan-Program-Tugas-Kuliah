/* Nama: Fadly Febro Surya Pratama
   Npm: 1402023024
 */
public class PesertaLomba_1402023024 {
    public static void main(String[] args) {
        // manufacturersName dan studentParticipantNumber adalah variabel string yang menyimpan nama pembuat program dan NPM/studentParticipantNumber (Nomor Pokok Mahasiswa) pembuat program.
        String manufacturersName = "Fadly Febro Surya Pratama";
        String studentParticipantNumber = "1402023024";
        // fullName, participantsAge, typeOfCompetition, dan number adalah variabel yang diinisialisasi dengan nilai dari argumen baris perintah yang dimasukkan oleh pengguna.
        String fullName = args[0].toUpperCase();
        int participantsAge = Integer.parseInt(args[3]);
        String typeOfCompetition = args[2];
        int number = Integer.parseInt(args[1]);
        // Mengambil frontCharacter, middle, dan final dari nama lengkap
        char frontCharacter = fullName.charAt(0);
        char middleCharacter = fullName.charAt(2);
        char finalCharacter = fullName.charAt(fullName.indexOf(' ') - 1);
        // Menggabungkan karakter-karakter di atas dengan umur peserta untuk membentuk kode nama
        String codeName = "" + frontCharacter + middleCharacter + finalCharacter + participantsAge;
        // Menghitung nomor urut dan peringkat peserta berdasarkan karakter-karakter di atas dan angka dari argumen
        int serialNumber =  (frontCharacter + middleCharacter + finalCharacter) / number;
        int Rating = (frontCharacter + middleCharacter + finalCharacter) % number;
        // Menampilkan informasi peserta lomba ke layar
        System.out.println("====================================================");
        System.out.println("               Program PESERTA LOMBA                  ");
        System.out.println("Dibuat oleh: " + manufacturersName + " / " + studentParticipantNumber);
        System.out.println("====================================================");
        System.out.println("Peserta Lomba\t\t\t: " + typeOfCompetition);
        System.out.println("Nama\t\t\t\t: " + fullName);
        System.out.println("Umur\t\t\t\t: " + participantsAge);
        System.out.println("----------------------------------------------------");
        System.out.println("Karakter depan dari nama\t: " + frontCharacter);
        System.out.println("Karakter tengah dari nama\t: " + middleCharacter);
        System.out.println("Karakter belakang dari nama\t: " + finalCharacter);
        System.out.println("----------------------------------------------------");
        System.out.println("Kode Nama\t\t\t: " + codeName);
        System.out.println("Peserta No Urut\t\t\t: " + serialNumber);
        System.out.println("Peringkat\t\t\t: " + Rating);
    }
}

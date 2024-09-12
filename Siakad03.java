import java.util.Scanner;
public class Siakad03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        
        double bobotKuis = 0.2;
        double bobotTugas = 0.15; 
        double bobotUTS = 0.3;
        double bobotUAS = 0.35;

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: " );
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        System.out.println("Masukkan Nilai Akhir:");
        
        nilaiAkhir = ((nilaiKuis * bobotKuis) + (nilaiTugas * bobotTugas) + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS));

        System.out.print("Nama: " + nama + " NIM: " + nim);
        System.out.print(" Kelas: " + kelas + " Absen: " + absen);
        System.out.println(" NIlai Akhir: " + nilaiAkhir);
        }
}
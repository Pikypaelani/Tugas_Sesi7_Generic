//Nama: Piky Paelani
//Kelas: TI22J
package PialaDunia;
import java.util.ArrayDeque;
public class DaftarPemainPersib {
    public static void main(String[] args) {
    ArrayDeque<String> daftarPemainPersib= new ArrayDeque<>();
    daftarPemainPersib.add("Zalnando 1");
    daftarPemainPersib.add("David Dasilva 2");
    daftarPemainPersib.add("Ciro Avles 3");
    daftarPemainPersib.add("Dedi K 4");
    daftarPemainPersib.add("Febrihayadi 5");
    
    System.out.println("Daftar Pemain Persib:");
    for (String Persib : daftarPemainPersib) {
      System.out.println(Persib);
    }

   //Pemain Pertama sedang Melakukan tanda tangan Kontrak
    String PelangganSedangDiproses = daftarPemainPersib.poll();
    System.out.println("\nSedang melakukan Registrasi Kontrak: " + PelangganSedangDiproses);

    
    //KOntrak Pemain Seteah di Proses
    System.out.println("\nDaftar Kontrak Pemain Persib Setelah Diproses:");
    for (String Nomerkontrak : daftarPemainPersib) {
      System.out.println(Nomerkontrak);
    }
}
}
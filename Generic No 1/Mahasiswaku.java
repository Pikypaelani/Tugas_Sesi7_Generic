//Nama: Piky Paelani
//Kelas: TI22J
package tugassesi7mahasiswa;

public class Mahasiswaku {
    public static void main(String[] args) {
        Mahasiswa <String, String, Integer> m = new Mahasiswa<>();
        m.setNim("201800888999");
        m.setNama("Lord Ucup");
        m.setClass(18);

        System.out.println(m.getNim());
        System.out.println(m.getNama());
        System.out.println(m.getClass());
    }
}


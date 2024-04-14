//Nama: Piky Paelani
//Kelas: TI22J
package PialaDunia;
import java.util.ArrayList;
public class TeamPialaDunia {
     public static void main(String[] args) {
    ArrayList<String> teamPialaDunia = new ArrayList<>();
    
    teamPialaDunia.add("Argentina");
    teamPialaDunia.add("Brazil");
    teamPialaDunia.add("Indonesia");
    teamPialaDunia.add("Portugal");
    teamPialaDunia.add("Spanyol");
    teamPialaDunia.add("Uruguay");
    
    
    System.out.println("Daftar Team Piala Dunia :");
    for (int i = 0; i < teamPialaDunia.size(); i++) {
      System.out.println((i+1) + ". " + teamPialaDunia.get(i));
    }
    
    teamPialaDunia.remove(3); 
    teamPialaDunia.remove(2); 
    System.out.println("\nDaftar team Piala Dunia yang dihapus:");
    for (int i = 0; i < teamPialaDunia.size(); i++) {
      System.out.println((i+1) + ". " + teamPialaDunia.get(i));
    }
  }
}

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Komputer> komputery = new ArrayList<>();
        KomputerWindows dell = new KomputerWindows("12ADS", "Windows 11");
        KomputerWindows asus = new KomputerWindows("ROG", "Windows 10");
        KomputerMac macbook = new KomputerMac("air", "os17");
        KomputerMac mac = new KomputerMac("pro", "os17");

        komputery.add(dell);
        komputery.add(asus);
        komputery.add(macbook);
        komputery.add(mac);

        for(Komputer k: komputery){
            System.out.println(k.getClass().getName());
            k.uruchom();
            k.zepsujSie();
            System.out.println("--------------------");
        }

        Collections.sort(komputery);
        System.out.println(komputery);
    }
}
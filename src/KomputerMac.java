public class KomputerMac implements Komputer {

    private String model;
    private String wersjaSystemu;
    public KomputerMac(String model, String wersjaSystemu) {
        this.model = model;
        this.wersjaSystemu = wersjaSystemu;
    }
    @Override
    public void uruchom() {
        System.out.println("Włączam się, poczekaj");
    }
    @Override
    public void zepsujSie() {
        System.out.println("Zepsuło się");
    }
}

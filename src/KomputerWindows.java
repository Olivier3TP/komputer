public class KomputerWindows implements Komputer {

    private String model;
    private String wersjaSystemu;
    public KomputerWindows(String model, String wersjaSystemu) {
        this.model = model;
        this.wersjaSystemu = wersjaSystemu;
    }
    @Override
    public void uruchom() {
        System.out.println("Zaczekaj włączam się");
    }
    @Override
    public void zepsujSie() {
        System.out.println("kaput");
    }
}

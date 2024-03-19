public interface Komputer extends Comparable<Komputer> {
    void uruchom();
    void zepsujSie();
    default int compareTo(Komputer o) {
        return getClass().getName().length() - o.getClass().getName().length();
    }
}

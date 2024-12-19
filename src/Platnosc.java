public class Platnosc {
    private int kwota;
    private String statusPlatnosci;
    public Platnosc(int kwota, String statusPlatnosci){
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }
    public String getsp(){
        return statusPlatnosci;
    }
    public void zaplac(KoszykZakupowy koszykZakupowy){
        statusPlatnosci = "Opłacone";
        kwota = koszykZakupowy.obliczCalkowitaWartosc();
    }
}

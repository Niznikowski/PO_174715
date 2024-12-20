import java.util.Objects;

public class Renifer {
    private String imie;
    private int predkosc;
    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }
    public String getImie() {
        return imie;
    }
    public int getPredkosc(){
        return predkosc;
    }
    public void setImie(String imie) {
        if(imie != null) {
            this.imie = imie;
        }else{
            System.out.println("Error: Imię nie może być null");
        }
    }
    public void setPredkosc(int predkosc) {
        if(predkosc > 0) {
            this.predkosc = predkosc;
        }else{
            System.out.println("Error: Prędkość nie może być mniejsza od 0");
        }
    }
    public void nakarmRenifera(){
        predkosc += 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Renifer renifer = (Renifer) o;
        return getPredkosc() == renifer.getPredkosc() && Objects.equals(getImie(), renifer.getImie());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getImie());
        result = 31 * result + getPredkosc();
        return result;
    }

    @Override
    public String toString() {
        return "Renifer{" +
                "imie='" + imie + '\'' +
                ", predkosc=" + predkosc +
                '}';
    }
}

import java.util.Objects;

public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;
    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    public String getImie() {
        return imie;
    }
    public int getWiek(){
        return wiek;
    }
    public String getStanowisko(){
        return stanowisko;
    }
    public void setImie(String imie) {
        if(imie != null){
            this.imie = imie;
        }else{
            System.out.println("Error: Imię nie może być null");
        }
    }
    public void setWiek(int wiek) {
        if(wiek > 0){
            this.wiek = wiek;
        }else{
            System.out.println("Error: Wiek nie może być mniejszy od 0");
        }
    }
    public void setStanowisko(String stanowisko) {
        if(stanowisko != null){
            this.stanowisko = stanowisko;
        }
    }

    public void przedstawSie(){
        System.out.println("Cześć, nazywam się "+imie+", mam "+wiek+" lat, a moje stanowisko pracy to "+stanowisko+".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elf elf = (Elf) o;
        return getWiek() == elf.getWiek() && Objects.equals(getImie(), elf.getImie()) && Objects.equals(getStanowisko(), elf.getStanowisko());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getImie());
        result = 31 * result + getWiek();
        result = 31 * result + Objects.hashCode(getStanowisko());
        return result;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", stanowisko='" + stanowisko + '\'' +
                '}';
    }
}

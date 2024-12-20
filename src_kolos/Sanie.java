import java.util.ArrayList;
import java.util.Objects;

public class Sanie {
    private ArrayList<Renifer> renifers;
    public Sanie() {
        renifers = new ArrayList<Renifer>();
    }
    public ArrayList<Renifer> getRenifers() {
        return renifers;
    }
    public void setRenifers(ArrayList<Renifer> renifers) {
        this.renifers = renifers;
    }
    public void dodajRenifera(Renifer renifer) {
        renifers.add(renifer);
    }
    public void sumaPredkosci(){
        int suma = 0;
        for(Renifer i: renifers) {
            suma += i.getPredkosc();
        }
        System.out.println(suma);
    }
    public Renifer najwolniejszyRenifer(){
        int naj = 1000;
        Renifer ren = null;
        for(Renifer i: renifers) {
            if(naj > i.getPredkosc()){
                naj = i.getPredkosc();
                ren = i;
            }
        }
        return ren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sanie sanie = (Sanie) o;
        return Objects.equals(getRenifers(), sanie.getRenifers());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRenifers());
    }

    @Override
    public String toString() {
        return "Sanie{" +
                "renifers=" + renifers +
                '}';
    }
}

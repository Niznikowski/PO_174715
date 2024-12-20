import java.util.ArrayList;
import java.util.Objects;

public class Fabryka {
    private ArrayList<Elf> elfs;
    private int dlGeo;
    private int szGeo;
    public Fabryka(int dlGeo, int szGeo) {
        elfs = new ArrayList<Elf>();
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }
    public ArrayList<Elf> getElfs() {
        return elfs;
    }
    public int getDlGeo() {
        return dlGeo;
    }
    public int getSzGeo() {
        return szGeo;
    }
    public void setElfs(ArrayList<Elf> elfs) {
        this.elfs = elfs;
    }
    public void setDlGeo(int dlGeo) {
        if(dlGeo <= 180 && dlGeo >= -180) {
            this.dlGeo = dlGeo;
        }
        else{
            System.out.println("Error: dlGeo musi być między: 180 a -180");
        }
    }
    public void setSzGeo(int szGeo) {
        if(szGeo <= 90 && szGeo >= -90) {
            this.szGeo = szGeo;
        }
        else{
            System.out.println("Error: dlGeo musi być między: 90 a -90");
        }
    }

    public void dodajPracownika(Elf elf){
        elfs.add(elf);
    }
    public void usunPracownika(Elf elf){
        elfs.remove(elf);
    }
    public Elf najstarszyPracownik(){
        int naj = 0;
        Elf elf = null;
        for(Elf i: elfs){
            if(i.getWiek() > naj){
                naj = i.getWiek();
                elf = i;
            }
        }

        return elf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fabryka fabryka = (Fabryka) o;
        return getDlGeo() == fabryka.getDlGeo() && getSzGeo() == fabryka.getSzGeo() && Objects.equals(getElfs(), fabryka.getElfs());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getElfs());
        result = 31 * result + getDlGeo();
        result = 31 * result + getSzGeo();
        return result;
    }

    @Override
    public String toString() {
        return "Fabryka{" +
                "elfs=" + elfs +
                ", dlGeo=" + dlGeo +
                ", szGeo=" + szGeo +
                '}';
    }
}

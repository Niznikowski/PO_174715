public class Animal {
    private String name;
    private int wiek;
    private int waga;

    public Animal(String name, int wiek, int waga){
        this.name = name;
        this.wiek = wiek;
        this.waga = waga;
    }
    public int getWiek() {
        return wiek;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        if(waga > 0){
            this.waga = waga;
        }
        else{
            this.waga = 0;
        }
    }

    public void setWiek(int wiek) {
        if(wiek > 0){
            this.wiek = wiek;
        }
        else{
            this.wiek = 0;
        }
    }
    public String getName() {
        return name;
    }
}

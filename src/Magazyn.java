public class Magazyn {
    private zestaw_6.Produkt produkty;
    private int ilosc;
    public Magazyn(zestaw_6.Produkt produkty, int ilosc){
        this.produkty = produkty;
        this.ilosc = ilosc;
    }
    public void wyswietlAsortyment(){

    }
    public int getIlosc() {
        return ilosc;
    }
    void dodajDoMagazynu(int i){
        ilosc += i;
    }
    void usunZMagazynu(int i){
        if(ilosc >= i){
            ilosc -= i;
        }
    }



}

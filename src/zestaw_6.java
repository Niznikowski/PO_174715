import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class zestaw_6 {
    public static void main(String[] args) {
        Produkt p = new Produkt("mleko", 5);
        Produkt p2 = new Produkt("kaktus", 40);
        Produkt p3 = new Produkt("krzesło", 100);
        Produkt p4 = new Produkt("taboret", 20);
        Magazyn magazyn = new Magazyn(p, 20);
        magazyn.dodajDoMagazynu(4);
        HashMap<Produkt, Integer> lista = new HashMap<Produkt, Integer>();
        HashMap<Produkt, Integer> lista2 = new HashMap<Produkt, Integer>();
        KoszykZakupowy koszyk = new KoszykZakupowy(lista);
        KoszykZakupowy koszyk2 = new KoszykZakupowy(lista2);
        koszyk.dodajProdukt(p, 5, magazyn);
        koszyk.dodajProdukt(p2, 1, magazyn);
        koszyk2.dodajProdukt(p3, 6, magazyn);
        koszyk2.dodajProdukt(p4, 4, magazyn);
        //koszyk.wyswietlZawartoscKoszyka();
        //System.out.println("Wartość koszyka: " + koszyk.obliczCalkowitaWartosc());
        Platnosc platnosc1 = new Platnosc(koszyk.obliczCalkowitaWartosc(), "nieopłacone");
        Platnosc platnosc2 = new Platnosc(koszyk2.obliczCalkowitaWartosc(), "nieopłacone");
        Zamowienie kol12 = new Zamowienie(koszyk, "nieopłacone", platnosc1);
        Zamowienie kol13 = new Zamowienie(koszyk2, "czeka na płatność", platnosc2);
        //kol12.wyswietlZamowienie();
        //kol12.ustawStatusZamowienia("opłacone");
        //kol12.wyswietlZamowienie();
        ArrayList<Zamowienie> listazamowien = new ArrayList<>();
        Klient Romek = new Klient("Romek", "Skur", listazamowien, new Adres("ogurkowa", 33, "kapustowo", 94300));
        Romek.dodajZamowienie(kol12);
        Romek.dodajZamowienie(kol13);
        //Romek.wyswietlHistorieZamowien();
        //System.out.println("Łączny koszt zamowień: " + Romek.obliczLacznyKosztZamowien());
        ArrayList<Produkt> produkty = new ArrayList<>();
        Sklep Biedra = new Sklep(produkty, "Pszczółka",  "20-12-2001",magazyn);
        Biedra.dodajProdukt(p);
        Biedra.dodajProdukt(p3);
        Biedra.dodajProdukt(p2);
        Biedra.wyswietlOferty();
        Biedra.zakupy(p, 10, koszyk2, magazyn);
        Adres adres = new Adres("Gryfa", 44, 69, "Ogre", 96420);
        Adres adres2 = new Adres("Romby", 29, "Wamber", 86420);
        adres.pokaz();
        adres.przed(adres2);


        
    }
    public static class Produkt {
        String nazwa;
        int cena;
        public Produkt(String n, int c){
            nazwa = n;
            cena = c;
        }

        public int getCena() {
            return cena;
        }

        public String getNazwa() {
            return nazwa;
        }

        public void setCena(int cena) {
            this.cena = cena;
        }

        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }

        public void wyswietlInformacje(){
            System.out.println(nazwa + " cena: " +cena);
        }
    }
}
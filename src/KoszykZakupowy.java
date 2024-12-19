import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;

public class KoszykZakupowy {
    private HashMap<zestaw_6.Produkt, Integer> listaProduktow = new HashMap<zestaw_6.Produkt, Integer>();

    public KoszykZakupowy(HashMap<zestaw_6.Produkt, Integer> listaProduktow){
        this.listaProduktow = listaProduktow;
    }
    public void dodajProdukt(zestaw_6.Produkt produkt, int ilosc, Magazyn magazyn){
        int mag = magazyn.getIlosc();
        if(ilosc <= mag){
            listaProduktow.put(produkt, ilosc);
            magazyn.usunZMagazynu(ilosc);
        }else {
            System.out.println("Brak wysztarczającej ilości produktu: "+ produkt.nazwa + " na magazynie");
        }
    }
    public void wyswietlZawartoscKoszyka(){
        for(zestaw_6.Produkt i: listaProduktow.keySet()){
            System.out.println(i.nazwa + " " + listaProduktow.get(i));
        }
    }
    public int obliczCalkowitaWartosc(){
        int cw = 0;
        for(zestaw_6.Produkt i : listaProduktow.keySet()){
            cw += listaProduktow.get(i) * i.cena ;
        }
        return cw;
    }

}

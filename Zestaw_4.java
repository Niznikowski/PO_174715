import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Zestaw_4 {
    public static void main(String[] args) {
        //generujTablice(10, 2, 17);
        //wypiszTablice(generujTablice(9, 2, 17), 3, 4);
        //System.out.println(ileNieparzystych(generujTablice(10, 2, 10)));
        //System.out.println(ileParzystych(generujTablice(10, 2, 10)));
        //System.out.println(ileDodatnich(generujTablice(10, -10, 10)));
        //System.out.println(ileUjemych(generujTablice(10, -10, 10)));
        //System.out.println(ileZerowych(generujTablice(10, -10, 10)));
        //System.out.println(ileMaxymalnych(generujTablice(10, 5, 10)));
        //System.out.println(ileMinimalnych(generujTablice(10, 5, 10)));
        //System.out.println(ileUniklanych(generujTablice(10, 5, 10)));
        //System.out.println(sumaDodatnich(generujTablice(10, 2, 15)));
        //System.out.println(sumaUjemnych(generujTablice(10, 2, 15)));
        //System.out.println(sredniaArytmetyczna(generujTablice(10, 2, 10)));
        //System.out.println(sredniaGeometryczna(generujTablice(10, 2, 10)));
        //System.out.println(sredniaHarmoniczna(generujTablice(3, 2, 10)));
        //System.out.println(funkcjaLiniowa(generujTablice(5, 1, 5), 2, 5));
        //System.out.println(funkcjaKwadratowa(generujTablice(5, 1, 5), 2, 5, 5));
        //System.out.println(funkcjaWykladnicza(generujTablice(5, 1, 5), 2));
        //System.out.println(funkcjaSignum(generujTablice(5, -5, 5)));
        //int[] naj = najdluzszyCiagDodatnich(generujTablice(10,-5, 5));
        //int[] naj = najdluzszyCiagUjemnych(generujTablice(10,-5, 5));
        //for(int i : naj){
        //    System.out.print(i + " ");
        //}
        //int[] n = odwrocTablice(generujTablice(11, 0, 9));
        int[] n = odwrocTablicev2(generujTablice(11, 0, 9), 3, 6);
        for(int i : n){
            System.out.print(i + " ");
        }




    }
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc){
        int[] tab = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
        for (int wartosc : tab){
            System.out.print(wartosc + " ");
        }
        System.out.println();
        return tab;
    }
    public static void wypiszTablice(int[] tab, int n, int m){

        int k = 0;
        while (k < tab.length) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(tab[k] + " ");
                    k++;
                    if(k>tab.length-1){
                        break;
                    }
                }
                System.out.println();
            }
        }
    }
    public static int ileNieparzystych(int[] tab){
        int count = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 1){
                count++;
            }
        }
        return count;
    }
    public static int ileParzystych(int[] tab){
        int count = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static int ileDodatnich(int[] tab){
        int count = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                count++;
            }
        }
        return count;
    }
    public static int ileUjemych(int[] tab){
        int count = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                count++;
            }
        }
        return count;
    }
    public static int ileZerowych(int[] tab){
        int count = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == 0){
                count++;
            }
        }
        return count;
    }
    public static int ileMaxymalnych(int[] tab){
        int count = 0;
        int max = tab[0];
        for(int j = 0; j < tab.length; j++){
            if (tab[j] > max){
                max = tab[j];
            }
        }
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == max){
                count++;
            }
        }
        return count;
    }
    public static int ileMinimalnych(int[] tab){
        int count = 0;
        int min = tab[0];
        for(int j = 0; j < tab.length; j++){
            if (tab[j] < min){
                min = tab[j];
            }
        }
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == min){
                count++;
            }
        }
        return count;
    }
    public static int ileUniklanych(int[] tab){
        int unik = 0;
        int p;

        for(int i = 0; i < tab.length; i++){
            p = tab[i];
            int count = 0;
            for (int j = 0; j < tab.length; j++) {
                if (p == tab[j]) {
                    count++;
                }
            }
            if(count == 1){
                unik++;
            }
        }
        return unik;
    }
    public static int sumaDodatnich(int[] tab){
        int suma = 0;
        for (int j : tab) {
            if (j % 2 == 0) {
                suma += j;
            }
        }
        return suma;
    }
    public static int sumaUjemnych(int[] tab){
        int suma = 0;
        for (int j : tab) {
            if (j % 2 == 1) {
                suma += j;
            }
        }
        return suma;
    }
    public static float sredniaArytmetyczna(int[] tab){
        float srednia = 0;
        int suma = 0;
        for(int i : tab){
            suma += i;
        }
        srednia = (float) suma / tab.length;
        return srednia;
    }
    public static float sredniaGeometryczna(int[] tab){
        float srednia = 0;
        int iloczyn = 1;
        for(int i : tab){
            iloczyn *= i;
        }
        srednia = (float) Math.pow(iloczyn, 1.0/tab.length);
        return srednia;
    }
    public static float sredniaHarmoniczna(int[] tab){
        float srednia = 0;
        float suma = 0;
        for (int i : tab){
            suma += (float) 1 / i;
        }
        srednia = (float) tab.length / suma;
        return srednia;
    }
    public static int[] funkcjaLiniowa(int[] tab, int a, int b){
        int[] funkcja = new int[tab.length];
        int y;
        for (int i = 0; i < tab.length; i++){
            y = a*tab[i] + b;
            funkcja[i] = y;
        }
        for (int wartosc : funkcja){
            System.out.print(wartosc + " ");
        }
        System.out.println();
        return funkcja;
    }
    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c){
        int[] funkcja = new int[tab.length];
        int y;
        for (int i = 0; i < tab.length; i++){
            y = (int) (a * Math.pow(tab[i], 2) + b*tab[i] + c);
            funkcja[i] = y;
        }
        for (int wartosc : funkcja){
            System.out.print(wartosc + " ");
        }
        System.out.println();
        return funkcja;
    }
    public static int[] funkcjaWykladnicza(int[] tab, int a){
        int[] funkcja = new int[tab.length];
        int y;
        for(int i = 0; i < tab.length; i++){
            y = (int) Math.pow(a, tab[i]);
            funkcja[i] = y;
        }
        for (int wartosc : funkcja){
            System.out.print(wartosc + " ");
        }
        System.out.println();
        return funkcja;
    }
    public static int[] funkcjaSignum(int[] tab){
        int[] funkcja = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                funkcja[i] = 1;
            } else if (tab[i] == 0) {
                funkcja[i] = 0;
            }else {
                funkcja[i] = -1;
            }
        }
        for (int wartosc : funkcja){
            System.out.print(wartosc + " ");
        }
        System.out.println();
        return funkcja;
    }
    public static int[] najdluzszyCiagDodatnich(int[] tab){
        int maxDlugosc = 0;
        int startIndexNajdluzszego = 0;
        int obecnaDlugosc = 0;
        int obecnyStart = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                if (obecnaDlugosc == 0) {
                    obecnyStart = i;
                }
                obecnaDlugosc++;
            } else {
                if (obecnaDlugosc > maxDlugosc) {
                    maxDlugosc = obecnaDlugosc;
                    startIndexNajdluzszego = obecnyStart;
                }
                obecnaDlugosc = 0;
            }
        }
        if (obecnaDlugosc > maxDlugosc) {
            maxDlugosc = obecnaDlugosc;
            startIndexNajdluzszego = obecnyStart;
        }
        int[] najdluzszyCiag = new int[maxDlugosc];
        System.arraycopy(tab, startIndexNajdluzszego, najdluzszyCiag, 0, maxDlugosc);
        return najdluzszyCiag;
    }
    public static int[] najdluzszyCiagUjemnych(int[] tab){
        int maxDlugosc = 0;
        int startIndexNajdluzszego = 0;
        int obecnaDlugosc = 0;
        int obecnyStart = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                if (obecnaDlugosc == 0) {
                    obecnyStart = i;
                }
                obecnaDlugosc++;
            } else {
                if (obecnaDlugosc > maxDlugosc) {
                    maxDlugosc = obecnaDlugosc;
                    startIndexNajdluzszego = obecnyStart;
                }
                obecnaDlugosc = 0;
            }
        }
        if (obecnaDlugosc > maxDlugosc) {
            maxDlugosc = obecnaDlugosc;
            startIndexNajdluzszego = obecnyStart;
        }
        int[] najdluzszyCiag = new int[maxDlugosc];
        System.arraycopy(tab, startIndexNajdluzszego, najdluzszyCiag, 0, maxDlugosc);
        return najdluzszyCiag;
    }
    public static int[] odwrocTablice(int[] tab){
        int p;
        int z = tab.length;
        for(int i = 0; i < z / 2; i++){
            p = tab[i];
            tab[i] = tab[z-i-1];
            tab[z-i-1] = p;
        }
        return tab;
    }
    public static int[] odwrocTablicev2(int[] tab, int indeksStart, int indeksStop){
        int p;
        int z = tab.length;
        for(int i = indeksStart; i < indeksStop-2; i++){
            p = tab[i];
            tab[i] = tab[z-i-1];
            tab[z-i-1] = p;
        }
        return tab;
    }
}
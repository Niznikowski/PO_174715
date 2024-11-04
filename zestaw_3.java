public class zestaw_3 {
    public static void main(String[] args) {
        //trojkiPitagorejskie(20);
        //funKwaRozwiazania(5);
        //funKwaDelta(20);
        //liczbyPierwsze(11);
        //liczbyPodzielne(3, 4);
        //piramida(3,1);
        //silnia(5);
        //silniaPodwojna(3);
        //silnia(2, 3);
        //dwumainNewton(6 ,2);
        //ciagFibonacciego(8);
        //sumaNaturalnych(3);
        //sumaParzystych(3);
        //sumaNieparzystych(5);
        //sumaKwaNaturalnych(4);
        //sumaSzeNaturalnych(3);
        //sumaOdwNaturalnych(2);
        //String wyraz = "potop";
        //boolean bol = czyPalindrom(wyraz);
        //System.out.println(bol);
        //trojkatPascla(7);
        //boolean bol = czyPalindromv2(121);
        //System.out.println(bol);
        //int liczba = 6;
        //int liczba2 = 7;
        //boolean bol1 = czyDoskonala(liczba);
        //boolean bol2 = czyDoskonala(liczba2);
        //System.out.println(bol1);
        //System.out.println(bol2);
        //int l1 = 11;
        //int l2 = 6;
        //boolean bol1 = czyPierwsza(l1);
        //boolean bol2 = czyPierwsza(l2);
        //System.out.println(bol1);
        //System.out.println(bol2);
        //System.out.println(NWD(108, 99));
        //int[] ta = wczytajTablice(4);
        //for(int i: ta){
        //    System.out.print(i + " ");
        //}
        //int[] tab = new int[4];
        //tab = new int[]{1, 9, 4, 8};
        //podzbiory(tab);





    }
    static void trojkiPitagorejskie(int n){
        int a = 0;
        int b = 0;
        int c = 0;
        for(int j = 0; j < n; j++) {
            b++;
            a = 0;
            for(int k =0; k < b-1; k ++) {
                a++;
                c = 0;
                for(int l = 0; l < n; l++) {
                    c++;
                    if (a * a + b * b == c * c) {
                        System.out.println("result "+ a + " " + b + " " + c);
                    }
                }
            }
        }
    }
    static void funKwaRozwiazania(int n){
        int a = 0;
        int b = 0;
        int c = 0;
        for(int j = 0; j < n; j++) {
            b++;
            a = 0;
            for (int k = 0; k < n; k++) {
                a++;
                c = 0;
                for (int l = 0; l < n; l++) {
                    c++;
                    if (b * b - 4 * a * c > 0) {
                        System.out.println("result " + a + " " + b + " " + c);
                    }
                }
            }
        }
    }
    static void funKwaDelta(int n){
        int a = 0;
        int b = 0;
        int c = 0;
        for(int j = 0; j < n; j++) {
            b++;
            a = 0;
            for (int k = 0; k < n; k++) {
                a++;
                c = 0;
                for (int l = 0; l < n; l++) {
                    c++;
                    if (b * b - 4 * a * c > 0) {
                        int y = b * b - 4 * a * c;
                        for (int i = 0; i < n; i++) {
                            if (y == i*i) {
                                System.out.println("result " + a + " " + b + " " + c);
                                System.out.println(y + " " + i);
                            }
                        }
                    }
                }
            }
        }
    }
    public static int[] liczbyPierwsze(int n){
        int[] tab = new int[n];
        int k = 0;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for(int j = 1; j <= n; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
                tab[k] = i;
                k++;
            }
        }
        return tab;
    }
    static void liczbyPodzielne(int m, int n){
        for (double i = Math.pow(10, m-1); i < Math.pow(10,m)-1; i++){
            if(i % n == 0){
                System.out.println(i);
            }
        }
    }
    static void piramida(int n, int x){
        if (x == 0){
            for (int i = 1; i <= n; i++){
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }

                System.out.println();
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int k = n; k > i; k--) {
                    System.out.print(" ");
                }
                for (int j = i; j > 0; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    static int silnia(int n){
        int c = 1;
        for(int i = 1; i < n+1; i++) {
            c = c * i;
        }
        //System.out.println(c);
        return c;
    }
    static void silniaPodwojna(int n){
        int a = silnia(silnia(n));
        System.out.println(a);
    }
    static void silnia(int m, int n){
        for(int i = 0; i < m; i++){
            n = silnia(n);
        }
        System.out.println(n);
    }
    static void dwumainNewton(int n, int k){
        int dwu;
        dwu = silnia(n)/(silnia(k) * (silnia(n - k)));
        System.out.println(dwu);
    }
   static void ciagFibonacciego(int n){
       int a = 1;
       int b = 1;
       int c;
       System.out.print("1 ");
        for(int i = 0; i < n-1; i++){
            c = a + b;
            if (a == 1) {
                System.out.print(c + " ");
                a = c;
            } else {
                System.out.print(c + " ");
                b = a;
                a = c;
            }
        }
   }
   static void sumaNaturalnych(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++){
            suma += i;
        }
        System.out.print(suma);
   }
   static void sumaParzystych(int n){
        int suma = 0;
        for(int i = 0; i <= n; i += 2){
            suma += i;
        }
        System.out.println(suma);
   }
    static void sumaNieparzystych(int n){
        int suma = 0;
        for(int i = 1; i <= n; i += 2){
            suma += i;
        }
        System.out.println(suma);
    }
    static void sumaKwaNaturalnych(int n){
        int suma = 0;
        for(int i = 0; i <= n; i++){
            suma += i * i;
        }
        System.out.println(suma);
    }
    static void sumaSzeNaturalnych(int n){
        int suma = 0;
        for(int i = 0; i <= n; i++){
            suma += i * i * i;
        }
        System.out.println(suma);
    }
    static void sumaOdwNaturalnych(int n){
        float suma = 0;
        for(float i = 1; i <= n; i++){
            suma += 1 / i;
        }
        System.out.println(suma);
    }
    public static boolean czyPalindrom(String wyraz){
        for(int i = 0, j = wyraz.length()-1; i < j; i++, j--){
            if(wyraz.charAt(i) != wyraz.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void trojkatPascla(int n){
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    public static boolean czyPalindromv2(int n){
        String str = Integer.toString(n);
        for(int i = 0, j = str.length()-1; i < j; i++, j--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static boolean czyDoskonala(int n){
        int suma = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                suma += i;
            }
        }
        if (suma == n){
            return true;
        }
       return false;
    }
    public static boolean czyPierwsza(int n){
        int[] tab = liczbyPierwsze(n);
        for(int i = 0; i < n; i++) {
            if (n == tab[i]) {
                return true;
            }
        }
        return false;
    }
    public static int NWD(int a, int b){
        int nwd  = 0;
        int l = Math.min(a, b);
        for(int i = 1; i <= l; i++){
            if(a % i == 0 && b % i == 0){
                nwd = i;
            }
        }
        return nwd;
    }
    public static int[] wczytajTablice(int n){
        int[] tab = new int[n];
        int i = 0;
        while(n != i){
            tab[i] = n;
            i++;
        }
        return tab;
    }
    public static int[] podzbiory(int[] tab){
        int[] t = new int[tab.length];
        int k = 1;
        for(int i = 0; i < tab.length; i++){
            t[i] = tab[i];
            for(int j = 0; j < k; j++){
                System.out.print(t[j] + " ");

            }
            System.out.println();
            k++;
        }
        return t;
    }
}


public class Kolos {
    public static void main(String[] args) {
        int[] tab_2 = new int[5];
        tab_2[0] = 0;
        tab_2[1] = 1;
        tab_2[2] = 5;
        tab_2[3] = 3;
        tab_2[4] = 4;
        boolean b1 = czyCiagArytmetyczny(tab_2);
        System.out.println(b1);

        int[] tab = new int[7];
        tab[0] = 0;
        tab[1] = 1;
        tab[2] = 0;
        tab[3] = 1;
        tab[4] = 2;
        tab[5] = 4;
        tab[6] = 6;
        System.out.println(podciag(tab));
        System.out.println(podciag(tab, 2));
        sekwencjaCollatza(15, -10);
        minMaxSekwencjaCollatza(15, -10);
    }
    public static int[] ciagArytmetycznyRodzajuM(int n, int m, int a1, int r){
        int[] tab = new int[n];
        for(int i = 0 ; i < r; i++){
            tab[i] = a1 + (int) Math.pow(i-1, i) * r;
        }
        return tab;
    }
    public static boolean czyCiagArytmetyczny(int[] tab){
        int r = tab[1] - tab[0];
        for(int i = 1; i < tab.length; i++){
            if(tab[i] != tab[i-1] +r){
                return false;
            }
        }
        return true;
    }




    public static int podciag(int[] tab){
        int count = 0;
        int rem = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[i] > tab[i-1]){
                count++;
            }
            else {
                if(rem < count){
                    rem = count;
                }
                count = 0;
            }
            if(rem < count){
                rem = count;
            }
        }
        if(rem > 0)
            rem++;
        return rem;
    }
    public static int podciag(int[] tab, int r){
        int count = 0;
        int rem = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[i] == tab[i-1] + r){
                count++;
            }
            else{
                count = 0;
            }
            if(rem < count) {
                rem = count;
            }
        }
        if(rem > 0)
            rem++;
        return rem;
    }






    public static void sekwencjaCollatza(int n, int c){
        int coll = 0;
        int i = 0;
        System.out.print("Sekwencja Collatza ");
        while(i != n){
            coll = 3 * c + 1;
            System.out.print(coll + " ");
            i++;
            c++;
        }
    }
    public static void minMaxSekwencjaCollatza(int n, int c){
        int coll = 0;
        int[] tab = new int[n];
        int min, max;
        int i = 0;
        while(i != n-1){
            coll = 3 * c + 1;
            i++;
            c++;
            tab[i] = coll;
        }
        min = tab[0];
        max = tab[0];
        for(int j = 0; j < n; j++){
            if(tab[j] < min){
                min = tab[j];
            }
             if(tab[j] > max){
                 max = tab[j];
             }
        }
        System.out.println("min=" + min);
        System.out.println("max=" + max);
    }



}
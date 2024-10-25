import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        t1.add(2);
        t1.add(3);
        t2.add(4);
        t2.add(7);
        t2.add(15);
        //append(t1, t2);
        //merge(t1, t2);
        //mergeSorted(t1, t2);
    }
    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        tab1.addAll(tab2);
        //System.out.println(tab1);
        return tab1;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> tab3 = new ArrayList<>();
        int max = Math.max(tab1.size(), tab2.size());
        for(int i = 0; i < max; i++){
            if (i < tab1.size()){
                tab3.add(tab1.get(i));
            }
            if (i < tab2.size()){
                tab3.add(tab2.get(i));
            }
        }
        System.out.println(tab3);
        return tab3;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> tab3 = new ArrayList<>();
        int size = tab1.size() + tab2.size();
        for(int i = 0; i < size; i++) {
            int min1 = tab1.get(0);
            int min2 = tab2.get(0);
            for (int j = 0; j < tab1.size(); j++) {
                if (tab1.get(j) < min1) {
                    min1 = tab1.get(j);
                }
            }
            for (int k = 0; k < tab2.size(); k++) {
                if (tab2.get(k) < min2) {
                    min2 = tab2.get(k);
                }
            }
            if (min1 < min2){
                tab3.add(min1);
            }else {
                tab3.add(min2);
            }
        }
        System.out.println(tab3);
        return tab3;
    }
    public static ArrayList<Integer> toArrayList(int liczba){
        ArrayList<Integer> tab = new ArrayList<>();

        return tab;
    }

}

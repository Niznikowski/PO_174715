import java.util.*;


public class Zestaw_5 {
    public static void main(String[] args) {
        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        t1.add(2);
        t1.add(3);
        t2.add(4);
        t2.add(7);
        
        //append(t1, t2);
        //merge(t1, t2);
        //mergeSorted(t1, t2);
        //System.out.println(toArrayList(4591023));
        //System.out.println(toArrayListv2("Dragon"));
        //boolean b1 = checkChar(toArrayListv2("Dragon"), 'r');
        //System.out.println(b1);
        //boolean b2 = ckeckDigit(toArrayList(120425522), 3);
        //System.out.println(b2);
        //System.out.println(countChar(toArrayListv2("reerre"), 'r'));
        //System.out.println(countDigit(toArrayList(4030802), 0));
        //ArrayList<String> tab = new ArrayList<>();
        //tab.add("apple");
        //tab.add("banana");
        //tab.add("apple");
        //tab.add("orange");
        //tab.add("banana");
        //ArrayList<ArrayList<String>> result = countArrayList(tab);
        //System.out.println(result);
        //ArrayList<Integer> tabv2 = new ArrayList<>();
        //tabv2.add(4);
        //tabv2.add(6);
        //tabv2.add(6);
        //tabv2.add(7);
        //tabv2.add(4);
        //ArrayList<ArrayList<String>> result2 = countArrayListv2(tabv2);
        //System.out.println(result2);


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
        while (liczba > 0){
            tab.add(liczba % 10);
            liczba /= 10;
        }
        Collections.sort(tab);
        return tab;
    }
    public static ArrayList<String> toArrayListv2(String napis){
        ArrayList<String> tab = new ArrayList<>();
        for(char c : napis.toCharArray()){
            tab.add(String.valueOf(c));
        }
        Collections.sort(tab);
        return tab;
    }
    public static boolean checkChar(ArrayList<String> tab, char znak){
        String zn = String.valueOf(znak);
        for(String i: tab){
            if(i.equals(zn)){
                return true;
            }
        }
        return false;
    }
    public static boolean ckeckDigit(ArrayList<Integer> tab, int cyfra){
        for(int i: tab){
            if(i == cyfra){
                return true;
            }
        }
        return false;
    }
    public static int countChar(ArrayList<String> tab, char znak){
        String zn = String.valueOf(znak);
        int count = 0;
        for(String i: tab){
            if(i.equals(zn)){
                count ++;
            }
        }
        return count;
    }
    public static int countDigit(ArrayList<Integer> tab, int cyfra){
        int count = 0;
        for(int i: tab){
            if(i == cyfra){
                count++;
            }
        }
        return count;
    }
    public static ArrayList<ArrayList<String>> uniqueArrayList(ArrayList<String> tab){
        HashMap<String, Integer> counts = new HashMap<>();
        for(String i: tab){
            counts.put(i, 0);
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : counts.entrySet()){
            ArrayList<String> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(String.valueOf(entry.getValue()));
            res.add(pair);
        }
        return res;
    }

    public static ArrayList<ArrayList<String>> uniqueArrayListv2(ArrayList<Integer> tab) {

        HashMap<Integer, Integer> counts = new HashMap<>();
        for (Integer value : tab) {
            counts.put(value, 0);
        }

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (HashMap.Entry<Integer, Integer> entry : counts.entrySet()) {
            ArrayList<String> pair = new ArrayList<>();
            pair.add(String.valueOf(entry.getKey()));
            pair.add(String.valueOf(entry.getValue()));
            result.add(pair);
        }

        return result;
    }
    public static ArrayList<ArrayList<String>> countArrayList(ArrayList<String> tab) {
        HashMap<String, Integer> counts = new HashMap<>();
        for (String value : tab) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (HashMap.Entry<String, Integer> entry : counts.entrySet()) {
            ArrayList<String> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(String.valueOf(entry.getValue()));
            result.add(pair);
        }

        return result;
    }
    public static ArrayList<ArrayList<String>> countArrayListv2(ArrayList<Integer> tab) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (Integer value : tab) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (HashMap.Entry<Integer, Integer> entry : counts.entrySet()) {
            ArrayList<String> pair = new ArrayList<>();
            pair.add(String.valueOf(entry.getKey()));
            pair.add(String.valueOf(entry.getValue()));
            result.add(pair);
        }
        return result;
    }



}

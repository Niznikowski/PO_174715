import java.util.*;

public class cwiczenia_13 {

    public static <T> void printUnique(Collection<T> items){
        HashSet<T> uniqueElements = new HashSet<>(items);

        for(T item: uniqueElements){
            System.out.println(item);
        }
    }
    public static <T> int countOccurrences(Collection<T> items, T element){
        int count = 0;
        for(T item: items){
            if(item.equals(element)){
                count++;
            }
        }
        return count;
    }
    public static <T> ArrayList<T> mergeList(ArrayList<T> lista1, ArrayList<T> lista2){
        ArrayList<T> result = new ArrayList<>();
        result.addAll(lista1);
        result.addAll(lista2);
        return result;
    }
    public static <T> LinkedList<T> findCommonElements(LinkedList<T> list1, LinkedList<T> list2){
        LinkedList<T> result = new LinkedList<>();
        for(T item: list1){
            for (T item2: list2){
                if(item.equals(item2)){
                    result.add(item);
                }
            }
        }
        return result;
    }
    public static <T> HashSet<T> findUniqueElements(ArrayList<T> list){
        return new HashSet<>(list);
    }

    public static <T> TreeSet<T> findElementsInRage(TreeSet<T> tree, T lowerBound, T upperBound){
        return (TreeSet<T>) tree.subSet(lowerBound,true, upperBound, true);
    }
    public static <K, V> TreeMap<K,V> subMapInRange(TreeMap<K,V> tree, K startKey, K endKey){
        return (TreeMap<K, V>) tree.subMap(startKey,true, endKey, true);
    }




    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(1);
        tree.add(4);
        tree.add(9);
        tree.add(7);
        tree.add(5);
        //System.out.println(findElementsInRage(tree, 3,7));
        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<Integer> lista2 = new LinkedList<>();
        lista1.add(2);
        lista1.add(7);
        lista1.add(8);
        lista1.add(6);
        lista2.add(8);
        lista2.add(4);
        lista2.add(3);
        lista2.add(2);
        //System.out.println(findCommonElements(lista1, lista2));
        ArrayList<Integer> listaaa = new ArrayList<>();
        listaaa.add(1);
        listaaa.add(1);
        listaaa.add(3);
        listaaa.add(3);
        listaaa.add(6);
        listaaa.add(6);
        listaaa.add(9);
        //System.out.println(findUniqueElements(listaaa));
        TreeMap<Integer, String> treee = new TreeMap<>();
        treee.put(12, "Wampir");
        treee.put(4, "Wilkołak");
        treee.put(2, "Zombie");
        treee.put(7, "Bies");
        System.out.println(subMapInRange(treee, 6, 12));

    }
}

import java.util.ArrayList;
import java.util.List;


class Box<T>{
    T objekt;
    public void setObjekt(T objekt){
        this.objekt = objekt;
    }
    public T getObjekt(){
        return objekt;
    }
}

class Counter<T>{
    List<T> lista = new ArrayList<T>();

    public void add(T element){
        lista.add(element);
    }

    public int getCount(){
        return lista.size();
    }
}




public class Main_generyczne {

    public static <T> boolean isEqual(T obj1, T obj2){
        return obj1.equals(obj2);
    }
    public static <T> void swap(ArrayList<T> lista, int elem1, int elem2 ){
        if(elem1 > lista.size()-1 || elem2 > lista.size()-1){
            System.out.println("Out of range");
        }else{
            T tmp = lista.get(elem1);
            lista.set(elem1, lista.get(elem2));
            lista.set(elem2, tmp);
        }
    }
    public static <T> T minValue(Comparable<T> tablica){
        T min = null;


        return min;
    }

    public static Animal findMax(Animal element1, Animal element2){
        Animal wiekszy = null;
        if(element1.getWiek() > element2.getWiek()){
            wiekszy = element1;
        }
        else{
            wiekszy = element2;
        }
        return wiekszy;
    }




    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setObjekt("Objekt 1");
        System.out.println(box1.getObjekt());
        Box<String> box2 = new Box<>();
        box2.setObjekt("Objekt 1");
        System.out.println(box2.getObjekt());
        System.out.println(isEqual(box1.getObjekt(), box2.getObjekt()));

        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("Jablko");
        stringCounter.add("Gruszka");
        System.out.println(stringCounter.getCount());

        Counter<Integer> stringCounter2 = new Counter<>();
        stringCounter2.add(1);
        stringCounter2.add(2);
        stringCounter2.add(3);
        System.out.println(stringCounter2.getCount());

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        swap(lista, 1, 3);
        System.out.println(lista);

        Animal kon = new Animal("kon",4, 60);
        Animal zebra = new Animal("zebra",5, 70);
        System.out.println(findMax(kon, zebra).getName());


    }
}
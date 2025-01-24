import java.util.ArrayList;

public class Main {
    public static <T extends Comparable<T>> void sortDescending (ArrayList<T> tab){
        int n = tab.size();
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(tab.get(i).compareTo(tab.get(j)) < 0){
                    T temp = tab.get(i);
                    tab.set(i, tab.get(j));
                    tab.set(j, temp);
                }
            }
        }
    }



    public static void main(String[] args) {
        House house = new House(12, "Green", 7);
        System.out.println(house.getNumberOfRooms());
        System.out.println(house.getHeight());
        System.out.println(house.getColor());
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(2);
        tab.add(2);
        tab.add(1);
        tab.add(6);
        tab.add(5);
        sortDescending(tab);
        System.out.println(tab);
    }
}
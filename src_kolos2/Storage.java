public class Storage<T> {
    private T paczka;
    public Storage(T paczka) {
        this.paczka = paczka;
    }
    public void store(T item){
        paczka = item;
    }
    public T retrieve(){
        return paczka;
    }
}

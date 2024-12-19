public class Television extends Electronics{
    int cale;

    public Television(String name, int cale) {
        super(name);
        this.cale = cale;
    }
    @Override
    public final void turnOn(){
        System.out.println("Urzędzenie włączone");
    }

}

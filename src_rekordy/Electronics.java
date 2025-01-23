public class Electronics {
    String name;

    public Electronics(String name) {
        this.name = name;
    }

    public final void turnOn(){
        System.out.println("Urzędzenie włączone");
    }
}

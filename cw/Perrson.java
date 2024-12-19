public record Perrson(String name, int age) {
    public Perrson {
        if(age < 0){
            System.out.println("Podano wiek ujemny");
            age = 0;
        }
    }
}

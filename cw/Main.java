public class Main {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("Diuna", "Frank Herbert", 30, 1985);
        BookDTO book2 = new BookDTO("Wiedźmin", "Andrzej Sapkowski", 29, 1986);
        BookDTO book3 = new BookDTO("Koło czasu", "Robert Jordan", 35, 1990);
        Address adres = new Address("Wolności", 69, 2137666, "Nowhere");
        Person osoba = new Person("Alex", "Zobaa", adres);
        System.out.println("Name: "+ osoba.firstName());
        System.out.println("City: "+ osoba.address().city());
        Car audi = new Car("Audi", "A6", 15);
        System.out.println(audi.fuelCost(3.9, 150));
        Perrson osobaa = new Perrson("Lolo", -1);
        System.out.println(osobaa.age());
        ImmutableBook bookk = new ImmutableBook("KOlo", "jan", "40580280453035");
        
    }
}
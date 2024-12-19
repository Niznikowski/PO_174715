public class Adres {
    private String ulica;
    private int numerDomu;
    private int numerMieszkania;
    private String miasto;
    private int kodPocztowy;
    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, int kodPocztowy){
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, int numerDomu, String miasto, int kodPocztowy){
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public void pokaz(){
        System.out.println(kodPocztowy + " " + miasto);
        if(numerMieszkania > 0)
            System.out.println(ulica + " " + numerDomu + " " + numerMieszkania);
        else System.out.println(ulica + " " + numerDomu);
    }
    public void przed(Adres ad){
        if(kodPocztowy < ad.kodPocztowy){
            System.out.println("Adres: ");
            pokaz();
            System.out.println("występuję przed: ");
            ad.pokaz();
        }
        else{
            System.out.println("Adres: ");
            pokaz();
            System.out.println("nie występuję przed: ");
            ad.pokaz();
        }
    }



}

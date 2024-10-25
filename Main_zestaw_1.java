// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.time.LocalDate;
import java.time.LocalTime;
class Main {
    public static void main(String[] args) {
        System.out.println("Filip Niznikowski"); //zadanie 1

        String str = "Filip Niznikowski";
        int actualValue = str.length();
        System.out.println(actualValue); //zadanie 2

        String n1 = "Ala";
        String n2 = "ma";
        String n3 = "kota";
        String n4 = n1 + " " + n2 + " " + n3;
        System.out.println(n4); //zadanie 3

        System.out.println("                    *  ");
        System.out.println("                    * *  ");
        System.out.println("                    * * * ");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                    * * * ");
        System.out.println("                    * *  ");
        System.out.println("                    *  ");

        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
        System.out.println(" * * * * *");
        System.out.println("  * * * *");
        System.out.println("   * * *");
        System.out.println("    * *");
        System.out.println("     *"); // zadanie 4

        String rep = n4.replace("a", "e");
        System.out.println(rep); // zadanie 5

        String toup = n4.toUpperCase();
        String rep2 = toup.replaceFirst("A", "a");
        System.out.println(rep2); //zadanie 6

        int a1 = 'A';
        System.out.println("ASCII - A: "+a1);
        int a2 = '!';
        System.out.println("ASCII - !: "+a2);
        int a3 = '@';
        System.out.println("ASCII - @: "+a3);
        int a4 = '>';
        System.out.println("ASCII - >: "+a4);
        int a5 = '~';
        System.out.println("ASCII - ~: "+a5);
        int a6 = '\n';
        System.out.println("ASCII - \n: "+a6);
        int a7 = '\b';
        System.out.println("ASCII - \b: "+a7);//zadanie 7


        int aaa = 'a';
        int aaz = 'z';
        int aaA = 'A';
        int aaZ = 'Z';
        System.out.println("Male litery:"+aaa+"-"+aaz);
        System.out.println("Duze litery:"+aaA+"-"+aaZ);
        int aa0 = '0';
        int aa9 = '9';
        System.out.println("Cyfry:"+aa0+"-"+aa9); //zadanie 8

        String g = "Grzesiek nie wiedzial dlaczego ... jest tak drapieznym ... mimo, ze jego ... na to nie wskazuje";
        g = g.replaceFirst("\\...", "kot");
        g = g.replaceFirst("\\...", "ssakiem");
        g = g.replaceFirst("\\...", "futro");
        System.out.println(g); //zadnie 9

        String k = "... to najlepsza ksiazka napisana przez ...";
        k = k.replaceFirst("\\...", "Diuna");
        k = k.replaceFirst("\\...", "Franka Herberta");
        System.out.println(k); //zadanie 10

        for(int i = 0; i < 5; i++){
            System.out.print("wodrze ");
        } //zadanie 11

        System.out.println("");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Dzisiaj jest "+ date +" godzina "+ time); // zadanie 12

        int value = 54;
        char c = (char) value;
        System.out.println(c);
        int value1 = 103;
        char c1 = (char) value1;
        System.out.println(c1);
        int value2 = 241;
        char c2 = (char) value2;
        System.out.println(c2);
        int value3 = 67;
        char c3 = (char) value3;
        System.out.println(c3);
        int value4 = 9999;
        char c4 = (char) value4;
        System.out.println(c4);
        int value5 = str.length();
        char c5 = (char) value5;
        System.out.println(c5);
        int value6 = 174715;
        char c6 = (char) value6;
        System.out.println(c6); // zadanie 13



        //zestaw 2
        //float n1 = 23.0f;
        //int n2 = 23;
        // float n = n1 + n2;
        //System.out.println(n);

        //int sum = (Math.sqrt(7) - 1)/2 + 3^3%2;
        //System.out.println(sum);
        int sum1 = 2002/26*2;
        System.out.println(sum1);



    }
}
package meteo;

public class Main {
    public static void main(String[] args){

        Luni luni = new Luni();
        System.out.println(luni.sunRise());
        System.out.println(luni.sunSet());
        System.out.println(luni.temp());
        System.out.println(luni.fenomenNatural());
    }
}

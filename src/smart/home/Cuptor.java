package smart.home;

public class Cuptor extends ElementeComune implements Electrocasnice {

    int tempMinim;
    int tempMax;

    public String on(){
        return "Setare cuptor modul preincalzire";
    }

    public String off(){
        return "Operatiune cuptor inchis cu succes";
    }
}

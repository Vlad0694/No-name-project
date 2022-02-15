package smart.home;

public class ExpresorCafea extends ElementeComune implements Electrocasnice {

    int volumApa;

    public String on(){
        return "Ati setat expresorul pe modul cafea";
    }

    public String off (){
        return "Ati oprit expresorul";
    }

}

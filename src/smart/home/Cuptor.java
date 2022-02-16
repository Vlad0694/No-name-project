package smart.home;

public class Cuptor extends ElementeComune implements Electrocasnice {

    int tempMinim;
    int tempMax;

    public String on(){
        System.out.println("Setare cuptor modul preincalzire");
        try{
            Thread.sleep(7000);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Preincalzire terminata ";
    }

    public String off(){
        return "Operatiune cuptor inchis cu succes";
    }

}

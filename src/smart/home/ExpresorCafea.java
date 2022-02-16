package smart.home;

public class ExpresorCafea extends ElementeComune implements Electrocasnice {

    int volumApa;

    public String on(){

        System.out.println("Ati setat expresorul pe modul cafea");
        try{
            Thread.sleep(8000);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Cafeaua este servita";
    }

    public String off (){
        return "Ati oprit expresorul";
    }

}

package smart.home;

public class AerConditionat extends ElementeComune implements Electrocasnice{

    int temperaturaAmbient;

    public String on()  {
        System.out.println("Initializare pornire Aer conditionat");
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Am finalizat pornirea aerului conditionat";

    }





    public String off(){
        return "Ati oprit aerul conditionat";
    }
}

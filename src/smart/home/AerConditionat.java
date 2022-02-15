package smart.home;

public class AerConditionat extends ElementeComune implements Electrocasnice{

    int temperaturaAmbient;

    public String on() {
        return "Ati pornit aerul conditionat";
    }

    public String off(){
        return "Ati oprit aerul conditionat";
    }
}

package smart.home;

public class Main {
    public static void main(String[] args){

        SmartHome smarthome = new SmartHome();
        AerConditionat aerConditionat1 = new AerConditionat();
        AerConditionat aerConditionat2 = new AerConditionat();
        AerConditionat aerConditionat3 = new AerConditionat();
        ExpresorCafea expresor1 = new ExpresorCafea();
        ExpresorCafea expresor2 = new ExpresorCafea();
        Cuptor cuptor1 = new Cuptor();
        Cuptor cuptor2 = new Cuptor();

        adaugareElectrocasnice(smarthome, aerConditionat1, expresor1, cuptor1);

        atribuireNume_Culoare(aerConditionat1, aerConditionat2, aerConditionat3);

        for(int i = 0; i < smarthome.getElectrocasnice().size(); i++){
            System.out.println(smarthome.getElectrocasnice().get(i).on());
            System.out.println(smarthome.getElectrocasnice().get(i).off());
        }

    }





    private static void adaugareElectrocasnice(SmartHome smarthome, AerConditionat aerConditionat1, ExpresorCafea expresor1, Cuptor cuptor1) {
        smarthome.getElectrocasnice().add(aerConditionat1);
        //   smarthome.getElectrocasnice().add(aerConditionat2);
        //   smarthome.getElectrocasnice().add(aerConditionat3);
        smarthome.getElectrocasnice().add(expresor1);
        //   smarthome.getElectrocasnice().add(expresor2);
        smarthome.getElectrocasnice().add(cuptor1);
        //   smarthome.getElectrocasnice().add(cuptor2);
    }

    private static void atribuireNume_Culoare(AerConditionat aerConditionat1, AerConditionat aerConditionat2, AerConditionat aerConditionat3) {
        aerConditionat1.setNume("Tesla");
        aerConditionat1.setCuloare("Alb");
        aerConditionat2.setNume("Arctic");
        aerConditionat2.setCuloare("Albastru");
        aerConditionat3.setNume("Samsung");
        aerConditionat3.setCuloare("Rosu");
    }
}

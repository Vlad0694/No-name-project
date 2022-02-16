package teme;

import java.util.ArrayList;
import java.util.Scanner;

public class Thread {


    public Thread(Runnable prima) {
    }

    public static void main(String[] args){

        ArrayList<Integer> lista = new ArrayList<>();
        add(lista);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduceti cifra pe care o cautati in lista");
        int key = 7;
        Runnable prima = new Runnable() {
            @Override
            public void run() {
                System.out.println("gfhgfhgfhgf");
                boolean found = false;
                for( int i = (lista.size()/2)-1; i >= 0; i--){
                        if (key == lista.get(i)) {
                            System.out.println("A fost gasita cifra " + key + " in prima jumatate a listei");
                            found = true;
                            break;
                        }
                }

                if(!found){
                    System.out.println("Nu a fost gasita cifra " + key);
                }
            }
        };
        new Thread(prima).start();

    }






    private void start() {
    }

    private static void add(ArrayList<Integer> lista) {
        lista.add(0);
        lista.add(1);
        lista.add(7);
        lista.add(10);
        lista.add(26);
        lista.add(5);
        lista.add(51);
        lista.add(76);
        lista.add(33);
        lista.add(98);
    }
}

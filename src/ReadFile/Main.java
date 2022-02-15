package ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        while(true) {
            if (args.length < 1) {
                System.out.println("Bobita, trebuie sa dai un argument  -- pathul complet catre fisier");
            } else {
                System.out.println("Username: ");
                String userIntrodus = key.nextLine();
                System.out.println("Password: ");
                String passIntrodusa = key.nextLine();
                ReadFile.getUserRole(userIntrodus, passIntrodusa, args[0]);
              //  ReadFile.getUserRole(userIntrodus, passIntrodusa, "C:\\Users\\vlad\\IdeaProjects\\ReadFile\\out\\artifacts\\ReadFile_jar\\users.txt");
            }
            break;
        }
    }
}



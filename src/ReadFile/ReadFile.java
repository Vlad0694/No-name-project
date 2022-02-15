package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    //  public String userIntrodus;
    // public String passwordIntrodusa;

     public static String getUserRole(String userIntrodus, String passIntrodusa, String filepath) {
         Scanner myReader = null;
        try {

            File myObj = new File(filepath);
            myReader  = new Scanner(myObj);
            boolean found = false;
            boolean wasbreak = false;
            int i = 0;

            while (myReader.hasNextLine()) {
                String userExistent = myReader.nextLine();
                if(checkSize(userExistent, i++)){
                    wasbreak = true;
                    break;
                }
                String passExistenta = myReader.nextLine();
                if(checkSize(passExistenta, i++)){
                    wasbreak = true;
                    break;
                }
                String type = myReader.nextLine();
                if(checkSize(type, i++)){
                    wasbreak = true;
                    break;
                }
                if (userIntrodus.equals(userExistent) && passIntrodusa.equals(passExistenta)) {
                    found = true;
                    if (type.equalsIgnoreCase("AD")) {
                        System.out.println("Aveti rolul de " + type);
                        return type;
                    }else if(type.equalsIgnoreCase("UT")){
                        System.out.println("Aveti rolul de " + type);
                        return type;
                    }
                    else{
                        System.out.println("Rol invalid");
                    }
                }

            }if ( !wasbreak && !found) {
                System.out.println("Username or password invalid. Try again!");

            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
           myReader.close();
        }
        return "Access Denied!";
    }

    static boolean checkSize(String input, int i ){
        if(input.length() < 1){
            System.out.println("Linia " + i + " este invalida");
            return true;
        }
        return false;
    }
}




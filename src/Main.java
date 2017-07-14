import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Validator validator;
        //validator = new Validator("94021709213");
        //validator = new Validator("1234563218");

        String line;
        Scanner scanner;
        while(true){
            scanner = new Scanner(System.in);
            line = scanner.nextLine();
            if(Objects.equals(line, "exit"))
                break;
            else
                validator = new Validator(line);
        }

    }
}

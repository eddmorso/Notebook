package View;

import java.util.Scanner;

public class Viewer {
    private Scanner scanner;

    public Viewer(){
        scanner = new Scanner(System.in);
    }

    public String getStringFromConsol(){
        return scanner.next();
    }
}

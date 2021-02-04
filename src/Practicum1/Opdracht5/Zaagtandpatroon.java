package Practicum1.Opdracht5;

public class Zaagtandpatroon {
    public static void main(String[] args) {
        boolean myBool = true;
        for (int i = 1; i < 20; i++) {
            if (myBool == true) {
                System.out.println('s');
                myBool = false;
            } else {
                System.out.println("ss");
                myBool = true;
            }
        }
    }
}

package tombszamlalas;
import java.util.Scanner;

public class TOMBSZAMLALAS {

    public static void main(String[] args) {

        int valasz;

        Scanner bemenet = new Scanner(System.in);
        
        System.out.println("\nHány számból álljon a tömb?");
        valasz = bemenet.nextInt();
        
        int tomb[] = new int[valasz];
        System.out.println("A tömb elemei: ");

        for (int i = 0; i < valasz; i++) {
            tomb[i]=(int) (Math.random()*999)+1;
            System.out.println((i + 1) + ".: " + String.format("% ,6d" ,tomb[i]));
        }
        
    }
    
}

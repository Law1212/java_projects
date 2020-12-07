package osszetett_feladatok;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OSSZETETT_FELADATOK {

    public static void main(String[] args) {
        System.out.println("Összetett feladatok a Java-ban!");
        Scanner input = new Scanner(System.in);
        char answer;
        
        do {
            // 1. & 2. Feladat
            
            int[] szamok1 = new int[(int)(Math.random() * 20) + 10];
            int[] szamok2 = new int[(int)(Math.random() * 20) + 10];
            
            // 3. & 4. & 5. Feladat
            
            List<Integer> rightNumbers = new ArrayList<Integer>(); // ujTomb
            System.out.print("\nAz 1. tömb elemei: ");
            for (int i = 0; i < szamok1.length; i++) 
            {
                szamok1[i] = (int)(Math.random() * 100) - 50;
                if(Math.abs(szamok1[i]) % 10 == 0)
                    rightNumbers.add(szamok1[i]);
                System.out.print(String.format("%,5d", szamok1[i]) + " ");
            }
            System.out.print("\nA  2. tömb elemei: ");
            for (int i = 0; i < szamok2.length; i++) 
            {
                szamok2[i] = (int)(Math.random() * 100) - 50;
                if(Math.abs(szamok2[i]) % 10 == 0)
                    rightNumbers.add(szamok2[i]);
                System.out.print(String.format("%,5d", szamok2[i]) + " ");
            }

            System.out.print("\nA számok amik oszthatóak 5-el és párosak: ");
            for (int i = 0; i < rightNumbers.size(); i++) {
                System.out.print(rightNumbers.get(i) + " ");
            }
            
            // 6. Feladat
            
            if(rightNumbers.contains(0))
                System.out.print("\nA tömb tartalmaz 0-át!");
            else
                System.out.print("\nA tömb nem tartalmaz 0-át!");
            
            // 7. Feladat
            
            System.out.print("\nSzeretné e újra futtatni?(i/n)");
            answer = input.next().toLowerCase().charAt(0);
        } while (answer == 'i');
    }
}

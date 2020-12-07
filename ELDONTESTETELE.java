package eldontestetele;
import java.util.Scanner;

public class ELDONTESTETELE {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Adja meg a tomb hosszat!");
        int valasz = input.nextInt();
        boolean szerepelE = false;
        
        int[]szamok = new int[valasz];

        System.out.print("A szamok: ");
        for(int i = 0; i < valasz; i++)
        {
            szamok[i] = (int) (Math.random() * 40 - 20);
            System.out.print(szamok[i] + " ");
            if(szamok[i] == 0)
                szerepelE = true;
        }
        if(szerepelE)
            System.out.println("\nA tomb tartalmaz nullat");
        else
            System.out.println("\nA tomb nem tartalmaz nullat");
        
        input.close();
    }
    
}

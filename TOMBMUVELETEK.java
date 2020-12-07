package tombmuveletek;
import java.util.Scanner;

//elem osszeg + atlag
// mind2 array elem osszeg + atlag 

public class TOMBMUVELETEK {

    public static void main(String[] args) {
        System.out.println("\n\tTombmuveletek\n");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hány elemet tartalmaznak a tömbök: ");
        int arrayLength = input.nextInt();
        
        int[] tomb1 = new int [arrayLength];
        int[] tomb2 = new int [arrayLength];
        
        int tomb1Sum = 0;
        int tomb2Sum = 0;
        
        for(int i = 0; i < arrayLength; i++)
        {
            tomb1[i] = (int) (Math.random() * 999) + 1;
            tomb1Sum += tomb1[i];
            tomb2[i] = (int) (Math.random() * 999) + 1;
            tomb2Sum += tomb2[i];
        }
        
        System.out.println("A tömb elemei:");
        
        for(int i = 0; i < arrayLength; i++)
        {
            int rowSum = tomb1[i] + tomb2[i];
            System.out.print(i + 1 + ".: ");
            System.out.print(String.format("%, 5d", tomb1[i]) + " + ");
            System.out.print(String.format("%, 5d", tomb2[i]) + " = ");
            System.out.print(String.format("%, 5d", rowSum));
            System.out.println("");
        }
        
        System.out.println("\nTömb(1) összege: " + tomb1Sum);
        System.out.println("Tömb(1) átlaga: " + (double) tomb1Sum / tomb1.length + "\n");
        System.out.println("Tömb(2) összege: " + tomb2Sum);
        System.out.println("Tömb(2) átlaga: " + (double) tomb2Sum / tomb2.length);
        
        input.close();
        
    }
    
}

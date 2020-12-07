package kettomb;

public class KETTOMB {

    public static void main(String[] args) {
        System.out.println("\n\tOSSZEGZES TETELE\n");
        
        int[] tomb1 = new int[10];
        int[] tomb2 = new int[10];
        
        int osszeg1 = 0;
        int osszeg2 = 0;
        
        System.out.println("A tömb1 elemei: ");
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 99) + 1;
            osszeg1 = osszeg1 + tomb1[i]; // osszeg += tomb[i]
            System.out.print(tomb1[i] + " ");
        }
        
        System.out.println("\nA tömb2 elemei: ");
        
        for(int i = 0; i < tomb2.length; i++)
        {
            tomb2[i] = (int) (Math.random() * 99) + 1;
            osszeg2 = osszeg2 + tomb2[i]; // osszeg += tomb[i]
            System.out.print(tomb2[i] + " ");
        }
        
        double atlag1 = osszeg1 / (double) tomb1.length;
        double atlag2 = osszeg2 / (double) tomb2.length;
        System.out.println("\nA szamok(1) osszege: " + osszeg1);
        System.out.println("A számok(1) átlaga: " + atlag1);
        
        System.out.println("\nA szamok(2) osszege: " + osszeg2);
        System.out.println("A számok(2) átlaga: " + atlag2);
    }
    
}

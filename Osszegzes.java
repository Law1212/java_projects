package osszegzes;

public class Osszegzes {

    public static void main(String[] args) {
        System.out.println("\n\tOSSZEGZES TETELE\n");
        
        int tomb[] = new int[5];
        
        int osszeg = 0;
        for(int i = 0; i < tomb.length; i++)
        {
            tomb[i] = (int) (Math.random() * 99) + 1;
            osszeg = osszeg + tomb[i]; // osszeg += tomb[i]
            if(i != tomb.length - 1)
                System.out.print(tomb[i] + ", ");
            else
                System.out.println(tomb[i]);
        }
        double atlag = osszeg / tomb.length;
        System.out.println("\nA szamok osszege: " + osszeg);
        System.out.println("A számok átlaga: " + atlag);
    }
    
}

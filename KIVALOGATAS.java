package kivalogatas;
import java.util.Scanner;

public class KIVALOGATAS {

    public static void main(String[] args) {
        System.out.println("A kiválogatás tétele a Java-ban!\n");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hány jegyet generáljunk?");
        int gradesCount = input.nextInt();
        int[] grades = new int[gradesCount];
        int[] gradesByGradeCount = new int[5];
        
        System.out.println("Érdemjegyek: ");
        for(int i = 0; i < gradesCount; i++)
        {
            grades[i] = (int) (Math.random() * 5 + 1); // 1-5
            System.out.print(grades[i] + " ");
            for(int j = 1; j <= 5; j++) // gradesByGradeCount: if the num is 4 its going to give +1 to the the 4. num in the array
            {
                if(grades[i] == j)
                {
                    gradesByGradeCount[j - 1] += 1; 
                    break;
                }
            }
        }
        System.out.println("\n");
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print((i + 1) + "-(esek): ");
            for(int j = 0 ; j < gradesByGradeCount[i]; j++)
            {
                System.out.print((i + 1) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println((i + 1) + "-esek száma: " + gradesByGradeCount[i]);
        }
        
    }
    
}

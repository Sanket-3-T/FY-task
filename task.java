import java .util.*;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("\n Enter the string : ");
    
        String str = sc.nextLine();
      
        int charCount[] = new int[256];
        int flag = 0;
        
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;

        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                System.out.println("The non repeating character is = " + str.charAt(i));
                flag++;

            }

        }
        if (flag == 0) {
            System.out.println("\n The string does not contain any non repeating character :");

        }

        System.out.println(str);
        sc.close();

        

    }
}
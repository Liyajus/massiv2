import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String [] array = new String[ 10 ];
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i<10; i++) {
            array [i] = sc.next();
        }
        sc.close();
        for (int i = 0; i<10; i++) {
            System.out.println(array[i] + " ");
        }
    }
}

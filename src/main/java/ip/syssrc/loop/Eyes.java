package ip.syssrc.loop;

/**
 * Eyes
 *
 * Assignment 2.3
 *
 * @author H071211044 - Adelia Puspita Hilal <adhepuspita123@gmail.com>
 *
 */
import java.util.Scanner;

public class Eyes {

    public static void main(String[] args) {

        Scanner t2 = new Scanner(System.in);

        int n = t2.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j && j == n) {
                    System.out.println(1);
                } 
                else if (i == j) {
                    System.out.print(1 + " ");
                }
                else if (j == n) {
                    System.out.println(0);
                }
                else {
                    System.out.print(0 + " ");
                }
            }
        }
    }
}
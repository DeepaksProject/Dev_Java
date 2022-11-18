import java.util.*;

public class odev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}

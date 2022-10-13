import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a;
        int b = 1;
        int c = 0;
        int i = 0;
        while (c < n){
            i++;
            a = b;
            b = c;
            c = a + b;

        }
        if (n == c){
            System.out.println(1 + " " + i);
        }else {
            System.out.println(0);
        }

    }
}

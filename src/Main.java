import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int l = 0, r = 101;
        while (r > l + 1) {
            int m = (l + r) >> 1;

            System.out.println("Are you olden then\t" + m + " years old human being? (Yes/No)");
            String ans = cin.nextLine();

            if (ans.equals("Yes")) l = m;
            else r = m;
        }
        System.out.println("So you are " + l + " years old 😁");
        cin.close();
    }
}

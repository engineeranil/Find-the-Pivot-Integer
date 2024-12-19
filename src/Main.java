import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        int reverseN = 0;
        int pivot = 0;
        int value = 1;
        while (value <= n) {
            pivot += value;
            reverseN = 0;
            for (int i = value; i <= n; i++) {
                reverseN += i;
            }
            if (pivot == reverseN) {
                System.out.println(value);
                return;
            }
            value++;
        }
        System.out.println(-1);
    }
}

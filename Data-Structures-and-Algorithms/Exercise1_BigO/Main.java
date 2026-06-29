// package Exercise1_BigO;

public class Main {

    // O(1)
    public static void constantTime() {
        System.out.println("O(1) - Constant Time");
    }

    // O(n)
    public static void linearTime(int n) {
        System.out.println("O(n) - Linear Time");
        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // O(n²)
    public static void quadraticTime(int n) {
        System.out.println("O(n²) - Quadratic Time");

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        constantTime();

        linearTime(5);

        quadraticTime(5);
    }
}
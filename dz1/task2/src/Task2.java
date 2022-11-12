public class Task2 {
    public static boolean isSimple(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isSimple(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

}
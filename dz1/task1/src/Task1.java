public class Task1 {
    public static int getSumm(int[] a)
    {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ += a[i];
        }
        return summ;
    }

    public static int getMax(int[] a)
    {
        int mx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mx) {
                mx = a[i];
            }
        }
        return mx;
    }

    public static int getMin(int[] a)
    {
        int mn = 1001;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < mn) {
                mn = a[i];
            }
        }
        return mn;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * 1000);
        }
        System.out.println("Array");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();

        System.out.print("Max: ");
        System.out.println(getMax(a));

        System.out.print("Min: ");
        System.out.println(getMin(a));

        System.out.print("Summ: ");
        System.out.println(getSumm(a));

        System.out.print("Average: ");
        System.out.println((double)getSumm(a) / a.length);
    }
}
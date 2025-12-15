public class fungsi {
    public static void main(String[] args) {
        System.out.println("Fungsi = Sub program mengembalikan nilai");

        int x = pertambahan(1, 2);
        System.out.println("1. Pertambahan 2 variabel = " + x);

        int y = pertambahan(1, 2, 3);
        System.out.println("2. Pertambahan 3 variabel = " + y);

        int z = pertambahan(1, 2, 3, 4);
        System.out.println("3. Pertambahan 4 variabel = " + z);
    }

    public static int pertambahan(int a, int b) {
        return a + b;
    }

    public static int pertambahan(int a, int b, int c) {
        return a + b + c;
    }

    public static int pertambahan(int a, int b, int c, int d) {
        return a + b + c +d;
    }
}

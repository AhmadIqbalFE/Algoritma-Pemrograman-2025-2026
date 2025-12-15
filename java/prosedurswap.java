public class prosedurswap {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("SWAP adalah tempat penyimpanan memori sementara ");
        System.out.println("Sebelum swapping, a = " + a + " b = " + b);
        prosedurSwap(a, b);
    }

    public static void prosedurSwap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("Setelah swapping, a = " + a + " b = " + b);
    }
}

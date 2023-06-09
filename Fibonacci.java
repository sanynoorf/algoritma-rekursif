public class Fibonacci {
    public static int hitungFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return hitungFibonacci(n - 1) + hitungFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int jumlahAngka = 7;
        System.out.println("Deret Fibonacci dengan " + jumlahAngka + " angka:");
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print(hitungFibonacci(i) + " ");
        }
    }
}
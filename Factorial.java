public class Factorial {
    public static int hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int angka = 6;
        int faktorial = hitungFaktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
    }
}

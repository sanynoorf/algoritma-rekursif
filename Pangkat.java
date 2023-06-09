public class Pangkat {
    public static int hitungPangkat(int basis, int eksponen) {
        if (eksponen == 0) {
            return 1;
        } else {
            return basis * hitungPangkat(basis, eksponen - 1);
        }
    }

    public static void main(String[] args) {
        int basis = 6;
        int eksponen = 3;
        int hasilPangkat = hitungPangkat(basis, eksponen);
        System.out.println(basis + " pangkat " + eksponen + " adalah " + hasilPangkat);
    }
}
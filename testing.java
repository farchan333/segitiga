public class testing{
    public static void main(String[] args) {
        int panjangSegitiga = 5;
        for (int i = 0; i < panjangSegitiga; i++) {
            for (int j = i; j <= panjangSegitiga; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int rozmiar = 6; // ustalenie rozmiaru szachownicy

        for (int i = 1; i <= rozmiar; i++) {
            for (int j = 1; j <= rozmiar; j++) {
                // Sprawdzenie parzystości sumy indeksów i oraz j
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // wyświetlenie spacji
                }
            }
            System.out.println(); // przejście do nowej linii po zakończeniu wiersza
        }
    }
}

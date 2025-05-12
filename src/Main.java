import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaConcatenata<String> funzione = new ListaConcatenata<>();
        int scelta;
        do {
            System.out.println("\n1 - Visualizza contenuto lista\n" +
                    "2 - Inserisci in testa\n" +
                    "3 - Inserisci in coda\n" +
                    "4 - Inserisci in posizione prestabilita\n" +
                    "5 - Inserisci prima di un elemento cercato\n" +
                    "6 - Cancella un nodo\n" +
                    "0 - Uscita");
            System.out.print("Inserisci la tua scelta: ");
            scelta = input.nextInt();
            input.nextLine();
            switch (scelta) {
                case 1:{
                    System.out.println(funzione);
                    break;
                }
                default : System.out.println("Scelta non valida!");
            }
        } while (scelta != 0);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int scelta;
        do {
            System.out.println("1 - Visualizza contenuto lista\n" +
                    "2 - Inserisci in testa\n" +
                    "3 - Inserisci in coda\n" +
                    "4 - Inserisci in posizione prestabilita\n" +
                    "5 - Inserisci prima di un elemento cercato\n" +
                    "6 - Cancella un nodo\n" +
                    "0 - Uscita");
            System.out.print("Inserisci la tua scelta: ");
            scelta= input.nextInt();
            switch (scelta){
                case 1:{

                    break;
                }
                default -> System.out.println("Scelta non disponibile!");
            }
        }while (scelta!=0);
    }
}
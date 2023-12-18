import java.util.Scanner;

public class SommaPrimiNumeri {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero N:");
        int numeroN = scanner.nextInt();

        int somma = 0;

        //ciclo
       for(int i=1; i<=numeroN; i=i+1); {
        somma = somma + 1;
       }

        System.out.println("La somma dei primi numeri"+ numeroN + " è uguale" + somma);
        scanner.close();
       }
       }

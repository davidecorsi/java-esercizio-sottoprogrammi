import java.util.Scanner;

/*
 * Create un applicazione che chieda in input una somma di denaro, una percentuale di interesse ed
 * il numero di anni per il quale la somma di denaro verrà mantenuta dalla banca.
 * Per ogni anno la somma di denaro crescerà del 20% sul totale.
 * Calcolare la somma finale. Utilizzare sottoprogrammi per i valori da leggere, il calcolo della
 * somma finale e la stampa.
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double somma = letturaValore(input, "Inserire la somma di denaro ");
		double percentuale = letturaValore(input, "Inserire la percentuale di interesse ");
		double anni = letturaValore(input, "Inserire il numero di anni per il deposito ");
		double sommaFinale = calcoloSommaFinale(somma, percentuale, anni);
		stampaRisultato(sommaFinale);
	}
	
	public static double letturaValore(Scanner input, String msg) {
		System.out.print(msg);
		return input.nextInt();
	}
	
	public static double calcoloSommaFinale(double somma, double percentuale, double anni) {
		while(anni > 0) {
			somma += somma / 100 * percentuale;
			anni--;
		}
		return somma;
	}
	
	public static void stampaRisultato(double sommaFinale) {
		System.out.println("La somma finale è " + sommaFinale);
	}
}

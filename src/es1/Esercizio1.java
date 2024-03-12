package es1;

import java.util.*;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<String>parole=new HashSet<>();
        List<String>doppioni=new ArrayList<>();
        System.out.println("Digita il numero di elementi da inserire");
        int nElementi= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nElementi; i++) {
            System.out.println("Digita una parola da aggiungere ");
            String parola = scanner.nextLine();
            boolean aggiunte = parole.add(parola);
            if (!aggiunte) {
                System.out.println(parola + " è già presente");
                doppioni.add(parola);
            }
        }

        System.out.println("Numero di parole irripetibili: " + parole.size());
        System.out.println("Parole irripetibili: " + parole);
        System.out.println("Doppioni: " + doppioni);
        scanner.close();

    }
}

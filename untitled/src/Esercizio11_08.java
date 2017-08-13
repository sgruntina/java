public class Esercizio11_08 {
    public static void main(String[] args) {
        char lettera = 'A'; //dichiarazione tipo nomeVariabile = valoreVariabile
        /*
        i caratteri si mettono in apice singolo
        i numeri senza apici
        le stringhe con doppio apice o virgolette
         */
        lettera = 'J';
        System.out.println(lettera);

       double numeriConVirgola;
       numeriConVirgola = 2.41;

       int[] numeri;
       numeri = new int[]{2, 4, 7};
       numeri[1] = 5;
       stampaArrayInteri(numeri);

       char[] lettere;
       lettere = new char[3];
       lettere[0] = 'R';
       lettere[1] = 'K';
       lettere[2] = 'G';
       stampaArrayChar(lettere);

    }

    public static void stampaArrayInteri(int[] arrayDiInteri){
        //nelle tonde ci sono i parametri formali
        for (int i = 0; i < arrayDiInteri.length; i++){
            System.out.println(arrayDiInteri[i]);

        }
        //System.out.println(arrayDiInteri);


    }

    public static void stampaArrayChar(char[] arrayCaratteri){
        //for (variabile dello stesso tipo degli elementi iterati, es char; int ecc:collezione iterata, es [])
        for (char lettera : arrayCaratteri) {
            System.out.println(lettera);

        }

    }
}

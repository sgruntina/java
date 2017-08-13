public class Esercizio_If_Else {
    public static void main(String[] args) {
        double numero;
        numero = 4.00;
        togliIntero(numero);
        vediMaggioreOMinore(togliIntero(numero));
    }

    public static double togliIntero(double numeroEnne){
        while (numeroEnne >= 1){
            numeroEnne--;
        }
        return numeroEnne;

    }

    public static void vediMaggioreOMinore(double risultatoDelMetodo){
        if (risultatoDelMetodo >= 0.50){
            System.out.println("MAGGIORE");
        } else {
            System.out.println("MINORE");
        }
    }

}

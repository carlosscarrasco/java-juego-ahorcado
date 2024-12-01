import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta = "jirafa"; palabraSecreta = palabraSecreta.toUpperCase();
        int contadorIntentos = 0;
        int maxIntentos = 10;
        boolean palabraAcertada = false;

        System.out.println(" ");
        System.out.println("¡Bienvenid@ al juego del ahoracado! \n");

        char[] letrasAcertadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAcertadas.length; i++) {
            letrasAcertadas[i] = '_';
        }

        while (!palabraAcertada && contadorIntentos < maxIntentos) {
            System.out.println("Palabra a adivinar " + String.valueOf(letrasAcertadas) + " (" + (palabraSecreta.length()) + " letras)");
            System.out.println("Introduce una letra: ");
            char letra = sc.next().toUpperCase().charAt(0);
            System.out.println(" ");
            boolean letraCorrecta = false;

            for (int i = 0; i < letrasAcertadas.length; i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAcertadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                contadorIntentos ++;
                System.out.println("¡Letra incorrecta! Te quedan " + (maxIntentos - contadorIntentos) + " intentos.");
            }
            if (String.valueOf(letrasAcertadas).equals(palabraSecreta)) {
                palabraAcertada = true;
                System.out.println("¡Enhorabuena! Has acertado la palabra secreta: " + palabraSecreta + ".");
            }
        }

        if (!palabraAcertada) {
            System.out.println("¡Te has quedado sin intentos! La palabra secreta era: " + palabraSecreta + ".");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio_1 {

    public static int fatorial(int n){

        if (n == 1)
            return 1;

        else
            return n * fatorial(n-1);
    }
    public static void mostraPares(int n){
        int nPares = 0;

        for (int i = 1; i < n; i++){
            if (i % 2 == 0)
                nPares++;
        }

        System.out.println("A quantidade de números pares dentre 0 e " + n + " é: ");
        System.out.println(nPares);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numCalcFat;
        int resultFat;

        System.out.println("Insira o número que será calculado o fatorial: ");
        numCalcFat = entrada.nextInt(); // Recebendo número int

        resultFat = fatorial(numCalcFat);
        System.out.println(resultFat);

        // --------------------------------------------------------------------------------------------------- //

        int numCalcPar;

        System.out.println("Insira o número que será contabilizado a quantidade de números pares entre 0 e ele: ");
        numCalcPar = entrada.nextInt();

        mostraPares(numCalcPar);


        entrada.close();
    }

}
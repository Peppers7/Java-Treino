import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int n = sc.nextInt();
        double[] altura = new double[n];

        //Recebe a altura
        for (int i = 0; i < n ; i++) {
            altura[i] = sc.nextDouble();
        }

        //calculo da media
        for (int i = 0; i < n; i++){
            soma += altura[i];
        }

        double media = soma/n;

        System.out.printf("AVEREGE HEIGHT = %.2f", media);
        sc.close();
    }
}
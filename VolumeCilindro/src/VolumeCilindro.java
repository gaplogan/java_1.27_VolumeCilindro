import java.util.Scanner;

public class VolumeCilindro {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double r, a, h, v;

        r = 0;
        while (r <= 0)
        {
            System.out.print("Digite o valor do raio da base do cilindro: ");
            r = entrada.nextDouble();
        }

        h = 0;
        while (h <= 0)
        {
            System.out.print("Digite o valor da altura do cilindro: ");
            h = entrada.nextDouble();
        }

        a = Math.PI * Math.sqrt(r); // Área da base.
        v = a * h; // Volume do cilindro.

        System.out.println("Volume do cilindro " + v);

        entrada.close();
    }
}

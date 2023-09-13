import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static int numero1;
    public static int numero2;

    public static void main(String[] args) throws ParametrosInvalidosException {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                
                System.out.println("\nDigite um número que irá ficar como parâmetro: ");
                numero1 = scanner.nextInt();
                System.out.println("Imprimindo primeiro número digitado: "+numero1+"\n");

                System.out.println("Digite o segundo número que irá ficar como parâmetro: ");
                numero2 = scanner.nextInt();
                System.out.println("Imprimindo segundo número digitado: "+numero2+"\n");
                
                if(numero2>numero1){
                    System.out.println("O número de ocorrências é a diferença entre os dois parâmetros");
                    System.out.println("Número de ocorrências geradas:");
                    System.out.println("DIGITE QUALQUER LETRA E TECLE ENTER PARA CONTINUAR: ");
                    String tecla = scanner.next();
                    for(int i=1;i<diferencaParametros()+1;i++){
                        System.out.println("Ocorrência: "+i);
                        System.out.println("------------------------------");   
                    }
                    System.out.println("\nA quantidade total de ocorrências é: "+Contador.diferencaParametros());
                } else {
                    throw new ParametrosInvalidosException();
                }
            }
    }
    public Contador (int numero1, int numero2) {
    }
    public static int diferencaParametros() {
        return numero2 - numero1;
    }
}


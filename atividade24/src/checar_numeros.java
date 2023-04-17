import java.util.InputMismatchException;
import java.util.Scanner;
public class checar_numeros {
    public static void main(String[] args) {
        int numero,quantidade_repetida=0,i;
        boolean aprovado=false;
        Scanner valor = new Scanner(System.in);
        while(aprovado==false){
            try{
                System.out.println("digite quantas vezes deseja repetir");
                quantidade_repetida = valor.nextInt();
                if(quantidade_repetida<=0){
                    System.out.println("numero deve ser maior que 0\n");
                }else{
                    aprovado=true;
                }
            }catch (InputMismatchException exception){
                System.out.println("Digite um numero valido inteiro:\n");
                valor.next();
            }
        }
        for(i=1;i<=quantidade_repetida;i++){
            System.out.println("informe um numero");
            while(!valor.hasNextInt()){
                System.out.println("Digite um numero valido inteiro:");
                valor.next();
            }
            numero= valor.nextInt();
            if(numero<0){
                System.out.println(numero+" e negativo\n");
            } else if (numero>0) {
                System.out.println(numero+" e positivo\n");
            }else{
                System.out.println("voce digitou 0\n");
            }
        }
    }
}

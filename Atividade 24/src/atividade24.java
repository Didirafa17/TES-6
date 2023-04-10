import java.util.Scanner;
public class atividade24 {
    public static void main(String[] args) {
        int quantidade,numero,i;
        Scanner valor = new Scanner(System.in);
        System.out.println("Informe a quantidade de vezes para repetir");
        while(!valor.hasNextInt() || valor.nextInt()<1){
                System.out.println("Informe um numero inteiro valido (sem virgula)");
                valor.next();
        }
        quantidade = valor.nextInt();
        for(i=1;i<=quantidade;i++){
            System.out.println("Digite um numero");
            while(!valor.hasNextInt()){
                System.out.println("Informe um numero inteiro valido (sem virgula)");
                valor.next();
            }
            numero = valor.nextInt();
            if(numero<0){
                System.out.println("O numero "+numero+" e negativo");
            }else if(numero>0){
                System.out.println("O numero "+numero+" e positivo");
            }else{
                System.out.println("Seu numero e 0 portanto neutro");
            }
        }
    }
}

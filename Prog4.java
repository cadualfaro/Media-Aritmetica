/*
Implementar um programa que lê valores até receber um valor negativo, e calcula a média
de todos os valores positivos digitados
*/
package prog4;
import java.util.Scanner;
public class Prog4 {

    public static void main(String[] args) {
        double i, valor, total = 0;
        
        Scanner my_scan = new Scanner(System.in);
        
        System.out.println("O programa ira receber valores positivos e calcular a media de tais valores");
        System.out.println("\nInsira um valor menor que 0 para calcular a media dos valores positivos");
        
        for(i=0; i >= 0;i++){
        System.out.println("\nInsira um valor: ");
        valor = my_scan.nextDouble();  
        
        if(valor >= 0){
        total = valor+total;
        }
        else if(valor<0){
            double media = total/i;
            System.out.println("\nA media dos numeros inseridos e: "+media);
            break;
        }
    }
    }
}


package lista4;

import java.util.Scanner;

/**
 * Dado um vetor​ de números reais, fazer um programa que imprima o menor elemento do vetor
 *
 * @author Rafael
 */
public class Exe4 {
     public static void main(String[] args) {
        
        int dados = recebeDados();
        int[] vetor = vetor(dados);
        vetor = preencheVetor(vetor);
        int menor = menor(vetor);
        imprimi(menor);
    }
    
    static int recebeDados(){
        Scanner leitor = new Scanner(System.in);
        int dados = 0;
        boolean saiLoop = true;
        do{
            try{
                System.out.print("Digite um valor: ");
                dados = Integer.parseInt(leitor.next());
                
                saiLoop = false;
                
            }catch(Exception ex){
                System.out.printf("\n Número Invalido! \n digite novamente!! \n");
            }
        }while(saiLoop);
        
        return dados;
        
    }
    
    static int[] vetor(int dados){
        int[] vetor = new int[dados];
        
        return vetor;
    }
    
    static int[] preencheVetor(int[] vetor){
        int dados = 0;
        for(int i = 0; i < vetor.length; i++){
            dados = recebeDados();
            
            vetor[i] = dados;
        }
        
        return vetor;
    }
    
    static int menor(int[] vetor){
       int menor = vetor[0];
       
       for(int i = 1; i<vetor.length; i++){
           if(vetor[i] < menor){
               
               menor = vetor[i];
           }
       }        
    
        return menor;
    } 
    
    static void imprimi(int menor){
        
        System.out.println("O maior numero é: "+ menor);
    }
    
    
}

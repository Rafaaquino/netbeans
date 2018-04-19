/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author upper
 */
public class Lista4 {

    static int dado;
    static Scanner leitor = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int a = recebeDados();
       //int b = recebeDados();
       
       int[] vetor = vetor(a);
       //int[] vetorB = vetorB(b);
       vetor = preencheVetor(vetor);
       //int[] vetor = contImpares(vetor);
       imprimiVetor(vetor);
       //int result2 = contMenor(vetor);
       //imprime(result2);
        
    }
    
    static int recebeDados(){
        
        int dado = 0;
        boolean saiLoop = true;
        do{
            try{ 
                System.out.print("Digite um numero: ");
                dado = Integer.parseInt(leitor.next());
                saiLoop = false;
           }
            catch(Exception ex){
                System.out.printf("\n número invalido! digite novamente \n");
            }
        }while(saiLoop);
        
        return dado;        
    }
    
    static int[] vetor(int a){
        
        int[] vetor = new int[a];
        
        return vetor;        
    }
    
    static int[] vetorB(int a){
        
        int[] vetorB = new int[a];
        
        return vetorB;
    }
    
    static int[]  preencheVetor(int[] vetor){
        int a = 0;
        for(int i=0; i<vetor.length; i++ ){
            a = leitor.nextInt();
            
            vetor[i] = a;
        }
        
        return vetor;
    }
    
    static int contPares(int[] vetor){
        
        int pares = 0;
        
        for(int i=0; i<vetor.length; i++){
            
            if(vetor[i] %2 == 0){
                
                pares = vetor[i];
            }
        }
        return pares;
    }
    
    static int contImpares(int[] vetor){
        
        int impares = 0;
        
        for(int i=0; i<vetor.length; i++){
            
            if(vetor[i] %2 == 1){
                
                impares = vetor[i];
            }
        }
        return impares;
    }
    
    static int contMenor(int[] vetor){
        
        int menor = vetor[0];
        
        for(int i = 1; i < vetor.length; i++){
            
         //menor = vetor[0];
            if(vetor[i] < menor){
                
                menor = vetor[i];
            }
        }
        return menor;
    }
    
    static int contMaior(int[] vetor){
        
        int maior = vetor[0];
        
        for(int i = 1; i < vetor.length; i++){
            
         //menor = vetor[0];
            if(vetor[i] > maior){
                
                maior = vetor[i];
            }
        }
        return maior;
    }
    
    static void imprime(int a){
        
        System.out.println("o numero é: "+a);
    }
    
    static void imprimiVetor(int[] vetor){
        for (int i = 0; i<vetor.length; i ++){
            
                System.out.printf("vetor [%d]: %d \n", i , vetor[i]);
            
        }
    }
    
    static void imprimiMatriz(int[][] matriz){
        for (int i = 0; i<matriz.length; i ++){
            
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Matriz [%d][%d]: %d \n", i ,j, matriz[i][j]);
            }
        }
    }
    
}

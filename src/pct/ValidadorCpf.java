/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ValidadorCpf {
    public static void main(String[] args) {
        String cpf;
        int d1, d2, soma=0, idx=0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\n\t---Validador de CPF---\t");
        
        System.out.print("Digite seu CPF: ");
        cpf = entrada.next();
        
        if(cpf.length() == 11){
            for(int i = 10;i>=2;i--){
                soma += Character.getNumericValue(cpf.charAt(idx))*i;
                idx++;
            }  
            d1 = soma % 11;
            if(d1 >=2){
                d1 = 11-d1;
            }else{
                d1 = 0;
            }
            
            soma = 0;
            idx = 0;
            
            for(int i = 11;i >= 2;i--){
                soma += Character.getNumericValue(cpf.charAt(idx))*i;
                idx++;
            }
            d2 = soma % 11;
            if(d2>=2){
                d2 = 11 - d2;
            }else{
                d2=0;
            }
            if(d1 == Character.getNumericValue(cpf.charAt(9)) && (d2 == Character.getNumericValue(cpf.charAt(10)))){
                System.out.println("CPF VÁLIDO!!");
            }else{
                System.out.println("CPF INVÁLIDO!!");
            }
        }else{
            System.out.println("O CPF: "+ cpf + " tem a quantidade de digitos incorreto");
        }
    }
}

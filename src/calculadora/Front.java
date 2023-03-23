package calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import calculadora.calculadoraimc;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rober
 */
public class Front {
   static ArrayList<calculadoraimc> listaCalculos = new ArrayList<>();
            
    public static void main(String[] args) {
        
        while (true) {            
            System.out.println("PROGRAMA OO CÁLCULO IMC");
            System.out.print(" N = Novo");
            System.out.print(" L = Listar");
            System.out.print(" S = Sair");
            System.out.print(" Opção: ");
            Scanner sc = new Scanner(System.in);
            String lido = sc.nextLine();
            if (lido.equals("S")){
                break;
            } else if (lido.equals("N")){
               calculadoraimc a = criarCalculo();
               listaCalculos.add(a);
            } else if (lido.equals("L")){
                for(calculadoraimc a : listaCalculos){
                   mostrarResultado(a);
                }
                
            }
        }
    }
    
    public static void mostrarResultado(calculadoraimc a1) {
        
        System.out.print("CPF: " + a1.getCPF());        
        System.out.print(" | Nome: " + a1.getNome());
        System.out.print(" | Peso: " + a1.getPeso());
        System.out.println(" | Altura: " + a1.getAltura());
        System.out.println("Seu IMC é " + a1.calcularIMC());
        System.out.println("Sua classificação é: " + a1.classificarIMC());
    }
    
    public static calculadoraimc criarCalculo() {
        // Teste1: Um aluno com dados fictícios
        calculadoraimc a1 = new calculadoraimc();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("CPF: ");
        a1.setCPF(sc.next());
        
        System.out.print("Nome: ");
        a1.setNome(sc.next());
        
        System.out.print("Peso: ");
       try {
           a1.setPeso(sc.nextFloat());
       } catch (Exception ex) {
           Logger.getLogger(Front.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        System.out.print("Altura: ");
       try {
           a1.setAltura(sc.nextFloat());
       } catch (Exception ex) {
           Logger.getLogger(Front.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        return a1;
    }   
}

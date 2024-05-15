/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listacircular;

/**
 *
 * @author User
 */
public class ExemploLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaDuplamenteEncadeadaCircular lista = 
                new ListaDuplamenteEncadeadaCircular<>();
        
        lista.adicionarInicio(10);
        lista.adicionarFim(15);
        lista.adicionarInicio(23);
        lista.adicionarFim(1);
        
        lista.imprimir();
        System.out.println("--------------");
        lista.imprimirReverso();
    }
    
}

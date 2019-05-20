/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *  Interface para designar classes de pessoas que recebem bonificação
 * 
 * @author rodrigo.pinto
 */
public interface Bonificavel {
    
    
    /**
     * Método para calcular o bônus do objeto
     * Note que, dependendo da classe, o comportamento do bônus pode variar.
     * @return 
     */
    double getBonificacao();
}

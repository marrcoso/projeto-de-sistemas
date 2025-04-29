/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadeiaDeResponsabilidade;

public interface Desconto {
    double valor(Pedido pedido);
    
    void definirSucessor(Desconto desconto);
}

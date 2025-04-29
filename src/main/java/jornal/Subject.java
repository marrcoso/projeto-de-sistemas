/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jornal;

/**
 *
 * @author aluno
 */
public interface Subject {
    public void registrar(Observador usuario);
    
    public void notificar();
    
    public void desregistrar(Observador usuario);
}

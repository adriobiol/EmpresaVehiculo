/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Obi
 */
public class Coche extends Transporte  {

    public Coche(int plaza, String matricula) {
        super(plaza, matricula);
    }

    
    
    public double precioAlquiler (int dia){
        double precio=(50*dia+(1.5*getPlaza()*dia));
    return precio;
    }
    
}

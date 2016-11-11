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
public class Microbus extends Transporte  {

    public Microbus(int plaza, String matricula) {
        super(plaza, matricula);
    }
    
  public double precioAlquiler (int dia){
        double precio=(50*dia+(2*getPlaza()));
    return precio;
    }
}

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
public class Camion extends Carga {

    public Camion(double PMA, String matricula) {
        super(PMA, matricula);
    }
    public double precioAlquiler (int dia){
        double precio = 40 + (20*getPMA()) + 50 * dia;
    return precio;
    }
}

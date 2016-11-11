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
public class Furgoneta extends Carga {

    public Furgoneta(double PMA, String matricula) {
        super(PMA, matricula);
    }

    public double precioAlquiler(int dia) {
        double precio = (20 * getPMA()) + 50 * dia;
        return precio;
    }
}

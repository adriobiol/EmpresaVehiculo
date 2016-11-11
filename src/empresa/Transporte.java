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
public class Transporte extends Vehiculo{
    private int plaza;

    public Transporte(int plaza, String matricula) {
        super(matricula);
        this.plaza = plaza;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }
    
}

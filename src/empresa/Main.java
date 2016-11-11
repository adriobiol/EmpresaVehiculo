/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import java.util.ArrayList;
import ocutilidades.EntradaDatos;
public class Main {
  
        public static void main(String[] args) {
        Coche uno = new Coche(5, "1A");
        Microbus dos = new Microbus (20, "2B");
        Furgoneta tres = new Furgoneta (2, "3C");
        Camion cuatro = new Camion (10, "4D");
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();  
            vehiculos.add(uno);
            vehiculos.add(dos);
            vehiculos.add(tres);
            vehiculos.add(cuatro);
            menu();
            String matricula = EntradaDatos.pedirCadena("¿Matrícula?");
            Vehiculo v = obtMatricula(matricula, vehiculos);
            if (v!=null){
            if (uno.getMatricula()==v.getMatricula()){
                int dias = EntradaDatos.pedirEntero("¿Cuántos días se dispondrá del vehículo?");
                Double precio = uno.precioAlquiler(dias);
                System.out.println("El precio total es: " + precio);
            }
            else if (dos.getMatricula()==v.getMatricula()){
                int dias = EntradaDatos.pedirEntero("¿Cuántos días se dispondrá del vehículo?");
                Double precio = dos.precioAlquiler(dias);
                System.out.println("El precio total es: " + precio);               
            }
               else if (tres.getMatricula()==v.getMatricula()){
                int peso = EntradaDatos.pedirEntero("¿Cuántos peso necesitas?");
                Double precio = tres.precioAlquiler(peso);
                System.out.println("El precio total es: " + precio);
                }
               else if (cuatro.getMatricula()==v.getMatricula()){
                int peso = EntradaDatos.pedirEntero("¿Cuántos peso necesitas?");
                Double precio = cuatro.precioAlquiler(peso);
                System.out.println("El precio total es: " + precio);
                }

            }
            else {
                   System.out.println("Esa matrícula no está registrada");
               }
        }
        
        private static void menu(){
            System.out.println("Coche: 1A");
            System.out.println("Microbus: 2B");
            System.out.println("Furgoneta: 3C");
            System.out.println("Camión: 4D");
            
        }
        private static Vehiculo obtMatricula (String matricula,ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            boolean result = v.getMatricula().contentEquals(matricula);
            if (result==true) {
                return v;
            }
        }
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author dieberalv
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Vamos a llamar todo para poder ejecutar correctamente
        //Empezamos a hacer instancia de objetos
        
        Modelo mod = new Modelo();
        Vista view = new Vista();
        
        //Vamos a llamar al controlador y le enviamos los parámetros que acabamos de crear
        Controlador ctrl = new Controlador(view,mod);
        
        //Llamar al método del controlador iniciar()
        ctrl.iniciar();
        
        //Establecemos ahora que el formulario sea visible
        view.setVisible(true);
    }
    
}

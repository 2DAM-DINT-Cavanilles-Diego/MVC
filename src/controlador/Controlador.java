/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author dieberalv
 */
public class Controlador implements ActionListener {

    //Declaramos las variables para cada clase creada
    private final Vista view;
    private final Modelo model;

    //Constructor
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;

        // Traer la acción del botón accediendo a los botones de la vista
        this.view.btnMultiplicar.addActionListener(this);

    }
    
    public void iniciar(){
        //Definir el título
        view.setTitle("MVC MULTIPLICAR");
        
        //Indicar la posición donde se va a iniciar la ventana
        //Por ser null, es la posición '0'. Es decir, en el centro de la pantalla
        view.setLocationRelativeTo(null);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.modeloPaises;
import View.frmAgregaryEliminar;
import View.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class paisController implements ActionListener{
    frmAgregaryEliminar ventanaAgregar;
    frmPrincipal ventanaPrincipal;
    modeloPaises modeloP;
    HashMap MiLista2 = new HashMap();

    public paisController(frmAgregaryEliminar ventanaAgregar, frmPrincipal ventanaPrincipal, modeloPaises modeloP) {
        this.ventanaAgregar = ventanaAgregar;
        this.ventanaPrincipal = ventanaPrincipal;
        this.modeloP = modeloP;
        
        this.ventanaPrincipal.btnAgregarpaisfrm.addActionListener(this);
        this.ventanaPrincipal.setVisible(true);
        this.ventanaPrincipal.setLocationRelativeTo(null);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.ventanaPrincipal.btnAgregarpaisfrm){
            this.ventanaAgregar.btnAgregar.addActionListener(this);
            this.ventanaAgregar.btnEliminar.addActionListener(this);
            this.ventanaAgregar.setVisible(true);
            this.ventanaAgregar.setLocationRelativeTo(null);
            
        }
        
        if(e.getSource()== this.ventanaAgregar.btnAgregar){    
           MiLista2.forEach((clave,valor)->{
            if(clave == this.ventanaAgregar.txtCodigodePais.getText()){
                JOptionPane.showConfirmDialog(null, "Ya fue ingresado este pais");
            }
            else{
                MiLista2.put(this.ventanaAgregar.txtCodigodePais.getText(), 
                        ventanaAgregar.txtPaisOrigen.getText());
            }
        });
            
            this.ventanaAgregar.txtCodigodePais.setText("");
            this.ventanaAgregar.txtPaisOrigen.setText("");
            System.out.println(MiLista2);
        }
        
        if(e.getSource()== this.ventanaAgregar.btnEliminar){
            MiLista2.remove(this.ventanaAgregar.txtCodigodePais.getText());
            this.ventanaAgregar.txtCodigodePais.setText("");
            this.ventanaAgregar.txtPaisOrigen.setText("");
            JOptionPane.showConfirmDialog(null, "pais eliminado");
            System.out.println(MiLista2);
        }
    }
    
    
            
}

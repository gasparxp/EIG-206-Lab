/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Control.Control;
import Modelo.Modelo;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edva5
 */
public class InterfazAdministrador extends myInterface implements Observer{

    /**
     * @param modelo the modelo to set
     */
   
    public static final String MANTENIMIENTO_ADMINISTRADOR="Mantenimiento Administrador";
    /*private Control control;
    private Modelo modelo;    */
    /**
     * Creates new form InterfazAdministrador
     */
    public InterfazAdministrador() {
        initComponents();
        this.setTitle(MANTENIMIENTO_ADMINISTRADOR);                
    }    

    @Override
    public void setModelo(Modelo modelo) {
        modelo.getAllAdministradores().stream().forEach(x->this.defaultTableModel.addRow(x.toVectorOfString()));
        super.setModelo(modelo); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * @param control the control to set
     */    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param args the command line arguments
     */   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

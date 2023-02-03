
package com.mycompany.desafio1.Igu;


import com.mycompany.desafio1.Logica.Auto;
import com.mycompany.desafio1.Logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
    
    Controladora control = null;

   
    public VerDatos() {
        
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutos);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Datos de Autos:");

        btnEditar.setIcon(new javax.swing.ImageIcon("E:\\PROGRAMACION\\JAVA\\Proyectos\\JAVA TodoCode\\logoEditar2.png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("E:\\PROGRAMACION\\JAVA\\Proyectos\\JAVA TodoCode\\logoEliminar.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(318, 318, 318))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        //Controlo que la tabla no este vacia
        
        if (tablaAutos.getRowCount() > 0) {
            
            //Controlo que se haya seleccionado un registro
          if (tablaAutos.getSelectedRow() != -1) {
           
              //Obtengo la Id del auto a eliminar
              
              int id = Integer.parseInt(String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0 )));
              
              //Llamo al metodo borrar
              control.eliminarAuto(id);  
              
              //Aviso al usuario que borro correctamente
              mostrarMensaje("Auto eliminado corectamente", "info", "borrado de Mascota");
              cargarTabla();
          } 
           else {
              mostrarMensaje("No seleccionó ningun Auto","Error","Error al eliminar");
            }
        }
        else {  
            mostrarMensaje("No hay nada para eliminar en la tabla","Error","Error al eliminar");    
        }        
      
    }
    
    public void mostrarMensaje (String mensaje, String tipo, String titulo) {
      
        JOptionPane optionPane = new JOptionPane (mensaje);
        
        if (tipo.equals("Info")){
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (tipo.equals("Error")) {
             optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);    
    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     
         
        if (tablaAutos.getRowCount() > 0) {
            
            //Controlo que se haya seleccionado un registro
          if (tablaAutos.getSelectedRow() != -1) {
           
            //Obtengo la Id de la mascota a editar
            int id = Integer.parseInt(String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0 )));    
            
            ModificarDatos pantallaModif = new ModificarDatos(id);
            pantallaModif.setVisible(true);
            pantallaModif.setLocationRelativeTo(null);
            
            this.dispose();
            
         } 
           else {
              mostrarMensaje("No seleccionó ningun auto","Error","Error al eliminar");
            }
        }
        else {  
            mostrarMensaje("No hay nada para eliminar en la tabla","Error","Error al eliminar");    
        }      
        
    }//GEN-LAST:event_btnEditarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutos;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("empty-statement")
    private void cargarTabla() {
       
        //Definir el modelo que queremos que tenga la tabla
        
        DefaultTableModel modeloTabla = new DefaultTableModel () {
        
            //que filas y columnas no sean editables
            @Override
            public boolean isCellEditable (int row, int column) {
                return false;
            }
        }; 
        
        //Establecemos los nombres de las columnas
        
        String titulos [] = {"Id", "Marca", "Modelo", "Motor", "Color", 
            "Patente", "Puertas"};
        
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Carga de los datos desde la Base de Datos
        
        List <Auto> listaAutos = control.traerListaAuto();
        
        //Recorrer la lista y mostrar cada uno de los elementos en la tabla
        
        if (listaAutos != null ) {
        
            for (Auto auto : listaAutos) {
               Object [] objeto = {auto.getId(), auto.getMarca(), auto.getModelo(), auto.getMotor(),
                auto.getColor(),auto.getPatente(), auto.getNumPuertas()};
               
               modeloTabla.addRow(objeto);
            }
        }
        
        tablaAutos.setModel(modeloTabla);
        
    }
}   


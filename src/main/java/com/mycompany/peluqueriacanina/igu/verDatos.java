
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class verDatos extends javax.swing.JFrame {

    Controladora control = null;
  
    public verDatos() {
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
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Visualización de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Datos de mascotas:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
          if (tablaMascotas.getRowCount() > 0){
              // Controlo que se haya seleccionado a una mascota
              if (tablaMascotas.getSelectedRow() !=-1){
                  //Obtengo el id de la mascota a eliminar
                  int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                  //llamo al metodo borrar
                  control.borrarMascota(num_cliente);
                  
                   // aviso al usuario que borró correctamente
                   mostrarMensaje ("Mascota eliminada correctamente", "Info", "Borrado de Mascota");
                   cargarTabla();
                  
              }else{
                  mostrarMensaje ("No seleccionó ninguna mascota", "Error", "Error al eliminar");
              }
          }else{
                  mostrarMensaje ("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
          }
     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
           // controlo que la tabla no este vacia
             if (tablaMascotas.getRowCount() > 0){
              // Controlo que se haya seleccionado a una mascota
              if (tablaMascotas.getSelectedRow() !=-1){
                  // obtengo el id de la mascota a editar
                  int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                  
                     ModificarDatos pantallaModif = new  ModificarDatos (num_cliente);
                     pantallaModif.setVisible(true);
                     pantallaModif.setLocationRelativeTo(null);
                  
                     
                         this.dispose();
                         
           }else{
                  mostrarMensaje ("No seleccionó ninguna mascota", "Error", "Error al eliminar");
              }
          }else{
                  mostrarMensaje ("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
          }
             
    }//GEN-LAST:event_btnEditarActionPerformed

public void mostrarMensaje(String mensaje, String tipo, String titulo){
    JOptionPane optionPane = new JOptionPane(mensaje);
    if (tipo.equals("Info")){
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    }else if (tipo.equals("Error")){
        optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
    }
    JDialog dialog = optionPane.createDialog(titulo);
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
       
        //definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            // Que fila y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int colum){
                return false;
            }
        };

        //Establecemos los nombres de las columnas
        String titulos [ ] = { "Num", "Nombre", "Color", "Raza", "Alergico",  "At. Esp.", "Dueño", "Tlf" };
       modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la base de datos
        List <Mascota> listaMascotas = control.traerMascotas();
        
        //recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaMascotas!=null){
            for(Mascota masco : listaMascotas){
                Object [ ] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(), masco.getRaza(),
                    masco.getAlergico(), masco.getAtencion_especial(), masco.getUnDuenio().getNombre(),
                    masco.getUnDuenio().getTlfDuenio()};
                
                modeloTabla.addRow(objeto);
            }
        }
        
        tablaMascotas.setModel(modeloTabla);
        
    }
}

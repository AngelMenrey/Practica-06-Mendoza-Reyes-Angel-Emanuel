
import java.util.jar.Attributes;
import javax.swing.DefaultListModel;


public class frmCotizador extends javax.swing.JFrame {
    private Listacotizador listacotizador;
    float subto = 0, total = 0, IVA = (float) .16;
    
    public frmCotizador(String usuario) {
        initComponents();
        setLocationRelativeTo(null);
        name.setText(usuario);
        listacotizador = new Listacotizador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        JSCANTIDADDEDIAS = new javax.swing.JScrollBar();
        JLCANTIDADEDIAS = new javax.swing.JLabel();
        JLDESTINOSTURISTICOS = new javax.swing.JLabel();
        JCDESTINOSTURISTICOS = new javax.swing.JComboBox<>();
        JLTIPODEHABITACION = new javax.swing.JLabel();
        JLTIPODEPAGO = new javax.swing.JLabel();
        REGISTRAR = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        MENSUALIDADES = new javax.swing.JRadioButton();
        TARJETA = new javax.swing.JRadioButton();
        TXTREGISTRAR = new javax.swing.JLabel();
        SUITE = new javax.swing.JRadioButton();
        DOBLE = new javax.swing.JRadioButton();
        SENCILLA = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLTIPODEHOTEL = new javax.swing.JList<>();
        TXT = new javax.swing.JLabel();
        TXT1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel1.setText("COTIZADOR");

        JSCANTIDADDEDIAS.setBackground(new java.awt.Color(102, 102, 255));
        JSCANTIDADDEDIAS.setBlockIncrement(1);
        JSCANTIDADDEDIAS.setMaximum(40);
        JSCANTIDADDEDIAS.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        JSCANTIDADDEDIAS.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                JSCANTIDADDEDIASAdjustmentValueChanged(evt);
            }
        });

        JLCANTIDADEDIAS.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        JLCANTIDADEDIAS.setText("CANTIDAD DE DIAS:");

        JLDESTINOSTURISTICOS.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        JLDESTINOSTURISTICOS.setText("DESTINOS TURISTICOS");

        JCDESTINOSTURISTICOS.setBackground(new java.awt.Color(153, 153, 255));
        JCDESTINOSTURISTICOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acapulco", "Puerto Vallarta", "Cancun ", "Rivera Maya", "Playa del Carmen", " " }));
        JCDESTINOSTURISTICOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCDESTINOSTURISTICOSActionPerformed(evt);
            }
        });

        JLTIPODEHABITACION.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        JLTIPODEHABITACION.setText("TIPO DE HABITACION");

        JLTIPODEPAGO.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        JLTIPODEPAGO.setText("TIPO DE PAGO");

        REGISTRAR.setBackground(new java.awt.Color(51, 255, 0));
        REGISTRAR.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });

        MOSTRAR.setBackground(new java.awt.Color(255, 255, 0));
        MOSTRAR.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });

        REGRESAR.setBackground(new java.awt.Color(255, 0, 0));
        REGRESAR.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        LIMPIAR.setBackground(new java.awt.Color(0, 255, 204));
        LIMPIAR.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        buttonGroup1.add(MENSUALIDADES);
        MENSUALIDADES.setText("Mensualidades");

        buttonGroup1.add(TARJETA);
        TARJETA.setText("Tarjeta");
        TARJETA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TARJETAActionPerformed(evt);
            }
        });

        buttonGroup2.add(SUITE);
        SUITE.setText("Suite");

        buttonGroup2.add(DOBLE);
        DOBLE.setSelected(true);
        DOBLE.setText("Doble");

        buttonGroup2.add(SENCILLA);
        SENCILLA.setText("Sencilla");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel2.setText("TIPO DE HOTEL");

        jScrollPane1.setViewportView(JLTIPODEHOTEL);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel3.setText("Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLDESTINOSTURISTICOS)
                            .addComponent(JCDESTINOSTURISTICOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel1))
                            .addComponent(JSCANTIDADDEDIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLCANTIDADEDIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(REGRESAR)
                                        .addGap(39, 39, 39)
                                        .addComponent(LIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLTIPODEHABITACION)
                                            .addComponent(MENSUALIDADES)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(SENCILLA)
                                                    .addComponent(DOBLE)
                                                    .addComponent(SUITE)
                                                    .addComponent(JLTIPODEPAGO)))
                                            .addComponent(TARJETA))
                                        .addGap(74, 74, 74))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3)
                                .addGap(65, 65, 65)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(REGISTRAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MOSTRAR)
                            .addComponent(TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(283, 283, 283)
                                .addComponent(TXTREGISTRAR)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(JLCANTIDADEDIAS)
                        .addGap(3, 3, 3)
                        .addComponent(JSCANTIDADDEDIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLDESTINOSTURISTICOS)
                        .addGap(18, 18, 18)
                        .addComponent(JCDESTINOSTURISTICOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(JLTIPODEHABITACION)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SENCILLA)
                        .addGap(18, 18, 18)
                        .addComponent(DOBLE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SUITE)
                        .addGap(18, 18, 18)
                        .addComponent(JLTIPODEPAGO)
                        .addGap(18, 18, 18)
                        .addComponent(MENSUALIDADES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTREGISTRAR)
                        .addGap(17, 17, 17)
                        .addComponent(TARJETA)
                        .addGap(55, 55, 55)))
                .addGap(29, 29, 29)
                .addComponent(TXT)
                .addGap(12, 12, 12)
                .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(REGISTRAR)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(REGRESAR)
                            .addComponent(LIMPIAR)
                            .addComponent(MOSTRAR))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
    frmInicio inicio = new frmInicio();
    inicio.setVisible(true);
    dispose();
    setVisible(false);        
    }//GEN-LAST:event_REGRESARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
    buttonGroup1.clearSelection();
    buttonGroup2.clearSelection();
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void JCDESTINOSTURISTICOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCDESTINOSTURISTICOSActionPerformed
      DefaultListModel modelo = new DefaultListModel();
      switch(JCDESTINOSTURISTICOS.getSelectedIndex()){
          case 0:
              modelo.addElement("HOTEL A");
              modelo.addElement("HOTEL B");
              modelo.addElement("HOTEL C");
              break;
          case 1:
              modelo.addElement("HOTEL A");
              modelo.addElement("HOTEL B");
              modelo.addElement("HOTEL C");
              break;
          case 2:
              modelo.addElement("HOTEL A");
              modelo.addElement("HOTEL B");
              modelo.addElement("HOTEL C");
              break;
          case 3:
              modelo.addElement("HOTEL A");
              modelo.addElement("HOTEL B");
              modelo.addElement("HOTEL C");
              break;
          case 4:
              modelo.addElement("HOTEL A");
              modelo.addElement("HOTEL B");
              modelo.addElement("HOTEL C");
             break;
      }
       JLTIPODEHOTEL.setModel(modelo);
    }//GEN-LAST:event_JCDESTINOSTURISTICOSActionPerformed

    private void JSCANTIDADDEDIASAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_JSCANTIDADDEDIASAdjustmentValueChanged
    JLCANTIDADEDIAS.setText("CANTIDAD DE DIAS: \n" + String.valueOf(JSCANTIDADDEDIAS.getValue()));
    }//GEN-LAST:event_JSCANTIDADDEDIASAdjustmentValueChanged

    private void TARJETAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TARJETAActionPerformed
    
    }//GEN-LAST:event_TARJETAActionPerformed

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
    String tipoHab = null ;
    String tipoPag = null ;
    DefaultListModel modelo = new DefaultListModel();    
    switch(JCDESTINOSTURISTICOS.getSelectedIndex()){
    case 0:
     subto = 5000;
     break;
     case 1:
     subto = 4000;
     break;
     case 2:
     subto = 3500;
     break;
     case 3:
     subto = 5000;
     break;
     case 4:
     subto = 6500;
     break;
    }
    
    if(SENCILLA.isSelected()){
    tipoHab = " Habitacion Sencilla";
    subto = subto + 1000; 
        }
    else if(DOBLE.isSelected()){
    tipoHab = "Habitacion Doble";
    subto = subto + 2000;
    }
    else if(SUITE.isSelected()){
    tipoHab = "Habitacion Suite";
    subto = subto + 3000;
    }
    if(TARJETA.isSelected()){
    tipoPag = "Tarjeta";  
    }
    else if(MENSUALIDADES.isSelected()){
    tipoPag = "Mensualidades";
    subto = (subto*(float)(1.3));
    }
    subto = (subto)*(JSCANTIDADDEDIAS.getValue());
    total = (subto + (subto*(IVA)));
    listacotizador.agregar(JSCANTIDADDEDIAS.getValue(), JCDESTINOSTURISTICOS.getSelectedItem().toString(),JLTIPODEHOTEL.getSelectedValue().toString(),tipoHab,tipoPag,total);
    TXT.setText("Datos agregados");
    }//GEN-LAST:event_REGISTRARActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
    String usuario = name.getText();
    frmMostrarCotizador frm = new frmMostrarCotizador(name.getText(),listacotizador.recorrerDestinos(),listacotizador.estaVacia());
    frm.setVisible(true);
     
   // frmMostrarCotizador frm = new frmMostrarCotizador();
    //frm.setVisible(true);
    //this.dispose();
    //setVisible(false);
            
    }//GEN-LAST:event_MOSTRARActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new frmCotizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DOBLE;
    private javax.swing.JComboBox<String> JCDESTINOSTURISTICOS;
    private javax.swing.JLabel JLCANTIDADEDIAS;
    private javax.swing.JLabel JLDESTINOSTURISTICOS;
    private javax.swing.JLabel JLTIPODEHABITACION;
    private javax.swing.JList<String> JLTIPODEHOTEL;
    private javax.swing.JLabel JLTIPODEPAGO;
    private javax.swing.JScrollBar JSCANTIDADDEDIAS;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JRadioButton MENSUALIDADES;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JRadioButton SENCILLA;
    private javax.swing.JRadioButton SUITE;
    private javax.swing.JRadioButton TARJETA;
    private javax.swing.JLabel TXT;
    private javax.swing.JLabel TXT1;
    private javax.swing.JLabel TXTREGISTRAR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}

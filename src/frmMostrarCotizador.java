
public class frmMostrarCotizador extends javax.swing.JFrame {
  
    public frmMostrarCotizador(String usuario, String recorrerLista,boolean estavacia) {
        initComponents();
        setLocationRelativeTo(null);
        if(estavacia){
            TEXTAREA.setText("no hay datos registrados");
        }else{
            TEXTAREA.append("Nombre: " + usuario + "\n");
            TEXTAREA.append(recorrerLista);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLCOSTOCOTIZADOR = new javax.swing.JLabel();
        REGRESAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEXTAREA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLCOSTOCOTIZADOR.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        JLCOSTOCOTIZADOR.setText("DATOS COTIZADOR");

        REGRESAR.setBackground(new java.awt.Color(255, 0, 51));
        REGRESAR.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        TEXTAREA.setColumns(20);
        TEXTAREA.setRows(5);
        jScrollPane1.setViewportView(TEXTAREA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(JLCOSTOCOTIZADOR)
                        .addGap(0, 178, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(REGRESAR)
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLCOSTOCOTIZADOR)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(REGRESAR)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
    frmCotizador frm = new frmCotizador("");
    frm.setVisible(true);
    dispose();
    setVisible(false);   
    }//GEN-LAST:event_REGRESARActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmMostrarCotizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCOSTOCOTIZADOR;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JTextArea TEXTAREA;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aguacate.vista;

import aguacate.modelo.Usuario;
import aguacate.modelo.Bloque;
import aguacate.modelo.NoobChain;
import static aguacate.modelo.NoobChain.addBlock;
import static aguacate.modelo.NoobChain.genesisTransaction;
import co.edu.unisinu.tallerpro.abp.finanzas.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author JoseP
 */
public class venInterna extends javax.swing.JFrame {

    
    static int count = 0;
    
    public venInterna() {
        initComponents();
        Usuario user = Principal.usuarios.get(0);
        String balance = String.valueOf(user.balance);
        String balanceOr = String.valueOf(user.getCartera().getBalance());
        String deudas = String.valueOf(user.deudas);
        usuarioLabel.setText(user.id);
        balanceLabel.setText(balanceOr);
        deudasLabel.setText(deudas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiUsuario = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        etiBalance = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        etiDeudas = new javax.swing.JLabel();
        deudasLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTransferir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnRecargar = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiUsuario.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        etiUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiUsuario.setText("BIENVENIDO");

        usuarioLabel.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        usuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarioLabel.setText("usuario");

        etiBalance.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        etiBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiBalance.setText("BALANCE");

        balanceLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        balanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceLabel.setText("0");

        etiDeudas.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        etiDeudas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiDeudas.setText("DEUDAS");

        deudasLabel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        deudasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deudasLabel.setText("0");

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnTransferir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnTransferir.setForeground(new java.awt.Color(255, 255, 255));
        btnTransferir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTransferir.setText("TRANSFERIR");
        btnTransferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransferirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRecargar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnRecargar.setForeground(new java.awt.Color(255, 255, 255));
        btnRecargar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRecargar.setText("MINAR");
        btnRecargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecargarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRecargar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRecargar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aguacate/imagenes/Untitled-2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(deudasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(etiDeudas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(etiBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bg)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(etiUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(balanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(deudasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(etiDeudas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(etiBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bg)
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

    private void btnTransferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferirMouseClicked
        int monto = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el monto a transferir."));
        String usuario = JOptionPane.showInputDialog(null,"Por favor ingresese el usuario al cual va a transferir");
                    if (Principal.usuarios.stream().filter(user -> user.id.equals(usuario)
                && user.id.equals(usuario)).findAny().isPresent()){
                                System.out.println(monto);
                                System.out.println(usuario);
                    }
                        else{
                            JOptionPane.showMessageDialog(null, "Usuario no existente");
                      }
    }//GEN-LAST:event_btnTransferirMouseClicked

    private void btnRecargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecargarMouseClicked
        count++;
        if (count <= 2) {
            
        }
        
        JOptionPane.showMessageDialog(null, "Minando El Bloque...");
        Bloque genesis = new Bloque("0");
        genesis.agregarTransaccionInterfaz(genesisTransaction);
        //addBlock(genesis);
        NoobChain.agregarBloqueInterfaz(genesis);
        
//        balance += 
//        balanceLabel.setText();

        

    }//GEN-LAST:event_btnRecargarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String userLabelS = "";

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venInterna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnRecargar;
    private javax.swing.JLabel btnTransferir;
    private javax.swing.JLabel deudasLabel;
    private javax.swing.JLabel etiBalance;
    private javax.swing.JLabel etiDeudas;
    private javax.swing.JLabel etiUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}

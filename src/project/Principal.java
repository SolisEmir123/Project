/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author emiry
 */
public class Principal extends javax.swing.JFrame {

    public String email;
    int xMouse, yMouse;

    /**
     * Creates new form Home
     */
    public Principal() {
        initComponents();

    }

    public Principal(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("admin@theonedestiny.online")) {
            btnPanelAdmin.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnNewVenta = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnViewVentas = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        btnPanelAdmin = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JLabel();
        PanelScreen = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(0, 134, 190));
        jPanel6.setPreferredSize(new java.awt.Dimension(1130, 50));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));
        jPanel3.setMinimumSize(new java.awt.Dimension(50, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(75, 100));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Punto de Venta - OneDestiny");
        jPanel6.add(jLabel3, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 134, 190));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 710));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(0, 134, 190));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 75));
        jPanel5.setLayout(new java.awt.BorderLayout());

        btnNewVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNewVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnNewVenta.setText("CREAR VENTA");
        btnNewVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewVentaMouseClicked(evt);
            }
        });
        jPanel5.add(btnNewVenta, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(0, 134, 190));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel4.setLayout(new java.awt.BorderLayout());

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Cerrar Sesión");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel4.add(btnLogout, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel7.setBackground(new java.awt.Color(0, 134, 190));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(0, 134, 190));
        jPanel8.setPreferredSize(new java.awt.Dimension(250, 75));
        jPanel8.setLayout(new java.awt.BorderLayout());

        btnViewVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnViewVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        btnViewVentas.setText("EDITAR VENTAS");
        btnViewVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewVentasMouseClicked(evt);
            }
        });
        jPanel8.add(btnViewVentas, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(0, 134, 190));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(0, 134, 190));
        jPanel10.setPreferredSize(new java.awt.Dimension(250, 75));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel11.setBackground(new java.awt.Color(0, 134, 190));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(0, 134, 190));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(0, 134, 190));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(0, 134, 190));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel15.setBackground(new java.awt.Color(0, 134, 190));
        jPanel15.setLayout(new java.awt.BorderLayout());

        btnPanelAdmin.setBackground(new java.awt.Color(0, 134, 190));
        btnPanelAdmin.setPreferredSize(new java.awt.Dimension(250, 75));
        btnPanelAdmin.setLayout(new java.awt.BorderLayout());

        btnAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnAdmin.setText("MENU ADMIN");
        btnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });
        btnPanelAdmin.add(btnAdmin, java.awt.BorderLayout.CENTER);

        jPanel15.add(btnPanelAdmin, java.awt.BorderLayout.PAGE_START);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        PanelScreen.setBackground(new java.awt.Color(255, 255, 255));
        PanelScreen.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PanelScreen, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Estas seguro de salir?", "Selecciona", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres Cerrar Sesión", "Selecciona", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnNewVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewVentaMouseClicked
        PlaceOrder placeorder = new PlaceOrder(email);
        placeorder.setLocationRelativeTo(null); 
        placeorder.setVisible(true);
    }//GEN-LAST:event_btnNewVentaMouseClicked

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        AdminMenu adminmenu = new AdminMenu();
        adminmenu.setLocationRelativeTo(null); 
        adminmenu.setVisible(true);
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnViewVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewVentasMouseClicked
        ViewBillsOrder viewBillsOrder = new ViewBillsOrder();
        viewBillsOrder.setLocationRelativeTo(null); 
        viewBillsOrder.setVisible(true);
    }//GEN-LAST:event_btnViewVentasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelScreen;
    private javax.swing.JLabel btnAdmin;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnNewVenta;
    private javax.swing.JPanel btnPanelAdmin;
    private javax.swing.JLabel btnViewVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}

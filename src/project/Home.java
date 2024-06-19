/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author emiry
 */
public class Home extends javax.swing.JFrame {
    public String name;
    int xMouse, yMouse;
            
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Home(String userEmail) {
        initComponents();
        name = userEmail;
        if(!name.equals("admin1")) {
            btnCategory.setVisible(false);
            btnNewProduct.setVisible(false);
            btnEdit.setVisible(false);
            btnVerifiedU.setVisible(false);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnVerifiedU = new javax.swing.JButton();
        btnNewVenta = new javax.swing.JButton();
        btnViewVentas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setLocation(new java.awt.Point(50, 50));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(204, 0, 0));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Cerrar Sesión");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnCategory.setText("Editar Categorias");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 680, -1, -1));

        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("Nuevo Producto");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 680, -1, -1));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnEdit.setText("Ver, Editar o Eliminar Producto");
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, -1, -1));

        btnVerifiedU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifiedU.setText("Verificar Usuario");
        getContentPane().add(btnVerifiedU, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 680, -1, -1));

        btnNewVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnNewVenta.setText("Crear Venta");
        getContentPane().add(btnNewVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        btnViewVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        btnViewVentas.setText("Ver ventas");
        getContentPane().add(btnViewVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 740));

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Estas seguro de salir?","Selecciona", JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres Cerrar Sesión", "Selecciona", JOptionPane.YES_NO_OPTION);
        if(a == 0) {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new Home().setVisible(true);
           }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnNewVenta;
    private javax.swing.JButton btnVerifiedU;
    private javax.swing.JButton btnViewVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

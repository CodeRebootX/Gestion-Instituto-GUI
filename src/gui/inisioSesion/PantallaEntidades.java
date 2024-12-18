/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.inisioSesion;

import crearTablas.CrearTablas;
import factory.DbFactory;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author estudiante
 */
public class PantallaEntidades extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaEntidades() {
        initComponents();
        this.setLocationRelativeTo(null);
        setLabelImage();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonAcceder = new javax.swing.JButton();
        jButtonDiagrama = new javax.swing.JButton();
        jLabelBack = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelTitle.setFont(new java.awt.Font("Bahnschrift", 3, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitle.setText("ADMINISTRACIÓN IES ITACA");
        getContentPane().add(jLabelTitle);
        jLabelTitle.setBounds(230, 110, 340, 40);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SELECCIONA ENTIDAD:");
        jPanel1.add(jLabel1);

        jComboBox1.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "profesores", "alumnos", "asignaturas", "aulas", "cursos" }));
        jComboBox1.setBorder(null);
        jPanel1.add(jComboBox1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 230, 330, 40);

        jButtonAcceder.setBackground(new java.awt.Color(2, 132, 54));
        jButtonAcceder.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        jButtonAcceder.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAcceder.setText("ACCEDER");
        jButtonAcceder.setBorder(null);
        jButtonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcceder);
        jButtonAcceder.setBounds(260, 380, 110, 30);

        jButtonDiagrama.setBackground(new java.awt.Color(2, 132, 54));
        jButtonDiagrama.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        jButtonDiagrama.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDiagrama.setText("VER DIAGRAMA");
        jButtonDiagrama.setBorder(null);
        jButtonDiagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiagramaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDiagrama);
        jButtonDiagrama.setBounds(390, 380, 130, 30);

        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelBack);
        jLabelBack.setBounds(10, 10, 30, 30);
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(130, 10, 120, 50);

        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelExit);
        jLabelExit.setBounds(750, 520, 30, 30);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccederActionPerformed
        // TODO add your handling code here:
        
        
       
        String tabla = (String)jComboBox1.getSelectedItem();
        
        
            PantallaDatos pD;
            try {
                pD = new PantallaDatos (tabla);
                pD.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PantallaEntidades.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();       
    }//GEN-LAST:event_jButtonAccederActionPerformed

    private void jButtonDiagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiagramaActionPerformed
        Diagrama diagrama = new Diagrama();
        diagrama.setVisible(true);
        
    }//GEN-LAST:event_jButtonDiagramaActionPerformed

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        Loggin log = new Loggin ();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        dispose();
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void setLabelImage() {
        String currentDir = System.getProperty("user.dir");
        String imagePath = currentDir + "/src/img/HomeItaca.jpg";
        String imagePath2 = currentDir + "/src/img/LogoItaca.png";
        String imagePath3 = currentDir + "/src/img/cerrar-sesion.png";
        String imagePath4 = currentDir + "/src/img/flecha-izquierda.png";
        
        jPanel1.setBackground(new Color(221, 221, 221, 0));
           
        Image imag1 = Toolkit.getDefaultToolkit().createImage(imagePath);
        imag1 = imag1.getScaledInstance(jLabelFondo.getWidth(), jLabelFondo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(imag1);
        jLabelFondo.setIcon(img2);
        
        Image imag2 = Toolkit.getDefaultToolkit().createImage(imagePath2);
        imag2 = imag2.getScaledInstance(jLabelLogo.getWidth(), jLabelLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon img3 = new ImageIcon(imag2);
        jLabelLogo.setIcon(img3);
        
        Image imag3 = Toolkit.getDefaultToolkit().createImage(imagePath3);
        imag3 = imag3.getScaledInstance(jLabelExit.getWidth(), jLabelExit.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon img4 = new ImageIcon(imag3);
        jLabelExit.setIcon(img4);
        
        Image imag4 = Toolkit.getDefaultToolkit().createImage(imagePath4);
        imag4 = imag4.getScaledInstance(jLabelBack.getWidth(), jLabelBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon img5 = new ImageIcon(imag4);
        jLabelBack.setIcon(img5);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcceder;
    private javax.swing.JButton jButtonDiagrama;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

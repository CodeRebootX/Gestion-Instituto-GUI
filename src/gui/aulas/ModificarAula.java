/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.aulas;

import factory.DaoFactory;
import gui.inisioSesion.PantallaDatos;
import interfazDao.IDao;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import models.Aula;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author estudiante
 */
public class ModificarAula extends javax.swing.JFrame {

    /**
     * Creates new form ModificarAula
     */
    public ModificarAula(Aula aula) {
        initComponents();
        this.setLocationRelativeTo(null);
        setLabelImage();
        jLabelCodigo.setText(String.valueOf(aula.getCodigo()));
        jTextFieldPiso.setText(String.valueOf(aula.getPiso()));
        jTextFieldPupitres.setText(String.valueOf(aula.getNum_pupitres()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPiso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPupitres = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jLabelBack = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        jLabelTitulo.setText("DATOS AULA");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(220, 20, 86, 18);

        jPanel1.setLayout(new java.awt.GridLayout(3, 2));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        jLabel1.setText("CODIGO:");
        jPanel1.add(jLabel1);
        jPanel1.add(jLabelCodigo);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        jLabel2.setText("PISO: ");
        jPanel1.add(jLabel2);

        jTextFieldPiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPisoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPiso);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 3, 14)); // NOI18N
        jLabel3.setText("Nº PUPITRES: ");
        jPanel1.add(jLabel3);
        jPanel1.add(jTextFieldPupitres);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(65, 109, 370, 100);

        jButtonUpdate.setFont(new java.awt.Font("Bahnschrift", 3, 12)); // NOI18N
        jButtonUpdate.setText("ACTUALIZAR");
        jButtonUpdate.setBorder(null);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate);
        jButtonUpdate.setBounds(210, 310, 110, 30);

        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelBack);
        jLabelBack.setBounds(10, 10, 30, 30);
        getContentPane().add(jLabelFondo);
        jLabelFondo.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPisoActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int codigo;
        int piso;
        int pupitres;

        codigo = Integer.parseInt(jLabelCodigo.getText());
        piso = Integer.parseInt(jTextFieldPiso.getText());
        pupitres = Integer.parseInt(jTextFieldPupitres.getText());

        Aula aula = new Aula (codigo, piso, pupitres);

        try {
            IDao dao = DaoFactory.getDao(DaoFactory.DaoType.AULA);
            dao.updateRecord(aula, codigo);
            PantallaDatos pD = new PantallaDatos ("aulas");
            pD.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarAula.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        PantallaDatos pD;
        try {
            pD = new PantallaDatos("aulas");
            pD.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarAula.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void setLabelImage() {
        String currentDir = System.getProperty("user.dir");
        String imagePath = currentDir + "/src/img/fondo-form.jpg";
        String imagePath4 = currentDir + "/src/img/flecha-izquierda.png";
        
        jPanel1.setBackground(new Color(221, 221, 221, 0));
           
        Image imag1 = Toolkit.getDefaultToolkit().createImage(imagePath);
        imag1 = imag1.getScaledInstance(jLabelFondo.getWidth(), jLabelFondo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(imag1);
        jLabelFondo.setIcon(img2);
        
        Image imag4 = Toolkit.getDefaultToolkit().createImage(imagePath4);
        imag4 = imag4.getScaledInstance(jLabelBack.getWidth(), jLabelBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon img5 = new ImageIcon(imag4);
        jLabelBack.setIcon(img5);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldPiso;
    private javax.swing.JTextField jTextFieldPupitres;
    // End of variables declaration//GEN-END:variables
}

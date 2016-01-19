/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okno;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import kniznica.*;

/**
 *
 * @author Matúš
 */
public class FilmInfoForm extends javax.swing.JDialog {

    Film film = new Film();
    private List<Herec> herci = new ArrayList<>();
    private List<Stat> staty = new ArrayList<>();
    private List<Zaner> zanre = new ArrayList<>();
    private List<Reziser> reziser = new ArrayList<>();
    private List<Scenarista> scenarista = new ArrayList<>();
    private FilmDao FilmDao = FilmDaoFactory.INSTANCE.getFilmDao();
    private HerecDao HerecDao = HerecDaoFactory.INSTANCE.getHerecDao();
    private StatDao StatDao = StatDaoFactory.INSTANCE.getStatDao();
    private ZanerDao ZanerDao = ZanerDaoFactory.INSTANCE.getZanerDao();
    private ReziserDao ReziserDao = ReziserDaoFactory.INSTANCE.getReziserDao();
    private ScenaristaDao ScenaristaDao = ScenaristaDaoFactory.INSTANCE.getScenaristaDao();

    /**
     * Creates new form FilmInfoForm
     */
    public FilmInfoForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    FilmInfoForm(Frame parent, boolean modal, Film film) throws IOException {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.white);
        jPanel1.setBackground(Color.white);
        setLocationRelativeTo(null);

        this.film = film;

        NazovFilmu.setText(film.getNazov());
        NazovFilmu.setForeground(Color.red);

        HodnotenieLabel.setText(Integer.toString(film.getHodnotenie()) + "%");

        herci = HerecDao.dajVsetkychZID(Integer.toString(film.getId()));
        HerciList.setListData(herci.toArray());

        staty = StatDao.dajVsetkychZID(Integer.toString(film.getId()));
        StatyList.setListData(staty.toArray());

        zanre = ZanerDao.dajVsetkychZID(Integer.toString(film.getId()));
        ZanreList.setListData(zanre.toArray());

        reziser = ReziserDao.dajVsetkychZID(Integer.toString(film.getId()));
        ReziserList.setListData(reziser.toArray());

        scenarista = ScenaristaDao.dajVsetkychZID(Integer.toString(film.getId()));
        ScenaristaList.setListData(scenarista.toArray());

        String recenzia = film.getRecenzia().toString();
        RecenziaTextField.setText(recenzia);
        RecenziaTextField.setEditable(false);

        String trailer = film.getTrailer().toString();
        TrailerTextField.setText(trailer);
        TrailerTextField.setEditable(false);

        DlzkaTextField.setText(Integer.toString(film.getDlzka()));
        DlzkaTextField.setEditable(false);
        obsahTextArea.setLineWrap(true);
        obsahTextArea.setWrapStyleWord(true);
        obsahTextArea.setText(film.getObsah());
        obsahTextArea.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        NazovFilmu = new javax.swing.JLabel();
        HerciLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HerciList = new javax.swing.JList();
        HodnotenieLabel = new javax.swing.JLabel();
        ZanreLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ZanreList = new javax.swing.JList();
        StatLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        StatyList = new javax.swing.JList();
        ReziserLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DlzkaTextField = new javax.swing.JTextField();
        ObsahLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        obsahTextArea = new javax.swing.JTextArea();
        RecenziaTextField = new javax.swing.JTextField();
        TrailerTextField = new javax.swing.JTextField();
        ZatvorButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ReziserList = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        ScenaristaList = new javax.swing.JList();
        RecenziaButton = new javax.swing.JButton();
        TrailerButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        NazovFilmu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NazovFilmu.setText("jLabel1");

        HerciLabel.setText("Herci");

        HerciList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        HerciList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HerciListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(HerciList);

        HodnotenieLabel.setText("jLabel1");

        ZanreLabel.setText("Zanre");

        ZanreList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ZanreList);

        StatLabel.setText("Staty");

        StatyList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(StatyList);

        ReziserLabel.setText("Reziser");

        jLabel1.setText("Scenarista");

        jLabel2.setText("Dlzka");

        DlzkaTextField.setText("jTextField1");

        ObsahLabel.setText("Obsah");

        obsahTextArea.setColumns(20);
        obsahTextArea.setRows(5);
        jScrollPane5.setViewportView(obsahTextArea);

        RecenziaTextField.setText("jTextField1");

        TrailerTextField.setText("jTextField1");

        ZatvorButton.setText("Zatvor");
        ZatvorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZatvorButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Hodnotenie:");

        ReziserList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ReziserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReziserListMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(ReziserList);

        ScenaristaList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ScenaristaList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScenaristaListMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(ScenaristaList);

        RecenziaButton.setText("Recenzia");
        RecenziaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecenziaButtonActionPerformed(evt);
            }
        });

        TrailerButton.setText("Trailer");
        TrailerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrailerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HerciLabel)
                                    .addComponent(ZanreLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReziserLabel))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jScrollPane4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(ObsahLabel)
                            .addComponent(RecenziaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TrailerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TrailerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ZatvorButton)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DlzkaTextField)
                                        .addGap(162, 162, 162))
                                    .addComponent(RecenziaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HodnotenieLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(NazovFilmu)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(NazovFilmu)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(HodnotenieLabel))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HerciLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ZanreLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatLabel)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReziserLabel)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(DlzkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ObsahLabel)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RecenziaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RecenziaButton))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TrailerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TrailerButton))
                        .addGap(42, 42, 42)
                        .addComponent(ZatvorButton))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ZatvorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZatvorButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ZatvorButtonActionPerformed

    private void HerciListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HerciListMouseClicked
        Herec herec = (Herec) HerciList.getSelectedValue();
        URL url = herec.getWiki();
        if (evt.getClickCount() == 2) {
            try {
                openWebpage(url.toURI());
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_HerciListMouseClicked

    private void ReziserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReziserListMouseClicked
        Reziser reziser = (Reziser) ReziserList.getSelectedValue();
        URL url = reziser.getWiki();
        if (evt.getClickCount() == 2) {
            try {
                openWebpage(url.toURI());
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ReziserListMouseClicked

    private void ScenaristaListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScenaristaListMouseClicked
        Scenarista scenarista = (Scenarista) ScenaristaList.getSelectedValue();
        URL url = scenarista.getWiki();
        if (evt.getClickCount() == 2) {
            try {
                openWebpage(url.toURI());
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ScenaristaListMouseClicked

    private void RecenziaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecenziaButtonActionPerformed
        try {
            URL url = new URL(RecenziaTextField.getText());
            openWebpage(url.toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(FilmInfoForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(FilmInfoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RecenziaButtonActionPerformed

    private void TrailerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrailerButtonActionPerformed
        URL url;
        try {
            url = new URL(TrailerTextField.getText());
            openWebpage(url.toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(FilmInfoForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(FilmInfoForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_TrailerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FilmInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FilmInfoForm dialog = new FilmInfoForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DlzkaTextField;
    private javax.swing.JLabel HerciLabel;
    private javax.swing.JList HerciList;
    private javax.swing.JLabel HodnotenieLabel;
    private javax.swing.JLabel NazovFilmu;
    private javax.swing.JLabel ObsahLabel;
    private javax.swing.JButton RecenziaButton;
    private javax.swing.JTextField RecenziaTextField;
    private javax.swing.JLabel ReziserLabel;
    private javax.swing.JList ReziserList;
    private javax.swing.JList ScenaristaList;
    private javax.swing.JLabel StatLabel;
    private javax.swing.JList StatyList;
    private javax.swing.JButton TrailerButton;
    private javax.swing.JTextField TrailerTextField;
    private javax.swing.JLabel ZanreLabel;
    private javax.swing.JList ZanreList;
    private javax.swing.JButton ZatvorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea obsahTextArea;
    // End of variables declaration//GEN-END:variables

    public static void openWebpage(URI uri) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

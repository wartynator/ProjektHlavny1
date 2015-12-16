/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okno;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import kniznica.*;


/**
 *
 * @author Rastislav
 */
public class menuOkno extends javax.swing.JFrame {
    private FilmDao FilmDao = FilmDaoFactory.INSTANCE.getFilmDao();
    private ZanerDao ZanreDao = ZanerDaoFactory.INSTANCE.getZanerDao();
   
    /**
     * Creates new form menuOkno
     */
    public menuOkno(java.awt.Frame parent, boolean modal) {
        
        initComponents();
        refreshFilmy();
        refreshZanre();
        
        
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
        TOP10List = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        Najnovsich10List = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        FilmyList = new javax.swing.JList();
        pridajFilmButton = new javax.swing.JButton();
        HladajButton = new javax.swing.JButton();
        ZanreComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setPreferredSize(new java.awt.Dimension(690, 430));
        getContentPane().setLayout(null);

        TOP10List.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        TOP10List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TOP10ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TOP10List);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(385, 36, 137, 340);

        Najnovsich10List.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Najnovsich10List);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(540, 36, 125, 340);

        jLabel1.setText("TOP 10");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(385, 16, 35, 14);

        jLabel2.setText("Najnovsich 10");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 16, 67, 14);

        FilmyList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        FilmyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilmyListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(FilmyList);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(210, 36, 157, 340);

        pridajFilmButton.setText("pridaj film");
        pridajFilmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridajFilmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pridajFilmButton);
        pridajFilmButton.setBounds(10, 36, 130, 23);

        HladajButton.setText("Hladaj");
        HladajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HladajButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HladajButton);
        HladajButton.setBounds(10, 90, 80, 23);

        getContentPane().add(ZanreComboBox);
        ZanreComboBox.setBounds(100, 90, 69, 20);

        jLabel4.setText("Filmy:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 10, 28, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matúš\\Documents\\NetBeansProjects\\projektHlavny\\ft.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 660, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FilmyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilmyListMouseClicked
        if(evt.getClickCount() == 2){
        Film film = (Film) FilmyList.getSelectedValue();
        FilmInfoForm filmInfo = null;
            try {
                filmInfo = new FilmInfoForm(this,true,film);
            } catch (IOException ex) {
                Logger.getLogger(menuOkno.class.getName()).log(Level.SEVERE, null, ex);
            }
        filmInfo.setVisible(true);
        }
    }//GEN-LAST:event_FilmyListMouseClicked

    private void pridajFilmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridajFilmButtonActionPerformed
      PridatFilmFormCisto pridaj = new PridatFilmFormCisto(this, true);
      pridaj.setVisible(true);
      refreshFilmy();
    }//GEN-LAST:event_pridajFilmButtonActionPerformed

    private void HladajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HladajButtonActionPerformed
        if(ZanreComboBox.getSelectedItem() == "all"){refreshFilmy();}
        Zaner zaner = (Zaner) ZanreComboBox.getSelectedItem();
        String zanerStr= zaner.toString();
        List<Film> filmyZanre = FilmDao.dajFilmyZanre(zanerStr);
        FilmyList.setListData(filmyZanre.toArray());
        
        
    }//GEN-LAST:event_HladajButtonActionPerformed

    private void TOP10ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TOP10ListMouseClicked
       if(evt.getClickCount() == 2){
        Film film = (Film) TOP10List.getSelectedValue();
        FilmInfoForm filmInfo = null;
           try {
               filmInfo = new FilmInfoForm(this,true,film);
           } catch (IOException ex) {
               Logger.getLogger(menuOkno.class.getName()).log(Level.SEVERE, null, ex);
           }
        filmInfo.setVisible(true);
    }//GEN-LAST:event_TOP10ListMouseClicked
    }
    
       
    
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
            java.util.logging.Logger.getLogger(menuOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menuOkno dialog = new menuOkno(new javax.swing.JFrame(), true);
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
    private javax.swing.JList FilmyList;
    private javax.swing.JButton HladajButton;
    private javax.swing.JList Najnovsich10List;
    private javax.swing.JList TOP10List;
    private javax.swing.JComboBox ZanreComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton pridajFilmButton;
    // End of variables declaration//GEN-END:variables

    private void refreshFilmy() {
        List<Film> filmy = FilmDao.dajVsetkych();
        FilmyList.setListData(filmy.toArray());
        List<Film> top10= FilmDao.dajTop10();
        TOP10List.setListData(top10.toArray());
        List<Film> najnov10 = FilmDao.dajNajnov10();
        Najnovsich10List.setListData(najnov10.toArray());
    }

    private void refreshZanre() {
        List<Zaner> zanre = ZanreDao.dajVsetkych();
        Set<Zaner> zanreSet= new HashSet<Zaner>();
        for (Zaner zaner : zanre) {
            ZanreComboBox.addItem(zaner);
        }
        String all = "all";
        ZanreComboBox.addItem(all);
        
        
    }
    

   

    
    
    
    
    
    
}

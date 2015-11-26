/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okno;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kniznica.Film;
import kniznica.Herec;
import kniznica.SQLFilm;
import kniznica.SQLHerec;
import kniznica.SQLStat;
import kniznica.SQLZaner;
import kniznica.Stat;
import kniznica.Zaner;

/**
 *
 * @author Matúš
 */
public class PridatFilmForm extends javax.swing.JFrame {

    private Film film;
    private Set<Herec>herci= new HashSet<>();
   private Set<Stat> staty = new HashSet<>();
  private  Set<Zaner> zanre = new HashSet<>();
    //private FilmDao filmDao = FilmDaoFactory.instance.GetFilmDao();
    

    /**
     * Creates new form PridatFilmForm
     */
    public PridatFilmForm(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        initComponents();
    }
    
    PridatFilmForm(Frame parent, boolean modal, Film film) {
      //  super(parent, modal);
        initComponents();
        refreshHerci();
        refreshZanre();
        setLocationRelativeTo(null);
        
        this.film = film;        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDTextField = new javax.swing.JTextField();
        HodnotenieTextField = new javax.swing.JTextField();
        NazovTextField = new javax.swing.JTextField();
        IDLabel = new javax.swing.JLabel();
        HodnotenieLabel = new javax.swing.JLabel();
        NazovLabel = new javax.swing.JLabel();
        HerciLabel = new javax.swing.JLabel();
        ZanerLabel = new javax.swing.JLabel();
        DlzkaLabel = new javax.swing.JLabel();
        DlzkaTextField = new javax.swing.JTextField();
        PremieraLabel = new javax.swing.JLabel();
        rokTextField = new javax.swing.JTextField();
        StatLabel = new javax.swing.JLabel();
        ObsahLabel = new javax.swing.JLabel();
        TrailerLabel = new javax.swing.JLabel();
        TrailerTextField = new javax.swing.JTextField();
        RecenziaLabel = new javax.swing.JLabel();
        RecenziaTextField = new javax.swing.JTextField();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ObsahTextArea = new javax.swing.JTextArea();
        mesiac = new javax.swing.JTextField();
        den = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menoHercaTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hercovZivotopiTextField1 = new javax.swing.JTextField();
        pridajHercaButton1 = new javax.swing.JButton();
        zmazHercaButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        zoznamHercovList1 = new javax.swing.JList();
        zanerTextField1 = new javax.swing.JTextField();
        pridajButton2 = new javax.swing.JButton();
        zmazZanerButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        zoznamZanreList = new javax.swing.JList();
        pridajStatTextField1 = new javax.swing.JTextField();
        pridajStatButton2 = new javax.swing.JButton();
        zmazStatButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        zoznamStatList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextFieldActionPerformed(evt);
            }
        });
        IDTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDTextFieldKeyTyped(evt);
            }
        });

        HodnotenieTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HodnotenieTextFieldKeyTyped(evt);
            }
        });

        IDLabel.setText("ID filmu");

        HodnotenieLabel.setText("Hodnotenie");

        NazovLabel.setText("Nazov");

        HerciLabel.setText("Meno herca");

        ZanerLabel.setText("Zaner");

        DlzkaLabel.setText("Dlzka");

        PremieraLabel.setText("Premiera");

        rokTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rokTextFieldActionPerformed(evt);
            }
        });

        StatLabel.setText("Stat");

        ObsahLabel.setText("Obsah");

        TrailerLabel.setText("Trailer");

        TrailerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrailerTextFieldActionPerformed(evt);
            }
        });

        RecenziaLabel.setText("Recenzia");

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ObsahTextArea.setColumns(20);
        ObsahTextArea.setRows(5);
        jScrollPane1.setViewportView(ObsahTextArea);

        jLabel1.setText("yyyy");

        jLabel2.setText("mm");

        jLabel3.setText("dd");

        menoHercaTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menoHercaTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Hercov zivotopis");

        pridajHercaButton1.setText("pridaj herca");
        pridajHercaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridajHercaButton1ActionPerformed(evt);
            }
        });

        zmazHercaButton.setText("zmaz herca");
        zmazHercaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazHercaButtonActionPerformed(evt);
            }
        });

        zoznamHercovList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(zoznamHercovList1);

        pridajButton2.setText("pridaj zaner");
        pridajButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridajButton2ActionPerformed(evt);
            }
        });

        zmazZanerButton.setText("zmaz zaner");
        zmazZanerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazZanerButtonActionPerformed(evt);
            }
        });

        zoznamZanreList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(zoznamZanreList);

        pridajStatButton2.setText("pridaj stat");
        pridajStatButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridajStatButton2ActionPerformed(evt);
            }
        });

        zmazStatButton4.setText("zmaz stat");
        zmazStatButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmazStatButton4ActionPerformed(evt);
            }
        });

        zoznamStatList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(zoznamStatList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HerciLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(menoHercaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hercovZivotopiTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pridajHercaButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(zmazHercaButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(HodnotenieLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HodnotenieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NazovLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NazovTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ZanerLabel)
                                .addGap(18, 18, 18)
                                .addComponent(zanerTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(pridajButton2)
                                .addGap(18, 18, 18)
                                .addComponent(zmazZanerButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(OKButton)
                                .addGap(18, 18, 18)
                                .addComponent(CancelButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RecenziaLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RecenziaTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TrailerLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TrailerTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(DlzkaLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DlzkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ObsahLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(StatLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pridajStatTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(pridajStatButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(zmazStatButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PremieraLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rokTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(mesiac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(den, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HodnotenieLabel)
                    .addComponent(HodnotenieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NazovLabel)
                    .addComponent(NazovTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HerciLabel)
                    .addComponent(menoHercaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(hercovZivotopiTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pridajHercaButton1)
                    .addComponent(zmazHercaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ZanerLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zanerTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pridajButton2)
                        .addComponent(zmazZanerButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatLabel)
                    .addComponent(pridajStatTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pridajStatButton2)
                    .addComponent(zmazStatButton4)
                    .addComponent(PremieraLabel)
                    .addComponent(rokTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesiac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(den, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DlzkaLabel)
                        .addComponent(DlzkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ObsahLabel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TrailerLabel)
                    .addComponent(TrailerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecenziaLabel)
                    .addComponent(RecenziaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(CancelButton))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Film film = new Film();
        int id;
        String kont1 = IDTextField.getText();
        if (kont1.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste id!");
            return;
        } else {
            id = Integer.parseInt(IDTextField.getText());
        }
        film.setId(id);
        
        int hodnotenie;
        String kont2 = HodnotenieTextField.getText();
        if (kont2.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste hodnotenie!");
            return;
        } else {
            hodnotenie = Integer.parseInt(HodnotenieTextField.getText());
        }        
        film.setHodtenie(hodnotenie);
        
        String nazov = NazovTextField.getText();
        if (nazov.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste nazov!");
            return;
        }        
        film.setNazov(nazov);
        
        
        int dlzka;
        String kont3 = DlzkaTextField.getText();
        if (kont3.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste dlzku filmu!");
            return;
        } else {
            dlzka = Integer.parseInt(DlzkaTextField.getText());
        }        
        
        
        
        Date datum = null;
        try {
            datum = sdf.parse(rokTextField.getText()+"-"+mesiac.getText()+"-"+den.getText());
        } catch (ParseException ex) {
            Logger.getLogger(PridatFilmForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (datum == null) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste premieru!");
            return;
        }        
        film.setPremiera(datum);
        
        String obsah = ObsahTextArea.getText();
        if (obsah.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste obsah!");
            return;
        }        
        
        film.setObsah(obsah);
        URL trailer = null;
        try {
            trailer = new URL(TrailerTextField.getText());
        } catch (MalformedURLException ex) {
            Logger.getLogger(PridatFilmForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (trailer == null) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste trailer!");
            return;
        }        
        film.setTrailer(trailer);        
        
        URL recenzia = null;
        try {
            recenzia = new URL(RecenziaTextField.getText());
        } catch (MalformedURLException ex) {
            Logger.getLogger(PridatFilmForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (recenzia == null) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste recenziu!");
            return;
        }        
        film.setRecenzie(recenzia);
        
        SQLFilm sqlfilm = new SQLFilm();
        sqlfilm.pridat(film);
        SQLStat sqlstat = new SQLStat();
        SQLHerec sqlherec = new SQLHerec();
        SQLZaner sqlzaner = new SQLZaner();
        for (Herec herci1 : herci) {
            sqlherec.pridat(herci1);
        }
        for (Stat staty1 : staty) {
            sqlstat.pridat(staty1);
        }
        for (Zaner zanre1 : zanre) {
            sqlzaner.pridat(zanre1);
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTextFieldActionPerformed

    private void rokTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rokTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rokTextFieldActionPerformed

    private void menoHercaTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menoHercaTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menoHercaTextField1ActionPerformed

    private void pridajHercaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridajHercaButton1ActionPerformed
Herec herec = new Herec();
String kont1 = IDTextField.getText();
        if (kont1.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste id filmu!");
            return;}
String meno = menoHercaTextField1.getText();
        if (meno.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste meno herca!");
            return;
        } 
herec.setMeno(meno);
URL wiki = null;
        try {
            wiki = new URL(hercovZivotopiTextField1.getText());
        } catch (MalformedURLException ex) {
            Logger.getLogger(PridatFilmForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (wiki == null) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste zivotopis!");
            return;
        }        
        herec.setWiki(wiki);
        herec.setId(Integer.parseInt(IDTextField.getText()));
        herci.add(herec);
        
    }//GEN-LAST:event_pridajHercaButton1ActionPerformed

    private void TrailerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrailerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrailerTextFieldActionPerformed

    private void pridajButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridajButton2ActionPerformed
        Zaner zaner = new Zaner();
        String kont1 = IDTextField.getText();
        if (kont1.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste id filmu!");
            return;}
        String menoZanra = zanerTextField1.getText();
        if (menoZanra.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste zaner!");
            return;
        } 
        zaner.setId(Integer.parseInt(IDTextField.getText()));
        zaner.setMeno(menoZanra);
        zanre.add(zaner);
    }//GEN-LAST:event_pridajButton2ActionPerformed

    private void pridajStatButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridajStatButton2ActionPerformed
      Stat stat = new Stat();
      String kont1 = IDTextField.getText();
        if (kont1.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste id filmu!");
            return;}
      String menoStatu = zanerTextField1.getText();
        if (menoStatu.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nevyplnili ste stat!");
            return;
        } 
        
        stat.setId(Integer.parseInt(IDTextField.getText()));
        stat.setNazov(menoStatu);
        staty.add(stat);
    }//GEN-LAST:event_pridajStatButton2ActionPerformed

    private void zmazZanerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazZanerButtonActionPerformed
        Zaner zaner = (Zaner) zoznamZanreList.getSelectedValue();
        zanre.remove(zaner);
        refreshZanre();
        
        
    }//GEN-LAST:event_zmazZanerButtonActionPerformed

    private void zmazHercaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazHercaButtonActionPerformed
        Herec herec = (Herec) zoznamHercovList1.getSelectedValue();
        herci.remove(herec);
        refreshHerci();
    }//GEN-LAST:event_zmazHercaButtonActionPerformed

    private void IDTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDTextFieldKeyTyped
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
        evt.consume();
        }
    }//GEN-LAST:event_IDTextFieldKeyTyped

    private void HodnotenieTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HodnotenieTextFieldKeyTyped
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
        evt.consume();
        }
    }//GEN-LAST:event_HodnotenieTextFieldKeyTyped

    private void zmazStatButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmazStatButton4ActionPerformed
        Stat stat = (Stat) zoznamStatList.getSelectedValue();
        staty.remove(stat);
        refreshStaty();
        
    }//GEN-LAST:event_zmazStatButton4ActionPerformed
    
    private void refreshHerci(){
       List<String> herci= new ArrayList<>();
       for (Herec herec : this.herci) {
            herci.add(this.herci.toString());
        }
        zoznamHercovList1.setListData(herci.toArray());
        herci=null;
    }
    private void refreshZanre(){
        List<String> zanre= new ArrayList<>();
       for (Zaner zaner : this.zanre) {
            zanre.add(this.zanre.toString());
           
        }
    zoznamZanreList.setListData(zanre.toArray());
    zanre=null;
    }
    private void refreshStaty(){
        List<String> staty = new ArrayList<>();
         for (Stat stat : this.staty) {
            staty.add(this.staty.toString());
        }
    zoznamStatList.setListData(staty.toArray());
    staty=null;
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
            java.util.logging.Logger.getLogger(PridatFilmForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatFilmForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatFilmForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatFilmForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatFilmForm dialog = new PridatFilmForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel DlzkaLabel;
    private javax.swing.JTextField DlzkaTextField;
    private javax.swing.JLabel HerciLabel;
    private javax.swing.JLabel HodnotenieLabel;
    private javax.swing.JTextField HodnotenieTextField;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JLabel NazovLabel;
    private javax.swing.JTextField NazovTextField;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel ObsahLabel;
    private javax.swing.JTextArea ObsahTextArea;
    private javax.swing.JLabel PremieraLabel;
    private javax.swing.JLabel RecenziaLabel;
    private javax.swing.JTextField RecenziaTextField;
    private javax.swing.JLabel StatLabel;
    private javax.swing.JLabel TrailerLabel;
    private javax.swing.JTextField TrailerTextField;
    private javax.swing.JLabel ZanerLabel;
    private javax.swing.JTextField den;
    private javax.swing.JTextField hercovZivotopiTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField menoHercaTextField1;
    private javax.swing.JTextField mesiac;
    private javax.swing.JButton pridajButton2;
    private javax.swing.JButton pridajHercaButton1;
    private javax.swing.JButton pridajStatButton2;
    private javax.swing.JTextField pridajStatTextField1;
    private javax.swing.JTextField rokTextField;
    private javax.swing.JTextField zanerTextField1;
    private javax.swing.JButton zmazHercaButton;
    private javax.swing.JButton zmazStatButton4;
    private javax.swing.JButton zmazZanerButton;
    private javax.swing.JList zoznamHercovList1;
    private javax.swing.JList zoznamStatList;
    private javax.swing.JList zoznamZanreList;
    // End of variables declaration//GEN-END:variables
}

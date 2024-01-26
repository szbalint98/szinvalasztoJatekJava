package kodtoro;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JButton;
import sun.security.util.Length;

public class Szinek_gui extends javax.swing.JFrame {

    ArrayList<JButton> gombLista = new ArrayList<>();
    ArrayList<Color> randomszinlista = new ArrayList<>();
    Set<Integer>veletlenszamlista= new HashSet<Integer>();
    ArrayList<Integer> szamaim = new ArrayList<>();
    
    

    public Szinek_gui() {
        initComponents();
        alaphelyzet();
        

    }

    private void alapszinek() {
        kek.setBackground(Color.BLUE);
        piros.setBackground(Color.RED);
        sarga.setBackground(Color.YELLOW);
        zold.setBackground(Color.GREEN);
        narancs.setBackground(Color.ORANGE);
        rozsaszin.setBackground(Color.PINK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton43 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Ujjatek = new javax.swing.JButton();
        valasztott3 = new javax.swing.JButton();
        valasztott4 = new javax.swing.JButton();
        valasztott1 = new javax.swing.JButton();
        valasztott2 = new javax.swing.JButton();
        nyolcadik1 = new javax.swing.JButton();
        nyolcadik2 = new javax.swing.JButton();
        nyolcadik3 = new javax.swing.JButton();
        nyolcadik4 = new javax.swing.JButton();
        hetedik1 = new javax.swing.JButton();
        hetedik2 = new javax.swing.JButton();
        hetedik3 = new javax.swing.JButton();
        hetedik4 = new javax.swing.JButton();
        hatodik1 = new javax.swing.JButton();
        hatodik2 = new javax.swing.JButton();
        hatodik3 = new javax.swing.JButton();
        hatodik4 = new javax.swing.JButton();
        otodik1 = new javax.swing.JButton();
        otodik2 = new javax.swing.JButton();
        otodik3 = new javax.swing.JButton();
        otodik4 = new javax.swing.JButton();
        negyedik1 = new javax.swing.JButton();
        negyedik2 = new javax.swing.JButton();
        negyedik3 = new javax.swing.JButton();
        negyedik4 = new javax.swing.JButton();
        harmadik1 = new javax.swing.JButton();
        harmadik2 = new javax.swing.JButton();
        harmadik3 = new javax.swing.JButton();
        harmadik4 = new javax.swing.JButton();
        kilencedik1 = new javax.swing.JButton();
        kilencedik2 = new javax.swing.JButton();
        kilencedik3 = new javax.swing.JButton();
        kilencedik4 = new javax.swing.JButton();
        masodik1 = new javax.swing.JButton();
        masodik2 = new javax.swing.JButton();
        masodik3 = new javax.swing.JButton();
        masodik4 = new javax.swing.JButton();
        elso1 = new javax.swing.JButton();
        elso2 = new javax.swing.JButton();
        elso3 = new javax.swing.JButton();
        elso4 = new javax.swing.JButton();
        zold = new javax.swing.JButton();
        piros = new javax.swing.JButton();
        narancs = new javax.swing.JButton();
        rozsaszin = new javax.swing.JButton();
        sarga = new javax.swing.JButton();
        kek = new javax.swing.JButton();
        mentes = new javax.swing.JButton();
        gepszin1 = new javax.swing.JButton();
        gepszin2 = new javax.swing.JButton();
        gepszin3 = new javax.swing.JButton();
        gepszin4 = new javax.swing.JButton();
        talal8 = new javax.swing.JButton();
        talal7 = new javax.swing.JButton();
        talal6 = new javax.swing.JButton();
        talal5 = new javax.swing.JButton();
        talal1 = new javax.swing.JButton();
        talal2 = new javax.swing.JButton();
        talal4 = new javax.swing.JButton();
        talal3 = new javax.swing.JButton();
        talal9 = new javax.swing.JButton();
        talal10 = new javax.swing.JButton();
        talal11 = new javax.swing.JButton();
        talal12 = new javax.swing.JButton();
        talal13 = new javax.swing.JButton();
        talal14 = new javax.swing.JButton();
        talal15 = new javax.swing.JButton();
        talal16 = new javax.swing.JButton();
        talal17 = new javax.swing.JButton();
        talal18 = new javax.swing.JButton();
        talal19 = new javax.swing.JButton();
        talal20 = new javax.swing.JButton();
        talal21 = new javax.swing.JButton();
        talal22 = new javax.swing.JButton();
        talal23 = new javax.swing.JButton();
        talal24 = new javax.swing.JButton();
        talal25 = new javax.swing.JButton();
        talal26 = new javax.swing.JButton();
        talal27 = new javax.swing.JButton();
        talal28 = new javax.swing.JButton();
        talal29 = new javax.swing.JButton();
        talal30 = new javax.swing.JButton();
        talal31 = new javax.swing.JButton();
        talal32 = new javax.swing.JButton();
        talal33 = new javax.swing.JButton();
        talal34 = new javax.swing.JButton();
        talal35 = new javax.swing.JButton();
        talal36 = new javax.swing.JButton();
        tisztito = new javax.swing.JButton();

        jButton43.setBackground(new java.awt.Color(204, 102, 0));

        jButton41.setBackground(new java.awt.Color(255, 255, 51));

        jButton40.setBackground(new java.awt.Color(0, 0, 255));

        jButton42.setBackground(new java.awt.Color(0, 204, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kódtörő");

        Ujjatek.setText("Új Játék");
        Ujjatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UjjatekActionPerformed(evt);
            }
        });

        valasztott3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valasztott3ActionPerformed(evt);
            }
        });

        valasztott4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valasztott4ActionPerformed(evt);
            }
        });

        valasztott1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valasztott1ActionPerformed(evt);
            }
        });

        valasztott2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valasztott2ActionPerformed(evt);
            }
        });

        zold.setBackground(new java.awt.Color(51, 255, 0));
        zold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szinekEvt(evt);
            }
        });

        piros.setBackground(new java.awt.Color(255, 51, 51));
        piros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szinekEvt(evt);
            }
        });

        narancs.setBackground(java.awt.Color.orange);
        narancs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szinekEvt(evt);
            }
        });

        rozsaszin.setBackground(new java.awt.Color(255, 51, 255));
        rozsaszin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szinekEvt(evt);
            }
        });

        sarga.setBackground(new java.awt.Color(255, 255, 51));
        sarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szinekEvt(evt);
            }
        });

        kek.setBackground(new java.awt.Color(0, 0, 255));
        kek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szinekEvt(evt);
            }
        });

        mentes.setText("Mentés");
        mentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentesActionPerformed(evt);
            }
        });

        tisztito.setText("tisztít");
        tisztito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tisztitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valasztott1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(valasztott2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valasztott3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valasztott4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(talal8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(talal6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(talal5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(talal7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(elso4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(elso3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(elso2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(elso1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(masodik4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(masodik3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(masodik2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(masodik1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(harmadik4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(harmadik3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(harmadik2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(harmadik1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(negyedik4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(negyedik3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(negyedik2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(negyedik1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(otodik4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(otodik3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(otodik2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(otodik1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(hatodik4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(hatodik3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(10, 10, 10)
                                                            .addComponent(hatodik2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(hatodik1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(hetedik4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(hetedik3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(10, 10, 10)
                                                            .addComponent(hetedik2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(hetedik1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(nyolcadik4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nyolcadik3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(nyolcadik2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nyolcadik1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(kilencedik4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kilencedik3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(kilencedik2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kilencedik1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zold, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(piros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(narancs, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(rozsaszin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kek, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sarga, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tisztito, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ujjatek, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(gepszin1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(gepszin2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(gepszin4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(gepszin3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(mentes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valasztott2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valasztott1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valasztott3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valasztott4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Ujjatek)
                        .addComponent(tisztito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(mentes)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gepszin3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gepszin4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gepszin2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gepszin1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sarga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kek, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zold, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rozsaszin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(narancs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(piros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kilencedik3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kilencedik4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kilencedik1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kilencedik2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(talal35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(talal36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(talal34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(talal33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nyolcadik3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nyolcadik4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nyolcadik1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nyolcadik2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hetedik3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hetedik4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hetedik1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hetedik2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(hatodik3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(hatodik4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(hatodik1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(hatodik2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(otodik3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(otodik4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(otodik1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(otodik2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(negyedik3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(negyedik4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(negyedik1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(negyedik2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(harmadik3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(harmadik4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(harmadik1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(harmadik2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(masodik3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(masodik4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(masodik1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(masodik2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(elso3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(elso4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(elso1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(elso2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(talal8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(talal7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(talal6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(talal5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(talal4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(talal3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(talal2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(talal1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(3, 3, 3))))
                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(talal11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(talal12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(talal10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(talal9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(talal15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(talal16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(talal14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(talal13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(talal19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(talal20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(talal18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(talal17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(talal23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(talal24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(talal22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(talal21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(talal26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(talal25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(talal31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(talal32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(talal30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(talal29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UjjatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UjjatekActionPerformed
        alaphelyzet();
        szinbeallit();
    }//GEN-LAST:event_UjjatekActionPerformed

    private void valasztott1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valasztott1ActionPerformed
        if (valasztott1.getBackground() != Color.WHITE) {
            valasztott1.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_valasztott1ActionPerformed

    private void valasztott2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valasztott2ActionPerformed
        if (valasztott2.getBackground() != Color.WHITE) {
            valasztott2.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_valasztott2ActionPerformed

    private void valasztott3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valasztott3ActionPerformed
        if (valasztott3.getBackground() != Color.WHITE) {
            valasztott3.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_valasztott3ActionPerformed

    private void valasztott4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valasztott4ActionPerformed
        if (valasztott4.getBackground() != Color.WHITE) {
            valasztott4.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_valasztott4ActionPerformed

    private void szinekEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szinekEvt
        JButton gmb = (JButton) evt.getSource();
        
        if (gmb.getBackground() == Color.RED) {

            if (valasztott1.getBackground() == Color.WHITE && valasztott2.getBackground()!=Color.RED && valasztott3.getBackground()!=Color.RED && valasztott4.getBackground()!=Color.RED) {
                valasztott1.setBackground(Color.RED);
            } else if (valasztott2.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.RED && valasztott3.getBackground()!=Color.RED && valasztott4.getBackground()!=Color.RED){
                valasztott2.setBackground(Color.RED);
            } else if (valasztott3.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.RED && valasztott2.getBackground()!=Color.RED && valasztott4.getBackground()!=Color.RED) {
                valasztott3.setBackground(Color.RED);
            } else if (valasztott4.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.RED && valasztott2.getBackground()!=Color.RED && valasztott3.getBackground()!=Color.RED) {
                valasztott4.setBackground(Color.RED);
            }
        } else if (gmb.getBackground() == Color.GREEN) {

            if (valasztott1.getBackground() == Color.WHITE && valasztott2.getBackground()!=Color.GREEN && valasztott3.getBackground()!=Color.GREEN && valasztott4.getBackground()!=Color.GREEN) {
                valasztott1.setBackground(Color.GREEN);
            } else if (valasztott2.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.GREEN && valasztott3.getBackground()!=Color.GREEN && valasztott4.getBackground()!=Color.GREEN){
                valasztott2.setBackground(Color.GREEN);
            } else if (valasztott3.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.GREEN && valasztott2.getBackground()!=Color.GREEN && valasztott4.getBackground()!=Color.GREEN) {
                valasztott3.setBackground(Color.GREEN);
            } else if (valasztott4.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.GREEN && valasztott2.getBackground()!=Color.GREEN && valasztott3.getBackground()!=Color.GREEN) {
                valasztott4.setBackground(Color.GREEN);
            }
        } else if (gmb.getBackground() == Color.PINK) {
            
            if (valasztott1.getBackground() == Color.WHITE && valasztott2.getBackground()!=Color.PINK && valasztott3.getBackground()!=Color.PINK && valasztott4.getBackground()!=Color.PINK) {
                valasztott1.setBackground(Color.PINK);
            } else if (valasztott2.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.PINK && valasztott3.getBackground()!=Color.PINK && valasztott4.getBackground()!=Color.PINK){
                valasztott2.setBackground(Color.PINK);
            } else if (valasztott3.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.PINK && valasztott2.getBackground()!=Color.PINK && valasztott4.getBackground()!=Color.PINK) {
                valasztott3.setBackground(Color.PINK);
            } else if (valasztott4.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.PINK && valasztott2.getBackground()!=Color.PINK && valasztott3.getBackground()!=Color.PINK) {
                valasztott4.setBackground(Color.PINK);
            }
        } else if (gmb.getBackground() == Color.YELLOW) {
            
            if (valasztott1.getBackground() == Color.WHITE && valasztott2.getBackground()!=Color.YELLOW && valasztott3.getBackground()!=Color.YELLOW && valasztott4.getBackground()!=Color.YELLOW) {
                valasztott1.setBackground(Color.YELLOW);
            } else if (valasztott2.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.YELLOW && valasztott3.getBackground()!=Color.YELLOW && valasztott4.getBackground()!=Color.YELLOW){
                valasztott2.setBackground(Color.YELLOW);
            } else if (valasztott3.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.YELLOW && valasztott2.getBackground()!=Color.YELLOW && valasztott4.getBackground()!=Color.YELLOW) {
                valasztott3.setBackground(Color.YELLOW);
            } else if (valasztott4.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.YELLOW && valasztott2.getBackground()!=Color.YELLOW && valasztott3.getBackground()!=Color.YELLOW) {
                valasztott4.setBackground(Color.YELLOW);
            }
        } else if (gmb.getBackground() == Color.BLUE) {
            
            if (valasztott1.getBackground() == Color.WHITE && valasztott2.getBackground()!=Color.BLUE && valasztott3.getBackground()!=Color.BLUE&& valasztott4.getBackground()!=Color.BLUE) {
                valasztott1.setBackground(Color.BLUE);
            } else if (valasztott2.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.BLUE && valasztott3.getBackground()!=Color.BLUE && valasztott4.getBackground()!=Color.BLUE){
                valasztott2.setBackground(Color.BLUE);
            } else if (valasztott3.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.BLUE && valasztott2.getBackground()!=Color.BLUE && valasztott4.getBackground()!=Color.BLUE) {
                valasztott3.setBackground(Color.BLUE);
            } else if (valasztott4.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.BLUE && valasztott2.getBackground()!=Color.BLUE && valasztott3.getBackground()!=Color.BLUE) {
                valasztott4.setBackground(Color.BLUE);
            }
        } else if (gmb.getBackground() == Color.ORANGE) {
            
            if (valasztott1.getBackground() == Color.WHITE && valasztott2.getBackground()!=Color.ORANGE && valasztott3.getBackground()!=Color.ORANGE && valasztott4.getBackground()!=Color.ORANGE) {
                valasztott1.setBackground(Color.ORANGE);
            } else if (valasztott2.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.ORANGE &&valasztott3.getBackground()!=Color.ORANGE && valasztott4.getBackground()!=Color.ORANGE){
                valasztott2.setBackground(Color.ORANGE);
            } else if (valasztott3.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.ORANGE && valasztott2.getBackground()!=Color.ORANGE && valasztott4.getBackground()!=Color.ORANGE) {
                valasztott3.setBackground(Color.ORANGE);
            } else if (valasztott4.getBackground() == Color.WHITE && valasztott1.getBackground()!=Color.ORANGE && valasztott2.getBackground()!=Color.ORANGE && valasztott3.getBackground()!=Color.ORANGE) {
                valasztott4.setBackground(Color.ORANGE);
            }

        }
    }//GEN-LAST:event_szinekEvt

    private void mentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentesActionPerformed
        if (elso1.getBackground()==Color.WHITE) {
            elsokor();
        }else if(masodik1.getBackground()==Color.WHITE){
            masodikkor();
        }else if(harmadik1.getBackground()==Color.WHITE){
            harmadikkor();
        }else if(negyedik1.getBackground()==Color.WHITE){
            negyedikkor();
        }else if(otodik1.getBackground()==Color.WHITE){
            otodikkor();
        }else if(hatodik1.getBackground()==Color.WHITE){
            hatodikkor();
        }else if(hetedik1.getBackground()==Color.WHITE){
            hetedikkor();
        }else if(nyolcadik1.getBackground()==Color.WHITE){
           nyolcadikkor();
        }else if(kilencedik1.getBackground()==Color.WHITE){
           kilencedikkor();
        }
        
    }//GEN-LAST:event_mentesActionPerformed

    private void tisztitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tisztitoActionPerformed
        valasztott1.setBackground(Color.WHITE);
        valasztott2.setBackground(Color.WHITE);
        valasztott3.setBackground(Color.WHITE);
        valasztott4.setBackground(Color.WHITE);
                        
    }//GEN-LAST:event_tisztitoActionPerformed

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
            java.util.logging.Logger.getLogger(Szinek_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szinek_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szinek_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szinek_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szinek_gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ujjatek;
    private javax.swing.JButton elso1;
    private javax.swing.JButton elso2;
    private javax.swing.JButton elso3;
    private javax.swing.JButton elso4;
    private javax.swing.JButton gepszin1;
    private javax.swing.JButton gepszin2;
    private javax.swing.JButton gepszin3;
    private javax.swing.JButton gepszin4;
    private javax.swing.JButton harmadik1;
    private javax.swing.JButton harmadik2;
    private javax.swing.JButton harmadik3;
    private javax.swing.JButton harmadik4;
    private javax.swing.JButton hatodik1;
    private javax.swing.JButton hatodik2;
    private javax.swing.JButton hatodik3;
    private javax.swing.JButton hatodik4;
    private javax.swing.JButton hetedik1;
    private javax.swing.JButton hetedik2;
    private javax.swing.JButton hetedik3;
    private javax.swing.JButton hetedik4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kek;
    private javax.swing.JButton kilencedik1;
    private javax.swing.JButton kilencedik2;
    private javax.swing.JButton kilencedik3;
    private javax.swing.JButton kilencedik4;
    private javax.swing.JButton masodik1;
    private javax.swing.JButton masodik2;
    private javax.swing.JButton masodik3;
    private javax.swing.JButton masodik4;
    private javax.swing.JButton mentes;
    private javax.swing.JButton narancs;
    private javax.swing.JButton negyedik1;
    private javax.swing.JButton negyedik2;
    private javax.swing.JButton negyedik3;
    private javax.swing.JButton negyedik4;
    private javax.swing.JButton nyolcadik1;
    private javax.swing.JButton nyolcadik2;
    private javax.swing.JButton nyolcadik3;
    private javax.swing.JButton nyolcadik4;
    private javax.swing.JButton otodik1;
    private javax.swing.JButton otodik2;
    private javax.swing.JButton otodik3;
    private javax.swing.JButton otodik4;
    private javax.swing.JButton piros;
    private javax.swing.JButton rozsaszin;
    private javax.swing.JButton sarga;
    private javax.swing.JButton talal1;
    private javax.swing.JButton talal10;
    private javax.swing.JButton talal11;
    private javax.swing.JButton talal12;
    private javax.swing.JButton talal13;
    private javax.swing.JButton talal14;
    private javax.swing.JButton talal15;
    private javax.swing.JButton talal16;
    private javax.swing.JButton talal17;
    private javax.swing.JButton talal18;
    private javax.swing.JButton talal19;
    private javax.swing.JButton talal2;
    private javax.swing.JButton talal20;
    private javax.swing.JButton talal21;
    private javax.swing.JButton talal22;
    private javax.swing.JButton talal23;
    private javax.swing.JButton talal24;
    private javax.swing.JButton talal25;
    private javax.swing.JButton talal26;
    private javax.swing.JButton talal27;
    private javax.swing.JButton talal28;
    private javax.swing.JButton talal29;
    private javax.swing.JButton talal3;
    private javax.swing.JButton talal30;
    private javax.swing.JButton talal31;
    private javax.swing.JButton talal32;
    private javax.swing.JButton talal33;
    private javax.swing.JButton talal34;
    private javax.swing.JButton talal35;
    private javax.swing.JButton talal36;
    private javax.swing.JButton talal4;
    private javax.swing.JButton talal5;
    private javax.swing.JButton talal6;
    private javax.swing.JButton talal7;
    private javax.swing.JButton talal8;
    private javax.swing.JButton talal9;
    private javax.swing.JButton tisztito;
    private javax.swing.JButton valasztott1;
    private javax.swing.JButton valasztott2;
    private javax.swing.JButton valasztott3;
    private javax.swing.JButton valasztott4;
    private javax.swing.JButton zold;
    // End of variables declaration//GEN-END:variables

    private void alaphelyzet() {
        randomszinlista.clear();
        veletlenszamlista.clear();
        szamaim.clear();
        gombfeherites();
        alapszinek();

    }

    private void gombfeherites() {
        gombLista.add(valasztott1);
        gombLista.add(valasztott2);
        gombLista.add(valasztott3);
        gombLista.add(valasztott4);
        gombLista.add(elso1);
        gombLista.add(elso2);
        gombLista.add(elso3);
        gombLista.add(elso4);
        gombLista.add(masodik1);
        gombLista.add(masodik2);
        gombLista.add(masodik3);
        gombLista.add(masodik4);
        gombLista.add(harmadik1);
        gombLista.add(harmadik2);
        gombLista.add(harmadik3);
        gombLista.add(harmadik4);
        gombLista.add(negyedik1);
        gombLista.add(negyedik2);
        gombLista.add(negyedik3);
        gombLista.add(negyedik4);
        gombLista.add(otodik1);
        gombLista.add(otodik2);
        gombLista.add(otodik3);
        gombLista.add(otodik4);
        gombLista.add(hatodik1);
        gombLista.add(hatodik2);
        gombLista.add(hatodik3);
        gombLista.add(hatodik4);
        gombLista.add(hetedik1);
        gombLista.add(hetedik2);
        gombLista.add(hetedik3);
        gombLista.add(hetedik4);
        gombLista.add(nyolcadik1);
        gombLista.add(nyolcadik2);
        gombLista.add(nyolcadik3);
        gombLista.add(nyolcadik4);
        gombLista.add(kilencedik1);
        gombLista.add(kilencedik2);
        gombLista.add(kilencedik3);
        gombLista.add(kilencedik4);

        for (int i = 0; i < gombLista.size(); i++) {
            JButton aktGomb = gombLista.get(i);
            aktGomb.setBackground(Color.WHITE);
        }
        
    }
    

    private int randomszam() {
        Random rnd = new Random();
        int veletlenszam;
        int min=1;
        int max=6;
        veletlenszam=rnd.nextInt((max-min)+1)+min;
        
        
        return veletlenszam;
        
    }

    private void szinbeallit() {
        
        negyszingeneralas();
        gepszin1.setBackground(randomszinlista.get(0));
        gepszin2.setBackground(randomszinlista.get(1));
        gepszin3.setBackground(randomszinlista.get(2));
        gepszin4.setBackground(randomszinlista.get(3));

        
    }

    private void negyszingeneralas() {
        int szamom;
        while (veletlenszamlista.size()<4) {            
            szamom=randomszam();
            veletlenszamlista.add(szamom);
        }
        szamaim.addAll(veletlenszamlista);
        
        Color veletlenszin1=randomszin(szamaim.get(0));
        Color veletlenszin2=randomszin(szamaim.get(1));
        Color veletlenszin3=randomszin(szamaim.get(2));
        Color veletlenszin4=randomszin(szamaim.get(3));
        randomszinlista.add(veletlenszin1);
        randomszinlista.add(veletlenszin2);
        randomszinlista.add(veletlenszin3);
        randomszinlista.add(veletlenszin4);     
        
    }

    private Color randomszin(int randomszam) {
        if (randomszam == 1) {
        return Color.RED;
    } else if (randomszam == 2) {
        return Color.BLUE;
    } else if (randomszam == 3) {
        return Color.YELLOW;
    } else if (randomszam == 4) {
        return Color.ORANGE;
    } else if (randomszam == 5) {
        return Color.GREEN;
    } else if (randomszam== 6) {
        return Color.PINK;
    } else  {
        return Color.BLACK;
    }
    }

    private void elsokor() {
        Color v1=valasztott1.getBackground();
        Color v2=valasztott2.getBackground();
        Color v3=valasztott3.getBackground();
        Color v4=valasztott4.getBackground();
        elso1.setBackground(v4);
        elso2.setBackground(v3);
        elso3.setBackground(v2);
        elso4.setBackground(v1);
    }

    private void masodikkor() {
        Color v1=valasztott1.getBackground();
        Color v2=valasztott2.getBackground();
        Color v3=valasztott3.getBackground();
        Color v4=valasztott4.getBackground();
        masodik1.setBackground(v4);
        masodik2.setBackground(v3);
        masodik3.setBackground(v2);
        masodik4.setBackground(v1);
    }

    private void harmadikkor() {
        Color v1=valasztott1.getBackground();
        Color v2=valasztott2.getBackground();
        Color v3=valasztott3.getBackground();
        Color v4=valasztott4.getBackground();
        harmadik1.setBackground(v4);
        harmadik2.setBackground(v3);
        harmadik3.setBackground(v2);
        harmadik4.setBackground(v1);
    }

    private void negyedikkor() {
        Color v1=valasztott1.getBackground();
        Color v2=valasztott2.getBackground();
        Color v3=valasztott3.getBackground();
        Color v4=valasztott4.getBackground();
        negyedik1.setBackground(v4);
        negyedik2.setBackground(v3);
        negyedik3.setBackground(v2);
        negyedik4.setBackground(v1);
    }

    private void otodikkor() {
        Color v1=valasztott1.getBackground();
        Color v2=valasztott2.getBackground();
        Color v3=valasztott3.getBackground();
        Color v4=valasztott4.getBackground();
        otodik1.setBackground(v4);
        otodik2.setBackground(v3);
        otodik3.setBackground(v2);
        otodik4.setBackground(v1);
    }

    private void hatodikkor() {
        Color v1=valasztott1.getBackground();
        Color v2=valasztott2.getBackground();
        Color v3=valasztott3.getBackground();
        Color v4=valasztott4.getBackground();
        hatodik1.setBackground(v4);
        hatodik2.setBackground(v3);
        hatodik3.setBackground(v2);
        hatodik4.setBackground(v1);
    }

    private void hetedikkor() {
        Color v1=valasztott1.getBackground();
        Color v2=valasztott2.getBackground();
        Color v3=valasztott3.getBackground();
        Color v4=valasztott4.getBackground();
        hetedik1.setBackground(v4);
        hetedik2.setBackground(v3);
        hetedik3.setBackground(v2);
        hetedik4.setBackground(v1);
    }

    private void nyolcadikkor() {
        Color v1=valasztott1.getBackground();
        Color v2=valasztott2.getBackground();
        Color v3=valasztott3.getBackground();
        Color v4=valasztott4.getBackground();
        nyolcadik1.setBackground(v4);
        nyolcadik2.setBackground(v3);
        nyolcadik3.setBackground(v2);
        nyolcadik4.setBackground(v1);
    }

    private void kilencedikkor() {
        Color v1=valasztott1.getBackground();
        Color v2=valasztott2.getBackground();
        Color v3=valasztott3.getBackground();
        Color v4=valasztott4.getBackground();
        kilencedik1.setBackground(v4);
        kilencedik2.setBackground(v3);
        kilencedik3.setBackground(v2);
        kilencedik4.setBackground(v1);
    }
}

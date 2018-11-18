package amzevent.gui;
import javax.swing.JFrame;
import amzevent.domain.AmzController;
import amzevent.domain.AmzController.TypeComposante;
import amzevent.domain.ComposanteSalle;
import amzevent.domain.Scene;
import amzevent.domain.SectionReguliere;
import java.awt.Point;
import java.util.List;

public class MainWindow extends javax.swing.JFrame {

    public AmzController controller;
    public TypeComposante selectedTypeComposante;
    private Boolean isBeingDragged = false;
    private Point pointDepartDrag;
    private int indexComposanteSelectionnee;
    public MainWindow() {
        
        controller = new AmzController();
        
        initComponents();
        jPanel_menu_haut.setVisible(false);
        jPanel_dessin.setVisible(false);
        drawingPanel1.setVisible(false);
        this.fermerPanelsMenuDroite();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Accueil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        boutonNouvelleSalle = new javax.swing.JButton();
        jPanel_Programme = new javax.swing.JPanel();
        jPanel_menu_haut = new javax.swing.JPanel();
        jPanel_menu_haut1 = new javax.swing.JPanel();
        jPanel_menu_haut3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jToggleButton_attrib_siege = new javax.swing.JToggleButton();
        jToggleButton_attrib_rangee = new javax.swing.JToggleButton();
        jToggleButton_attrib_section = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel_menu_haut2 = new javax.swing.JPanel();
        jToggleButton_redistribution = new javax.swing.JToggleButton();
        jToggleButton_grille_magnetique = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel_menu_haut5 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jButton_nouvelle_offre = new javax.swing.JButton();
        jPanel_menu_haut_6 = new javax.swing.JPanel();
        jButton_offre = new javax.swing.JButton();
        jToggleButton_section = new javax.swing.JToggleButton();
        jButton_dessiner_scene = new javax.swing.JButton();
        jPanel_dessin = new javax.swing.JPanel();
        jPanel_retour = new javax.swing.JPanel();
        jButton_retour = new javax.swing.JButton();
        jPanel_section = new javax.swing.JPanel();
        jButton_irreguliere = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jButton_reguliere = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jButton_admission = new javax.swing.JButton();
        jPanel_menu_sectionIR = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jColorChooser2 = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        drawingPanel1 = new amzevent.gui.DrawingPanel(this);
        jLabel_zoom = new javax.swing.JLabel();
        jSlider_zoom = new javax.swing.JSlider();
        jPanel_menu_salle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel_menu_scene = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        longueurSceneTxtField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        largeurSceneTxtField = new javax.swing.JTextField();
        boutonValiderScene = new javax.swing.JButton();
        jPanel_menu_sectionR = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel_menu_admission = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jColorChooser3 = new javax.swing.JColorChooser();
        jPanel_menu_rangee = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jColorChooser5 = new javax.swing.JColorChooser();
        jPanel_menu_siege = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jColorChooser4 = new javax.swing.JColorChooser();
        jPanel_menu_offre = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amzevent/gui/affiche.PNG"))); // NOI18N

        jButton1.setText("Ouvrir Salle Existante");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        boutonNouvelleSalle.setText("Nouvelle Salle");
        boutonNouvelleSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonNouvelleSalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AccueilLayout = new javax.swing.GroupLayout(jPanel_Accueil);
        jPanel_Accueil.setLayout(jPanel_AccueilLayout);
        jPanel_AccueilLayout.setHorizontalGroup(
            jPanel_AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AccueilLayout.createSequentialGroup()
                .addGroup(jPanel_AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AccueilLayout.createSequentialGroup()
                        .addComponent(boutonNouvelleSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel_AccueilLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel_AccueilLayout.setVerticalGroup(
            jPanel_AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AccueilLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel_AccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boutonNouvelleSalle, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jPanel_menu_haut.setLayout(new java.awt.CardLayout());

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jToggleButton_attrib_siege.setText("Par siège");
        jToggleButton_attrib_siege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_attrib_siegeActionPerformed(evt);
            }
        });

        jToggleButton_attrib_rangee.setText("Par rangée");
        jToggleButton_attrib_rangee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_attrib_rangeeActionPerformed(evt);
            }
        });

        jToggleButton_attrib_section.setText("Par section");
        jToggleButton_attrib_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_attrib_sectionActionPerformed(evt);
            }
        });

        jLabel15.setText("Type d'attribution automatique des prix");

        javax.swing.GroupLayout jPanel_menu_haut3Layout = new javax.swing.GroupLayout(jPanel_menu_haut3);
        jPanel_menu_haut3.setLayout(jPanel_menu_haut3Layout);
        jPanel_menu_haut3Layout.setHorizontalGroup(
            jPanel_menu_haut3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_haut3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_menu_haut3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menu_haut3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jToggleButton_attrib_siege)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton_attrib_rangee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton_attrib_section))
                    .addGroup(jPanel_menu_haut3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel15)))
                .addGap(253, 253, 253))
        );
        jPanel_menu_haut3Layout.setVerticalGroup(
            jPanel_menu_haut3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_haut3Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_menu_haut3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton_attrib_section, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jToggleButton_attrib_rangee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton_attrib_siege, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jSeparator3)
        );

        jToggleButton_redistribution.setText("Redistribution");
        jToggleButton_redistribution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_redistributionActionPerformed(evt);
            }
        });

        jToggleButton_grille_magnetique.setText("Grille Magnetique");
        jToggleButton_grille_magnetique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_grille_magnetiqueActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel_menu_haut2Layout = new javax.swing.GroupLayout(jPanel_menu_haut2);
        jPanel_menu_haut2.setLayout(jPanel_menu_haut2Layout);
        jPanel_menu_haut2Layout.setHorizontalGroup(
            jPanel_menu_haut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_haut2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton_redistribution)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton_grille_magnetique, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_menu_haut2Layout.setVerticalGroup(
            jPanel_menu_haut2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToggleButton_redistribution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton_grille_magnetique, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
        );

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton_nouvelle_offre.setText("Nouvelle offre");

        javax.swing.GroupLayout jPanel_menu_haut5Layout = new javax.swing.GroupLayout(jPanel_menu_haut5);
        jPanel_menu_haut5.setLayout(jPanel_menu_haut5Layout);
        jPanel_menu_haut5Layout.setHorizontalGroup(
            jPanel_menu_haut5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_haut5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_nouvelle_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_menu_haut5Layout.setVerticalGroup(
            jPanel_menu_haut5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator7)
            .addComponent(jButton_nouvelle_offre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton_offre.setText("Offres");
        jButton_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_offreActionPerformed(evt);
            }
        });

        jToggleButton_section.setText("Section");
        jToggleButton_section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_sectionActionPerformed(evt);
            }
        });

        jButton_dessiner_scene.setText("Dessiner Scène");
        jButton_dessiner_scene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_dessiner_sceneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menu_haut_6Layout = new javax.swing.GroupLayout(jPanel_menu_haut_6);
        jPanel_menu_haut_6.setLayout(jPanel_menu_haut_6Layout);
        jPanel_menu_haut_6Layout.setHorizontalGroup(
            jPanel_menu_haut_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_haut_6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton_dessiner_scene, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton_section, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_offre, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel_menu_haut_6Layout.setVerticalGroup(
            jPanel_menu_haut_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_dessiner_scene, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToggleButton_section, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton_offre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_menu_haut1Layout = new javax.swing.GroupLayout(jPanel_menu_haut1);
        jPanel_menu_haut1.setLayout(jPanel_menu_haut1Layout);
        jPanel_menu_haut1Layout.setHorizontalGroup(
            jPanel_menu_haut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_haut1Layout.createSequentialGroup()
                .addComponent(jPanel_menu_haut_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_menu_haut2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_menu_haut3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_menu_haut5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_menu_haut1Layout.setVerticalGroup(
            jPanel_menu_haut1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_menu_haut2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_menu_haut3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_menu_haut5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_menu_haut_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_menu_haut.add(jPanel_menu_haut1, "card8");

        jPanel_dessin.setPreferredSize(new java.awt.Dimension(858, 482));

        jButton_retour.setText("< Retour au plan de salle");
        jButton_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_retourLayout = new javax.swing.GroupLayout(jPanel_retour);
        jPanel_retour.setLayout(jPanel_retourLayout);
        jPanel_retourLayout.setHorizontalGroup(
            jPanel_retourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_retourLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_retour)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_retourLayout.setVerticalGroup(
            jPanel_retourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_retourLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jButton_retour, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jButton_irreguliere.setText("Irrégulière");
        jButton_irreguliere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_irreguliereActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton_reguliere.setText("Regulière");
        jButton_reguliere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reguliereActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton_admission.setText("Admission");
        jButton_admission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_admissionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_sectionLayout = new javax.swing.GroupLayout(jPanel_section);
        jPanel_section.setLayout(jPanel_sectionLayout);
        jPanel_sectionLayout.setHorizontalGroup(
            jPanel_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_sectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_irreguliere)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_reguliere, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_admission)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel_sectionLayout.setVerticalGroup(
            jPanel_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_sectionLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(jPanel_sectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_irreguliere, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jButton_reguliere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5)))
            .addComponent(jButton_admission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_dessinLayout = new javax.swing.GroupLayout(jPanel_dessin);
        jPanel_dessin.setLayout(jPanel_dessinLayout);
        jPanel_dessinLayout.setHorizontalGroup(
            jPanel_dessinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dessinLayout.createSequentialGroup()
                .addComponent(jPanel_retour, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 380, Short.MAX_VALUE))
        );
        jPanel_dessinLayout.setVerticalGroup(
            jPanel_dessinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dessinLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel_dessinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_retour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Dimensions Section");

        jLabel29.setText("Nombre de colonnes");

        jLabel30.setText("Nombre de rangéees");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Espace Vital");

        jLabel32.setText("Longueur");

        jLabel33.setText("Largeur");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Élévation");

        jLabel35.setText("Élévation");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Nom de la section");

        jLabel37.setText("Revenu Total");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Finances");

        jLabel39.setText("Prix section");

        javax.swing.GroupLayout jPanel_menu_sectionIRLayout = new javax.swing.GroupLayout(jPanel_menu_sectionIR);
        jPanel_menu_sectionIR.setLayout(jPanel_menu_sectionIRLayout);
        jPanel_menu_sectionIRLayout.setHorizontalGroup(
            jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionIRLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(8, 8, 8))
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel31)))
                            .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel36))
                            .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel38)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_menu_sectionIRLayout.setVerticalGroup(
            jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel28)
                .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                                .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                                .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel34)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel_menu_sectionIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_menu_sectionIRLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        drawingPanel1.setBackground(new java.awt.Color(255, 255, 255));
        drawingPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        drawingPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawingPanel1MouseDragged(evt);
            }
        });
        drawingPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawingPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drawingPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout drawingPanel1Layout = new javax.swing.GroupLayout(drawingPanel1);
        drawingPanel1.setLayout(drawingPanel1Layout);
        drawingPanel1Layout.setHorizontalGroup(
            drawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        drawingPanel1Layout.setVerticalGroup(
            drawingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(drawingPanel1);

        jLabel_zoom.setText("ZOOM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Dimensions");

        jLabel4.setText("Longueur");

        jLabel5.setText("Largeur");

        jLabel7.setText("Longueur");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Espace Vital");

        jLabel6.setText("Largeur");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Finances");

        jLabel9.setText("Prix Min");

        jLabel10.setText("Pix Max");

        jLabel11.setText("Revenu Total");

        javax.swing.GroupLayout jPanel_menu_salleLayout = new javax.swing.GroupLayout(jPanel_menu_salle);
        jPanel_menu_salle.setLayout(jPanel_menu_salleLayout);
        jPanel_menu_salleLayout.setHorizontalGroup(
            jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_salleLayout.createSequentialGroup()
                .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menu_salleLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_salleLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_salleLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_salleLayout.createSequentialGroup()
                                .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel_menu_salleLayout.createSequentialGroup()
                                .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_salleLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(8, 8, 8))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_salleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(76, 76, 76))
        );
        jPanel_menu_salleLayout.setVerticalGroup(
            jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_salleLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_menu_salleLayout.createSequentialGroup()
                        .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_menu_salleLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_menu_salleLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26))
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_menu_salleLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_menu_salleLayout.createSequentialGroup()
                                .addGroup(jPanel_menu_salleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Dimensions");

        jLabel13.setText("Longueur");

        jLabel14.setText("Largeur");

        boutonValiderScene.setText("Valider");
        boutonValiderScene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonValiderSceneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menu_sceneLayout = new javax.swing.GroupLayout(jPanel_menu_scene);
        jPanel_menu_scene.setLayout(jPanel_menu_sceneLayout);
        jPanel_menu_sceneLayout.setHorizontalGroup(
            jPanel_menu_sceneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sceneLayout.createSequentialGroup()
                .addGroup(jPanel_menu_sceneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_menu_sceneLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boutonValiderScene))
                    .addGroup(jPanel_menu_sceneLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel_menu_sceneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sceneLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(largeurSceneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sceneLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(longueurSceneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sceneLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel12)))))
                .addGap(75, 75, 75))
        );
        jPanel_menu_sceneLayout.setVerticalGroup(
            jPanel_menu_sceneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_sceneLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel_menu_sceneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_menu_sceneLayout.createSequentialGroup()
                        .addGroup(jPanel_menu_sceneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(longueurSceneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(largeurSceneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addGap(74, 74, 74)
                .addComponent(boutonValiderScene)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Dimensions Section");

        jLabel17.setText("Nombre de colonnes");

        jLabel18.setText("Nombre de rangéees");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Espace Vital");

        jLabel20.setText("Longueur");

        jLabel21.setText("Largeur");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Élévation");

        jLabel25.setText("Élévation");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Nom de la section");

        jLabel26.setText("Revenu Total");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Finances");

        jLabel27.setText("Prix section");

        javax.swing.GroupLayout jPanel_menu_sectionRLayout = new javax.swing.GroupLayout(jPanel_menu_sectionR);
        jPanel_menu_sectionR.setLayout(jPanel_menu_sectionRLayout);
        jPanel_menu_sectionRLayout.setHorizontalGroup(
            jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionRLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(8, 8, 8))
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel19)))
                            .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel23))
                            .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel24)))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_menu_sectionRLayout.setVerticalGroup(
            jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel16)
                .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                                .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                                .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel22)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel_menu_sectionRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_menu_sectionRLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Dimensions Section");

        jLabel41.setText("Nombre de colonnes");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Élévation");

        jLabel47.setText("Élévation");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Nom de la section");

        jLabel49.setText("Revenu Total");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Finances");

        jLabel51.setText("Prix section");

        javax.swing.GroupLayout jPanel_menu_admissionLayout = new javax.swing.GroupLayout(jPanel_menu_admission);
        jPanel_menu_admission.setLayout(jPanel_menu_admissionLayout);
        jPanel_menu_admissionLayout.setHorizontalGroup(
            jPanel_menu_admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_admissionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_menu_admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_admissionLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_admissionLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_admissionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_admissionLayout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_admissionLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_menu_admissionLayout.createSequentialGroup()
                        .addGroup(jPanel_menu_admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_menu_admissionLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel46))
                            .addGroup(jPanel_menu_admissionLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel48))
                            .addGroup(jPanel_menu_admissionLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel50)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jColorChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_menu_admissionLayout.setVerticalGroup(
            jPanel_menu_admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_admissionLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel40)
                .addGroup(jPanel_menu_admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menu_admissionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_menu_admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel_menu_admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel_menu_admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel50)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel_menu_admissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_menu_admissionLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jColorChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("Finances");

        jLabel55.setText("Prix section");

        javax.swing.GroupLayout jPanel_menu_rangeeLayout = new javax.swing.GroupLayout(jPanel_menu_rangee);
        jPanel_menu_rangee.setLayout(jPanel_menu_rangeeLayout);
        jPanel_menu_rangeeLayout.setHorizontalGroup(
            jPanel_menu_rangeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_rangeeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel_menu_rangeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_rangeeLayout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_menu_rangeeLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel54)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jColorChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_menu_rangeeLayout.setVerticalGroup(
            jPanel_menu_rangeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_rangeeLayout.createSequentialGroup()
                .addGroup(jPanel_menu_rangeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menu_rangeeLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jColorChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_menu_rangeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel54)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel_menu_rangeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Finances");

        jLabel53.setText("Prix section");

        javax.swing.GroupLayout jPanel_menu_siegeLayout = new javax.swing.GroupLayout(jPanel_menu_siege);
        jPanel_menu_siege.setLayout(jPanel_menu_siegeLayout);
        jPanel_menu_siegeLayout.setHorizontalGroup(
            jPanel_menu_siegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_siegeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel_menu_siegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menu_siegeLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_menu_siegeLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel52)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jColorChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_menu_siegeLayout.setVerticalGroup(
            jPanel_menu_siegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_siegeLayout.createSequentialGroup()
                .addGroup(jPanel_menu_siegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_menu_siegeLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jColorChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_menu_siegeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel52)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel_menu_siegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel42.setText("Offre");

        javax.swing.GroupLayout jPanel_menu_offreLayout = new javax.swing.GroupLayout(jPanel_menu_offre);
        jPanel_menu_offre.setLayout(jPanel_menu_offreLayout);
        jPanel_menu_offreLayout.setHorizontalGroup(
            jPanel_menu_offreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_offreLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel42)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel_menu_offreLayout.setVerticalGroup(
            jPanel_menu_offreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_menu_offreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(430, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_ProgrammeLayout = new javax.swing.GroupLayout(jPanel_Programme);
        jPanel_Programme.setLayout(jPanel_ProgrammeLayout);
        jPanel_ProgrammeLayout.setHorizontalGroup(
            jPanel_ProgrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_menu_haut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_ProgrammeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ProgrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ProgrammeLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel_zoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider_zoom, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_ProgrammeLayout.createSequentialGroup()
                        .addGroup(jPanel_ProgrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_dessin, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_ProgrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_menu_sectionR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_salle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_rangee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_scene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_siege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_offre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_sectionIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_admission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );
        jPanel_ProgrammeLayout.setVerticalGroup(
            jPanel_ProgrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ProgrammeLayout.createSequentialGroup()
                .addComponent(jPanel_menu_haut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_ProgrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ProgrammeLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel_ProgrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_menu_sectionR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_salle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_rangee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_scene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_siege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_offre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_sectionIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_menu_admission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_ProgrammeLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel_dessin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_ProgrammeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_zoom)
                            .addComponent(jSlider_zoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
        );

        jMenu1.setText("Fichier");

        jMenuItem1.setText("Nouveau Plan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ouvrir Plan");
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Enregistrer");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Enregistrer Sous");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem5");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("jMenuItem5");
        jMenu1.add(jMenuItem7);

        jMenuItem3.setText("Quitter");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Édition");

        jMenuItem8.setText("Annuler");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Répéter");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Accueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_Programme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Accueil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_Programme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setTypeComposante(TypeComposante newType) {
        this.selectedTypeComposante = newType;
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boutonNouvelleSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonNouvelleSalleActionPerformed
                // TODO add your handling code here:
                this.setTypeComposante(TypeComposante.SCENE);
                jPanel_menu_haut5.setVisible(false);
                jPanel_retour.setVisible(false);               
                jPanel_menu_haut.setVisible(true);
                
                jPanel_Accueil.removeAll();
                jPanel_Accueil.repaint();
                jPanel_Accueil.revalidate();

                jPanel_Accueil.add(jPanel_Programme);
                jPanel_Accueil.repaint();
                jPanel_Accueil.revalidate();
                
                this.fermerPanelsMenuDroite();
                jPanel_menu_salle.setVisible(true);
                jPanel_dessin.setVisible(true);
                drawingPanel1.setVisible(false);
    }//GEN-LAST:event_boutonNouvelleSalleActionPerformed

    private void jToggleButton_redistributionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_redistributionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton_redistributionActionPerformed

    private void jToggleButton_grille_magnetiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_grille_magnetiqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton_grille_magnetiqueActionPerformed

    private void jButton_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_offreActionPerformed
        // TODO add your handling code here:

        jPanel_menu_haut_6.setVisible(false);
        jPanel_menu_haut2.setVisible(false);
        jPanel_menu_haut3.setVisible(false);

        this.fermerPanelsMenuDroite();
        
        jPanel_menu_haut5.setVisible(true);
        jPanel_menu_offre.setVisible(true);
        jPanel_retour.setVisible(true);
        
    }//GEN-LAST:event_jButton_offreActionPerformed
    
    private void jButton_dessiner_sceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_dessiner_sceneActionPerformed
        // TODO add your handling code here:
        this.setTypeComposante(TypeComposante.SCENE);
        jPanel_retour.setVisible(true);
        
        this.fermerPanelsMenuDroite();
        jPanel_menu_scene.setVisible(true); 
        
        jPanel_menu_haut3.setVisible(false);
        
        jButton_dessiner_scene.setVisible(false);
        jPanel_dessin.setVisible(true);

    }//GEN-LAST:event_jButton_dessiner_sceneActionPerformed

    private void jButton_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retourActionPerformed
        // TODO add your handling code here:
        jPanel_menu_salle.setVisible(true);
        jPanel_menu_scene.setVisible(false); 
        
        jPanel_menu_haut3.setVisible(true);
        jPanel_menu_haut2.setVisible(true);
        jPanel_menu_haut_6.setVisible(true);
        
        jPanel_retour.setVisible(false);
        jPanel_menu_haut5.setVisible(false);
        
        jButton_dessiner_scene.setVisible(true);
    }//GEN-LAST:event_jButton_retourActionPerformed

    private void jToggleButton_attrib_siegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_attrib_siegeActionPerformed
        // TODO add your handling code here:
        jToggleButton_attrib_rangee.setSelected(false);
        jToggleButton_attrib_section.setSelected(false);
        
    }//GEN-LAST:event_jToggleButton_attrib_siegeActionPerformed

    
    private void jButton_irreguliereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_irreguliereActionPerformed
        // TODO add your handling code here:
        this.setTypeComposante(TypeComposante.SECTION_IR);
        this.fermerPanelsMenuDroite();
        jPanel_menu_sectionIR.setVisible(true);
        jPanel_section.setVisible(true);
        jPanel_retour.setVisible(true);
        jToggleButton_section.setSelected(false);
    }//GEN-LAST:event_jButton_irreguliereActionPerformed

    private void jToggleButton_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_sectionActionPerformed
        // TODO add your handling code here:
        if(jToggleButton_section.isSelected())
            jPanel_section.setVisible(true);
        else
            jPanel_section.setVisible(false);
    }//GEN-LAST:event_jToggleButton_sectionActionPerformed

    private void jButton_reguliereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reguliereActionPerformed
        // TODO add your handling code here:
        this.setTypeComposante(TypeComposante.SECTION_R);
        this.fermerPanelsMenuDroite();
        jPanel_menu_sectionR.setVisible(true);
        jPanel_section.setVisible(true);
        jPanel_retour.setVisible(true);
        jToggleButton_section.setSelected(false);
    }//GEN-LAST:event_jButton_reguliereActionPerformed

    private void jButton_admissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_admissionActionPerformed
        // TODO add your handling code here:
        this.setTypeComposante(TypeComposante.SECTION_A);
        this.fermerPanelsMenuDroite();
        jPanel_menu_admission.setVisible(true);
        jPanel_section.setVisible(true);
        jPanel_retour.setVisible(true);
        jToggleButton_section.setSelected(false);
    }//GEN-LAST:event_jButton_admissionActionPerformed

    private void jToggleButton_attrib_rangeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_attrib_rangeeActionPerformed
        // TODO add your handling code here:
        jToggleButton_attrib_siege.setSelected(false);
        jToggleButton_attrib_section.setSelected(false);
    }//GEN-LAST:event_jToggleButton_attrib_rangeeActionPerformed

    private void jToggleButton_attrib_sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_attrib_sectionActionPerformed
        // TODO add your handling code here:
        jToggleButton_attrib_rangee.setSelected(false);
        jToggleButton_attrib_siege.setSelected(false);
    }//GEN-LAST:event_jToggleButton_attrib_sectionActionPerformed

    private void drawingPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanel1MousePressed
        Point mousePoint = evt.getPoint();
        AmzController.TypeComposante actualType = this.selectedTypeComposante;
        if(!isBeingDragged && !validerSiClickSurComposante(mousePoint)){
            this.controller.addComposante(mousePoint, actualType);
            drawingPanel1.repaint();
        }
        else{
            this.pointDepartDrag = mousePoint;
        }
    }//GEN-LAST:event_drawingPanel1MousePressed

    private void boutonValiderSceneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonValiderSceneActionPerformed
        // TODO add your handling code here:
        int longueur = Integer.parseInt(longueurSceneTxtField.getText());
        int largeur = Integer.parseInt(largeurSceneTxtField.getText());
        controller.modifierScene(longueur, largeur);
        drawingPanel1.repaint();
    }//GEN-LAST:event_boutonValiderSceneActionPerformed

    private void drawingPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanel1MouseDragged
        // TODO add your handling code here:
        Point mousePoint = evt.getPoint();
        if(validerSiClickSurComposante(mousePoint))
           this.isBeingDragged = true;
    }//GEN-LAST:event_drawingPanel1MouseDragged
    public boolean validerSiClickSurComposante(Point mousePoint){
        List<ComposanteSalle> listeComposantes = this.controller.getListeComposantes();
        double composanteLargeur=0;     
        double composanteLongueur=0;
        double composantePointX ;
        double composantePointY;
        boolean isClicked = false;
        ComposanteSalle composante;    
        if(listeComposantes != null){
            for (int i=0; i< listeComposantes.size(); i++){
                composante = listeComposantes.get(i);
                composantePointX = composante.getPoint().getX();
                composantePointY = composante.getPoint().getY();
                if(composante instanceof SectionReguliere){
                    composanteLargeur = composantePointX + ((SectionReguliere) composante).getLargeur();
                    composanteLongueur = composantePointY + ((SectionReguliere) composante).getLongueur();   
                }
                else if(composante instanceof Scene){
                    composanteLargeur = composantePointX + ((Scene) composante).getLargeur();
                    composanteLongueur = composantePointY + ((Scene) composante).getLongueur();
                }
            
                if (mousePoint.getX() <= composanteLargeur && mousePoint.getY() <= composanteLongueur && mousePoint.getX()>= composantePointX && mousePoint.getY()>= composantePointY){
                    isClicked = true;
                    this.indexComposanteSelectionnee = i;
                    break;
                }
            }
        }
        return isClicked;
    }
    private void drawingPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanel1MouseReleased
        // TODO add your handling code here:
        if(this.isBeingDragged){
            Point mousePoint = evt.getPoint();
            double differenceX = mousePoint.getX() - this.pointDepartDrag.getX();
            double differenceY = mousePoint.getY() - this.pointDepartDrag.getY();
            double pointSceneX = controller.getSalle().getComposantesSalle().get(this.indexComposanteSelectionnee).getPoint().getX();
            double pointSceneY = controller.getSalle().getComposantesSalle().get(this.indexComposanteSelectionnee).getPoint().getY();
            int nouveauX = (int)(pointSceneX+ differenceX);
            int nouveauY = (int)(pointSceneY+differenceY);
            Point nouveauPoint = new Point(nouveauX, nouveauY);
            //mousePoint.translate((int)differenceY, (int)differenceX);
            controller.getSalle().getComposantesSalle().get(this.indexComposanteSelectionnee).setPoint(mousePoint); // a remplacer par nouveauPoint quand la logique est corrigee
            drawingPanel1.repaint();
            this.isBeingDragged = false;
        }
    }//GEN-LAST:event_drawingPanel1MouseReleased

    private void fermerPanelsMenuDroite(){
        drawingPanel1.setVisible(true);
        jPanel_menu_salle.setVisible(false);
        jPanel_menu_sectionIR.setVisible(false);
        jPanel_menu_sectionR.setVisible(false);
        jPanel_menu_admission.setVisible(false);
        jPanel_menu_rangee.setVisible(false);
        jPanel_menu_siege.setVisible(false);
        jPanel_menu_offre.setVisible(false);
        jPanel_section.setVisible(false);
        jPanel_menu_scene.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonNouvelleSalle;
    private javax.swing.JButton boutonValiderScene;
    private amzevent.gui.DrawingPanel drawingPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_admission;
    private javax.swing.JButton jButton_dessiner_scene;
    private javax.swing.JButton jButton_irreguliere;
    private javax.swing.JButton jButton_nouvelle_offre;
    private javax.swing.JButton jButton_offre;
    private javax.swing.JButton jButton_reguliere;
    private javax.swing.JButton jButton_retour;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JColorChooser jColorChooser3;
    private javax.swing.JColorChooser jColorChooser4;
    private javax.swing.JColorChooser jColorChooser5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_zoom;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel_Accueil;
    private javax.swing.JPanel jPanel_Programme;
    private javax.swing.JPanel jPanel_dessin;
    private javax.swing.JPanel jPanel_menu_admission;
    private javax.swing.JPanel jPanel_menu_haut;
    private javax.swing.JPanel jPanel_menu_haut1;
    private javax.swing.JPanel jPanel_menu_haut2;
    private javax.swing.JPanel jPanel_menu_haut3;
    private javax.swing.JPanel jPanel_menu_haut5;
    private javax.swing.JPanel jPanel_menu_haut_6;
    private javax.swing.JPanel jPanel_menu_offre;
    private javax.swing.JPanel jPanel_menu_rangee;
    private javax.swing.JPanel jPanel_menu_salle;
    private javax.swing.JPanel jPanel_menu_scene;
    private javax.swing.JPanel jPanel_menu_sectionIR;
    private javax.swing.JPanel jPanel_menu_sectionR;
    private javax.swing.JPanel jPanel_menu_siege;
    private javax.swing.JPanel jPanel_retour;
    private javax.swing.JPanel jPanel_section;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSlider jSlider_zoom;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton_attrib_rangee;
    private javax.swing.JToggleButton jToggleButton_attrib_section;
    private javax.swing.JToggleButton jToggleButton_attrib_siege;
    private javax.swing.JToggleButton jToggleButton_grille_magnetique;
    private javax.swing.JToggleButton jToggleButton_redistribution;
    private javax.swing.JToggleButton jToggleButton_section;
    private javax.swing.JTextField largeurSceneTxtField;
    private javax.swing.JTextField longueurSceneTxtField;
    // End of variables declaration//GEN-END:variables

}

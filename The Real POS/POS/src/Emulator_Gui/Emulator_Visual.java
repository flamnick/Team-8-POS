package Emulator_Gui;

import Editor_Gui.XMLManager;
import Editor_Gui.setPic;
import Model.Calculator;
import java.awt.Color;
import java.io.File;
import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * The visual for the emulator. Many events are similar to the editor, but are
 * read in from a saved XML file.
 *
 */
public class Emulator_Visual extends javax.swing.JFrame implements Observer {

    /**
     * The data model reflected in the view.
     */
    Model.Template POSmodel = new Model.Template();
    /**
     * The XML manager used to load templates.
     */
    XMLManager xml = new XMLManager();
    /**
     * The calculator used to calculate pre and post tax totals.
     */
    Calculator totalCalculator = new Calculator();
    /**
     * The list model used by our Jlist to display clicked items to the user.
     */
    DefaultListModel<String> listModel = new DefaultListModel<>();
    /**
     * Interprets integer selections and determines which to display.
     */
    setPic picsetter = new setPic();

    /**
     * Creates new form Emulator_Visual
     */
    public Emulator_Visual() {
        POSmodel.initTemplate();
        POSmodel.addObserver(this);
        initComponents();
        POSmodel.setColorChoice(Color.MAGENTA);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        Menu_Panel = new javax.swing.JPanel();
        Load_Button = new javax.swing.JButton();
        Menu_Title_Label = new javax.swing.JLabel();
        Menu_Instructions_Label = new javax.swing.JLabel();
        Register_Panel = new javax.swing.JPanel();
        Button_1 = new javax.swing.JButton();
        Button_2 = new javax.swing.JButton();
        Button_3 = new javax.swing.JButton();
        Button_4 = new javax.swing.JButton();
        Button_5 = new javax.swing.JButton();
        Button_6 = new javax.swing.JButton();
        Button_7 = new javax.swing.JButton();
        Button_8 = new javax.swing.JButton();
        Button_9 = new javax.swing.JButton();
        Button_10 = new javax.swing.JButton();
        Button_11 = new javax.swing.JButton();
        Button_12 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DataHolder_List = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        TaxRateLabel = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu_Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Load_Button.setText("Load Template");
        Load_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Load_ButtonMouseClicked(evt);
            }
        });

        Menu_Title_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Menu_Title_Label.setText("Template Emulator");

        Menu_Instructions_Label.setText("Select a template to emulate:");

        javax.swing.GroupLayout Menu_PanelLayout = new javax.swing.GroupLayout(Menu_Panel);
        Menu_Panel.setLayout(Menu_PanelLayout);
        Menu_PanelLayout.setHorizontalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_PanelLayout.createSequentialGroup()
                        .addComponent(Menu_Title_Label)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_PanelLayout.createSequentialGroup()
                        .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Load_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Menu_Instructions_Label))
                        .addGap(37, 37, 37))))
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Menu_Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Menu_Instructions_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Load_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Button_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_1MouseExited(evt);
            }
        });

        Button_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_2MouseExited(evt);
            }
        });

        Button_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_3MouseExited(evt);
            }
        });

        Button_4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_4MouseExited(evt);
            }
        });

        Button_5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_5MouseExited(evt);
            }
        });

        Button_6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_6MouseExited(evt);
            }
        });

        Button_7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_7MouseExited(evt);
            }
        });

        Button_8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_8MouseExited(evt);
            }
        });

        Button_9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_9MouseExited(evt);
            }
        });

        Button_10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_10MouseExited(evt);
            }
        });

        Button_11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_11.setText("CLEAR");
        Button_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_11MouseExited(evt);
            }
        });

        Button_12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_12.setText("TOTAL");
        Button_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_12MouseExited(evt);
            }
        });

        DataHolder_List.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DataHolder_List.setModel(listModel);
        jScrollPane2.setViewportView(DataHolder_List);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Total:");

        TaxRateLabel.setText("Tax Rate:");

        javax.swing.GroupLayout Register_PanelLayout = new javax.swing.GroupLayout(Register_Panel);
        Register_Panel.setLayout(Register_PanelLayout);
        Register_PanelLayout.setHorizontalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Register_PanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Register_PanelLayout.createSequentialGroup()
                        .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(Register_PanelLayout.createSequentialGroup()
                                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Button_10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(Button_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(169, 169, 169)
                                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_12, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(Button_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(42, 42, 42))
                    .addGroup(Register_PanelLayout.createSequentialGroup()
                        .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TaxRateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Register_PanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Register_PanelLayout.setVerticalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Register_PanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Button_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button_7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(Button_9, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(Button_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button_10, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(Button_11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TaxRateLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Register_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Register_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * These are mouse entered events that change the color of the button when
     * the mouse is hovered over it. They are the same for all buttons
     *
     * @param evt
     */
    private void Button_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_1MouseEntered
        Button_1.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_1MouseEntered
    /**
     * These are mouse exited events that change the color of the button back to
     * the original after the mouse is no longer hovering over the button. They
     * are all the same.
     *
     * @param evt
     */
    private void Button_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_1MouseExited
        Button_1.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_1MouseExited

    private void Button_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_2MouseEntered
        Button_2.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_2MouseEntered

    private void Button_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_2MouseExited
        Button_2.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_2MouseExited

    private void Button_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_3MouseEntered
        Button_3.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_3MouseEntered

    private void Button_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_3MouseExited
        Button_3.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_3MouseExited

    private void Button_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_4MouseEntered
        Button_4.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_4MouseEntered

    private void Button_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_4MouseExited
        Button_4.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_4MouseExited

    private void Button_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_5MouseEntered
        Button_5.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_5MouseEntered

    private void Button_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_5MouseExited
        Button_5.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_5MouseExited

    private void Button_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_6MouseEntered
        Button_6.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_6MouseEntered

    private void Button_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_6MouseExited
        Button_6.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_6MouseExited

    private void Button_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_7MouseEntered
        Button_7.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_7MouseEntered

    private void Button_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_7MouseExited
        Button_7.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_7MouseExited

    private void Button_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_8MouseEntered
        Button_8.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_8MouseEntered

    private void Button_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_8MouseExited
        Button_8.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_8MouseExited

    private void Button_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_9MouseEntered
        Button_9.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_9MouseEntered

    private void Button_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_9MouseExited
        Button_9.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_9MouseExited

    private void Button_10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_10MouseEntered
        Button_10.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_10MouseEntered

    private void Button_10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_10MouseExited
        Button_10.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_10MouseExited

    private void Button_11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_11MouseEntered
        Button_11.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_11MouseEntered

    private void Button_11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_11MouseExited
        Button_11.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_11MouseExited

    private void Button_12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_12MouseEntered
        Button_12.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_12MouseEntered

    private void Button_12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_12MouseExited
        Button_12.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_12MouseExited

    private void Button_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_12MouseClicked
        totalCalculator.calculatePostTaxTotal(POSmodel.getTaxRate());
        String price;
        price = Double.toString(totalCalculator.getTotal());
        totalField.setText(price);
        listModel.clear();
        listModel.addElement("Thank you for shopping with us.");
        totalCalculator.clearTotal();
    }//GEN-LAST:event_Button_12MouseClicked
    /**
     * Populates the list on button press. Same for all buttons
     *
     * @param evt mouse clicked
     */
    private void Button_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_1MouseClicked
        addListItem(1);
        addToRunningTotal(1);
    }//GEN-LAST:event_Button_1MouseClicked

    /**
     * Loads chosen XML file to Emulator. Uses the file chooser to find the file and give it's name to our XML parser.
     *
     * @param evt mouse clicked
     */
    private void Load_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Load_ButtonMouseClicked
        String userhome = System.getProperty("user.dir");
        JFileChooser fchooser = new JFileChooser(userhome);
        fchooser.setVisible(true);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("xml", "xml");
        fchooser.setFileFilter(filter);
        int returnVal = fchooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            System.out.println(fchooser.getSelectedFile().getName());
            try {

                Model.Template softCopy = xml.read(fchooser.getSelectedFile().getName());
                POSmodel.setTemplate(softCopy);
            } catch (Exception e) {

                System.out.println("File not found");
            }

        }

    }//GEN-LAST:event_Load_ButtonMouseClicked
/**
 * All buttons have similar functionality: They add an item to our Jlist and they add to the running total.
 * @param evt 
 */    
    private void Button_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_2MouseClicked
        addListItem(2);
        addToRunningTotal(2);
    }//GEN-LAST:event_Button_2MouseClicked

    private void Button_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_3MouseClicked
        addListItem(3);
        addToRunningTotal(3);
    }//GEN-LAST:event_Button_3MouseClicked

    private void Button_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_4MouseClicked
        addListItem(4);
        addToRunningTotal(4);
    }//GEN-LAST:event_Button_4MouseClicked

    private void Button_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_5MouseClicked
        addListItem(5);
        addToRunningTotal(5);
    }//GEN-LAST:event_Button_5MouseClicked

    private void Button_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_6MouseClicked
        addListItem(6);
        addToRunningTotal(6);
    }//GEN-LAST:event_Button_6MouseClicked

    private void Button_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_7MouseClicked
        addListItem(7);
        addToRunningTotal(7);
    }//GEN-LAST:event_Button_7MouseClicked

    private void Button_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_8MouseClicked
        addListItem(8);
        addToRunningTotal(8);
    }//GEN-LAST:event_Button_8MouseClicked

    private void Button_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_9MouseClicked
        addListItem(9);
        addToRunningTotal(9);
    }//GEN-LAST:event_Button_9MouseClicked

    private void Button_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_10MouseClicked
        addListItem(10);
        addToRunningTotal(10);
    }//GEN-LAST:event_Button_10MouseClicked

    private void Button_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_11MouseClicked
        listModel.clear();
        totalCalculator.clearTotal();
        totalField.setText(" ");
    }//GEN-LAST:event_Button_11MouseClicked

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
            java.util.logging.Logger.getLogger(Emulator_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emulator_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emulator_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emulator_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emulator_Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_1;
    private javax.swing.JButton Button_10;
    private javax.swing.JButton Button_11;
    private javax.swing.JButton Button_12;
    private javax.swing.JButton Button_2;
    private javax.swing.JButton Button_3;
    private javax.swing.JButton Button_4;
    private javax.swing.JButton Button_5;
    private javax.swing.JButton Button_6;
    private javax.swing.JButton Button_7;
    private javax.swing.JButton Button_8;
    private javax.swing.JButton Button_9;
    private javax.swing.JList<String> DataHolder_List;
    private javax.swing.JButton Load_Button;
    private javax.swing.JLabel Menu_Instructions_Label;
    private javax.swing.JPanel Menu_Panel;
    private javax.swing.JLabel Menu_Title_Label;
    private javax.swing.JPanel Register_Panel;
    private javax.swing.JLabel TaxRateLabel;
    private java.awt.Choice choice1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
    private Model.Template POSupdate;

    /**
     * This is the update method for the view; it updates all our buttons on
     * click.
     *
     * @param o Our observable object.
     * @param o1 whats being observed.
     */
    @Override
    public void update(Observable o, Object o1) {
        POSupdate = (Model.Template) o;

        //This sets the text of each button to the name field of the corresponding button in the model.
        Button_1.setText("<html>" + POSupdate.getName(1) + "<br>$" + POSupdate.getPrice(1) + "</html>");
        Button_2.setText("<html>" + POSupdate.getName(2) + "<br>$" + POSupdate.getPrice(2) + "</html>");
        Button_3.setText("<html>" + POSupdate.getName(3) + "<br>$" + POSupdate.getPrice(3) + "</html>");
        Button_4.setText("<html>" + POSupdate.getName(4) + "<br>$" + POSupdate.getPrice(4) + "</html>");
        Button_5.setText("<html>" + POSupdate.getName(5) + "<br>$" + POSupdate.getPrice(5) + "</html>");
        Button_6.setText("<html>" + POSupdate.getName(6) + "<br>$" + POSupdate.getPrice(6) + "</html>");
        Button_7.setText("<html>" + POSupdate.getName(7) + "<br>$" + POSupdate.getPrice(7) + "</html>");
        Button_8.setText("<html>" + POSupdate.getName(8) + "<br>$" + POSupdate.getPrice(8) + "</html>");
        Button_9.setText("<html>" + POSupdate.getName(9) + "<br>$" + POSupdate.getPrice(9) + "</html>");
        Button_10.setText("<html>" + POSupdate.getName(10) + "<br>$" + POSupdate.getPrice(10) + "</html>");

        //This sets up our image files.
        Button_1.setIcon(picsetter.getPic(POSupdate.getPictureChoice(1)));
        Button_1.setHorizontalTextPosition(JButton.CENTER);
        Button_1.setVerticalTextPosition(JButton.CENTER);
        Button_2.setIcon(picsetter.getPic(POSupdate.getPictureChoice(2)));
        Button_2.setHorizontalTextPosition(JButton.CENTER);
        Button_2.setVerticalTextPosition(JButton.CENTER);
        Button_3.setIcon(picsetter.getPic(POSupdate.getPictureChoice(3)));
        Button_3.setHorizontalTextPosition(JButton.CENTER);
        Button_3.setVerticalTextPosition(JButton.CENTER);
        Button_4.setIcon(picsetter.getPic(POSupdate.getPictureChoice(4)));
        Button_4.setHorizontalTextPosition(JButton.CENTER);
        Button_4.setVerticalTextPosition(JButton.CENTER);
        Button_5.setIcon(picsetter.getPic(POSupdate.getPictureChoice(5)));
        Button_5.setHorizontalTextPosition(JButton.CENTER);
        Button_5.setVerticalTextPosition(JButton.CENTER);
        Button_6.setIcon(picsetter.getPic(POSupdate.getPictureChoice(6)));
        Button_6.setHorizontalTextPosition(JButton.CENTER);
        Button_6.setVerticalTextPosition(JButton.CENTER);
        Button_7.setIcon(picsetter.getPic(POSupdate.getPictureChoice(7)));
        Button_7.setHorizontalTextPosition(JButton.CENTER);
        Button_7.setVerticalTextPosition(JButton.CENTER);
        Button_8.setIcon(picsetter.getPic(POSupdate.getPictureChoice(8)));
        Button_8.setHorizontalTextPosition(JButton.CENTER);
        Button_8.setVerticalTextPosition(JButton.CENTER);
        Button_9.setIcon(picsetter.getPic(POSupdate.getPictureChoice(9)));
        Button_9.setHorizontalTextPosition(JButton.CENTER);
        Button_9.setVerticalTextPosition(JButton.CENTER);
        Button_10.setIcon(picsetter.getPic(POSupdate.getPictureChoice(10)));
        Button_10.setHorizontalTextPosition(JButton.CENTER);
        Button_10.setVerticalTextPosition(JButton.CENTER);

        //This sets all of our button fonts.
        Button_1.setFont(POSupdate.getFontChoice());
        Button_2.setFont(POSupdate.getFontChoice());
        Button_3.setFont(POSupdate.getFontChoice());
        Button_4.setFont(POSupdate.getFontChoice());
        Button_5.setFont(POSupdate.getFontChoice());
        Button_6.setFont(POSupdate.getFontChoice());
        Button_7.setFont(POSupdate.getFontChoice());
        Button_8.setFont(POSupdate.getFontChoice());
        Button_9.setFont(POSupdate.getFontChoice());
        Button_10.setFont(POSupdate.getFontChoice());
        Button_11.setFont(POSupdate.getFontChoice());
        Button_12.setFont(POSupdate.getFontChoice());
        
        String temp = Double.toString(POSmodel.getTaxRate());
        
        TaxRateLabel.setText("Current tax rate is " + temp + "%");
    }

    /**
     * Contains the code for adding a entry to the list.
     *
     * @param buttonNumber The button it's adding to the list.
     */
    public void addListItem(int buttonNumber) {
        String temp;
        temp = POSmodel.getName(buttonNumber) + " " + POSmodel.getPrice(buttonNumber);
        listModel.addElement(temp);
        revalidate();
    }
    public void addToRunningTotal(int buttonNumber)
    {
        totalCalculator.addToTotal(POSmodel.getPrice(buttonNumber));
        String price;
        price = Double.toString(totalCalculator.getTotal());
        totalField.setText(price);
    }

}

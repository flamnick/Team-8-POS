package Emulator_Gui;

import Editor_Gui.XMLManager;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Flamnick
 */
public class Emulator_Visual extends javax.swing.JFrame implements Observer {

    Model.Template POSmodel = new Model.Template();
    XMLManager xml = new XMLManager();

    DefaultListModel<String> listModel = new DefaultListModel<>();

    /**
     * Creates new form Emulator_Visual
     */
    public Emulator_Visual() {
        POSmodel.addObserver(this);
        initComponents();
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
        scrollPane1 = new java.awt.ScrollPane();
        File_List = new java.awt.List();
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
        jTextField1 = new javax.swing.JTextField();

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

        Load_Button.setText("Load");
        Load_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Load_ButtonMouseClicked(evt);
            }
        });

        Menu_Title_Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Menu_Title_Label.setText("Template Emulator");

        Menu_Instructions_Label.setText("Select a template to emulate:");

        scrollPane1.add(File_List);

        javax.swing.GroupLayout Menu_PanelLayout = new javax.swing.GroupLayout(Menu_Panel);
        Menu_Panel.setLayout(Menu_PanelLayout);
        Menu_PanelLayout.setHorizontalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Load_Button)
                .addGap(85, 85, 85))
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Instructions_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Menu_Title_Label)
                .addGap(53, 53, 53))
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Menu_Title_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Menu_Instructions_Label)
                .addGap(41, 41, 41)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Load_Button)
                .addContainerGap(267, Short.MAX_VALUE))
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
        Button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_1ActionPerformed(evt);
            }
        });

        Button_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_2MouseExited(evt);
            }
        });

        Button_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_3MouseExited(evt);
            }
        });

        Button_4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_4MouseExited(evt);
            }
        });

        Button_5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_5MouseExited(evt);
            }
        });

        Button_6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_6MouseExited(evt);
            }
        });

        Button_7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_7MouseExited(evt);
            }
        });

        Button_8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_8MouseExited(evt);
            }
        });

        Button_9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_9MouseExited(evt);
            }
        });

        Button_10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_10.addMouseListener(new java.awt.event.MouseAdapter() {
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

        jScrollPane2.setViewportView(DataHolder_List);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Total:");

        javax.swing.GroupLayout Register_PanelLayout = new javax.swing.GroupLayout(Register_Panel);
        Register_Panel.setLayout(Register_PanelLayout);
        Register_PanelLayout.setHorizontalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Register_PanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Register_PanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(42, 42, 42))))
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
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
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
     *
     * @param evt
     */
    private void Button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_1ActionPerformed

    }//GEN-LAST:event_Button_1ActionPerformed
    /**
     *
     * @param evt
     */
    private void Button_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_1MouseEntered
        Button_1.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_1MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_1MouseExited
        Button_1.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_1MouseExited
    /**
     *
     * @param evt
     */
    private void Button_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_2MouseEntered
        Button_2.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_2MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_2MouseExited
        Button_2.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_2MouseExited
    /**
     *
     * @param evt
     */
    private void Button_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_3MouseEntered
        Button_3.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_3MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_3MouseExited
        Button_3.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_3MouseExited
    /**
     *
     * @param evt
     */
    private void Button_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_4MouseEntered
        Button_4.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_4MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_4MouseExited
        Button_4.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_4MouseExited
    /**
     *
     * @param evt
     */
    private void Button_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_5MouseEntered
        Button_5.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_5MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_5MouseExited
        Button_5.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_5MouseExited
    /**
     *
     * @param evt
     */
    private void Button_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_6MouseEntered
        Button_6.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_6MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_6MouseExited
        Button_6.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_6MouseExited
    /**
     *
     * @param evt
     */
    private void Button_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_7MouseEntered
        Button_7.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_7MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_7MouseExited
        Button_7.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_7MouseExited
    /**
     *
     * @param evt
     */
    private void Button_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_8MouseEntered
        Button_8.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_8MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_8MouseExited
        Button_8.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_8MouseExited
    /**
     *
     * @param evt
     */
    private void Button_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_9MouseEntered
        Button_9.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_9MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_9MouseExited
        Button_9.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_9MouseExited
    /**
     *
     * @param evt
     */
    private void Button_10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_10MouseEntered
        Button_10.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_10MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_10MouseExited
        Button_10.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_10MouseExited
    /**
     *
     * @param evt
     */
    private void Button_11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_11MouseEntered
        Button_11.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_11MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_11MouseExited
        Button_11.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_11MouseExited
    /**
     *
     * @param evt
     */
    private void Button_12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_12MouseEntered
        Button_12.setBackground(POSmodel.getColorChoice());
    }//GEN-LAST:event_Button_12MouseEntered
    /**
     *
     * @param evt
     */
    private void Button_12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_12MouseExited
        Button_12.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_Button_12MouseExited

    private void Button_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_12MouseClicked

    }//GEN-LAST:event_Button_12MouseClicked
/**
 * Populates the list on the button's press.
 * @param evt 
 */
    private void Button_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_1MouseClicked
    
        listModel.addElement(POSmodel.getName(1) + " " + POSmodel.getPrice(1));

    }//GEN-LAST:event_Button_1MouseClicked

    private void Load_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Load_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Load_ButtonMouseClicked

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
    private java.awt.List File_List;
    private javax.swing.JButton Load_Button;
    private javax.swing.JLabel Menu_Instructions_Label;
    private javax.swing.JPanel Menu_Panel;
    private javax.swing.JLabel Menu_Title_Label;
    private javax.swing.JPanel Register_Panel;
    private java.awt.Choice choice1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
    private Model.Template POSupdate;

    @Override
    public void update(Observable o, Object o1) {
        POSupdate = (Model.Template) o;

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
    }
}

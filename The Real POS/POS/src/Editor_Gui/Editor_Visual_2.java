/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Gui;

import java.util.Observable;
import java.util.Observer;


/**
 * This is our GUI class. Each class can also receives a reference to our model.
 * @author Team 8
 */
public class Editor_Visual_2 extends javax.swing.JFrame implements Observer {
    Editor_Model.Template POSmodel = new Editor_Model.Template();
    XMLManager xml = new XMLManager();

    /**
     * Creates new form Emulator_Visual
     */
    public Editor_Visual_2() {
        
        initComponents();
        POSmodel.addObserver(this);
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
        jPanel1 = new javax.swing.JPanel();
        Load = new javax.swing.JButton();
        Menu_Title = new javax.swing.JLabel();
        Load_Instructions = new javax.swing.JLabel();
        Scroll_Pane = new java.awt.ScrollPane();
        Load_List = new java.awt.List();
        New_Template = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
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
        Tax_Label = new java.awt.Label();
        Scroll_Pane_2 = new javax.swing.JScrollPane();
        Register_List = new javax.swing.JTextField();
        Taxrate_Textfield = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Button_Settings_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        templateName = new javax.swing.JTextField();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Load.setText("Load");
        Load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadMouseClicked(evt);
            }
        });

        Menu_Title.setText("Template Editor");

        Load_Instructions.setText("Select a template to emulate:");

        Load_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Load_ListActionPerformed(evt);
            }
        });
        Scroll_Pane.add(Load_List);

        New_Template.setText("Create New Template");
        New_Template.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                New_TemplateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(Menu_Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Load)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Scroll_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Load_Instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(New_Template, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Menu_Title)
                .addGap(105, 105, 105)
                .addComponent(New_Template)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Load_Instructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scroll_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Load)
                .addGap(225, 225, 225))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Button_1.setBackground(new java.awt.Color(204, 204, 204));
        Button_1.setForeground(new java.awt.Color(204, 204, 204));
        Button_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_1MouseClicked(evt);
            }
        });
        Button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_1ActionPerformed(evt);
            }
        });

        Button_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_2MouseClicked(evt);
            }
        });

        Button_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_3MouseClicked(evt);
            }
        });

        Button_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_4MouseClicked(evt);
            }
        });

        Button_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_5MouseClicked(evt);
            }
        });

        Button_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_6MouseClicked(evt);
            }
        });

        Button_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_7MouseClicked(evt);
            }
        });

        Button_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_8MouseClicked(evt);
            }
        });

        Button_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_9MouseClicked(evt);
            }
        });

        Button_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_10MouseClicked(evt);
            }
        });

        Button_11.setFont(Button_11.getFont().deriveFont(Button_11.getFont().getStyle() & ~java.awt.Font.BOLD));

        Button_12.setBorder(null);
        Button_12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Tax_Label.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        Tax_Label.setText("Template Tax Rate:");

        Scroll_Pane_2.setViewportView(Register_List);

        Taxrate_Textfield.setText("Enter Tax Rate");

        Save.setText("Save Current Template");
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });

        Button_Settings_Button.setText("More Button Settings");
        Button_Settings_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Settings_ButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Template Name:");

        templateName.setText("Enter Template Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Button_10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(Button_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Button_11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(118, 118, 118)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Button_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Button_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Button_9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Button_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addComponent(Scroll_Pane_2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(Button_Settings_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tax_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Taxrate_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(templateName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Button_10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button_11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Button_12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(Scroll_Pane_2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tax_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Taxrate_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(templateName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Button_Settings_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Save)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_1MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 1);
        repaint();
    }//GEN-LAST:event_Button_1MouseClicked

    private void Button_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_2MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 2);
         repaint();
    }//GEN-LAST:event_Button_2MouseClicked

    private void Button_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_3MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 3);
         repaint();
    }//GEN-LAST:event_Button_3MouseClicked

    private void Button_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_4MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 4);
         repaint();
    }//GEN-LAST:event_Button_4MouseClicked

    private void Button_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_5MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 5);
         repaint();
    }//GEN-LAST:event_Button_5MouseClicked

    private void Button_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_6MouseClicked
       Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 6);
        repaint();
    }//GEN-LAST:event_Button_6MouseClicked

    private void Button_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_7MouseClicked
       Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 7);
        repaint();
    }//GEN-LAST:event_Button_7MouseClicked

    private void Button_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_8MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 8);
         repaint();
    }//GEN-LAST:event_Button_8MouseClicked

    private void Button_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_9MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 9);
         repaint();
    }//GEN-LAST:event_Button_9MouseClicked

    private void Button_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_10MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 10);
         repaint();
    }//GEN-LAST:event_Button_10MouseClicked


    private void Button_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_11MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 11);
         repaint();
    }//GEN-LAST:event_Button_11MouseClicked

    private void Button_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_12MouseClicked
        Editor_Gui.Edit_Button_Dialog dialog = new Editor_Gui.Edit_Button_Dialog(POSmodel, 12);
         repaint();
    }//GEN-LAST:event_Button_12MouseClicked

   
    
    private void Button_Settings_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Settings_ButtonMouseClicked
       Editor_Gui.Color_Text_Dialog dialog = new Editor_Gui.Color_Text_Dialog(this,true, POSmodel);
       repaint();
    }//GEN-LAST:event_Button_Settings_ButtonMouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
       try{
           xml.write(POSmodel,templateName.getText());
       } catch (Exception e)
       {
           
       }
        
    }//GEN-LAST:event_SaveMouseClicked

    private void New_TemplateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_TemplateMouseClicked
        POSmodel = new Editor_Model.Template();
        this.repaint();
    }//GEN-LAST:event_New_TemplateMouseClicked

    private void LoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadMouseClicked
       try{
        POSmodel = xml.read(Load_List.getSelectedItem());
        } catch (Exception e)
       {
           
       }
    }//GEN-LAST:event_LoadMouseClicked

    private void Load_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Load_ListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Load_ListActionPerformed

    private void Button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_1ActionPerformed

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
            java.util.logging.Logger.getLogger(Editor_Visual_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor_Visual_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor_Visual_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor_Visual_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor_Visual_2().setVisible(true);
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
    private javax.swing.JButton Button_Settings_Button;
    private javax.swing.JButton Load;
    private javax.swing.JLabel Load_Instructions;
    private java.awt.List Load_List;
    private javax.swing.JLabel Menu_Title;
    private javax.swing.JButton New_Template;
    private javax.swing.JTextField Register_List;
    private javax.swing.JButton Save;
    private java.awt.ScrollPane Scroll_Pane;
    private javax.swing.JScrollPane Scroll_Pane_2;
    private java.awt.Label Tax_Label;
    private javax.swing.JTextField Taxrate_Textfield;
    private java.awt.Choice choice1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField templateName;
    // End of variables declaration//GEN-END:variables

 /*   public void printDataModel()
    {
        System.out.println(POSmodel.getName(1));
    }*/
    private Editor_Model.Template POSupdate;
    /**
     * This is the update method for the view; it updates all our buttons on click.
     * @param o Our observable object.
     * @param o1 cool.
     */
    @Override
    public void update(Observable o, Object o1) 
    {        
        POSupdate= (Editor_Model.Template) o;
        Button_1.setText(POSupdate.getName(1) + "\n$ " + POSupdate.getPrice(1));
        Button_2.setText(POSmodel.getName(2) + "\n$ " + POSmodel.getPrice(2));
        Button_3.setText(POSmodel.getName(3) + "\n$ " + POSmodel.getPrice(3));
        Button_4.setText(POSmodel.getName(4) + "\n$ " + POSmodel.getPrice(4));
        Button_5.setText(POSmodel.getName(5) + "\n$ " + POSmodel.getPrice(5));
        Button_6.setText(POSmodel.getName(6) + "\n$ " + POSmodel.getPrice(6));
        Button_7.setText(POSmodel.getName(7) + "\n$ " + POSmodel.getPrice(7));
        Button_8.setText(POSmodel.getName(8) + "\n$ " + POSmodel.getPrice(8));
        Button_9.setText(POSmodel.getName(9) + "\n$ " + POSmodel.getPrice(9));
        Button_10.setText(POSmodel.getName(10) + "\n$ " + POSmodel.getPrice(10));
        
        repaint();
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

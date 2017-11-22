/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor_Gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

/**
 *
 * @author Flamnick
 */
public class Color_Text_Dialog extends javax.swing.JDialog {

    
    
    private Color color_choice;
    private Font font_choice;
    private Editor_Model.Template modelReference;
    /**
     * Creates new form Color_Text_Dialogue
     * @param model Takes a reference to the data model.
     */
    public Color_Text_Dialog(java.awt.Frame parent, boolean modal, Editor_Model.Template model) 
    {
        super(parent, modal);
        modelReference = model;
        initComponents();
        setVisible(true);
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
        Color_List = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Font_List = new javax.swing.JList<>();
        Title_Label = new javax.swing.JLabel();
        Color_List_label = new javax.swing.JLabel();
        Finish_Dialogue_Button = new javax.swing.JButton();
        Font_List_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Color_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Default", "Magenta", "Cyan", "Green" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Color_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                Color_ListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Color_List);

        Font_List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Default", "Arial", "Comic Sans", "Papyrus" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Font_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                Font_ListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(Font_List);

        Title_Label.setText("Configure More Button Settings");

        Color_List_label.setText("Mouse Over Color");

        Finish_Dialogue_Button.setText("Finish");
        Finish_Dialogue_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Finish_Dialogue_ButtonMouseClicked(evt);
            }
        });

        Font_List_Label.setText("Button Font");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title_Label)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(Finish_Dialogue_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Color_List_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Font_List_Label)
                        .addGap(18, 18, 18)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title_Label)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Color_List_label)
                    .addComponent(Font_List_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Finish_Dialogue_Button)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Finish_Dialogue_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Finish_Dialogue_ButtonMouseClicked
        modelReference.updateTemplateAppearance(color_choice, font_choice);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_Finish_Dialogue_ButtonMouseClicked

    private void Color_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_Color_ListValueChanged
        switch(Color_List.getSelectedValue())
        {
            case "Default": 
            {
                color_choice = UIManager.getColor("control");
                break;
            }
            case "Magenta": 
            {
                color_choice = Color.MAGENTA;
                break;
            }
            case "Cyan": 
            {
                color_choice = Color.CYAN;
                break;
            }
            case "Green": 
            {
                color_choice = Color.GREEN;
                break;
            }
            default:
            {
                color_choice = UIManager.getColor("control");
                break;
            }
            
        }
        
        System.out.println(color_choice);
    }//GEN-LAST:event_Color_ListValueChanged

    private void Font_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_Font_ListValueChanged
        switch(Font_List.getSelectedValue())
        {
            case "Default": 
            {
                font_choice = new Font("Tahoma", Font.BOLD, 14);
                break;
            }
            case "Arial": 
            {
                font_choice = new Font("Arial", Font.BOLD, 14);
                break;
            }
            case "Comic Sans": 
            {
                font_choice = new Font("Comic Sans MS", Font.BOLD, 14);
                break;
            }
            case "Papyrus": 
            {
                font_choice = new Font("Papyrus", Font.BOLD, 14);
                break;
            }
            default:
            {
                font_choice = new Font("Tahoma", Font.BOLD, 14);
                break;
            }
            
        }
        
        System.out.println(font_choice);
    }//GEN-LAST:event_Font_ListValueChanged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Color_List;
    private javax.swing.JLabel Color_List_label;
    private javax.swing.JButton Finish_Dialogue_Button;
    private javax.swing.JList<String> Font_List;
    private javax.swing.JLabel Font_List_Label;
    private javax.swing.JLabel Title_Label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

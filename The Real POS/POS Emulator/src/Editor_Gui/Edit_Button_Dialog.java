/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Team 8
 */
package Editor_Gui;

import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Model.Template;

/**
 * Code for Dialogue Box that allows user to set button name, price and picture.
 *
 */
public class Edit_Button_Dialog extends javax.swing.JFrame {
    
    /**
     * The chooser integer for our picture choice.
     */
    private int pictureChoice;

    /**
     * Our coffee icon.
     */
    private ImageIcon coffee_icon;
    /**
     * Our beer icon
     */
    private ImageIcon beer_icon;
    /**
     * Our bread icon.
     */
    private ImageIcon bread_icon;
    /**
     * Our cookie icon.
     */
    private ImageIcon cookie_icon;
    /**
     * Our strawberry icon
     */
    private ImageIcon strawberry_icon;
    /**
     * The user infoBus which helps to shuttle data to our model.
     */
    private UserInfoBus dialougeInfoBus = new UserInfoBus();
    /**
     * This prepares the reference to our data model so the compiler knows what to look for.
     */
    private Model.Template modelReference;
    /**
     * An integer flag which determines which button is under edit, this is populated by whatever is passed into our dialog box when it is created.
     */
    private int buttonUnderEdit;

    /**
     * Initializes our button dialogue box. Takes a reference to our model as
     * well as the button it is editing.
     *
     * @param model A reference to our data model.
     * @param buttonNumber A reference to which button it is changing.
     */
    public Edit_Button_Dialog(Model.Template model, int buttonNumber) {
        initComponents();
        modelReference = model;
        buttonUnderEdit = buttonNumber;

        No_Image_Button.setSelected(true);
        setVisible(true);
        try {
            coffee_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Coffee_new.png")));

        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }
        try {
            beer_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Beer_new.png")));

        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }
        try {
            bread_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Bread_new.png")));

        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }
        try {
            cookie_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Cookie_new.png")));

        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }
        try {
            strawberry_icon = new ImageIcon(ImageIO.read(ImagePanel.class.getResource("/Food_Sprites/Fruit_new.png")));

        } catch (Exception e) {
            assert false; // Resource load failure - did you mistype the path programmer?
        }
    }

    /**
     * Checks if both text fields have been filled, returns true when both not empty.
     */
    public void update() {
        Finish.setEnabled(Name_Field.getText().length() > 0 && Value_Field.getText().length() > 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Title = new javax.swing.JLabel();
        Name_Field = new javax.swing.JTextField();
        Value_Field = new javax.swing.JTextField();
        Name_Label = new javax.swing.JLabel();
        Value_Label = new javax.swing.JLabel();
        Finish = new javax.swing.JButton();
        Image_Label = new javax.swing.JLabel();
        No_Image_Button = new javax.swing.JRadioButton();
        Image_1_Button = new javax.swing.JRadioButton();
        Image_2_Button = new javax.swing.JRadioButton();
        Image_3_Button = new javax.swing.JRadioButton();
        Image_4_Button = new javax.swing.JRadioButton();
        Image_5_Button = new javax.swing.JRadioButton();
        Image_Display = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setText("Edit Button");

        Name_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Name_FieldKeyReleased(evt);
            }
        });

        Value_Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Value_FieldKeyReleased(evt);
            }
        });

        Name_Label.setText("~Set Button Name~");

        Value_Label.setText("~Set Button Price~");

        Finish.setText("Finish");
        Finish.setEnabled(false);
        Finish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinishMouseClicked(evt);
            }
        });

        Image_Label.setText("~Set Button  Image~");

        buttonGroup1.add(No_Image_Button);
        No_Image_Button.setText("No Image");
        No_Image_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                No_Image_ButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(Image_1_Button);
        Image_1_Button.setText("Coffee");
        Image_1_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image_1_ButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(Image_2_Button);
        Image_2_Button.setText("Beer");
        Image_2_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image_2_ButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(Image_3_Button);
        Image_3_Button.setText("Bread");
        Image_3_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image_3_ButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(Image_4_Button);
        Image_4_Button.setText("Fruit");
        Image_4_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image_4_ButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(Image_5_Button);
        Image_5_Button.setText("Cookie");
        Image_5_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Image_5_ButtonMouseClicked(evt);
            }
        });

        Image_Display.setBackground(new java.awt.Color(255, 255, 255));
        Image_Display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(Name_Label)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Name_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(Value_Field))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(Value_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(Image_Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(No_Image_Button)
                    .addComponent(Image_1_Button)
                    .addComponent(Image_2_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Image_5_Button)
                        .addGap(54, 205, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Image_4_Button)
                            .addComponent(Image_3_Button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Image_Display, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(Finish)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Name_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Name_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Value_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Value_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Image_Label)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(No_Image_Button)
                            .addComponent(Image_3_Button))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Image_1_Button)
                            .addComponent(Image_4_Button))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Image_Display, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Image_2_Button)
                    .addComponent(Image_5_Button))
                .addGap(18, 18, 18)
                .addComponent(Finish)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * When the finish button is pressed, it takes the users values, and parses them into the original Template data model. Dialog info bus gives us a way to package what we're sending.
     *
     * @param evt mouse clicked
     */
    private void FinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinishMouseClicked

        dialougeInfoBus.setName(Name_Field.getText());
        double number = Double.parseDouble(Value_Field.getText());
        dialougeInfoBus.setPrice(number);
        dialougeInfoBus.setPicture(pictureChoice);
        modelReference.updateButton(buttonUnderEdit, dialougeInfoBus);

        System.out.println(dialougeInfoBus.getName());

        setVisible(false);
        dispose();

    }//GEN-LAST:event_FinishMouseClicked

    /**
     * These methods update the button based on the integer selection from Color
     * choice. They are all pretty much the same.
     *
     * @param evt mouse clicked
     */
    private void No_Image_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_No_Image_ButtonMouseClicked

        Image_Display.setIcon(null);
        pictureChoice = 0;
        update();
        revalidate();

    }//GEN-LAST:event_No_Image_ButtonMouseClicked

    private void Image_1_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image_1_ButtonMouseClicked
        Image_Display.setIcon(coffee_icon);
        pictureChoice = 1;
        update();
        revalidate();
    }//GEN-LAST:event_Image_1_ButtonMouseClicked

    private void Image_2_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image_2_ButtonMouseClicked
        Image_Display.setIcon(beer_icon);
        pictureChoice = 2;
        update();
        revalidate();
    }//GEN-LAST:event_Image_2_ButtonMouseClicked

    private void Image_3_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image_3_ButtonMouseClicked
        Image_Display.setIcon(bread_icon);
        pictureChoice = 3;
        update();
        revalidate();
    }//GEN-LAST:event_Image_3_ButtonMouseClicked

    private void Image_4_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image_4_ButtonMouseClicked
        Image_Display.setIcon(strawberry_icon);
        pictureChoice = 4;
        update();
        revalidate();
    }//GEN-LAST:event_Image_4_ButtonMouseClicked

    private void Image_5_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Image_5_ButtonMouseClicked
        Image_Display.setIcon(cookie_icon);
        pictureChoice = 5;
        update();
        revalidate();
    }//GEN-LAST:event_Image_5_ButtonMouseClicked

    /**
     * @param
     */
    private void Name_FieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Name_FieldKeyReleased

        update();
    }//GEN-LAST:event_Name_FieldKeyReleased

    /**
     * @param
     */
    private void Value_FieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Value_FieldKeyReleased
        update();
    }//GEN-LAST:event_Value_FieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Finish;
    private javax.swing.JRadioButton Image_1_Button;
    private javax.swing.JRadioButton Image_2_Button;
    private javax.swing.JRadioButton Image_3_Button;
    private javax.swing.JRadioButton Image_4_Button;
    private javax.swing.JRadioButton Image_5_Button;
    private javax.swing.JLabel Image_Display;
    private javax.swing.JLabel Image_Label;
    private javax.swing.JTextField Name_Field;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JRadioButton No_Image_Button;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField Value_Field;
    private javax.swing.JLabel Value_Label;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables

}

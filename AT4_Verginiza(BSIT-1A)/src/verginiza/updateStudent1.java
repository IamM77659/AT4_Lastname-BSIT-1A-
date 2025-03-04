/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package verginiza;
// imports relevant packages

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Students Account
 */
public class updateStudent1 extends javax.swing.JFrame {

    /**
     * Creates new form addStudent
     */
    // initiates relevant variables
    private static String name, pass, newname, newpass;
    private static final String filepath = "src\\verginiza\\data_1.json";
    private static JSONParser jsonParser = new JSONParser();
    private static JSONArray userlist = new JSONArray();
    private static JSONObject record = new JSONObject();

    public updateStudent1() {
        initComponents();
        setResizable(false); // cannot resize window
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namefield = new javax.swing.JTextField();
        newPassField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBTNadd = new javax.swing.JButton();
        JBTNcancel = new javax.swing.JButton();
        JClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passField = new javax.swing.JTextField();
        newNameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 50, 51));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        namefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namefieldActionPerformed(evt);
            }
        });

        newPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassFieldActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Name");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Password");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Student");

        JBTNadd.setBackground(new java.awt.Color(0, 255, 255));
        JBTNadd.setForeground(new java.awt.Color(0, 0, 0));
        JBTNadd.setText("Update");
        JBTNadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNaddActionPerformed(evt);
            }
        });

        JBTNcancel.setText("Cancel");
        JBTNcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNcancelActionPerformed(evt);
            }
        });

        JClear.setText("Clear");
        JClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClear(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter New Password");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter New Name");

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });

        newNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(27, 27, 27)))
                            .addComponent(jLabel5))
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(JBTNcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namefield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(newNameField))))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(JBTNadd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(newNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTNadd)
                    .addComponent(JBTNcancel)
                    .addComponent(JClear))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassFieldActionPerformed

    private void namefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namefieldActionPerformed

    private void JBTNaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNaddActionPerformed
        // overwrites details when pressed
        /*
        If no match is found, displays an error message indicating the student was not found.
         */
        //Retrieves the entered username and password from input fields.  
        name = namefield.getText();
        pass = passField.getText();

        boolean found;

        //Handles file reading and JSON parsing errors with error messages. 
        try {
            //Attempts to check the file for existing data.  
            filecheck();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error reading the file. Please check if the file exists and is accessible.",
                    "File Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error parsing JSON data. The file might be corrupted or improperly formatted.",
                    "Data Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        // If both fields are empty, prompts the user to enter login details.  
        if (name.isBlank() && pass.isBlank()) {
            JOptionPane.showMessageDialog(null, "Please enter username and password to update.", "Enter username and password", JOptionPane.WARNING_MESSAGE);

            //Otherwise, searches for a matching username and password in the user list.  
        } else {

            /* If a match is found:  
        - Retrieves the new username and password from input fields.  
        - If the new details are empty, prompts the user to enter valid details.  
            if the user wants to retain the details, it prompts the user to enter the
            same details.
        - Updates the username and password in the JSON record.  
        - Saves the updated data and redirects to the menu.  */
            found = false;
            for (int a = 0; a < userlist.size(); a++) {
                JSONObject userobject = (JSONObject) userlist.get(a);
                String foundusname = (String) userobject.get("username");
                String foundpass = (String) userobject.get("password");

                if (name.equals(foundusname) && pass.equals(foundpass)) {
                    newname = newNameField.getText();
                    newpass = newPassField.getText();

                    if (newname.isBlank() || newpass.isBlank()) {
                        JOptionPane.showMessageDialog(null, "Please enter new details to update (or enter the "
                                + "current details if you want to keep the current details).",
                                "Enter details", JOptionPane.WARNING_MESSAGE);

                        return;
                    } else if (newname.isBlank() || newpass.isBlank()) {
                        JOptionPane.showMessageDialog(null, "Please enter new details to update (or enter the "
                                + "current details if you want to keep the current details).",
                                "Enter details", JOptionPane.WARNING_MESSAGE);
                        return;
                    } else {
                        userobject.put("password", newpass);
                        userobject.put("username", newname);

                        record.put("data", userlist);
                        found = true;
                        break;

                    }

                }

            }
            if (found) {
                try {
                    save();
                    Menu A = new Menu();
                    dispose();
                    A.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(updateStudent1.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Student not found. Please enter the correct details to update.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }


    }//GEN-LAST:event_JBTNaddActionPerformed

    private void JBTNcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNcancelActionPerformed
        //cancels this window
        Menu a = new Menu();
        dispose();
        a.setVisible(true);
    }//GEN-LAST:event_JBTNcancelActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void JClear(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClear
        /*clears all field of details 
        clears:
            -name field
            -password field
            -new name field
            -new password field
         */

        namefield.setText("");
        passField.setText("");
        newNameField.setText("");
        newPassField.setText("");
    }//GEN-LAST:event_JClear

    private void newNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(updateStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateStudent1().setVisible(true);
            }
        });
    }

    public static void filecheck() throws FileNotFoundException, IOException, ParseException {
           //checks for existing JSON file
        FileReader reader = new FileReader(filepath);

        if (reader.ready()) {
            Scanner s = new Scanner(reader);
            String line = "";

            while (s.hasNext()) {
                line = line + s.nextLine();
            }

            if (!line.equals("")) {
                reader.close();
                FileReader reader2 = new FileReader(filepath);
                record = (JSONObject) jsonParser.parse(reader2);
                userlist = (JSONArray) record.get("data");
                reader2.close();
            }
        }
    }

    public static void save() throws IOException {
        //saves new data to JSON file
        try {
            FileWriter file = new FileWriter(filepath);
            file.write(record.toJSONString());
            file.close();
            JOptionPane.showMessageDialog(null, "Updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to update. " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTNadd;
    private javax.swing.JButton JBTNcancel;
    private javax.swing.JButton JClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField newNameField;
    private javax.swing.JTextField newPassField;
    private javax.swing.JTextField passField;
    // End of variables declaration//GEN-END:variables

}

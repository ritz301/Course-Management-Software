/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemanagementsoftware;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ritz619
 */
public class DisplayDetails extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form DisplayDetails
     */
    private MainGUI mg;
    private DisplayDetails dd;
    private ArrayList<ArrayList<Courses>> cpar;
    private int index;
    private int sindex;

    public void setDd(DisplayDetails dd) {
        this.dd = dd;
    }
    public void setMg(MainGUI mg) {
        this.mg = mg;
    }

    public void setCpar(ArrayList<ArrayList<Courses>> cpar) {
        this.cpar = cpar;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSindex(int sindex) {
        this.sindex = sindex;
    }
    
    public DisplayDetails() {
        this.setTitle("Course Details");
        initComponents();
        details.setContentType( "text/html" );
    }
    
    public void run(){
        Courses o = cpar.get(sindex).get(index);
        String s = "<html>";
        s = s.concat("Course Name: " + o.getName() + "<br>");
        s = s.concat("Start Date: " + o.getDate() + "<br>");
        s = s.concat("Duration: " + o.getDuration()+ "<br>");
        s = s.concat("Fees: "+ o.getFee() + "<br><br>");
        s = s.concat("<b>Coordinator Details:</b><br>Name: " + o.getFaculty().getName() + "<br>");
        s = s.concat("Department: " + o.getFaculty().getDepartment() + "<br>");
        s = s.concat("Address: " + o.getFaculty().getAddress() + "<br>");
        s = s.concat("Mobile No: " + o.getFaculty().getMobileNo() + "<br>");
        s = s.concat("E-mail: " + o.getFaculty().getEmail() + "<br><br>");
        int i = 0;
        for(Faculty e : o.getFacs()){
            if(i==0)
                s = s.concat("<b>Instructor Details:</b><br>");
            i++;
            s = s.concat(i +". Name: " + e.getName() + "<br>");
            s = s.concat("   Department: " + e.getDepartment() + "<br>");
            s = s.concat("   Address: " + e.getAddress() + "<br>");
            s = s.concat("   Mobile No: " + e.getMobileNo() + "<br>");
            s = s.concat("   E-mail: " + e.getEmail() + "<br>");
        }
        i = 0;
        s = s.concat("<br>");
        for(Participant e : o.getParts()){
            if(i==0)
                s = s.concat("<b>Participant Details:</b><br>");
            i++;
            s = s.concat(i +". Name: " + e.getName() + "<br>");
            s = s.concat("   Organisation Name: " + e.getOrgName() + "<br>");
            s = s.concat("   Address: " + e.getAddress() + "<br>");
            s = s.concat("   Mobile No: " + e.getMobileNo() + "<br>");
            s = s.concat("   E-mail: " + e.getEmail() + "<br>");
        }
        details.setText(s  + "</html>");
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
        details = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        details.setEditable(false);
        jScrollPane1.setViewportView(details);

        jButton2.setText("Back to main menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton2)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dd.dispose();
        mg.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane details;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
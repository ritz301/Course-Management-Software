/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursemanagementsoftware;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ritz619
 */
public class Change extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form Change
     */
    private int mode;
    private MainGUI mg;
    private Change cmn;
    private ArrayList<ArrayList<Courses>> cpar;
    private int sindex;
    private int index;
    private AddDel ad;
    private ChangeDetails cd;
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void setCd(ChangeDetails cd) {
        this.cd = cd;
    }

    public void setAd(AddDel ad) {
        this.ad = ad;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSindex(int sindex) {
        this.sindex = sindex;
    }

    public void setCpar(ArrayList<ArrayList<Courses>> cpar) {
        this.cpar = cpar;
        Courses o = cpar.get(sindex).get(index);
        switch(mode){
            case 3:
                name.setText(o.getFaculty().getName());
                dep.setText(o.getFaculty().getDepartment());
                address.setText(o.getFaculty().getAddress());
                mobile.setText(o.getFaculty().getMobileNo());
                email.setText(o.getFaculty().getEmail());
                break;
            case 4:
                Faculty s = o.getFacs().get(num);
                name.setText(s.getName());
                dep.setText(s.getDepartment());
                address.setText(s.getAddress());
                mobile.setText(s.getMobileNo());
                email.setText(s.getEmail());
                break;
            case 5:
                Participant p = o.getParts().get(num);
                name.setText(p.getName());
                dep.setText(p.getOrgName());
                address.setText(p.getAddress());
                mobile.setText(p.getMobileNo());
                email.setText(p.getEmail());
            default:
                break;
        }
    }

    public void setMg(MainGUI mg) {
        this.mg = mg;
    }

    public void setCmn(Change cmn) {
        this.cmn = cmn;
    }

    public void setMode(int mode) {
        this.mode = mode;
        switch(mode){
            case 1:
                jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Faculty Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18)));
                jButton3.setText("Add");
                break;
            case 2:
                jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Participant Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18)));
                jButton3.setText("Add");
                jLabel2.setText("Organisation Name: ");
                break;
            case 3:
                break;
            case 4:
                jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Instructor Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18)));
                break;
            case 5:
                jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Participant Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18)));
                jLabel2.setText("Organisation Name: ");
            default:
                break;
        }
    }
    
    public Change() {
        initComponents();
    }

    public boolean MobileNoChecker(String str){
        int x;
        if(str.isEmpty() || str.length() < 6 || str.length() > 15)
            return false;
        for(int j = 0 ; j < str.length() ; j++)
        {
            x = (int)str.charAt(j);
            if( x < 48 || x > 57 )
            return false;    
        }
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        dep = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Coordinators Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        jLabel1.setText("Name:");

        jLabel2.setText("Department:");

        jLabel3.setText("Address:");

        jLabel4.setText("Mobile No:");

        jLabel5.setText("Email:");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(dep, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(mobile)
                            .addComponent(email))))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cmn.dispose();
        if(mode<3)  
            ad.setVisible(true);
        else
            cd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Courses o = cpar.get(sindex).get(index);
        String Name = name.getText();
        if(Name.isEmpty()){
            JOptionPane.showMessageDialog(cmn, "Enter a name");
            return;
        }
        String Dep = dep.getText();
        if(Dep.isEmpty()){
            JOptionPane.showMessageDialog(cmn, "Enter a department");
            return;
        }
        String Address = address.getText();
        if(Address.isEmpty()){
            JOptionPane.showMessageDialog(cmn, "Enter an address");
            return;
        }
        String Mobile = mobile.getText();
        if(!MobileNoChecker(Mobile)){
            JOptionPane.showMessageDialog(cmn, "Enter a valid mobile number (6-15 digits)");
            return;
        }
        String Email = email.getText();
        if(!Email.contains("@")){
            JOptionPane.showMessageDialog(cmn, "Enter a valid email");
            return;
        }
        switch(mode){
            case 1:
                Faculty f = new Faculty();
                f.setName(Name);
                f.setDepartment(Dep);
                f.setEmail(Email);
                f.setAddress(Address);
                f.setMobileNo(Mobile);
                o.getFacs().add(f);
                ad.setVisible(true);
                break;
            case 2:
                Participant p = new Participant();
                p.setName(Name);
                p.setOrgName(Dep);
                p.setEmail(Email);
                p.setAddress(Address);
                p.setMobileNo(Mobile);
                o.getParts().add(p);
                ad.setVisible(true);
                break;
            case 3:
                Faculty e = o.getFaculty();
                e.setName(Name);
                e.setDepartment(Dep);
                e.setAddress(Address);
                e.setMobileNo(Mobile);
                e.setEmail(Email);
                cd.setVisible(true);
                break;
            case 4:
                Faculty h = o.getFacs().get(num);
                h.setName(Name);
                h.setDepartment(Dep);
                h.setAddress(Address);
                h.setMobileNo(Mobile);
                h.setEmail(Email);
                cd.setVisible(true);
                break;
            case 5:
                Participant y = o.getParts().get(num);
                y.setName(Name);
                y.setOrgName(Dep);
                y.setAddress(Address);
                y.setEmail(Email);
                y.setMobileNo(Mobile);
                cd.setVisible(true);
            default:
                break;
        }
        cmn.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField dep;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables

}

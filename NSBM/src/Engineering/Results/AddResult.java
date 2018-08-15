package Engineering.Results;

import base.Subjects;
import javax.swing.JOptionPane;

public class AddResult extends javax.swing.JFrame {

    

    AddResultOperation dbadd=new AddResultOperation();
    
    public AddResult() {
        initComponents();
    }
    
    void setFields(ESubjects bs){
        txtreg1.setText(new Integer(bs.getRegid()).toString());
        txtname.setText(bs.getStname());
        txtsub1.setText(bs.getSub1());
        txtsub2.setText(bs.getSub2());
        txtsub3.setText(bs.getSub3());
        txtsub4.setText(bs.getSub4());
        txtsub5.setText(bs.getSub5());
        txtsub6.setText(bs.getSub6());
        txtsub7.setText(bs.getSub7());
        
    }

    void clearFields(){
        txtsub1mark.setText("");
        txtsub2mark.setText("");
        txtsub3mark.setText("");
        txtsub4mark.setText("");
        txtsub5mark.setText("");
        txtsub6mark.setText("");
        txtsub7mark.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtsub1 = new javax.swing.JTextField();
        txtreg = new javax.swing.JTextField();
        txtsub6 = new javax.swing.JTextField();
        txtsub4 = new javax.swing.JTextField();
        txtsub5 = new javax.swing.JTextField();
        txtsub3 = new javax.swing.JTextField();
        txtsub2 = new javax.swing.JTextField();
        txtsub7 = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        txtreg1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox<>();
        cbSem = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtsub1mark = new javax.swing.JTextField();
        txtsub2mark = new javax.swing.JTextField();
        txtsub3mark = new javax.swing.JTextField();
        txtsub4mark = new javax.swing.JTextField();
        txtsub5mark = new javax.swing.JTextField();
        txtsub6mark = new javax.swing.JTextField();
        txtsub7mark = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtsub1.setEditable(false);

        txtreg.setEditable(false);
        txtreg.setText("Reg ID");

        txtsub6.setEditable(false);

        txtsub4.setEditable(false);

        txtsub5.setEditable(false);

        txtsub3.setEditable(false);

        txtsub2.setEditable(false);

        txtsub7.setEditable(false);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtreg1.setEditable(false);

        jLabel1.setText("Year");

        jLabel2.setText("Semester");

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        cbSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jLabel3.setText("Name");

        txtname.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtreg, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtreg1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtsub6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub7, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsub1mark)
                            .addComponent(txtsub2mark)
                            .addComponent(txtsub3mark)
                            .addComponent(txtsub4mark)
                            .addComponent(txtsub5mark)
                            .addComponent(txtsub6mark)
                            .addComponent(txtsub7mark)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtname))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubmit)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtreg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsub1mark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsub2mark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtsub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsub5mark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsub7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtsub3mark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsub4mark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(txtsub6mark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsub7mark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Eresult br=new Eresult();
        br.setResultid(0);
        br.setRegid(new Integer(txtreg1.getText()).intValue());
        br.setStname(txtname.getText());
        br.setSemester(new Integer(cbSem.getSelectedItem().toString()).intValue());
        br.setYear(new Integer(cbYear.getSelectedItem().toString()).intValue());
        br.setSub1(txtsub1.getText());
        br.setSub1mark(new Integer(txtsub1mark.getText()).intValue());
        int mark1=new Integer(txtsub1mark.getText()).intValue();
        if(mark1>=90){
            br.setSub1result("A+");
        }else if(mark1<90 && mark1>=80){
            br.setSub1result("A");
        }else if(mark1<80 && mark1>=70){
            br.setSub1result("A-");
        }else if(mark1<70 && mark1>=65){
            br.setSub1result("B+");
        }else if(mark1<65 && mark1>=60){
            br.setSub1result("B");
        }else if(mark1<60 && mark1>=55){
            br.setSub1result("B-");
        }else if(mark1<55 && mark1>=50){
            br.setSub1result("C+");
        }else if(mark1<50 && mark1>=45){
            br.setSub1result("C");
        }else if(mark1<45 && mark1>=40){
            br.setSub1result("C-");
        }else if(mark1<40 && mark1>=35){
            br.setSub1result("D+");
        }else if(mark1<35 && mark1>=30){
            br.setSub1result("D");
        }else if(mark1<30 && mark1>=25){
            br.setSub1result("D-");
        }else{
            br.setSub1result("E");
        }
        
        /*br.setSub1(txtsub1.getText());
        br.setSub1mark(new Integer(txtsub1mark.getText()).intValue());
        int mark1=new Integer(txtsub1mark.getText()).intValue();
        if(mark1>=90){
            br.setSub1result("A+");
        }else if(mark1<90 && mark1>=80){
            br.setSub1result("A");
        }else if(mark1<80 && mark1>=70){
            br.setSub1result("A-");
        }else if(mark1<70 && mark1>=65){
            br.setSub1result("B+");
        }else if(mark1<65 && mark1>=60){
            br.setSub1result("B");
        }else if(mark1<60 && mark1>=55){
            br.setSub1result("B-");
        }else if(mark1<55 && mark1>=50){
            br.setSub1result("C+");
        }else if(mark1<50 && mark1>=45){
            br.setSub1result("C");
        }else if(mark1<45 && mark1>=40){
            br.setSub1result("C-");
        }else if(mark1<40 && mark1>=35){
            br.setSub1result("D+");
        }else if(mark1<35 && mark1>=30){
            br.setSub1result("D");
        }else if(mark1<30 && mark1>=25){
            br.setSub1result("D-");
        }else{
            br.setSub1result("E");
        }*/
        
        br.setSub2(txtsub2.getText());
        br.setSub2mark(new Integer(txtsub2mark.getText()).intValue());
        int mark2=new Integer(txtsub2mark.getText()).intValue();
        if(mark2>=90){
            br.setSub2result("A+");
        }else if(mark2<90 && mark2>=80){
            br.setSub2result("A");
        }else if(mark2<80 && mark2>=70){
            br.setSub2result("A-");
        }else if(mark2<70 && mark2>=65){
            br.setSub2result("B+");
        }else if(mark2<65 && mark2>=60){
            br.setSub2result("B");
        }else if(mark2<60 && mark2>=55){
            br.setSub2result("B-");
        }else if(mark2<55 && mark2>=50){
            br.setSub2result("C+");
        }else if(mark2<50 && mark2>=45){
            br.setSub2result("C");
        }else if(mark2<45 && mark2>=40){
            br.setSub2result("C-");
        }else if(mark2<40 && mark2>=35){
            br.setSub2result("D+");
        }else if(mark2<35 && mark2>=30){
            br.setSub2result("D");
        }else if(mark2<30 && mark2>=25){
            br.setSub2result("D-");
        }else{
            br.setSub2result("E");
        }
        
        br.setSub3(txtsub3.getText());
        br.setSub3mark(new Integer(txtsub3mark.getText()).intValue());
        int mark3=new Integer(txtsub3mark.getText()).intValue();
        if(mark3>=90){
            br.setSub3result("A+");
        }else if(mark3<90 && mark3>=80){
            br.setSub3result("A");
        }else if(mark3<80 && mark3>=70){
            br.setSub3result("A-");
        }else if(mark3<70 && mark3>=65){
            br.setSub3result("B+");
        }else if(mark3<65 && mark3>=60){
            br.setSub3result("B");
        }else if(mark3<60 && mark3>=55){
            br.setSub3result("B-");
        }else if(mark3<55 && mark3>=50){
            br.setSub3result("C+");
        }else if(mark3<50 && mark3>=45){
            br.setSub3result("C");
        }else if(mark3<45 && mark3>=40){
            br.setSub3result("C-");
        }else if(mark3<40 && mark3>=35){
            br.setSub3result("D+");
        }else if(mark3<35 && mark3>=30){
            br.setSub3result("D");
        }else if(mark3<30 && mark3>=25){
            br.setSub3result("D-");
        }else{
            br.setSub3result("E");
        }
        
        br.setSub4(txtsub4.getText());
        br.setSub4mark(new Integer(txtsub4mark.getText()).intValue());
        int mark4=new Integer(txtsub4mark.getText()).intValue();
        if(mark4>=90){
            br.setSub4result("A+");
        }else if(mark4<90 && mark4>=80){
            br.setSub4result("A");
        }else if(mark4<80 && mark4>=70){
            br.setSub4result("A-");
        }else if(mark4<70 && mark4>=65){
            br.setSub4result("B+");
        }else if(mark4<65 && mark4>=60){
            br.setSub4result("B");
        }else if(mark4<60 && mark4>=55){
            br.setSub4result("B-");
        }else if(mark4<55 && mark4>=50){
            br.setSub4result("C+");
        }else if(mark4<50 && mark4>=45){
            br.setSub4result("C");
        }else if(mark4<45 && mark4>=40){
            br.setSub4result("C-");
        }else if(mark4<40 && mark4>=35){
            br.setSub4result("D+");
        }else if(mark4<35 && mark4>=30){
            br.setSub4result("D");
        }else if(mark4<30 && mark4>=25){
            br.setSub4result("D-");
        }else{
            br.setSub4result("E");
        }
        
        br.setSub5(txtsub5.getText());
        br.setSub5mark(new Integer(txtsub5mark.getText()).intValue());
        int mark5=new Integer(txtsub1mark.getText()).intValue();
        if(mark5>=90){
            br.setSub5result("A+");
        }else if(mark5<90 && mark5>=80){
            br.setSub5result("A");
        }else if(mark5<80 && mark5>=70){
            br.setSub5result("A-");
        }else if(mark5<70 && mark5>=65){
            br.setSub5result("B+");
        }else if(mark5<65 && mark5>=60){
            br.setSub5result("B");
        }else if(mark5<60 && mark5>=55){
            br.setSub5result("B-");
        }else if(mark5<55 && mark5>=50){
            br.setSub5result("C+");
        }else if(mark5<50 && mark5>=45){
            br.setSub5result("C");
        }else if(mark5<45 && mark5>=40){
            br.setSub5result("C-");
        }else if(mark5<40 && mark5>=35){
            br.setSub5result("D+");
        }else if(mark5<35 && mark5>=30){
            br.setSub5result("D");
        }else if(mark5<30 && mark5>=25){
            br.setSub5result("D-");
        }else{
            br.setSub5result("E");
        }
        
        br.setSub6(txtsub6.getText());
        br.setSub6mark(new Integer(txtsub6mark.getText()).intValue());
        int mark6=new Integer(txtsub6mark.getText()).intValue();
        if(mark6>=90){
            br.setSub6result("A+");
        }else if(mark6<90 && mark6>=80){
            br.setSub6result("A");
        }else if(mark6<80 && mark6>=70){
            br.setSub6result("A-");
        }else if(mark6<70 && mark6>=65){
            br.setSub6result("B+");
        }else if(mark6<65 && mark6>=60){
            br.setSub6result("B");
        }else if(mark6<60 && mark6>=55){
            br.setSub6result("B-");
        }else if(mark6<55 && mark6>=50){
            br.setSub6result("C+");
        }else if(mark6<50 && mark6>=45){
            br.setSub6result("C");
        }else if(mark6<45 && mark6>=40){
            br.setSub6result("C-");
        }else if(mark6<40 && mark6>=35){
            br.setSub6result("D+");
        }else if(mark6<35 && mark6>=30){
            br.setSub6result("D");
        }else if(mark6<30 && mark6>=25){
            br.setSub6result("D-");
        }else{
            br.setSub1result("E");
        }
        
        br.setSub7(txtsub7.getText());
        br.setSub7mark(new Integer(txtsub7mark.getText()).intValue());
        int mark7=new Integer(txtsub7mark.getText()).intValue();
        if(mark7>=90){
            br.setSub1result("A+");
        }else if(mark7<90 && mark7>=80){
            br.setSub7result("A");
        }else if(mark7<80 && mark7>=70){
            br.setSub7result("A-");
        }else if(mark7<70 && mark7>=65){
            br.setSub7result("B+");
        }else if(mark7<65 && mark7>=60){
            br.setSub7result("B");
        }else if(mark7<60 && mark7>=55){
            br.setSub7result("B-");
        }else if(mark7<55 && mark7>=50){
            br.setSub7result("C+");
        }else if(mark7<50 && mark7>=45){
            br.setSub7result("C");
        }else if(mark7<45 && mark7>=40){
            br.setSub7result("C-");
        }else if(mark7<40 && mark7>=35){
            br.setSub7result("D+");
        }else if(mark7<35 && mark7>=30){
            br.setSub7result("D");
        }else if(mark7<30 && mark7>=25){
            br.setSub7result("D-");
        }else{
            br.setSub7result("E");
        }
        
        if(dbadd.addResult(br)){
            JOptionPane.showMessageDialog(this, "Successfully added!!!");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Error !!!");
            clearFields();
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(AddResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbSem;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtreg;
    private javax.swing.JTextField txtreg1;
    private javax.swing.JTextField txtsub1;
    private javax.swing.JTextField txtsub1mark;
    private javax.swing.JTextField txtsub2;
    private javax.swing.JTextField txtsub2mark;
    private javax.swing.JTextField txtsub3;
    private javax.swing.JTextField txtsub3mark;
    private javax.swing.JTextField txtsub4;
    private javax.swing.JTextField txtsub4mark;
    private javax.swing.JTextField txtsub5;
    private javax.swing.JTextField txtsub5mark;
    private javax.swing.JTextField txtsub6;
    private javax.swing.JTextField txtsub6mark;
    private javax.swing.JTextField txtsub7;
    private javax.swing.JTextField txtsub7mark;
    // End of variables declaration//GEN-END:variables
}

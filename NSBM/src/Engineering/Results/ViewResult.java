
package Engineering.Results;


public class ViewResult extends javax.swing.JFrame {

    AddResultOperation aro = new AddResultOperation();
    
    public ViewResult() {
        initComponents();
    }

    
    void setFields(Eresult bs) {
        txtreg1.setText(new Integer(bs.getRegid()).toString());
        txtname.setText(bs.getStname());
        txtsub1.setText(bs.getSub1());
        txtsub2.setText(bs.getSub2());
        txtsub3.setText(bs.getSub3());
        txtsub4.setText(bs.getSub4());
        txtsub5.setText(bs.getSub5());
        txtsub6.setText(bs.getSub6());
        txtsub7.setText(bs.getSub7());
        txtsub1mark.setText(new Integer(bs.getSub1mark()).toString());
        txtsub2mark.setText(new Integer(bs.getSub2mark()).toString());
        txtsub3mark.setText(new Integer(bs.getSub3mark()).toString());
        txtsub4mark.setText(new Integer(bs.getSub4mark()).toString());
        txtsub5mark.setText(new Integer(bs.getSub5mark()).toString());
        txtsub6mark.setText(new Integer(bs.getSub6mark()).toString());
        txtsub7mark.setText(new Integer(bs.getSub7mark()).toString());

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

        txtreg1.setEditable(false);

        jLabel1.setText("Year");

        jLabel2.setText("Semester");

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        cbSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jLabel3.setText("Name");

        txtname.setEditable(false);

        txtsub1mark.setEditable(false);

        txtsub2mark.setEditable(false);

        txtsub3mark.setEditable(false);

        txtsub4mark.setEditable(false);

        txtsub5mark.setEditable(false);

        txtsub6mark.setEditable(false);

        txtsub7mark.setEditable(false);

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
                        .addComponent(txtname)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(52, 52, 52))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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

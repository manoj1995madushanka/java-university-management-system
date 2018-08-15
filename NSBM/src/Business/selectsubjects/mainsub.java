package Business.selectsubjects;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
final JComboBox genderComboBox = null;
final JComboBox itemComboBox = null;

final DefaultComboBoxModel hisModel = new DefaultComboBoxModel(new String[]{"a", "b", "c"});
final DefaultComboBoxModel herModel = new DefaultComboBoxModel(new String[]{"x", "y", "z"});

genderComboBox.addActionListener (new ActionListener () {
    public void actionPerformed(ActionEvent e) {
        if ("Men".equals(genderComboBox.getSelectedItem())){
            itemComboBox.setModel(hisModel);    
        } else {
            itemComboBox.setModel(herModel);    
        }
    }
});
 */
public class mainsub extends javax.swing.JFrame {

    //final JComboBox cbsub4 = null;
    //final JComboBox cbsub5 = null;
    //final JComboBox cbsub6 = null;
    //final JComboBox cbsub7 = null;
    dbops db = new dbops();

    final DefaultComboBoxModel y1s1 = new DefaultComboBoxModel(new String[]{"BY1S1Item1", "BY1S1Item2", "BY1S1Item3"});
    final DefaultComboBoxModel y1s2 = new DefaultComboBoxModel(new String[]{"BY1S2Item1", "BY1S2Item2", "BY1S2Item3"});
    final DefaultComboBoxModel y2s1 = new DefaultComboBoxModel(new String[]{"BY2S1Item1", "BY2S1Item2", "BY2S1Item3"});
    final DefaultComboBoxModel y2s2 = new DefaultComboBoxModel(new String[]{"BY2S2Item1", "BY2S2Item2", "BY2S2Item3"});
    final DefaultComboBoxModel y3s1 = new DefaultComboBoxModel(new String[]{"BY3S1Item1", "BY3S1Item2", "BY3S1Item3"});
    final DefaultComboBoxModel y3s2 = new DefaultComboBoxModel(new String[]{"BY3S2Item1", "BY3S2Item2", "BY3S2Item3"});
    final DefaultComboBoxModel y4s1 = new DefaultComboBoxModel(new String[]{"BY4S1Item1", "BY4S1Item2", "BY4S1Item3"});
    final DefaultComboBoxModel y4s2 = new DefaultComboBoxModel(new String[]{"BY4S2Item1", "BY4S2Item2", "BY4S2Item3"});

    void setFields() {
        if ((cbYear.getSelectedItem().toString() == "1 year") && (cbSem.getSelectedItem().toString() == "semester 1")) {
            txtSub1.setText("Management Process");
            txtSub1Lec.setText("Dr. Jayantha Silva");
            txtSub1Amount.setText("3000");
            txtSub1Credit.setText("3");

            txtSub2.setText("Business Comunication");
            txtSub2Lec.setText("Dr. Sarath Fonseka");
            txtSub2Amount.setText("3000");
            txtSub2Credit.setText("3");

            txtSub3.setText("Financial Accounting");
            txtSub3Lec.setText("Dr. Saman Randunu");
            txtSub3Amount.setText("3000");
            txtSub3Credit.setText("3");

            //"Men".equals(genderComboBox.getSelectedItem())){
            cbsub4.setModel(y1s1);
            txtSub4Lec.setText("Dr. Warnakulasooriya");
            txtSub4Amount.setText("2500");
            txtSub4Credit.setText("2");

            cbSub5.setModel(y1s1);
            txtSub5Lec.setText("Dr. Premadasa");
            txtSub5Amount.setText("2500");
            txtSub5Credit.setText("2");

            cbSub6.setModel(y1s1);
            txtSub6Lec.setText("Dr. Tissera");
            txtSub6Amount.setText("2500");
            txtSub6Credit.setText("2");

            cbSub7.setModel(y1s1);
            txtSub7Lec.setText("Dr. Arumapperuma");
            txtSub7Amount.setText("2500");
            txtSub7Credit.setText("2");

        } else if ((cbYear.getSelectedItem().toString() == "1 year") && (cbSem.getSelectedItem().toString() == "semester 2")) {
            txtSub1.setText("Management Process");
            txtSub1Lec.setText("Dr. Jayantha Silva");
            txtSub1Amount.setText("3000");
            txtSub1Credit.setText("3");

            txtSub2.setText("Business Comunication");
            txtSub2Lec.setText("Dr. Sarath Fonseka");
            txtSub2Amount.setText("3000");
            txtSub2Credit.setText("3");

            txtSub3.setText("Financial Accounting");
            txtSub3Lec.setText("Dr. Saman Randunu");
            txtSub3Amount.setText("3000");
            txtSub3Credit.setText("3");

            //"Men".equals(genderComboBox.getSelectedItem())){
            cbsub4.setModel(y1s2);
            txtSub4Lec.setText("Dr. Warnakulasooriya");
            txtSub4Amount.setText("2500");
            txtSub4Credit.setText("2");

            cbSub5.setModel(y1s2);
            txtSub5Lec.setText("Dr. Premadasa");
            txtSub5Amount.setText("2500");
            txtSub5Credit.setText("2");

            cbSub6.setModel(y1s2);
            txtSub6Lec.setText("Dr. Tissera");
            txtSub6Amount.setText("2500");
            txtSub6Credit.setText("2");

            cbSub7.setModel(y1s2);
            txtSub7Lec.setText("Dr. Arumapperuma");
            txtSub7Amount.setText("2500");
            txtSub7Credit.setText("2");
        } else if ((cbYear.getSelectedItem().toString() == "2 year") && (cbSem.getSelectedItem().toString() == "semester 1")) {
            txtSub1.setText("Management Process");
            txtSub1Lec.setText("Dr. Jayantha Silva");
            txtSub1Amount.setText("3000");
            txtSub1Credit.setText("3");

            txtSub2.setText("Business Comunication");
            txtSub2Lec.setText("Dr. Sarath Fonseka");
            txtSub2Amount.setText("3000");
            txtSub2Credit.setText("3");

            txtSub3.setText("Financial Accounting");
            txtSub3Lec.setText("Dr. Saman Randunu");
            txtSub3Amount.setText("3000");
            txtSub3Credit.setText("3");

            //"Men".equals(genderComboBox.getSelectedItem())){
            cbsub4.setModel(y2s1);
            txtSub4Lec.setText("Dr. Warnakulasooriya");
            txtSub4Amount.setText("2500");
            txtSub4Credit.setText("2");

            cbSub5.setModel(y2s1);
            txtSub5Lec.setText("Dr. Premadasa");
            txtSub5Amount.setText("2500");
            txtSub5Credit.setText("2");

            cbSub6.setModel(y2s1);
            txtSub6Lec.setText("Dr. Tissera");
            txtSub6Amount.setText("2500");
            txtSub6Credit.setText("2");

            cbSub7.setModel(y2s1);
            txtSub7Lec.setText("Dr. Arumapperuma");
            txtSub7Amount.setText("2500");
            txtSub7Credit.setText("2");
        } else if ((cbYear.getSelectedItem().toString() == "2 year") && (cbSem.getSelectedItem().toString() == "semester 2")) {
            txtSub1.setText("Management Process");
            txtSub1Lec.setText("Dr. Jayantha Silva");
            txtSub1Amount.setText("3000");
            txtSub1Credit.setText("3");

            txtSub2.setText("Business Comunication");
            txtSub2Lec.setText("Dr. Sarath Fonseka");
            txtSub2Amount.setText("3000");
            txtSub2Credit.setText("3");

            txtSub3.setText("Financial Accounting");
            txtSub3Lec.setText("Dr. Saman Randunu");
            txtSub3Amount.setText("3000");
            txtSub3Credit.setText("3");

            //"Men".equals(genderComboBox.getSelectedItem())){
            cbsub4.setModel(y2s2);
            txtSub4Lec.setText("Dr. Warnakulasooriya");
            txtSub4Amount.setText("2500");
            txtSub4Credit.setText("2");

            cbSub5.setModel(y2s2);
            txtSub5Lec.setText("Dr. Premadasa");
            txtSub5Amount.setText("2500");
            txtSub5Credit.setText("2");

            cbSub6.setModel(y2s2);
            txtSub6Lec.setText("Dr. Tissera");
            txtSub6Amount.setText("2500");
            txtSub6Credit.setText("2");

            cbSub7.setModel(y2s2);
            txtSub7Lec.setText("Dr. Arumapperuma");
            txtSub7Amount.setText("2500");
            txtSub7Credit.setText("2");
        } else if ((cbYear.getSelectedItem().toString() == "3 year") && (cbSem.getSelectedItem().toString() == "semester 1")) {
            txtSub1.setText("Management Process");
            txtSub1Lec.setText("Dr. Jayantha Silva");
            txtSub1Amount.setText("3000");
            txtSub1Credit.setText("3");

            txtSub2.setText("Business Comunication");
            txtSub2Lec.setText("Dr. Sarath Fonseka");
            txtSub2Amount.setText("3000");
            txtSub2Credit.setText("3");

            txtSub3.setText("Financial Accounting");
            txtSub3Lec.setText("Dr. Saman Randunu");
            txtSub3Amount.setText("3000");
            txtSub3Credit.setText("3");

            //"Men".equals(genderComboBox.getSelectedItem())){
            cbsub4.setModel(y3s1);
            txtSub4Lec.setText("Dr. Warnakulasooriya");
            txtSub4Amount.setText("2500");
            txtSub4Credit.setText("2");

            cbSub5.setModel(y3s1);
            txtSub5Lec.setText("Dr. Premadasa");
            txtSub5Amount.setText("2500");
            txtSub5Credit.setText("2");

            cbSub6.setModel(y3s1);
            txtSub6Lec.setText("Dr. Tissera");
            txtSub6Amount.setText("2500");
            txtSub6Credit.setText("2");

            cbSub7.setModel(y3s1);
            txtSub7Lec.setText("Dr. Arumapperuma");
            txtSub7Amount.setText("2500");
            txtSub7Credit.setText("2");
        } else if ((cbYear.getSelectedItem().toString() == "3 year") && (cbSem.getSelectedItem().toString() == "semester 2")) {
            txtSub1.setText("Management Process");
            txtSub1Lec.setText("Dr. Jayantha Silva");
            txtSub1Amount.setText("3000");
            txtSub1Credit.setText("3");

            txtSub2.setText("Business Comunication");
            txtSub2Lec.setText("Dr. Sarath Fonseka");
            txtSub2Amount.setText("3000");
            txtSub2Credit.setText("3");

            txtSub3.setText("Financial Accounting");
            txtSub3Lec.setText("Dr. Saman Randunu");
            txtSub3Amount.setText("3000");
            txtSub3Credit.setText("3");

            //"Men".equals(genderComboBox.getSelectedItem())){
            cbsub4.setModel(y3s2);
            txtSub4Lec.setText("Dr. Warnakulasooriya");
            txtSub4Amount.setText("2500");
            txtSub4Credit.setText("2");

            cbSub5.setModel(y3s2);
            txtSub5Lec.setText("Dr. Premadasa");
            txtSub5Amount.setText("2500");
            txtSub5Credit.setText("2");

            cbSub6.setModel(y3s2);
            txtSub6Lec.setText("Dr. Tissera");
            txtSub6Amount.setText("2500");
            txtSub6Credit.setText("2");

            cbSub7.setModel(y3s2);
            txtSub7Lec.setText("Dr. Arumapperuma");
            txtSub7Amount.setText("2500");
            txtSub7Credit.setText("2");
        } else if ((cbYear.getSelectedItem().toString() == "4 year") && (cbSem.getSelectedItem().toString() == "semester 1")) {
            txtSub1.setText("Management Process");
            txtSub1Lec.setText("Dr. Jayantha Silva");
            txtSub1Amount.setText("3000");
            txtSub1Credit.setText("3");

            txtSub2.setText("Business Comunication");
            txtSub2Lec.setText("Dr. Sarath Fonseka");
            txtSub2Amount.setText("3000");
            txtSub2Credit.setText("3");

            txtSub3.setText("Financial Accounting");
            txtSub3Lec.setText("Dr. Saman Randunu");
            txtSub3Amount.setText("3000");
            txtSub3Credit.setText("3");

            //"Men".equals(genderComboBox.getSelectedItem())){
            cbsub4.setModel(y4s1);
            txtSub4Lec.setText("Dr. Warnakulasooriya");
            txtSub4Amount.setText("2500");
            txtSub4Credit.setText("2");

            cbSub5.setModel(y4s1);
            txtSub5Lec.setText("Dr. Premadasa");
            txtSub5Amount.setText("2500");
            txtSub5Credit.setText("2");

            cbSub6.setModel(y4s1);
            txtSub6Lec.setText("Dr. Tissera");
            txtSub6Amount.setText("2500");
            txtSub6Credit.setText("2");

            cbSub7.setModel(y4s1);
            txtSub7Lec.setText("Dr. Arumapperuma");
            txtSub7Amount.setText("2500");
            txtSub7Credit.setText("2");
        } else if ((cbYear.getSelectedItem().toString() == "4 year") && (cbSem.getSelectedItem().toString() == "semester 2")) {
            txtSub1.setText("Management Process");
            txtSub1Lec.setText("Dr. Jayantha Silva");
            txtSub1Amount.setText("3000");
            txtSub1Credit.setText("3");

            txtSub2.setText("Business Comunication");
            txtSub2Lec.setText("Dr. Sarath Fonseka");
            txtSub2Amount.setText("3000");
            txtSub2Credit.setText("3");

            txtSub3.setText("Financial Accounting");
            txtSub3Lec.setText("Dr. Saman Randunu");
            txtSub3Amount.setText("3000");
            txtSub3Credit.setText("3");

            //"Men".equals(genderComboBox.getSelectedItem())){
            cbsub4.setModel(y4s2);
            txtSub4Lec.setText("Dr. Warnakulasooriya");
            txtSub4Amount.setText("2500");
            txtSub4Credit.setText("2");

            cbSub5.setModel(y4s2);
            txtSub5Lec.setText("Dr. Premadasa");
            txtSub5Amount.setText("2500");
            txtSub5Credit.setText("2");

            cbSub6.setModel(y4s2);
            txtSub6Lec.setText("Dr. Tissera");
            txtSub6Amount.setText("2500");
            txtSub6Credit.setText("2");

            cbSub7.setModel(y4s2);
            txtSub7Lec.setText("Dr. Arumapperuma");
            txtSub7Amount.setText("2500");
            txtSub7Credit.setText("2");
        }
    }

    public mainsub() {
        initComponents();
        setFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSub1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSub2 = new javax.swing.JTextField();
        txtSub3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSub1Lec = new javax.swing.JTextField();
        txtSub2Lec = new javax.swing.JTextField();
        txtSub3Lec = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSub1Amount = new javax.swing.JTextField();
        txtSub2Amount = new javax.swing.JTextField();
        txtSub3Amount = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSub1Credit = new javax.swing.JTextField();
        txtSub2Credit = new javax.swing.JTextField();
        txtSub3Credit = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTotalCredit = new javax.swing.JTextField();
        txtTotalPayment = new javax.swing.JTextField();
        btnProceed = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cbSub6 = new javax.swing.JComboBox<>();
        cbSub5 = new javax.swing.JComboBox<>();
        cbsub4 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtSub4Lec = new javax.swing.JTextField();
        txtSub5Lec = new javax.swing.JTextField();
        txtSub6Lec = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtSub4Amount = new javax.swing.JTextField();
        txtSub5Amount = new javax.swing.JTextField();
        txtSub6Amount = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtSub4Credit = new javax.swing.JTextField();
        txtSub6Credit = new javax.swing.JTextField();
        txtSub5Credit = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtstname = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtregid = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cbSub7 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txtSub7Lec = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtSub7Amount = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtSub7Credit = new javax.swing.JTextField();
        cbYear = new javax.swing.JComboBox<>();
        cbSem = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Subject selecting and payment form for School of Business");

        jLabel2.setText("Subject 1");

        txtSub1.setEditable(false);
        txtSub1.setText("Management Process");

        jLabel3.setText("Subject 2");

        jLabel4.setText("Subject 3");

        txtSub2.setEditable(false);
        txtSub2.setText("Business Communication");

        txtSub3.setEditable(false);
        txtSub3.setText("Financial Accounting");

        jLabel6.setText("Lecturer");

        jLabel7.setText("Lecturer");

        jLabel8.setText("Lecturer");

        txtSub1Lec.setEditable(false);
        txtSub1Lec.setText("Dr.Jayantha Silva");

        txtSub2Lec.setEditable(false);
        txtSub2Lec.setText("Dr. Sarath Fonseka");

        txtSub3Lec.setEditable(false);
        txtSub3Lec.setText("Dr. Saman Randunu");

        jLabel10.setText("paymont amount");

        jLabel11.setText("paymont amount");

        jLabel13.setText("paymont amount");

        txtSub1Amount.setEditable(false);
        txtSub1Amount.setText("3000");

        txtSub2Amount.setEditable(false);
        txtSub2Amount.setText("3000");

        txtSub3Amount.setEditable(false);
        txtSub3Amount.setText("3000");

        jLabel14.setText("Credits");

        jLabel15.setText("Credits");

        jLabel16.setText("Credits");

        txtSub1Credit.setEditable(false);
        txtSub1Credit.setText("3");
        txtSub1Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub1CreditActionPerformed(evt);
            }
        });

        txtSub2Credit.setEditable(false);
        txtSub2Credit.setText("3");
        txtSub2Credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub2CreditActionPerformed(evt);
            }
        });

        txtSub3Credit.setEditable(false);
        txtSub3Credit.setText("3");

        jLabel18.setText("Total credit you will get from this semester");

        jLabel19.setText("Total payment value");

        jLabel20.setText("If information correct press PROCEED after student will recieve email");

        txtTotalCredit.setEditable(false);
        txtTotalCredit.setText("17");

        txtTotalPayment.setEditable(false);
        txtTotalPayment.setText("19000");

        btnProceed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nsbm/Images/Proceed1.jpg"))); // NOI18N
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        jLabel21.setText("Subject 4");

        jLabel22.setText("Subject 5");

        jLabel23.setText("Subject 6");

        jLabel25.setText("Lecturer");

        jLabel26.setText("Lecturer");

        jLabel27.setText("Lecturer");

        txtSub4Lec.setEditable(false);
        txtSub4Lec.setText("Dr.Test");
        txtSub4Lec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub4LecActionPerformed(evt);
            }
        });

        txtSub5Lec.setEditable(false);
        txtSub5Lec.setText("Dr.Test");
        txtSub5Lec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub5LecActionPerformed(evt);
            }
        });

        txtSub6Lec.setEditable(false);
        txtSub6Lec.setText("Dr.Text");
        txtSub6Lec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub6LecActionPerformed(evt);
            }
        });

        jLabel29.setText("paymont amount");

        jLabel30.setText("paymont amount");

        jLabel31.setText("paymont amount");

        txtSub4Amount.setEditable(false);
        txtSub4Amount.setText("2500");
        txtSub4Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub4AmountActionPerformed(evt);
            }
        });

        txtSub5Amount.setEditable(false);
        txtSub5Amount.setText("2500");
        txtSub5Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub5AmountActionPerformed(evt);
            }
        });

        txtSub6Amount.setEditable(false);
        txtSub6Amount.setText("2500");
        txtSub6Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub6AmountActionPerformed(evt);
            }
        });

        jLabel33.setText("Credits");

        jLabel34.setText("Credits");

        jLabel35.setText("Credits");

        txtSub4Credit.setEditable(false);
        txtSub4Credit.setText("2");

        txtSub6Credit.setEditable(false);
        txtSub6Credit.setText("2");

        txtSub5Credit.setEditable(false);
        txtSub5Credit.setText("2");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Student Name");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Reg ID(must same to student details)");

        jLabel24.setText("Subject 7");

        jLabel28.setText("Lecturer");

        txtSub7Lec.setEditable(false);
        txtSub7Lec.setText("Dr.Text");
        txtSub7Lec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub7LecActionPerformed(evt);
            }
        });

        jLabel32.setText("paymont amount");

        txtSub7Amount.setEditable(false);
        txtSub7Amount.setText("2500");
        txtSub7Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSub7AmountActionPerformed(evt);
            }
        });

        jLabel36.setText("Credits");

        txtSub7Credit.setEditable(false);
        txtSub7Credit.setText("2");

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 year", "2 year", "3 year", "4 year" }));
        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearActionPerformed(evt);
            }
        });

        cbSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "semester 1", "semester 2" }));
        cbSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSemActionPerformed(evt);
            }
        });

        jLabel5.setText("please select year");

        jLabel9.setText("please select semester");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(txtregid, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(txtstname))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addGap(10, 10, 10)
                                .addComponent(txtSub3Lec, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSub3Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSub3Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub2Lec, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub2Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub2Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub1Lec, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub1Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub1Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbSub7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSub7Lec))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbSub6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSub6Lec, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSub7Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSub7Credit))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSub6Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSub6Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub5Lec, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub5Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub5Credit))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbsub4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub4Lec, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub4Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel33)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSub4Credit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(8, 10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtregid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSub1Lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtSub1Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtSub1Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(txtSub2Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtSub2Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSub2Lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel11)
                        .addComponent(txtSub3Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSub3Lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtSub3Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cbsub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtSub4Lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtSub4Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(txtSub4Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cbSub5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtSub5Lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSub5Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtSub5Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cbSub6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtSub6Lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtSub6Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(txtSub6Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cbSub7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtSub7Lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(txtSub7Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(txtSub7Credit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnProceed)))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSub1CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub1CreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub1CreditActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        subs s1 = new subs();
        s1.setStid(0);
        s1.setStname(txtstname.getText());

        s1.setSub1(txtSub1.getText());
        s1.setSub1lec(txtSub1Lec.getText());
        s1.setSub1amount(new Integer(txtSub1Amount.getText()).intValue());
        s1.setSub1credit(new Integer(txtSub1Credit.getText()).intValue());

        s1.setSub2(txtSub2.getText());
        s1.setSub2lec(txtSub2Lec.getText());
        s1.setSub2amount(new Integer(txtSub2Amount.getText()).intValue());
        s1.setSub2credit(new Integer(txtSub2Credit.getText()).intValue());

        s1.setSub3(txtSub3.getText());
        s1.setSub3lec(txtSub3Lec.getText());
        s1.setSub3amount(new Integer(txtSub3Amount.getText()).intValue());
        s1.setSub3credit(new Integer(txtSub3Credit.getText()).intValue());

        s1.setSub4(cbsub4.getSelectedItem().toString());
        s1.setSub4lec(txtSub4Lec.getText());
        s1.setSub4amount(new Integer(txtSub4Amount.getText()).intValue());
        s1.setSub4credit(new Integer(txtSub4Credit.getText()).intValue());

        s1.setSub5(cbSub5.getSelectedItem().toString());
        s1.setSub5lec(txtSub5Lec.getText());
        s1.setSub5amount(new Integer(txtSub5Amount.getText()).intValue());
        s1.setSub5credit(new Integer(txtSub5Credit.getText()).intValue());

        s1.setSub6(cbSub6.getSelectedItem().toString());
        s1.setSub6lec(txtSub6Lec.getText());
        s1.setSub6amount(new Integer(txtSub6Amount.getText()).intValue());
        s1.setSub6credit(new Integer(txtSub6Credit.getText()).intValue());

        s1.setSub7(cbSub7.getSelectedItem().toString());
        s1.setSub7lec(txtSub7Lec.getText());
        s1.setSub7amount(new Integer(txtSub7Amount.getText()).intValue());
        s1.setSub7credit(new Integer(txtSub7Credit.getText()).intValue());

        s1.setRegid(new Integer(txtregid.getText()).intValue());

        s1.setTotalcredit(new Integer(txtTotalCredit.getText()).intValue());

        s1.setPaymentvalue(new Integer(txtTotalPayment.getText()).intValue());
        
        s1.setSub1result("pending");
        s1.setSub2result("pending");
        s1.setSub3result("pending");
        s1.setSub4result("pending");
        s1.setSub5result("pending");
        s1.setSub6result("pending");
        s1.setSub7result("pending");

        if ((cbYear.getSelectedItem().toString() == "1 year") && (cbSem.getSelectedItem().toString() == "semester 1")) {
            if (db.y1s1business(s1)) {
                JOptionPane.showMessageDialog(this, "Successfully inserted values!!! please go view and select subject of entered student...");
                //clearfields();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error occured hile entering values!!!");
                //clearfields();
            }
        }else if ((cbYear.getSelectedItem().toString() == "1 year") && (cbSem.getSelectedItem().toString() == "semester 2")) {
            if (db.y1s2business(s1)) {
                JOptionPane.showMessageDialog(this, "Successfully inserted values!!! please go view and select subject of entered student...");
                //clearfields();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error occured hile entering values!!!");
                //clearfields();
            }
        }else if ((cbYear.getSelectedItem().toString() == "2 year") && (cbSem.getSelectedItem().toString() == "semester 1")) {
            if (db.y2s1business(s1)) {
                JOptionPane.showMessageDialog(this, "Successfully inserted values!!! please go view and select subject of entered student...");
                //clearfields();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error occured hile entering values!!!");
                //clearfields();
            }
        }else if ((cbYear.getSelectedItem().toString() == "2 year") && (cbSem.getSelectedItem().toString() == "semester 2")) {
            if (db.y2s2business(s1)) {
                JOptionPane.showMessageDialog(this, "Successfully inserted values!!! please go view and select subject of entered student...");
                //clearfields();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error occured hile entering values!!!");
                //clearfields();
            }
        }else if ((cbYear.getSelectedItem().toString() == "3 year") && (cbSem.getSelectedItem().toString() == "semester 1")) {
            if (db.y3s1business(s1)) {
                JOptionPane.showMessageDialog(this, "Successfully inserted values!!! please go view and select subject of entered student...");
                //clearfields();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error occured hile entering values!!!");
                //clearfields();
            }
        }else if ((cbYear.getSelectedItem().toString() == "3 year") && (cbSem.getSelectedItem().toString() == "semester 2")) {
            if (db.y3s2business(s1)) {
                JOptionPane.showMessageDialog(this, "Successfully inserted values!!! please go view and select subject of entered student...");
                //clearfields();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error occured hile entering values!!!");
                //clearfields();
            }
        }else if ((cbYear.getSelectedItem().toString() == "4 year") && (cbSem.getSelectedItem().toString() == "semester 1")) {
            if (db.y4s1business(s1)) {
                JOptionPane.showMessageDialog(this, "Successfully inserted values!!! please go view and select subject of entered student...");
                //clearfields();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error occured hile entering values!!!");
                //clearfields();
            }
        }else if ((cbYear.getSelectedItem().toString() == "4 year") && (cbSem.getSelectedItem().toString() == "semester 2")) {
            if (db.y4s2business(s1)) {
                JOptionPane.showMessageDialog(this, "Successfully inserted values!!! please go view and select subject of entered student...");
                //clearfields();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Error occured hile entering values!!!");
                //clearfields();
            }
        }

    }//GEN-LAST:event_btnProceedActionPerformed

    private void txtSub4LecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub4LecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub4LecActionPerformed

    private void txtSub5LecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub5LecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub5LecActionPerformed

    private void txtSub6LecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub6LecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub6LecActionPerformed

    private void txtSub4AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub4AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub4AmountActionPerformed

    private void txtSub5AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub5AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub5AmountActionPerformed

    private void txtSub6AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub6AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub6AmountActionPerformed

    private void txtSub2CreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub2CreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub2CreditActionPerformed

    private void txtSub7LecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub7LecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub7LecActionPerformed

    private void txtSub7AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSub7AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSub7AmountActionPerformed

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
        setFields();
    }//GEN-LAST:event_cbYearActionPerformed

    private void cbSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSemActionPerformed
        setFields();
    }//GEN-LAST:event_cbSemActionPerformed

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
            java.util.logging.Logger.getLogger(mainsub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainsub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainsub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainsub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainsub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProceed;
    private javax.swing.JComboBox<String> cbSem;
    private javax.swing.JComboBox<String> cbSub5;
    private javax.swing.JComboBox<String> cbSub6;
    private javax.swing.JComboBox<String> cbSub7;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JComboBox<String> cbsub4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSub1;
    private javax.swing.JTextField txtSub1Amount;
    private javax.swing.JTextField txtSub1Credit;
    private javax.swing.JTextField txtSub1Lec;
    private javax.swing.JTextField txtSub2;
    private javax.swing.JTextField txtSub2Amount;
    private javax.swing.JTextField txtSub2Credit;
    private javax.swing.JTextField txtSub2Lec;
    private javax.swing.JTextField txtSub3;
    private javax.swing.JTextField txtSub3Amount;
    private javax.swing.JTextField txtSub3Credit;
    private javax.swing.JTextField txtSub3Lec;
    private javax.swing.JTextField txtSub4Amount;
    private javax.swing.JTextField txtSub4Credit;
    private javax.swing.JTextField txtSub4Lec;
    private javax.swing.JTextField txtSub5Amount;
    private javax.swing.JTextField txtSub5Credit;
    private javax.swing.JTextField txtSub5Lec;
    private javax.swing.JTextField txtSub6Amount;
    private javax.swing.JTextField txtSub6Credit;
    private javax.swing.JTextField txtSub6Lec;
    private javax.swing.JTextField txtSub7Amount;
    private javax.swing.JTextField txtSub7Credit;
    private javax.swing.JTextField txtSub7Lec;
    private javax.swing.JTextField txtTotalCredit;
    private javax.swing.JTextField txtTotalPayment;
    private javax.swing.JTextField txtregid;
    private javax.swing.JTextField txtstname;
    // End of variables declaration//GEN-END:variables
}

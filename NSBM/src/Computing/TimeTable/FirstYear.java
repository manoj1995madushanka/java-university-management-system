
package Computing.TimeTable;

import Computing.TimeTable.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JFrame;


public class FirstYear extends javax.swing.JFrame {

    ArrayList <timetable> checktable=new ArrayList();
    
    ArrayList <timetable> yr1sem1mon=new ArrayList();
    ArrayList <timetable> yr1sem1tue=new ArrayList(); 
    ArrayList <timetable> yr1sem1wed=new ArrayList();
    ArrayList <timetable> yr1sem1thu=new ArrayList();
    ArrayList <timetable> yr1sem1fri=new ArrayList();
    
    ArrayList <timetable> yr1sem2mon=new ArrayList();
    ArrayList <timetable> yr1sem2tue=new ArrayList(); 
    ArrayList <timetable> yr1sem2wed=new ArrayList();
    ArrayList <timetable> yr1sem2thu=new ArrayList();
    ArrayList <timetable> yr1sem2fri=new ArrayList();
    
    
    /*
    ArrayList <timetable> yr3sem1mon=new ArrayList();
    ArrayList <timetable> yr3sem1tue=new ArrayList(); 
    ArrayList <timetable> yr3sem1wed=new ArrayList();
    ArrayList <timetable> yr3sem1thu=new ArrayList();
    ArrayList <timetable> yr3sem1fri=new ArrayList();
    
    ArrayList <timetable> yr3sem2mon=new ArrayList();
    ArrayList <timetable> yr3sem2tue=new ArrayList(); 
    ArrayList <timetable> yr3sem2wed=new ArrayList();
    ArrayList <timetable> yr3sem2thu=new ArrayList();
    ArrayList <timetable> yr3sem2fri=new ArrayList();
    
    */
    
    CTimeTableDBOperation btdbo=new CTimeTableDBOperation();
    
    
    
    void loadSubjects(){    //for load the table data from studendetails class
        yr1sem1mon=btdbo.getvaluesyr1sem1mon();
        loadtable btt1=new loadtable(yr1sem1mon);
        tblyr1sem1mon.setModel(btt1);
        
        yr1sem1tue=btdbo.getvaluesyr1sem1tue();
        loadyr1sem1tue btt2=new loadyr1sem1tue(yr1sem1tue);
        tblyr1sem1tue.setModel(btt2);
        
        
        yr1sem1wed=btdbo.getvaluesyr1sem1wed();
        loadyr1sem1wed btt3=new loadyr1sem1wed(yr1sem1wed);
        tblyr1sem1wed.setModel(btt3);
        
        yr1sem1thu=btdbo.getvaluesyr1sem1thu();
        loadyr1sem1thu btt4=new loadyr1sem1thu(yr1sem1thu);
        tblyr1sem1thu.setModel(btt4);
        
        yr1sem1fri=btdbo.getvaluesyr1sem1fri();
        loadyr1sem1fri btt5=new loadyr1sem1fri(yr1sem1fri);
        tblyr1sem1fri.setModel(btt5);
        
        //for sem2
        
        yr1sem2mon=btdbo.getvaluesyr1sem2mon();
        loadyr1sem2mon btt6=new loadyr1sem2mon(yr1sem2mon);
        tblyr1sem2mon.setModel(btt6);
        
        yr1sem2tue=btdbo.getvaluesyr1sem2tue();
        loadyr1sem2tue btt7=new loadyr1sem2tue(yr1sem1tue);
        tblyr1sem2tue.setModel(btt7);
        
        yr1sem2wed=btdbo.getvaluesyr1sem2wed();
        loadyr1sem2wed btt8=new loadyr1sem2wed(yr1sem2wed);
        tblyr1sem2wed.setModel(btt8);
        
        yr1sem2thu=btdbo.getvaluesyr1sem2thu();
        loadyr1sem2thu btt9=new loadyr1sem2thu(yr1sem2thu);
        tblyr1sem2thu.setModel(btt9);
        
        yr1sem2fri=btdbo.getvaluesyr1sem2fri();
        loadyr1sem2fri btt10=new loadyr1sem2fri(yr1sem2fri);
        tblyr1sem2fri.setModel(btt10);
        
    }
    
    
    public FirstYear() {
        initComponents();
        loadSubjects();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblyr1sem1mon = new javax.swing.JTable();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblyr1sem1tue = new javax.swing.JTable();
        btnChange1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblyr1sem1wed = new javax.swing.JTable();
        btnChange2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblyr1sem1thu = new javax.swing.JTable();
        btnChange3 = new javax.swing.JButton();
        btnDelete3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblyr1sem1fri = new javax.swing.JTable();
        btnChange4 = new javax.swing.JButton();
        btnDelete4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblyr1sem2mon = new javax.swing.JTable();
        btnChange5 = new javax.swing.JButton();
        btnDelete5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblyr1sem2tue = new javax.swing.JTable();
        btnChange6 = new javax.swing.JButton();
        btnDelete6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblyr1sem2wed = new javax.swing.JTable();
        btnChange7 = new javax.swing.JButton();
        btnDelete7 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblyr1sem2thu = new javax.swing.JTable();
        btnChange8 = new javax.swing.JButton();
        btnDelete8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblyr1sem2fri = new javax.swing.JTable();
        btnChange9 = new javax.swing.JButton();
        btnDelete9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School of Business First Year Timetable");

        btnAdd.setText("ADD SUBJECT");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblyr1sem1mon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane1.setViewportView(tblyr1sem1mon);

        btnChange.setText("CHANGE");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE SLOT");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnChange)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Monday", jPanel3);

        tblyr1sem1tue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane2.setViewportView(tblyr1sem1tue);

        btnChange1.setText("CHANGE");
        btnChange1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange1ActionPerformed(evt);
            }
        });

        btnDelete1.setText("DELETE SLOT");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnChange1)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange1)
                    .addComponent(btnDelete1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Tuesday", jPanel4);

        tblyr1sem1wed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane3.setViewportView(tblyr1sem1wed);

        btnChange2.setText("CHANGE");
        btnChange2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange2ActionPerformed(evt);
            }
        });

        btnDelete2.setText("DELETE SLOT");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnChange2)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange2)
                    .addComponent(btnDelete2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Wednesday", jPanel5);

        tblyr1sem1thu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane4.setViewportView(tblyr1sem1thu);

        btnChange3.setText("CHANGE");
        btnChange3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange3ActionPerformed(evt);
            }
        });

        btnDelete3.setText("DELETE SLOT");
        btnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnChange3)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange3)
                    .addComponent(btnDelete3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Thursday", jPanel6);

        tblyr1sem1fri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane5.setViewportView(tblyr1sem1fri);

        btnChange4.setText("CHANGE");
        btnChange4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange4ActionPerformed(evt);
            }
        });

        btnDelete4.setText("DELETE SLOT");
        btnDelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnChange4)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange4)
                    .addComponent(btnDelete4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Friday", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sem1", jPanel2);

        tblyr1sem2mon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane6.setViewportView(tblyr1sem2mon);

        btnChange5.setText("CHANGE");
        btnChange5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange5ActionPerformed(evt);
            }
        });

        btnDelete5.setText("DELETE SLOT");
        btnDelete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnChange5)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange5)
                    .addComponent(btnDelete5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Monday", jPanel9);

        tblyr1sem2tue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane7.setViewportView(tblyr1sem2tue);

        btnChange6.setText("CHANGE");
        btnChange6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange6ActionPerformed(evt);
            }
        });

        btnDelete6.setText("DELETE SLOT");
        btnDelete6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnChange6)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange6)
                    .addComponent(btnDelete6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Tuesday", jPanel10);

        tblyr1sem2wed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane8.setViewportView(tblyr1sem2wed);

        btnChange7.setText("CHANGE");
        btnChange7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange7ActionPerformed(evt);
            }
        });

        btnDelete7.setText("DELETE SLOT");
        btnDelete7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnChange7)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange7)
                    .addComponent(btnDelete7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Wednesday", jPanel11);

        tblyr1sem2thu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane9.setViewportView(tblyr1sem2thu);

        btnChange8.setText("CHANGE");
        btnChange8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange8ActionPerformed(evt);
            }
        });

        btnDelete8.setText("DELETE SLOT");
        btnDelete8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btnChange8)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange8)
                    .addComponent(btnDelete8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Thursday", jPanel12);

        tblyr1sem2fri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Time", "Subject", "Location"
            }
        ));
        jScrollPane10.setViewportView(tblyr1sem2fri);

        btnChange9.setText("CHANGE");
        btnChange9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChange9ActionPerformed(evt);
            }
        });

        btnDelete9.setText("DELETE SLOT");
        btnDelete9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btnChange9)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange9)
                    .addComponent(btnDelete9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Friday", jPanel13);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sem 2", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addsubject as=new addsubject();
        as.setVisible(true);
        as.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        as.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem1mon.get(tblyr1sem1mon.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
        
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem1mon.get(tblyr1sem1mon.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnChange1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange1ActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem1tue.get(tblyr1sem1tue.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnChange1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem1tue.get(tblyr1sem1tue.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnChange2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange2ActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem1wed.get(tblyr1sem1wed.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnChange2ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem1mon.get(tblyr1sem1mon.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnChange3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange3ActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem1wed.get(tblyr1sem1wed.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnChange3ActionPerformed

    private void btnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete3ActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem1mon.get(tblyr1sem1mon.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDelete3ActionPerformed

    private void btnChange4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange4ActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem1thu.get(tblyr1sem1thu.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnChange4ActionPerformed

    private void btnDelete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete4ActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem1mon.get(tblyr1sem1mon.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDelete4ActionPerformed

    private void btnChange5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange5ActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem2fri.get(tblyr1sem2fri.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnChange5ActionPerformed

    private void btnDelete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete5ActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem2mon.get(tblyr1sem2mon.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDelete5ActionPerformed

    private void btnChange6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange6ActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem2tue.get(tblyr1sem2tue.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnChange6ActionPerformed

    private void btnDelete6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete6ActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem1mon.get(tblyr1sem1mon.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDelete6ActionPerformed

    private void btnChange7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange7ActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem2wed.get(tblyr1sem2wed.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnChange7ActionPerformed

    private void btnDelete7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete7ActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem2wed.get(tblyr1sem2wed.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDelete7ActionPerformed

    private void btnChange8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange8ActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem2thu.get(tblyr1sem2thu.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnChange8ActionPerformed

    private void btnDelete8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete8ActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem2thu.get(tblyr1sem2thu.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDelete8ActionPerformed

    private void btnChange9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChange9ActionPerformed
        changeSubject cs=new changeSubject();
        cs.setVisible(true);
        cs.setFields(yr1sem2fri.get(tblyr1sem2fri.getSelectedRow()));
        cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        cs.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnChange9ActionPerformed

    private void btnDelete9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete9ActionPerformed
        DeleteSubject ds=new DeleteSubject();
        ds.setVisible(true);
        
        ds.setFields(yr1sem2fri.get(tblyr1sem2fri.getSelectedRow()));
        ds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ds.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                loadSubjects();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
    }//GEN-LAST:event_btnDelete9ActionPerformed

    
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
            java.util.logging.Logger.getLogger(FirstYear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstYear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstYear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstYear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstYear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnChange1;
    private javax.swing.JButton btnChange2;
    private javax.swing.JButton btnChange3;
    private javax.swing.JButton btnChange4;
    private javax.swing.JButton btnChange5;
    private javax.swing.JButton btnChange6;
    private javax.swing.JButton btnChange7;
    private javax.swing.JButton btnChange8;
    private javax.swing.JButton btnChange9;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnDelete4;
    private javax.swing.JButton btnDelete5;
    private javax.swing.JButton btnDelete6;
    private javax.swing.JButton btnDelete7;
    private javax.swing.JButton btnDelete8;
    private javax.swing.JButton btnDelete9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable tblyr1sem1fri;
    private javax.swing.JTable tblyr1sem1mon;
    private javax.swing.JTable tblyr1sem1thu;
    private javax.swing.JTable tblyr1sem1tue;
    private javax.swing.JTable tblyr1sem1wed;
    private javax.swing.JTable tblyr1sem2fri;
    private javax.swing.JTable tblyr1sem2mon;
    private javax.swing.JTable tblyr1sem2thu;
    private javax.swing.JTable tblyr1sem2tue;
    private javax.swing.JTable tblyr1sem2wed;
    // End of variables declaration//GEN-END:variables
}

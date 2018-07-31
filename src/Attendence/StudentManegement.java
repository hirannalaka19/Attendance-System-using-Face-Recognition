/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import Database.DatabaseConnection;
import datepicker.DatePicker;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


/**
 *
 */
public class StudentManegement extends javax.swing.JFrame implements Observer {

    DatabaseConnection dbcon = new DatabaseConnection();
    String Subject = "Student Information From K. J. Somaiya Institute of Engineering and Information Technology";
    String dateText = "";
    public static String data1, data2, data3, data4;

    /**
     * Creates new form AttendenceCheck
     */
    public StudentManegement() {
        try {
            initComponents();
            setLocationRelativeTo(null);
            dbcon = new DatabaseConnection();
            dbcon.dbconnection();
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (Exception ex) {
            Logger.getLogger(StudentManegement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentDetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel1.setText("SELECT DATE");

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setText("ENTER STUDENT ID");

        txtStudentId.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStudentId)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblStudentDetails.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        tblStudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblStudentDetails);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Attendence", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void sendMessage(String sid, String subject, String percent) {
            try {
                String q = "SELECT phoneno FROM student WHERE sid='" + sid + "'";
                ResultSet rs = dbcon.getResultSet(q);
                if (rs.next()) {
                    String phnNo = rs.getString(1);
                    String message = " Your Student Attendence is very Irregular For College Lectures, Please visit college for discussion.";
                    System.out.println("phnNo: " + phnNo);
                    System.out.println("messge: " + message);
                 
                }
            } catch (SQLException ex) {
                Logger.getLogger(StudentManegement.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void sendemailMessage(String sid, String subject, String percent) {
            try {
                String q = "SELECT email FROM student WHERE sid='" + sid + "'";
                ResultSet rs = dbcon.getResultSet(q);
                if (rs.next()) {
                    String email_id = rs.getString(1);
                    String message = " Your Student Attendence is very Irregular For College Lectures, Please visit college for discussion.";
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(StudentManegement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        getByStudentID();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        getByDate();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DatePicker dp = new DatePicker(this, new Date());
        dp.start(txtDate);
        dateText = "first";
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean chkExists(String day, String subject, String fromtime, String totime) {
        boolean flag = false;
        try {
            String Query = "SELECT * FROM timetable WHERE Day='" + day + "' AND Subject='" + subject + "' AND Fromtime='" + fromtime + "' AND Totime='" + totime + "'";
            ResultSet rs = dbcon.getResultSet(Query);
            if (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
        }
        return flag;
    }
    public void addTable(Vector row) {
        Vector head = new Vector();
        head.add("id");
        head.add("name");
        head.add("Percent");

      //  tblDefltList.setModel((TableModel) new DefaultTableModel(row, head));
    }

    public List<Date> getListTimeTable(String stdate, String enddate) {
        List<Date> dates = new ArrayList<Date>();
        try {
            String str_date = stdate;
            String end_date = enddate;
            System.out.println("" + stdate);
            System.out.println("" + enddate);
            DateFormat formatter;

            formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = (Date) formatter.parse(str_date);
            Date endDate = (Date) formatter.parse(end_date);
            long interval = 24 * 1000 * 60 * 60; // 1 hour in millis
            long endTime = endDate.getTime(); // create your endtime here, possibly using Calendar or Date
            long curTime = startDate.getTime();
            while (curTime <= endTime) {
                dates.add(new Date(curTime));
                curTime += interval;
            }
            for (int i = 0; i < dates.size(); i++) {
                Date lDate = (Date) dates.get(i);
                String ds = formatter.format(lDate);
                System.out.println(" Date is ..." + ds);
            }
        } catch (ParseException ex) {
        }
        return dates;
    }

    public void error(String msg) {
        JOptionPane.showMessageDialog(this, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Get Student Name From Sid
     *
     */
    public String getStudentName(String sid) {
        String name = "";
        try {
            String query = "SELECT Student_name From student Where sid='" + sid + "'";
            ResultSet rs = dbcon.getResultSet(query);

            if (rs.next()) {
                name = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return name;
    }

    /**
     * Get Total Number Of present Days:
     *
     */
    public int getNumOfPresentDays(String subject, String frmDate, String toDate) {
        int totalNumOfPresentDays = 0;
        try {
            System.out.println("FRMDATE: " + frmDate);
            System.out.println("TODATE: " + toDate);
            List<Date> totalDays = getListTimeTable(frmDate, toDate);
            System.out.println("TOTAL size: " + totalDays.size());
            SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEEEEE");
            for (Date d : totalDays) {
                String day = sdf.format(d);
                System.out.println("day: " + day);
                String query = "SELECT * FROM timetable WHERE day='" + day + "' AND Subject='" + subject + "'";
                System.out.println("" + query);
                ResultSet rs = dbcon.getResultSet(query);
                if (rs.next()) {
                    totalNumOfPresentDays++;
                }
            }
        } catch (Exception e) {
        }
        return totalNumOfPresentDays;
    }

    /**
     *
     * Get Counter
     */
    public int getNumOfRecords(String sid, String frmDate, String toDate) {
        int number = -1;
        try {
            String query = "  SELECT COUNT(*) FROM attendence "
                    + "  WHERE sid='" + sid + "' "
                    + " AND attDate>='" + frmDate + "' "
                    + " AND attDate<='" + toDate + "'";

            System.out.println("" + query);
            ResultSet rs = dbcon.getResultSet(query);
            if (rs.next()) {
                number = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException | NumberFormatException e) {
        }
        return number;
    }

    /**
     * Check SID exists
     *
     */
    public boolean chkSID(String sid) {
        boolean flag = false;
        try {
            String query = "SELECT * FROM student WHERE SID='" + sid + "'";
            ResultSet rs = dbcon.getResultSet(query);
            if (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
        }
        return flag;
    }

    /**
     * Get DateDifference
     *
     */
    public int dateDiff(String strtDate, String endDate) {
        int diff = -1;
        try {
            String query = "SELECT DATEDIFF(Date('" + strtDate + "'),Date('" + endDate + "')) FROM student";
            System.out.println("" + query);
            ResultSet rs = dbcon.getResultSet(query);
            if (rs.next()) {
                diff = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException | NumberFormatException e) {
        }
        return diff;
    }

    /**
     * Getting By Date
     *
     */
    @SuppressWarnings("static-access")
    public void getByDate() {
        try {
            String date = txtDate.getText();
            if (date.equals("")) {
                JOptionPane.showMessageDialog(this, "Date Should Not Be Null!!");
                return;
            }

            String query = "SELECT s.Student_name,s.Student_std,att.present as 'Attenedence',att.attDate,att.entryTime"
                    + " FROM Attendence att,Student s "
                    + " WHERE att.sid=s.sid "
                    + " And att.attDate='" + date + "'";
            System.out.println("" + query);
            ResultSet rs = dbcon.getResultSet(query);
            tblStudentDetails.setModel(new DbUtils().resultSetToTableModel(rs));

        } catch (Exception e) {
        }

    }

    /**
     * Getting By Students ID
     *
     */
    @SuppressWarnings("static-access")
    public void getByStudentID() {
        try {
            String sid = txtStudentId.getText();
            if (sid.equals("")) {
                JOptionPane.showMessageDialog(this, "Please Enter Student Id !!!");
                return;
            }

            String query = "SELECT s.Student_name,s.Student_std,att.present as 'Attenedence',att.attDate,att.entryTime"
                    + " FROM Attendence att,Student s "
                    + " WHERE att.sid=s.sid "
                    + " And s.sid='" + sid + "'";

            ResultSet rs = dbcon.getResultSet(query);
            tblStudentDetails.setModel(new DbUtils().resultSetToTableModel(rs));
        } catch (Exception e) {
        }

    }

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
            java.util.logging.Logger.getLogger(StudentManegement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManegement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManegement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManegement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManegement().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblStudentDetails;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        Calendar calendar = (Calendar) arg;
        DatePicker dp = (DatePicker) o;
        if (dateText.equals("first")) {
            txtDate.setText(dp.formatDate(calendar, "yyyy-MM-dd"));
        }

        if (dateText.equals("PiStartDate")) {
        //    txtPiStartDate.setText(dp.formatDate(calendar, "yyyy-MM-dd"));

        }
        if (dateText.equals("PiEndDate")) {
        //    txtPiEndDate.setText(dp.formatDate(calendar, "yyyy-MM-dd"));
        }

        if (dateText.equals("FromDateDflt")) {
          //  txtFromDate.setText(dp.formatDate(calendar, "yyyy-MM-dd"));
        }

        if (dateText.equals("ToDateDflt")) {
          //  txtToDate.setText(dp.formatDate(calendar, "yyyy-MM-dd"));
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainMenu1.java
 *
 * Created on Mar 24, 2010, 7:35:30 PM
 */

/**
 *
 * @author root
 * /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 class Pair {
    private String first;
    private int second;

    public Pair(String first, int second) {
        super();
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString()
    {
           return "(" + first + ", " + second + ")";
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
 
 }
 
public class MainMenu1 extends javax.swing.JFrame {

int Thprocess=0;
double Thppload=0.0;
 double time=0.0;

    /** Creates new form MainMenu1 */
    public MainMenu1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        jButton6.setText("Set Process Limit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Start Load Detector");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reserved");
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Current Status");

        jButton3.setText("Set Thresholds");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setText("0.002");

        jTextField2.setText("100");

        jLabel2.setText("No Of Processes : ");

        jLabel3.setText("process");

        jLabel4.setText("                Ppload:");

        jLabel5.setText("ppload");

        jLabel6.setText("process");

        jLabel7.setText("ppload");

        jLabel8.setText("LIMIT ");

        jLabel9.setText("CURRENT");

        jLabel10.setText("PROCESS  LIMIT:");

        jLabel11.setText("LOAD  LIMIT :");

        jButton4.setText("Reserved");
        jButton4.setOpaque(true);

        jButton5.setText("Exit");
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("DejaVu LGC Sans", 0, 24));
        jLabel12.setText("    DYNAMIC LOAD DETECTOR AND BALANCER");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));

        jLabel14.setForeground(new java.awt.Color(241, 26, 26));
        jLabel14.setText("NETWORK ADDRESS");

        jLabel15.setText("MAXIMUM REQESTS IS FROM");

        jLabel16.setText("SAMPLING TIME   : ");

        jTextField3.setText("4000");

        jLabel17.setText("Sampling Time    :");

        jLabel18.setForeground(new java.awt.Color(17, 207, 7));
        jLabel18.setText("ms");
        jLabel18.setOpaque(true);

        jLabel19.setText("ms");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabel15)
                                                .addGap(15, 15, 15))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(482, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton3)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(35, 35, 35)
                                .addComponent(jButton2)
                                .addGap(30, 30, 30)
                                .addComponent(jButton4)
                                .addGap(47, 47, 47)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Thprocess= Integer.parseInt(jTextField2.getText());
        jLabel3.setText(jTextField2.getText());
        Thppload = Float.parseFloat(jTextField1.getText());
        jLabel5.setText(jTextField1.getText());
        time =Double.parseDouble(jTextField3.getText());
        jLabel18.setText(jTextField3.getText()+"ms");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileInputStream fin = null;

        try {
            String filepath = "/var/log/httpd/access_log";
            String filepath2 = "/root/PROJECT/fileout";
            fin = new FileInputStream(filepath);
            FileOutputStream fout = new FileOutputStream(filepath2);
            int n;
            
            Vector<Pair> data = new Vector<Pair>();
            Vector<Pair> request_size = new Vector<Pair>();
            Vector<Pair> reply_size = new Vector<Pair>();
            Pair count;
            String str = "";
            int consume;
            String cmd = "";
            String ip = "";
//		for(int network = 0 ; network < no_of_network ; network ++ )
//         IP[0]="127.0.0.1";
            for (;;) {
                cmd = "";
                str = "/root/ip ";
                ip = "";
                while ((n = fin.read()) != '~') {
                    ip = ip + (char) n;
                    str = str + (char) n;
                }
                while ((consume = fin.read()) != '^') {
                }
                consume = 0;
                String s = null;
                while ((consume = fin.read()) != '&') {
                    s = s + (char) consume;
                }
                String ref_ = "";
                int ref_size = 0;
                consume = 0;
                while ((consume = fin.read()) != '#') {
                    ref_ = ref_ + (char) consume;
                }
                ref_ = ref_.trim();
                ref_size = Integer.parseInt(ref_);
                String rep_ = "";
                consume = 0;
                int rep_size = 0;
                while ((consume = fin.read()) != '*') {
                    rep_ = rep_ + (char) consume;
                }
                rep_ = rep_.trim();
                rep_size = Integer.parseInt(rep_);
//		int no_of_node = Integer.parseInt( str );
                // BufferedReader q = new  BufferedReader( p.getOutputStream());
                cmd = "/root/ip " + ip + " 255.255.15.0";
                String line = "";
                try {
                    System.out.println(cmd);
                    Runtime run = Runtime.getRuntime();
                    Process pr = run.exec(cmd);
                    pr.waitFor();
                    BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                    while ((line = buf.readLine()) != null) {
                        fout.write(line.getBytes());
                        fout.write(("\n").getBytes());
                        ip = line.toString();
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("ip address " + ip + "input: " + ref_size + " rep_size : " + rep_size + " \n");
                int j;
                Boolean flag = false;
                System.out.println(ip);
                for (j = 0; j < data.size(); j++) {
                    Pair temp1 = data.get(j);
                    Pair temp2 = request_size.get(j);
                    Pair temp3 = reply_size.get(j);
                    if (temp1.getFirst().equals(ip)) {
                        int c = temp1.getSecond();
                        int req = temp2.getSecond();
                        int rep = temp3.getSecond();
                        temp1.setSecond(c + 1);
                        //int b= Integer.parseInt(ref_size);
                        //System.out.println("b= "+b);
                        temp2.setSecond(req + ref_size);
                        //   b = Integer.parseInt(rep_size);
                        temp3.setSecond(rep + rep_size);
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    Pair temp1 = new Pair(ip, 1);
                    data.add(temp1);
                    Pair temp2 = new Pair(ip, ref_size);
                    request_size.add(temp2);
                    Pair temp3 = new Pair(ip, rep_size);
                    reply_size.add(temp3);
                }
                int process = 0;
                int r = 0;
                int R = 0;
               Pair maxreq= new Pair("0.0.0.0",0);
                for (int k = 0; k < data.size(); k++) {
                    Pair temp1 = data.get(k);
                    //System.out.println("IP address : "+temp1.getFirst()+"  count = "+temp1.getSecond() );
                    process += temp1.getSecond();
                    temp1 = request_size.get(k);
                    r += temp1.getSecond();
                    if(temp1.getSecond()>maxreq.getSecond())
                        maxreq=temp1;
                    //System.out.println("IP address : "+temp1.getFirst()+"  request_size = "+temp1.getSecond() );
                    temp1 = reply_size.get(k);
                    R += temp1.getSecond();
                    //System.out.println("IP address : "+temp1.getFirst()+"  reply_size = "+temp1.getSecond() );
                    //  System.out.println("  ppload = "+(float)(R)/(process*r) );
                }
                double ppload = (double) (R) / (process * r);
                jLabel6.setText(Integer.toString(process));
                jLabel7.setText(Double.toString(ppload));
                                //if ((ppload>Thppload) && (process>Thprocess))
                System.out.println("  ppload = " + (double) (R) / (process * r) + "Thppload = " + Thppload + "process" + process + "Thprocess = " + Thprocess);
                if (process > Thprocess && ppload > Thppload) {
                    System.out.println("System currently overloaded due to more requests");
                        jLabel6.setText(Integer.toString(process));
                        jLabel7.setText(Double.toString(ppload));
                        jLabel13.setText("oops !!! I am overloaded !!!");
                        jLabel14.setText(maxreq.getFirst());          
                    break;
                }
            }
            int process = 0;
            for (int k = 0; k < data.size(); k++) {
                Pair temp1 = data.get(k);
                System.out.println("IP address : " + temp1.getFirst() + "  count = " + temp1.getSecond());
                process += temp1.getSecond();
                temp1 = request_size.get(k);
                System.out.println("IP address : " + temp1.getFirst() + "  request_size = " + temp1.getSecond());
                temp1 = reply_size.get(k);
                System.out.println("IP address : " + temp1.getFirst() + "  reply_size = " + temp1.getSecond());
            }
            fout.close();
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(MainMenu1.class.getName()).log(Level.SEVERE, null, ex);
        }  finally {
            try {
                fin.close();
            } catch (IOException ex) {
                Logger.getLogger(MainMenu1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // TODO add your handling code here:




    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu1().setVisible(true);
                
            }

        });
    }
    
    @Override
    public void dispose() {
        super.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * viewloader.java
 *
 * Created on 23 Apr, 2010, 10:53:12 PM
 */

package javaapplication1;


import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author root
 */
public class viewloader extends javax.swing.JFrame {

    /** Creates new form viewloader */
    public viewloader() {

        initComponents();

for(;;)
{
try
{
FileInputStream fin = null;
//            for (;;)
//            {
	int nm=0;
                    while ( nm < 1000000000)
					{
						nm++;
					}
			int n;

                    String str = "";
                    String cmd = "";
                    String ip = "";
                    String filepath = "/var/log/apache2/access.log";
                    String filepath2 = "/root/PROJECT/fileout";
                    fin = new FileInputStream(filepath);
                    FileOutputStream fout = new FileOutputStream(filepath2);

// calculating cpu usage
            Runtime r= Runtime.getRuntime();
            Process p1= r.exec("rm -f server-status");
            Process p2= r.exec("wget http://127.0.0.1/server-status");
            Process p3 = r.exec("rm -f input.txt");
            Process p4 = r.exec("./cpuusage.sh");
            Process p5 = r.exec("./noofreq.sh");
            Process p6 = r.exec("./accesses.sh");

//            FileInputStream fin1 = new FileInputStream("/root/input.txt");
            int n1;
            String str1="";
	    String line1="";

 // BufferedReader buf1 = new BufferedReader(new InputStreamReader(fin1));
		int chumma=0;

                double cpuusage1=0.0;
                int processes=0;
                double traffic=0.0;
                double accesses=0.0;
String unit ="";

//while((line1 = buf1.readLine()) != null) {
//	System.out.println("chumma = " +chumma);


	System.out.println("chumma="+ chumma);
	FileInputStream fin1 = new FileInputStream("/root/NetBeansProjects/JavaApplication1/src/javaapplication1/input.txt");
	BufferedReader buf1 = new BufferedReader(new InputStreamReader(fin1));

	if((line1 = buf1.readLine())!=null)
				{
					 String var[] = line1.split(" ");
					 String temp  =  var[7].replace("%"," ");
				         temp = temp.trim();
   				  	 cpuusage1 = Double.parseDouble(temp);
		  			 chumma =1;
			System.out.println("cpuusage =  " +cpuusage1);
				}

	if((line1 = buf1.readLine())!=null)
				{
					processes= Integer.parseInt(line1);
					System.out.println("No of requests : "+processes );
					chumma=2;
				}
	if((line1 = buf1.readLine())!=null)
				{
		 			 String var[] = line1.split(" ");
                	                 String temp  =  var[2];
                        	         temp = temp.trim();
					 String temp1 = var[6];
					 String temp2 = var[7];
					 temp1=temp1.trim();

				  	 String varss[] = temp2.split("<");
				  	 temp2 = varss[0];
					 temp2=temp2.toUpperCase();
			   	 accesses = Double.parseDouble(temp);
				 traffic= Double.parseDouble(temp1);
                                 unit = temp2;
				 	 System.out.println("access = " + temp) ;
                                 	 System.out.println("traffic = " + traffic);

//	System.out.println("processes : "+processes);
//	System.out.println("cpuusage1 : "+cpuusage1);
//	System.out.println("unit      : "+unit);
//	System.out.println("traffic   : "+traffic);

         if (processes > 1 && cpuusage1 > 0.03)
		   {
			System.out.println("inside first if" );
           		if (unit.equals("MB") && traffic > 3.0  )
  	        			{
				System.out.println("inside second if");
        				            System.out.println("System currently overloaded due to more requests");
						    System.out.println("cpu usage = " +cpuusage1 );
                                                    System.out.println("processes = " +processes );
                                                    System.out.println("traffic  = " + traffic+unit +"\n \n ");
                                                    jLabel6.setText("0.03");
                                                    jLabel7.setText("10");
                                                    jLabel8.setText("100");
                                                    jLabel9.setText("3.0 MB");
                                                    jLabel11.setText(Double.toString(cpuusage1));
                                                    jLabel12.setText(Double.toString(processes));
                                                    jLabel13.setText(Double.toString(accesses));
                                                    jLabel14.setText(traffic+unit);
						System.exit(0);
				        }

         	   }

//	for ( int mn =0 ;  mn<1000000000; mn++)
//			{}
		fin1.close();
//	}
      continue;
   }

}
catch(Exception ex)
{
	System.out.println("Exception received : "+ ex);
	String[] str ={"chumma", "hai"};
	viewloader.main(str);
}


 }


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cpu usage");

        jLabel2.setText("No of Requests");

        jLabel3.setText("Total accesses");

        jLabel4.setText("Traffic");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jButton1)
                .addGap(108, 108, 108)
                .addComponent(jButton2)
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel9)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel10)))
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel12)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel13)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel15)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewloader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}

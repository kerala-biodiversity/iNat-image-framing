
package inat.image.framing;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import static java.lang.Math.ceil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


//----------JSON related

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.Reader;
import java.util.Iterator;
import java.util.Scanner;



public class INatImageFraming extends javax.swing.JFrame {

	static int imageCount=0;
        static int observCount=0;
        static String DestName;//D:/"+"\u002F
        static String iNat_uname;
        static String copyright;
   
    public INatImageFraming() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        
        
        createFile("Copyright.txt");
        createFile("Uname.txt");
        createFile("desname.txt");
        readFilecpy("Copyright.txt");
        readFileinu("Uname.txt");
        readFiledes("desname.txt");
        
        if ( DestName== null ){
            setFolder();//Setting Destination folder
            System.out.println("Destination folder set to: "+jTextField7.getText());
           
        }
        
        if (copyright == null){
            copyright= JOptionPane.showInputDialog("Please input Observer Name: ");
            
            System.out.println(copyright);
           
        }
        if (iNat_uname == null){
            iNat_uname= JOptionPane.showInputDialog("Please input iNat User name: ");
            System.out.println(iNat_uname);  
        }
        jTextField8.setText(copyright);
        jTextField1.setText(iNat_uname);
        jTextField7.setText(DestName);
        writeFile("Copyright.txt",copyright);
    writeFile("desname.txt",DestName);    
    writeFile("Uname.txt",iNat_uname);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iNaturalist Image Framing");
        setBackground(new java.awt.Color(255, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Ink Free", 2, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk Download"));
        jPanel1.setFont(new java.awt.Font("Corbel", 3, 11)); // NOI18N
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);

        jTextField1.setToolTipText("Enter iNat user ID here");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("iNat username");

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Filter by Taxa");

        jLabel6.setText("No. of Images");

        jTextField6.setText("10");
        jTextField6.setToolTipText("Max:200");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "Butterflies", "Odonata", "Birds", "Plants", "Spiders" }));
        jComboBox1.setToolTipText("Supports custom filter like &taxon_id=48506&place_id=9627&month=12");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Single Image"));

        jLabel7.setText("Observation link");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField3.setText("https://www.inaturalist.org/observations/60515014");
        jTextField3.setToolTipText("Enter full link with https://www.");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setText("Frame & Download");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("User Info"));

        jLabel5.setText("Enter #Tag (Optional)");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Image quality");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medium", "large" }));

        jTextField7.setBackground(new java.awt.Color(255, 204, 255));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setText("Change Folder");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Observer Name");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7))
                .addGap(21, 21, 21))
        );

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // First we define variables.
    
            
      
    
    String tag, fil_taxa, img_qty,count;
   
    iNat_uname = jTextField1.getText();
     if (iNat_uname != null && !iNat_uname.isEmpty() ){
    copyright = jTextField8.getText();
    DestName= jTextField7.getText();
    writeFile("Copyright.txt",copyright);
    writeFile("Uname.txt",iNat_uname);
    writeFile("desname.txt",DestName);
    
    tag = jTextField5.getText();
    fil_taxa =(String) jComboBox1.getSelectedItem();// jTextField4.getText();
    img_qty = (String) jComboBox2.getSelectedItem();//jTextField3.getText();
    count= jTextField6.getText();
    switch(fil_taxa) {
    case "Butterflies":
    fil_taxa="&taxon_id="+"47224";// code block
    break;
    case  "Odonata":
    fil_taxa="&taxon_id="+"47792";// code block
    break;
    case  "Birds":
    fil_taxa="&taxon_id="+"3";// code block
    break;
    case  "Plants":
    fil_taxa="&taxon_id="+"47126";// code block
    break;
    case  "Spiders":
    fil_taxa="&taxon_id="+"47118";// code block
    break;
    case  "all":
    fil_taxa="&taxon_id="+"";// code block
    default:
    fil_taxa=fil_taxa;// for filtering custom like &taxon_id=48506&place_id=9627&month=12 
    }
  	
    try {
	inatDownloader(iNat_uname,tag,fil_taxa,img_qty,count,copyright);				
	JOptionPane.showMessageDialog(null, observCount+" Observations completed");
        jButton2.setText("Start");
	} 
    catch (IOException e1) {

	JOptionPane.showMessageDialog(null, "File Read Error");
	e1.printStackTrace();
    } catch (ParseException ex) {
        Logger.getLogger(INatImageFraming.class.getName()).log(Level.SEVERE, null, ex);
    }
openFolder();
     }
else {
            JOptionPane.showMessageDialog(null, "Please Enter iNat user name");
        }  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     // Sinlge image framing starts here-------------------------------
    
     String link, tag, img_qty;
      
     
     
    copyright = jTextField8.getText();
    DestName= jTextField7.getText();
    writeFile("Copyright.txt",copyright);
    writeFile("desname.txt",DestName);    
    writeFile("Uname.txt",iNat_uname);
    
    
     link=jTextField3.getText();
     tag = jTextField5.getText();
     img_qty = (String) jComboBox2.getSelectedItem();//jTextField3.getText();
     
     String st = "Please enter Link with https://www";
    //JOptionPane.showMessageDialog(null, st);
    String ht=jTextField3.getText();
     if (ht.length()>40){ 
         
    
   
    try {
	SingleinatDownloader(link,tag,img_qty,copyright);				
	JOptionPane.showMessageDialog(null, imageCount+" files completed");
        jButton4.setText("Frame & Download");
	} 
    catch (IOException e1) {
        // TODO Auto-generated catch block
	JOptionPane.showMessageDialog(null, "File Read Error");
	e1.printStackTrace();
    } catch (ParseException ex) {
        Logger.getLogger(INatImageFraming.class.getName()).log(Level.SEVERE, null, ex);
    } catch (org.json.simple.parser.ParseException ex) {
        Logger.getLogger(INatImageFraming.class.getName()).log(Level.SEVERE, null, ex);
    }
//------------Code to open the folder after downloading
      openFolder();
       //}
        //String st = "Please enter Link with https://www";
    
     
     }
     else{
     JOptionPane.showMessageDialog(null,st );
     System.out.println("URL error");
     }
//-----------------------------------------------------
       // Single image ends here:-------------------------------------------------------
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setFolder();//Setting Destination folder
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INatImageFraming().setVisible(true);
            }
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

private void inatDownloader(String iNat_uname,String tag,String fil_taxa,String img_qty,String count,String copyright) throws IOException, ParseException{
		
		
		
		String inatID="";
		
                String link="";
		int pageno =1;
                int rcount=Integer. parseInt(count);
                float pages1=rcount/200f;
                double pages=ceil(pages1);
               
	        observCount=0;
                for (int i = 0; i < pages; i++) {//No of pages loop here(iNat has a page limit of 200 records per page)
                
		String st = "https://www.inaturalist.org/observations/"+ iNat_uname +".csv?query"+fil_taxa +"&per_page="+"200"+"&page="+pageno;
		//System.out.println(st);
		URL stockURL = new URL(st);																						
		System.out.println("Page no:"+pageno);
                pageno=pageno+1;
                
	
		try (
	    		BufferedReader in = new BufferedReader(new InputStreamReader(stockURL.openStream()));//From Web directly
			CSVReader csvReader = new CSVReader(in);	
    	        ) {
    	            
			
                String[] nextRecord;
    	        nextRecord = csvReader.readNext();//to discard the first line(Header)
    	    	
                while ((nextRecord = csvReader.readNext()) != null) {//----------Loops here------------------
    	          if (observCount==rcount){
                      break;
                  }   	 
    	            	observCount=observCount+1;
    	             
    	             
    	                inatID=nextRecord[11];//F0
    	                System.out.println(observCount+" iNat ID: " + inatID);
    //---------------------Reomoved Bottom lines and kept in notepad
    link="https://www.inaturalist.org/observations/"+inatID;
    
    SingleinatDownloader(link,tag,img_qty,copyright);
    //-------------------------------------------------------------	             
    }//---------While page Loop ends here
                
    }               catch (org.json.simple.parser.ParseException ex) {
                        Logger.getLogger(INatImageFraming.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
	}
        System.out.println("All done");
        
}

//Single image download starts here-------------------
private void SingleinatDownloader(String link,String tag,String img_qty,String copyright) throws IOException, ParseException, org.json.simple.parser.ParseException{
		
		String i_url="";
		String sciName="";
		String comName="";
		String placeName="";
		String picDate="";
		String inatID="";
		//String copyright="";
                
                String st = link+".json" ;
		URL stockURL = new URL(st);																						
		try (
	    		BufferedReader in = new BufferedReader(new InputStreamReader(stockURL.openStream()));//From Web directly
                        
    	        ) {
                
        //---JSON starts here--------------------------------------------------
        
        inatID=link.substring(41,link.length());
        System.out.println("inatID: "+inatID);
        
        JSONParser parser = new JSONParser();

        //try (Reader reader = new FileReader("d:\\test.json")) {

            JSONObject jsonObject = (JSONObject) parser.parse(in);
            picDate = (String) jsonObject.get("observed_on");
            System.out.println(picDate);

        
            placeName = (String) jsonObject.get("place_guess");
            System.out.println(placeName);
            
            JSONObject taxon = (JSONObject) jsonObject.get("taxon");
            sciName = (String)taxon.get("name");
            System.out.println(sciName);
            comName ="";
            JSONObject c_name = (JSONObject) taxon.get("common_name");
            if (c_name!= null) {
            comName = (String)c_name.get("name");
            if ("Caprona alida".equals(sciName)) {//Changing incorrect inat common names here
            comName = "Alida Angle";
            System.out.println(comName);
            }
            }
            
            

            Long i_cnt = (Long) jsonObject.get("observation_photos_count");
            System.out.println("No. of images"+i_cnt);
                         
            imageCount =  i_cnt.intValue();
            
            JSONArray slideContent = (JSONArray) jsonObject.get("observation_photos");
            Iterator i = slideContent.iterator();
            
            //
    if  (picDate.length()>3) {//to avoid parse error wen there is no date
    Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(picDate);  
    // Display a date in day, month, year format
   
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    formatter = new SimpleDateFormat("dd MMM yyyy");
    picDate = formatter.format(date1);
    //System.out.println(picDate);  
    }
    //
        int img_no=0;//for multiple image numbers    
        while (i.hasNext()) {//Image URLs
            JSONObject slide = (JSONObject) i.next();
            JSONObject slide1 = (JSONObject) slide.get("photo");
            //
            //Image quality loop here
            String img_quality="";
            switch(img_qty) {
            case "medium":
            img_quality="medium_url";// code block
            break;
            case  "large":
            img_quality="large_url";// code block
            default:
            img_quality="medium_url";// 
            }
            //
            i_url = (String)slide1.get(img_quality);
            //System.out.println(i_url);
            //url_array=
        img_no=img_no+1;
    //---------------------------------------------------------------------
    
    	 if (i_url.length()>3)    {
                            
                                try{ 
    	                	final BufferedImage image = ImageIO.read(new URL(i_url + ""));
                               
    	                	String txtfont="Times New Roman";
    	                	int sizeFont=18;
    	                	Font newFont1 = new Font(txtfont, Font.ITALIC | Font.PLAIN, sizeFont);
    	                	Font placefont = new Font(txtfont, Font.PLAIN , sizeFont);
    	                	Font weekfont = new Font(txtfont, Font.BOLD , sizeFont);
    	                	Font signfont = new Font(txtfont,Font.PLAIN, sizeFont);
    	                	Font malfont = new Font(txtfont, Font.PLAIN, sizeFont);
    	                
    	    //--------increasing height by fixed pixels for frame---
            int boarderWidth = 0;
            int rectHeight = 20;//One row of text
            int frameWidth = image.getWidth()+2*boarderWidth;
            int frameHeight = image.getHeight()+(4*rectHeight)+2*boarderWidth;//50 on top plus 50 at bottom
            
            BufferedImage img = new BufferedImage(frameWidth, frameHeight, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = img.createGraphics();
            g.drawImage(image, boarderWidth, 2*rectHeight+boarderWidth, null);
            //--------------------------------------------
    	    g.setColor(Color.GRAY); //Gray thin(2pixels) boarder on all sides          
            g.fillRect(0, 0, frameWidth, boarderWidth);//Upper 
            g.fillRect(frameWidth-boarderWidth, 0, boarderWidth, frameHeight);//Right 
            g.fillRect(0, frameHeight-boarderWidth, frameWidth, boarderWidth);//Bottom 
            g.fillRect(0, 0,boarderWidth, frameHeight);//Left 
            //--------------------------
            g.setColor(Color.BLACK); //Black thin(5pixels) boarder on left and right 
            g.fillRect(boarderWidth, (2*rectHeight)+boarderWidth, 5, image.getHeight());//Right
            g.fillRect(frameWidth-boarderWidth-5, (2*rectHeight)+boarderWidth, 5, image.getHeight());//Left
            //----------------------------
            g.setColor(Color.black);           
            g.fillRect(boarderWidth, boarderWidth, image.getWidth(), rectHeight);            
            g.setColor(Color.white);  
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            drawFirstString(g, comName,new Rectangle(boarderWidth, boarderWidth, image.getWidth(), rectHeight),malfont);//com name
                       
            g.setColor(Color.GREEN);  
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            drawFirstString1(g, tag,new Rectangle(boarderWidth, boarderWidth, image.getWidth(), rectHeight),weekfont);//Banner
           
            g.setColor(Color.black);
            g.fillRect(boarderWidth,rectHeight+boarderWidth, image.getWidth(), rectHeight);
            g.setColor(Color.white);
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            drawFirstString(g, sciName,new Rectangle(boarderWidth,rectHeight+boarderWidth, image.getWidth(), rectHeight),newFont1);//sci name
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            drawFirstString1(g, "iNaturalist ID: "+ inatID,new Rectangle(boarderWidth, boarderWidth+ rectHeight, image.getWidth(), rectHeight),placefont);//iNat ID
            
            
            g.setColor(Color.black);
            g.fillRect(boarderWidth,frameHeight-(2*rectHeight)-boarderWidth , image.getWidth(), rectHeight);
            g.setColor(Color.white);
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            drawFirstString(g, placeName,new Rectangle(boarderWidth,frameHeight-(2*rectHeight)-boarderWidth , image.getWidth(), rectHeight),placefont);//place guess+date
            //g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            
            //--------------
            g.setColor(Color.black);
            g.fillRect(boarderWidth,frameHeight-rectHeight-boarderWidth, image.getWidth(), rectHeight);
            g.setColor(Color.white);
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            drawFirstString(g, picDate,new Rectangle(boarderWidth,frameHeight-rectHeight-boarderWidth, image.getWidth(), rectHeight),placefont);//place guess+date
            
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            //------------
            drawFirstString1(g, "© "+copyright,new Rectangle(boarderWidth,frameHeight-rectHeight-boarderWidth, image.getWidth(), rectHeight),signfont); // drawFirstString1(g, "� Firos AK",
            

                                           
            g.dispose();
            
            File destImageFile= new File(DestName+"\u002F"+sciName+"_"+inatID+".png");
            if (imageCount>1)    {
            destImageFile= new File(DestName+"\u002F"+sciName+"_"+inatID+"-"+img_no+".png");
                    
            }
            
            //File watermarkImageFile = new File("bys.png");//disabled watermark d:/                   
            addImageWatermark( img, destImageFile);//watermarkImageFile,
            
            }//try ends here
            catch(IOException e){
            System.out.println("Read Error,Skiping");   
            //continue;//do something with e... log, perhaps rethrow etc.
            }//catch ends here 			
        }
    	             
    }
           

        }catch (IOException e) {
            e.printStackTrace();
        }	       //}//---------page Loop ends here
                               
    	            
    }////---------pages Loop ends here
   


//------------Code to open the folder after downloading
public static void openFolder() { 
Desktop desktop = Desktop.getDesktop();
        File dirToOpen = null;
        try {
            dirToOpen = new File(DestName);
            desktop.open(dirToOpen);
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }   catch (IOException ex) {
                Logger.getLogger(INatImageFraming.class.getName()).log(Level.SEVERE, null, ex);
            }
}
//-----------------------------------------------------
//------------Code to open the folder after downloading
public void setFolder() { 
        String choosertitle = "Select destination Folder";
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());//
		//jfc.setCurrentDirectory(new java.io.File("."));
                jfc.setDialogTitle(choosertitle);
                jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	        jfc.setAcceptAllFileFilterUsed(false);
                int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
                       
			DestName=jfc.getSelectedFile().toString();
                        jTextField7.setText(jfc.getSelectedFile().toString());
		} 
}      //------------------------------
public void createFile(String f_name) { 
   try {
// Creating an object of a file
File myObj = new File(f_name); 
if (myObj.createNewFile()) {
System.out.println("File created: " + myObj.getName());
} else {
System.out.println("File already exists.");
}
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
    
} //-------------------
public void writeFile(String f_name,String f_text) { 
    try {
FileWriter myWriter = new FileWriter(f_name);
 // Writes this content into the specified file
myWriter.write(f_text); 
 
// Closing is necessary to retrieve the resources allocated
myWriter.close(); 
System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}
//------------------------------------------------------
public void readFilecpy(String f_name) { 
try {
// Creating an object of the file for reading the data
File myObj = new File(f_name);  
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
copyright=data;
System.out.println(data);
}
myReader.close();
} catch (FileNotFoundException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}

public void readFileinu(String f_name) { 
try {
// Creating an object of the file for reading the data
File myObj = new File(f_name);  
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
iNat_uname=data;
System.out.println(data);
}
myReader.close();
} catch (FileNotFoundException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}//

public void readFiledes(String f_name) { 
try {
// Creating an object of the file for reading the data
File myObj = new File(f_name);  
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
DestName=data;
System.out.println(data);
}
myReader.close();
} catch (FileNotFoundException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}//
//
    	public static void drawFirstString(Graphics g, String text, Rectangle rect, Font font) {
            // Get the FontMetrics
            FontMetrics metrics = g.getFontMetrics(font);
            // Determine the X coordinate for the text
            int x = 5;//rect.x + (rect.width - metrics.stringWidth(text)) ;
            // Determine the Y coordinate for the text (note we add the ascent, as
            // in java 2d 0 is top of the screen)
            int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
            // Set the font
            g.setFont(font);
            // Draw the String
            g.drawString(text, x, y);
        }
    	//
    	public static void drawFirstString1(Graphics g, String text, Rectangle rect, Font font) {
            // Get the FontMetrics
            FontMetrics metrics = g.getFontMetrics(font);
            // Determine the X coordinate for the text
            int x = rect.x + (rect.width - metrics.stringWidth(text))-5 ;
            // Determine the Y coordinate for the text (note we add the ascent, as
            // in java 2d 0 is top of the screen)
            int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
            // Set the font
            g.setFont(font);
            // Draw the String
            g.drawString(text, x, y);
    	
    	}
       	//Adding CC BY water mark image and saving formatted image 
    	public static void addImageWatermark(BufferedImage image, File destImageFile) {//File watermarkImageFile, 
    	      try {
    	          BufferedImage sourceImage =image;// ImageIO.read(sourceImageFile);
    	          //BufferedImage watermarkImage = ImageIO.read(watermarkImageFile);//disabled watermark
    	   
    	          // initializes necessary graphic properties
    	          Graphics2D g2d = (Graphics2D) sourceImage.getGraphics();
    	          AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f);
    	          g2d.setComposite(alphaChannel);
    	   
    	          // calculates the coordinate where the image is painted
    	          //int topLeftX = (sourceImage.getWidth() - watermarkImage.getWidth()) -6;//disabled watermark
    	          //int topLeftY = (sourceImage.getHeight() - watermarkImage.getHeight())-42;//disabled watermark
    	  
    	          // paints the image watermark
    	        // g2d.drawImage(watermarkImage, topLeftX, topLeftY, null);//disabled watermark
    	          
    	          ImageIO.write(sourceImage, "png",destImageFile);//save image with com name as filename
    	          //ImageIO.write(sourceImage, "png", destImageFile);
    	          g2d.dispose();
    	   
    	          //System.out.println("The image watermark is added to the image.");
    	   
    	      } catch (IOException ex) {
    	          System.err.println(ex);
    	      }
    	  }
   
}

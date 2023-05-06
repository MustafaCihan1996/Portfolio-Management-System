
package b;

import static b.Student.StudentShower;
import static b.Student.hasHMapCreator;
import static b.Student.studentInfom;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class loadStudent extends javax.swing.JDialog {

  
    public loadStudent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("               Load student infos");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter the input file name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
                Scanner sc = new Scanner(System.in); 
        
                //System.out.println("Enter the input file name");
             
                String inputName = "/Users/mustafaasimcihan/NetBeansProjects/program/src/main/java/b/";
                
                String b = jTextField1.getText();
                
                //sc.nextLine();
             
                //b = sc.nextLine();
                
                inputName+= b;
                
               // System.out.println(inputName);
         
                int year = 0;
             
                float gpa = 0;
             
                boolean bool1 = true;
               
               try 
               
               {
           
                        FileInputStream inputStream = new FileInputStream(inputName);

      
                        Scanner scanner = new Scanner(inputStream);

            
                        while (scanner.hasNextLine()) 
                        
                        {
                        
                        String checker = "";
                            
                        String line = scanner.nextLine();
                        
                        jTextArea1.append(line + "\n");
                        
                        String words[] = line.split(" ");
                        
                        if(words.length == 4)
                        
                        {
                          
                          checker+= words[0] + words[1] + words[3];
                            
                           year = Integer.parseInt(words[1]);
                          
                           gpa = Float.parseFloat(words[2]);
                          
                          
                          if(StudentShower.containsKey(checker.toLowerCase()))
                          
                          {
                          
                              //JOptionPane.showMessageDialog(null, "Object already exists");
                          
                          }
                          
                          else
                          
                          {
                              
                            try
                            {
                            
                             
                            Student student = new Student(words[0],year,gpa,words[3]);
               
                            hasHMapCreator(StudentShower,words[0],year,words[3],student);
                            
                            studentInfom.add(student);
                            
                            }
                            catch(NumberFormatException e)
                            
                            {
                            
                                System.out.println("An error occurred: " + e.getMessage());
                                
                            }
                              
                          }
                            
                        }
                        
                        if(words.length == 7)
                        
                        {
                        
                            checker+= words[0] + words[1] + words[3];
                            
                            try
                            {
                                
                             year = Integer.parseInt(words[1]);
                          
                             gpa = Float.parseFloat(words[2]);
                             
                             
                            
                             bool1 = Boolean.parseBoolean(words[5]);
                             
                            }
                            catch(NumberFormatException e)
                            
                            {
                            
                                System.out.println("An error occurred: " + e.getMessage());
                            
                            }
                         
                            if(StudentShower.containsKey(checker.toLowerCase()))
                          
                            {
                          
                              //System.out.println("Object already exist");
                          
                            }
                          
                            else
                          
                            {
                                try
                                
                                {
                          
                                GraduateStudent a = new GraduateStudent(words[0],year,gpa,words[3],words[4],bool1,words[6]);
                
                                hasHMapCreator(StudentShower,words[0],year,words[3],a);
               
                                studentInfom.add(a);
                                
                                }
                                
                                catch(NumberFormatException e)
                                
                                {
                                
                                    System.out.println("An error occurred: " + e.getMessage());
                                    
                                }
               
                 
                            }
                            
                        }
                        
                        
                        
                        
                        }
                        
                        scanner.close();
                        
                        inputStream.close();                   
                        
                } 
               
               catch (IOException e) 
               
               {
                    e.printStackTrace();
                
               }
               
            sc.close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        dispose();
              
        NewJDialog a = new NewJDialog(null, true);
              
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loadStudent dialog = new loadStudent(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

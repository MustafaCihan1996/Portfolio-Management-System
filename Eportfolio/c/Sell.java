/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package c;

import static c.Investment.InvestmentAll;
import javax.swing.JOptionPane;

/**
 *
 * @author mustafaasimcihan
 */
public class Sell extends javax.swing.JDialog {

    /**
     * Creates new form Sell
     */
    public Sell(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("  Sell the investments");

        jLabel2.setText("Symbol");

        jLabel3.setText("Quantity");

        jLabel4.setText("  Price");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Sell");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stock", "Mutualfund" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Investment kind");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
                
                int last = 0;
                
                String kind;
                
                String sym;
                
                int checkMe = 0;
                
                int savver = 0;
                
                int quant = 0;
                
                String Price = jTextField3.getText();
                
                String Quant = jTextField2.getText();
            
                System.out.println("Enter the kind of investment");
                
                kind = jComboBox1.getSelectedItem().toString().toLowerCase();
                
                
                if(kind.equals("stock"))
                
                {
                    // dont forget gain and dont forget if  symbol does not exist;
                    System.out.println("Enter the symbol");
                    
                    sym = jTextField1.getText();
                    
                    if(sym.isEmpty())
                    
                    {
                    
                        JOptionPane.showMessageDialog(null, "Symbol cannot be empty");
                        
                        jTextField1.setText("");
                        
                        jTextField2.setText("");
                        
                        jTextField3.setText("");
                        
                        last = 1;
                    
                    }
                    
                    int checker = 0;
                    
                    
                    
                    for(int j = 0; j<InvestmentAll.size(); j++)
               
                        {
               
                            if(InvestmentAll.get(j).symbol.equals(sym))
                            
                            {
                                
                                //System.out.println("Enter the quantity");
                                try
                                
                                {
                                
                                 quant = 0;
                                
                                if(Quant.isEmpty())
                                
                                {
                                
                                  JOptionPane.showMessageDialog(null, "Quantity can not be empty");
                                  
                                  jTextField1.setText("");
                        
                                  jTextField2.setText("");
                        
                                  jTextField3.setText("");
                                  
                                  last = 1;
                                
                                }
                                
                                quant = Integer.parseInt(jTextField2.getText());
                                 
                                }
                                
                                catch(NumberFormatException e)
                                
                                {
                                    
                                    JOptionPane.showMessageDialog(null, "Quantity should be integer");
            
                                    jTextField1.setText("");
                        
                                    jTextField2.setText("");
                        
                                    jTextField3.setText("");
         
                                    last = 1;
                                    
                                    
                                }
                                
                                //System.out.println("Enter the price");
                                
                                double pric = 0;
                                
                                if(Price.isEmpty())
                                
                                {
                                
                                    JOptionPane.showMessageDialog(null, "Price can not be empty");
                                    
                                    jTextField1.setText("");
                        
                                    jTextField2.setText("");
                        
                                    jTextField3.setText("");
                                    
                                    last = 1;
                                
                                }
                                
                                try
                                
                                {
                                
                                    pric = Double.parseDouble(jTextField3.getText());
                                
                                }
                                
                                catch(NumberFormatException e)
                                
                                {
                                                       
                                    JOptionPane.showMessageDialog(null, "Price should be integer");
            
                                    jTextField1.setText("");
                        
                                    jTextField2.setText("");
                        
                                    jTextField3.setText("");
         
                                    last = 1;
                                
                                }
                                
                                //scan.nextLine();
                                
                                if(last == 0)
                                
                                {
                                    InvestmentAll.get(j).setPrice(pric);
                                
                                }
                                
                                if(quant == InvestmentAll.get(j).getQuantity())
                                
                                {
                                    double comis = 9.99;
                                    
                                    double paymnt = 0;
                                    
                                    double gn = 0;
                                    
                                    paymnt = (pric*quant) - comis;
                                    
                                    gn = paymnt-InvestmentAll.get(j).getBookValue();
                                    
                                    InvestmentAll.get(j).setGetGain(gn);
                                    
                                    if(last == 0)
                                    
                                    {
                                    
                                    Stock.setStaticVariable(gn);
                                    
                                    //InvestmentAll.remove(j);
                                    
                                    checkMe = 1;
                                    
                                    savver = j;
                                    
                                    }
                                    
                                }
                                
                                if(quant<InvestmentAll.get(j).getQuantity())
                                
                                {
                                    
                                    double comis = 9.99;
                                    
                                    double paymnt = 0;
                                    
                                    double gn = 0;
                                    
                                    int remain = 0;
                                    
                                    remain = InvestmentAll.get(j).getQuantity()-quant;
                                    
                                    if(last == 0)
                                    
                                    {
                                    
                                    InvestmentAll.get(j).setBookValue(InvestmentAll.get(j).getBookValue(), remain, InvestmentAll.get(j).getQuantity(), 1);
                                    
                                    
                                    paymnt = (pric*quant) - comis;
                                
                                    gn = paymnt-InvestmentAll.get(j).getBookValue();
                                    
                                    InvestmentAll.get(j).setGetGain(gn);
                                    
                                    Stock.setStaticVariable(gn);
                                    
                                    JOptionPane.showMessageDialog(null, "Succesfully sold");
                                    
                                    }
                                    
                                    
                                }
                                
                                
                                
                                
                                checker++;
                                
                            }
                   
                        }
                    
                    if(checker == 0)
                    
                    {
                        
                        JOptionPane.showMessageDialog(null, "Investment does not exist");
                        
                        jTextField1.setText("");
                        
                        jTextField2.setText("");
                        
                        jTextField3.setText("");
                        
                        last = 1;
                        
                    }
                    
                }
                
                if(checkMe == 1)
                
                {
                    
                    InvestmentAll.remove(savver);
                    
                    JOptionPane.showMessageDialog(null, "Succesfully sold");
                    
                }
                
                checkMe = 0;
                
                if(kind.equals("mutualfund"))
                
                {
                    // dont forget gain and dont forget if  symbol does not exist;
                    //System.out.println("Enter the symbol");
                    
                    sym = jTextField1.getText();
                    
                    if(sym.isEmpty())
                    
                    {
                    
                        JOptionPane.showMessageDialog(null, "Symbol can not be empty");
                        
                        jTextField1.setText("");
                        
                        jTextField2.setText("");
                        
                        jTextField3.setText("");
                        
                        last = 1;
                        
                    
                    }
                    
                    int checker = 0;
                    
                    for(int k = 0; k<InvestmentAll.size(); k++)
               
                        {
               
                            if(InvestmentAll.get(k).symbol.equals(sym))
                            
                            {
                                
                                //System.out.println("Enter the quantity");
                                
                                //int quant = 0;
                                
                                if(Quant.isEmpty())
                                
                                {
                                
                                    JOptionPane.showMessageDialog(null, "Quantity can not be empty");
                                    
                                    jTextField1.setText("");
                        
                                    jTextField2.setText("");
                        
                                    jTextField3.setText("");
                                    
                                    last = 1;
                                    
                                }
                                
                                try
                                
                                {
                                
                                quant = Integer.parseInt(jTextField2.getText());
                                
                                }
                                
                               catch(NumberFormatException e)
                               
                               {
                               
                                   JOptionPane.showMessageDialog(null, "Quantity should be integer");
            
                                    jTextField1.setText("");
                        
                                    jTextField2.setText("");
                        
                                    jTextField3.setText("");
         
                                    last = 1;
                               
                               }
                                
                                //System.out.println("Enter the price");
                                
                                double pric = 0;
                                
                                if(Price.isEmpty())
                                
                                {
                                
                                    JOptionPane.showMessageDialog(null, "Price can not be empty");
                                    
                                    jTextField1.setText("");
                        
                                    jTextField2.setText("");
                        
                                    jTextField3.setText("");
         
                                    last = 1;
                                
                                }
                                
                                try
                                
                                {
                                
                                    pric = Double.parseDouble(jTextField3.getText());
                                
                                }
                                
                                catch(NumberFormatException e)
                                
                                {
                                
                                     JOptionPane.showMessageDialog(null, "Quantity should be integer");
            
                                     jTextField1.setText("");
                        
                                     jTextField2.setText("");
                        
                                     jTextField3.setText("");
         
                                    last = 1;
                                
                                }
                                
                                //scan.nextLine();
                                
                                if(last == 0)
                                
                                {
                                
                                     InvestmentAll.get(k).setPrice(pric);
                                
                                }
                                
                               
                                
                                if(quant == InvestmentAll.get(k).getQuantity())
                                
                                {
                                    double comis = 45;
                                    
                                    double paymnt = 0;
                                    
                                    double gn = 0;
                                    
                                    paymnt = (pric*quant) - comis;
                                    
                                    gn = paymnt-InvestmentAll.get(k).getBookValue();
                                    
                                    if(last == 0)
                                    
                                    {
                                    InvestmentAll.get(k).setGetGain(gn);
                                    
                                    Stock.setStaticVariable(gn);
                                    
                                    //InvestmentAll.remove(k);
                                    
                                    savver = k;
                                    
                                    checkMe = 1;
                                    
                                    }
                                    
                                    
                                }
                                
                                if(quant<InvestmentAll.get(k).getQuantity())
                                
                                {
                                    
                                    double comis = 45;
                                    
                                    double paymnt = 0;
                                    
                                    double gn = 0;
                                    
                                    int remain = 0;
                                    
                                    
                                    remain = InvestmentAll.get(k).getQuantity()-quant;
                                    
                                    if(last == 0)
                                    
                                    {
                                    
                                    InvestmentAll.get(k).setBookValueOne(InvestmentAll.get(k).bookValue, remain, InvestmentAll.get(k).getQuantity(), 1);
                                    
                                    InvestmentAll.get(k).setPrice(pric);
                                    
                                    paymnt = (pric*quant) - comis;
                                
                                    gn = paymnt-InvestmentAll.get(k).getBookValue();
                                    
                                            InvestmentAll.get(k).setGetGain(gn);
                                    
                                            Mutualfund.setStaticVariable(gn);
                                            
                                            JOptionPane.showMessageDialog(null, "Succesfully sold");
                                    }        
                                            
                                    
                                    
                                }
                                
                                
                                
                                
                                checker++;
                                
                            }
                   
                        }
                    
                    if(checkMe == 1)
                    
                    {
                       
                        InvestmentAll.remove(savver);
                        
                        JOptionPane.showMessageDialog(null, "Succesfully sold");
                        
                    }
                    
                    checkMe = 0;
                    
                    if(checker == 0)
                    
                    {
                        
                        JOptionPane.showMessageDialog(null, "Investment does not exist");
                        
                        jTextField1.setText("");
                        
                        jTextField2.setText("");
                        
                        jTextField3.setText("");
                        
                        last = 1;
                        
                    }
                    
                }
                
                if(last == 0)
        
        {
        
            dispose();
              
            Menu a = new Menu(null, true);
              
            a.setVisible(true);
            
        }
                
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jComboBox1.setSelectedIndex(0);
        
        jTextField1.setText("");
        
        jTextField2.setText("");
        
        jTextField3.setText("");
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        dispose();
        
        Menu a = new Menu(null, true);
              
        a.setVisible(true);
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
            java.util.logging.Logger.getLogger(Sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sell dialog = new Sell(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
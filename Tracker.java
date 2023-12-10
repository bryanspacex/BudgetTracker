// main window for running the entire program.
package expensetracker;

/**
 *
 * @author teamSWBois
 */
public class ExpenseTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        welcomeUser wu = new welcomeUser();
        wu.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                wu.loadvalue.setText(Integer.toString(i) + "%");

                Signup1 su = new Signup1();

                if (i == 10)
                    wu.loading.setText("Reaching modules...");
                if (i == 20)
                    wu.loading.setText("Opening modules...");
                if (i == 50)
                    wu.loading.setText("Connecting Database...");
                if (i == 70)
                    wu.loading.setText("Database connected...");
                if (i == 80)
                    wu.loading.setText("Opening Application");
                if (i == 100) {
                    wu.dispose();
                    su.show();
                }

                wu.loader.setValue(i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// WELCOME PAGE.
package expensetracker;

/**
 *
 * @author Lenovo
 */
public class welcomeUser extends javax.swing.JFrame {

    /**
     * Creates new form welcomeUser
     */
    public welcomeUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loader = new javax.swing.JProgressBar();
        loading = new javax.swing.JLabel();
        loadvalue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME USER");
        
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Desktop\\PIC FOR PROJECT\\images.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EXPENSE TRACKING SYSTEM");
        
        loader.setBackground(new java.awt.Color(255, 0, 0));
        loader.setForeground(new java.awt.Color(255, 255, 255));
        
        loading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 51));
        loading.setText("Loading...");
        
        loadvalue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadvalue.setForeground(new java.awt.Color(255, 255, 0));
        loadvalue.setText("0%");
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(209, 209, 209))
                .addComponent(loader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()

                                    .addComponent(loading,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 208,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                    
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                     .addComponent(loadvalue,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                                     .addGroup(jPanel1Layout.createSequentialGroup()
                                    
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignme
                                    nt.LEADING)
                                     .addGroup(jPanel1Layout.createSequentialGroup()
                                     .addGap(190, 190, 190)
                                    .addComponent(jLabel1,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 320,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                                     .addGroup(jPanel1Layout.createSequentialGroup()
                                     .addGap(238, 238, 238)
                                    .addComponent(jLabel2,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 215,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)))
                                     .addGap(0, 174, Short.MAX_VALUE)))
                                     .addContainerGap())
                                     );
                            
                                     jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(loading)
                                            .addComponent(loadvalue))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(loader, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    )
                            );

                            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                            getContentPane().setLayout(layout);
                            layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                            );
                            layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                            );

                            pack();
                            setLocationRelativeTo(null);
                            }// </editor-fold>
                            
                            /**
                             * @param args the command line arguments
                             */
                            public static void main(String args[]) {
                                /* Set the Nimbus look and feel */
                                //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                                /* If Nimbus (introduced in Java SE 6) is not available, stay with
                                the default look and feel.
                                * For details see
                                http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                                */
                                try {
                                    for (javax.swing.UIManager.LookAndFeelInfo info :
                                            javax.swing.UIManager.getInstalledLookAndFeels()) {
                                        if ("Nimbus".equals(info.getName())) {
                                            javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                            break;
                                        }
                                    }
                                } catch (ClassNotFoundException ex) {
                                    java.util.logging.Logger.getLogger(YourClassName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                } catch (InstantiationException ex) {
                                    java.util.logging.Logger.getLogger(YourClassName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                } catch (IllegalAccessException ex) {
                                    java.util.logging.Logger.getLogger(YourClassName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                                    java.util.logging.Logger.getLogger(YourClassName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                                }
                                //</editor-fold>
                            
                                /* Create and display the form */
                                java.awt.EventQueue.invokeLater(() -> {
                                    new YourClassName().setVisible(true);
                                });
                            }

                            // Variables declaration - do not modify
                            private javax.swing.JLabel jLabel1;
                            private javax.swing.JLabel jLabel2;
                            private javax.swing.JLabel jLabel3;
                            public javax.swing.JPanel jPanel1;
                            public javax.swing.JProgressBar loader;
                            public javax.swing.JLabel loading;
                            public javax.swing.JLabel loadvalue;
                            // End of variables declaration
}





    }
}


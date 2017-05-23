/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ManagerFrame.java
 *
 * Created on 06-Mar-2014, 15:45:33
 */

package CombinedProjectPackage;

/**
 *
 * @author fennell.38261
 */
public class ManagerFrame extends javax.swing.JFrame {

    /** Creates new form ManagerFrame */
    public ManagerFrame() {
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

        Search = new javax.swing.JButton();
        Create = new javax.swing.JButton();
        Load = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        getContentPane().setLayout(null);

        Search.setText("Animal Insert Table");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search);
        Search.setBounds(50, 40, 270, 23);

        Create.setText("Search Animal Database");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        getContentPane().add(Create);
        Create.setBounds(50, 70, 270, 23);

        Load.setText("Animal queries table");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });
        getContentPane().add(Load);
        Load.setBounds(50, 100, 270, 23);

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout);
        Logout.setBounds(150, 160, 65, 23);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-228)/2, 416, 228);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login Frame0= new Login();
        Frame0.setVisible(true);

        setVisible(false);
        dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        AnimalInsert Frame3= new AnimalInsert ();
        Frame3.setVisible(true);

        setVisible(false);
        dispose();
    }//GEN-LAST:event_SearchActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        SearchAnimal Frame4= new SearchAnimal ();
        Frame4.setVisible(true);

        setVisible(false);
        dispose();
    }//GEN-LAST:event_CreateActionPerformed

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        Query Frame5= new Query ();
        Frame5.setVisible(true);

        setVisible(false);
        dispose();
    }//GEN-LAST:event_LoadActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton Load;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Search;
    // End of variables declaration//GEN-END:variables

}

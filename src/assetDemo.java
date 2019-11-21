
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class assetDemo extends javax.swing.JFrame {
DefaultTableModel model;
   
    public assetDemo() {
        initComponents();
        populateTable();
  
    }
    public void populateTable(){
         model=(DefaultTableModel)tblAsset.getModel();
         model.setRowCount(0);
        try {
            ArrayList<assetTable>assets=getAssets();
            for (assetTable assettable:assets){
                Object[] row = {assettable.getAssetid(),assettable.getAssetname(),
                assettable.getAssetmark(),assettable.getAssetmodel(),assettable.getAssetpiece()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(assetDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ArrayList<assetTable> getAssets() throws SQLException{
        Connection connection =null;
        dbHelper dBHelper = new dbHelper();
        Statement statement=null;
        ResultSet resultSet;
        ArrayList<assetTable> assets=null;
        try{
        connection = dBHelper.getConnection();
        statement =connection.createStatement();
         resultSet=statement.executeQuery("select * from assettable");
         assets =new ArrayList<assetTable>();
                 while(resultSet.next()){
                 assets.add(new assetTable(
                         resultSet.getInt("assetID"),
                         resultSet.getString("assetName"),
                         resultSet.getString("assetMark"),
                         resultSet.getString("assetModel"),
                         resultSet.getInt("assetPiece")
                 ));
                 }
              
        }catch (SQLException exception){
            dBHelper.showErrorMessage(exception);
        }finally{
            statement.close();  
            connection.close();
        }
        return assets;
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtMark = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtPiece = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsset = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Ekle");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Varlik adi");

        jLabel2.setText("Marka");

        jLabel3.setText("Model");

        jLabel4.setText("Adet");

        tblAsset.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "assetID", "assetName", "assetMark", "asetModel", "assetPiece"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAsset);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblSearch.setText("Arama Ifadesi :");

        btnDelete.setText("Sil");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(txtPiece)
                    .addComponent(txtMark)
                    .addComponent(txtModel)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPiece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
      
        Connection connection=null;
            dbHelper dBhelper=new dbHelper();
            PreparedStatement statement=null;
            try{
                 connection = dBhelper.getConnection();
                 String sql="insert into assettable(assetName,  assetMark,  assetModel,  assetPiece)values (?,?,?,?)";
                 statement = connection.prepareStatement(sql);
                 statement.setString(1, txtName.getText());
                 statement.setString(2, txtModel.getText());
                 statement.setString(3, txtMark.getText());
                 statement.setInt(4,Integer.valueOf(txtPiece.getText())) ;
                 int result = statement.executeUpdate();
                    populateTable();
                    clearFields();
           } catch(SQLException exception){
                dBhelper.showErrorMessage(exception);
            }finally{
                try {
                    statement.close();
                    connection.close();
                } catch (SQLException ex) {
                    
                
            }
            }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
      String searchKey=txtSearch.getText();
      TableRowSorter<DefaultTableModel> tableRowSorter=new TableRowSorter<DefaultTableModel>(model);
      tblAsset.setRowSorter(tableRowSorter);
      tableRowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
            
             Connection connection=null;
            dbHelper dBhelper=new dbHelper();
            PreparedStatement statement=null;
            if (!tblAsset.getSelectionModel().isSelectionEmpty()){
            int onay = JOptionPane.showConfirmDialog(null, "Emin misiniz?", "Varlik Tablosu", JOptionPane.YES_NO_OPTION);

            if (onay == 0) {
            int row=tblAsset.getSelectedRow();
            String cell=tblAsset.getModel().getValueAt(row,0).toString();
            String sql="delete from assettable where assetID="+cell;
try{
             connection = dBhelper.getConnection();
                statement = connection.prepareStatement(sql);
                statement.execute();
                 populateTable(); 
                JOptionPane.showMessageDialog(null, "Silme islemi basarili.");
           } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                
            }finally{
                try {
                    statement.close();
                    connection.close();
                } catch (SQLException ex) {
                    
                }
            }
            }
            }
    }//GEN-LAST:event_btnDeleteActionPerformed
         private void clearFields(){
             txtName.setText(null);
             txtMark.setText(null);
             txtModel.setText(null);
             txtPiece.setText(null);
 
         }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new assetDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblAsset;
    private javax.swing.JTextField txtMark;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPiece;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

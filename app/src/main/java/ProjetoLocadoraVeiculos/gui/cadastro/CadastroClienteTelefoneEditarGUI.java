/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ProjetoLocadoraVeiculos.gui.cadastro;

import ProjetoLocadoraVeiculos.dao.ClienteDAO;
import ProjetoLocadoraVeiculos.dao.ClienteTelefoneDAO;
import ProjetoLocadoraVeiculos.entity.Cliente;
import ProjetoLocadoraVeiculos.entity.ClienteTelefone;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Riquetti
 */
public class CadastroClienteTelefoneEditarGUI extends javax.swing.JDialog {

    private ClienteTelefoneDAO dao = new ClienteTelefoneDAO();
    private ClienteTelefone clienteTelefoneEditar = null;
    private CadastroClienteTelefoneGUI parentDialog;

    /**
     * Creates new form CadastroFabricanteEditarGUI
     */
    public CadastroClienteTelefoneEditarGUI(java.awt.Frame parent, boolean modal, CadastroClienteTelefoneGUI dialogParent) {
        super(parent, modal);
        parentDialog = dialogParent;

        initComponents();

        carregarComboClienteNome();
    }

    

    public void carregarClienteTelefone(int id) {
        clienteTelefoneEditar = dao.select(id);
       
        txtTelefone.setText(String.valueOf(clienteTelefoneEditar.getTelefone()));

    }
    
    
    
    private void carregarComboClienteNome() {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> listaCliente = dao.select();

        Object[] items = new Object[listaCliente.size()];

        int contador = 0;

        for (Cliente cliente : listaCliente) {
            items[contador] = cliente;

            contador++;
        }

        ComboBoxModel model = new DefaultComboBoxModel(items);

        cboCliente.setModel(model);
    }

    private void limparCampos() {
        txtTelefone.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jMenuItem1 = new javax.swing.JMenuItem();
        lblCliente = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        cboCliente = new javax.swing.JComboBox<>();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCliente.setText("Cliente");

        lblTelefone.setText("Telefone");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 316, Short.MAX_VALUE)
                                .addComponent(btnFechar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(52, 52, 52)
                                            .addComponent(btnSalvar))
                                        .addComponent(lblTelefone))
                                    .addComponent(lblCliente))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (clienteTelefoneEditar == null) {

            String nome = txtTelefone.getText();

            Cliente clienteSelecionado = (Cliente) cboCliente.getModel().getSelectedItem();

            int id_cliente = clienteSelecionado.getId();

            try {
                dao.insert(id_cliente, nome);
                JOptionPane.showMessageDialog(this, "Telefone Inserido com Sucesso!", "SUCESS", JOptionPane.INFORMATION_MESSAGE);

                parentDialog.carregarListaTelefone();

                limparCampos();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            String telefoneCliente = txtTelefone.getText();

            Cliente clienteSelecionado = (Cliente) cboCliente.getModel().getSelectedItem();

            int id_cliente = clienteSelecionado.getId();

            int id = clienteTelefoneEditar.getId_telefone();

            try {
                dao.update( id_cliente, telefoneCliente, id);
                JOptionPane.showMessageDialog(this, "Telefone da Cliente Editado com Sucesso!", "SUCESS", JOptionPane.INFORMATION_MESSAGE);

                parentDialog.carregarListaTelefone();

                this.dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ProjetoLocadoraVeiculos.gui.cadastro;

import ProjetoLocadoraVeiculos.dao.ClienteDAO;
import ProjetoLocadoraVeiculos.dao.SeguradoraDAO;
import ProjetoLocadoraVeiculos.entity.Cliente;
import ProjetoLocadoraVeiculos.entity.Seguradora;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Riquetti
 */
public class CadastroClienteGUI extends javax.swing.JDialog {

    private ClienteDAO dao = new ClienteDAO();

    /**
     * Creates new form CadastroFabricanteGUI
     */
    public CadastroClienteGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        carregarLista();

    }

    public void carregarLista() {
        List<Cliente> listaCliente = dao.select();

        Object[][] dados = new Object[listaCliente.size()][10];

        int i = 0;

        for (Cliente cliente : listaCliente) {
            dados[i][0] = cliente.getId();
            dados[i][1] = cliente.getNome_cliente();
            dados[i][2] = cliente.getRg();
            dados[i][3] = cliente.getCpf();
            dados[i][4] = cliente.getLogradouro();
            dados[i][5] = cliente.getMunicipio();
            dados[i][6] = cliente.getEstado();
            dados[i][7] = cliente.getCnh();
            dados[i][8] = cliente.getCnhdatavencimento();
            dados[i][9] = cliente.getEmail_cliente();

            i++;
        }

        TableModel model = new DefaultTableModel(dados,
                new Object[]{
                    "Id", "Nome", "RG", "CPF", "Logradouro","Municipio",
                     "Estado", "CNH", "Data Vencimento", "E-mail"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblCliente.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        CadastroClienteEditarGUI dialog = new CadastroClienteEditarGUI(null, true, this);
        dialog.setVisible(true);
        carregarLista();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int selectedRow = tblCliente.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada. Selecione uma linha para editar.", "Sem Linha Selecionada", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        CadastroClienteEditarGUI dialog = new CadastroClienteEditarGUI(null, true, this);
        dialog.carregarCliente((Integer) tblCliente.getModel().getValueAt(selectedRow, 0));
        dialog.setVisible(true);

        carregarLista();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id = (Integer) tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 0);

        try {
            dao.delete(id);

            JOptionPane.showMessageDialog(this, "Seguradora excluida com Sucesso!", "SUCESS", JOptionPane.INFORMATION_MESSAGE);

            carregarLista();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
}

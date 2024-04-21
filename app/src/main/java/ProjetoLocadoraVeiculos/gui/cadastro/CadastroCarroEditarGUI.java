/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ProjetoLocadoraVeiculos.gui.cadastro;

import ProjetoLocadoraVeiculos.dao.CarroDAO;
import ProjetoLocadoraVeiculos.dao.FabricanteDAO;
import ProjetoLocadoraVeiculos.dao.ModeloDAO;
import ProjetoLocadoraVeiculos.entity.Carro;
import ProjetoLocadoraVeiculos.entity.Fabricante;
import ProjetoLocadoraVeiculos.entity.Modelo;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Riquetti
 */
public class CadastroCarroEditarGUI extends javax.swing.JDialog {
        
    // corrigir update
    // corrigir entrada com numeros com virgulas
    // filtro de fabricante de filtrar modelo
    
    private CarroDAO dao = new CarroDAO();
    private Carro carroEditar = null;
    private CadastroCarroGUI parentDialog;

    /**
     * Creates new form CadastroFabricanteEditarGUI
     */
    public CadastroCarroEditarGUI(java.awt.Frame parent, boolean modal, CadastroCarroGUI dialogParent) {
        super(parent, modal);
        parentDialog = dialogParent;

        initComponents();

        carregarComboFabricante();
        carregarComboModelo();
    }

    public void carregarCarro(int id) {
        carroEditar = dao.select(id);

        txtPlaca.setText(String.valueOf(carroEditar.getPlaca()));
        txtCor.setText(String.valueOf(carroEditar.getCor()));
        cbxDisponivel.setSelected(carroEditar.isDisponivel());
        txtAno.setText(String.valueOf(carroEditar.getAno()));
        txtValorLocacao.setText(String.valueOf(carroEditar.getValorLocacao()));
        

    }

    private void carregarComboFabricante() {
        FabricanteDAO dao = new FabricanteDAO();
        List<Fabricante> listaFabricante = dao.select();

        Object[] items = new Object[listaFabricante.size()];

        int contador = 0;

        for (Fabricante fabricante : listaFabricante) {
            items[contador] = fabricante;

            contador++;
        }

        ComboBoxModel model = new DefaultComboBoxModel(items);

        cboFabricante.setModel(model);
    }

    private void carregarComboModelo() {
        ModeloDAO dao = new ModeloDAO();
        List<Modelo> listaModelo = dao.select();

        Object[] items = new Object[listaModelo.size()];

        int contador = 0;

        for (Modelo modelo : listaModelo) {
            items[contador] = modelo;

            contador++;
        }

        ComboBoxModel model = new DefaultComboBoxModel(items);

        cboModelo.setModel(model);
    }

    private void limparCampos() {
        txtAno.setText("");
        txtCor.setText("");
        txtPlaca.setText("");
        txtValorLocacao.setText("");
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
        lblFabricante = new javax.swing.JLabel();
        cboFabricante = new javax.swing.JComboBox<>();
        lblModelo = new javax.swing.JLabel();
        cboModelo = new javax.swing.JComboBox<>();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        lblValorLocacao = new javax.swing.JLabel();
        txtValorLocacao = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        cbxDisponivel = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblFabricante.setText("Fabricante");

        lblModelo.setText("Modelo");

        lblAno.setText("Ano");

        lblValorLocacao.setText("Valor Loca��o");

        lblPlaca.setText("Placa");

        lblCor.setText("Cor");

        cbxDisponivel.setText("Dispon�vel");

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
                            .addComponent(lblFabricante)
                            .addComponent(cboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModelo)
                            .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCor)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAno)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorLocacao)
                            .addComponent(txtValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbxDisponivel)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(btnSalvar)
                            .addGap(18, 18, 18)
                            .addComponent(btnFechar))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFabricante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValorLocacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(cbxDisponivel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnSalvar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (carroEditar == null) {
            

            Fabricante fabricanteSelecionado = (Fabricante) cboFabricante.getModel().getSelectedItem();
            Modelo modeloSelecionado = (Modelo) cboModelo.getModel().getSelectedItem();
            // criar para modelo

            String placa = txtPlaca.getText();
            String cor = txtCor.getText();
            boolean disponivel = cbxDisponivel.isSelected();
            Integer ano = Integer.parseInt(txtAno.getText());
            Double valorLocacao = Double.parseDouble(txtValorLocacao.getText());

            Integer idFabricante = fabricanteSelecionado.getId();
            Integer idModelo = modeloSelecionado.getId();

            try {
                dao.insert(placa, cor, disponivel, ano, valorLocacao, idFabricante, idModelo);
                JOptionPane.showMessageDialog(this, "Modelo Inserido com Sucesso!", "SUCESS", JOptionPane.INFORMATION_MESSAGE);

                parentDialog.carregarLista();

                limparCampos();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {

            Fabricante fabricanteSelecionado = (Fabricante) cboFabricante.getModel().getSelectedItem();
            Modelo modeloSelecionado = (Modelo) cboModelo.getModel().getSelectedItem();

            String placa = txtPlaca.getText();
            String cor = txtCor.getText();
            boolean disponivel = cbxDisponivel.isSelected();
            int ano = Integer.parseInt(txtAno.getText());
            double valorLocacao = Double.parseDouble(txtValorLocacao.getText());

            int idFabricante = fabricanteSelecionado.getId();
            int idModelo = modeloSelecionado.getId();
            
            int id = carroEditar.getId();

            try {
                dao.update(placa, cor, disponivel, ano, valorLocacao, idFabricante, idModelo, id);
                JOptionPane.showMessageDialog(this, "Modelo Editado com Sucesso!", "SUCESS", JOptionPane.INFORMATION_MESSAGE);

                parentDialog.carregarLista();

                this.dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cboFabricante;
    private javax.swing.JComboBox<String> cboModelo;
    private javax.swing.JCheckBox cbxDisponivel;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblValorLocacao;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValorLocacao;
    // End of variables declaration//GEN-END:variables
}

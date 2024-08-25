
package br.com.ifba.prg03_scedu.gestaoalunos.view;

import br.com.ifba.prg03_scedu.gestaoalunos.controller.GestaoAlunoIController;
import br.com.ifba.prg03_scedu.gestaoalunos.entity.AlunosPrincipal;
import br.com.ifba.prg03_scedu.Prg03SceduApplication;
import jakarta.persistence.NoResultException;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class TelaListar extends javax.swing.JFrame {
    //Atributos usados na classe
    private static final Logger log = LoggerFactory.getLogger(TelaListar.class);
    private final GestaoAlunoIController gestaoAlunoController;

    public TelaListar(GestaoAlunoIController gestaoAlunoController) {
        log.info("Inicializando componentes da tela de listagem de alunos");
        initComponents();
        this.gestaoAlunoController = gestaoAlunoController;
        refresh();
    }
    
    //Método reponsável por atualiza os dados da tabela
    private void refresh(){
        
        try{
            log.info("Carregando dados da tabela de alunos");
            // Cria uma consulta JPQL para selecionar todos os registros da entidade Alunos
            List<AlunosPrincipal> dadosTabela = this.gestaoAlunoController.findAll();

            // Obtém o modelo da tabela associado ao componente tblAlunos
            DefaultTableModel dtmAlunos = (DefaultTableModel)tblAlunos.getModel();

            // Remove todas as linhas existentes no modelo da tabela
            dtmAlunos.setRowCount(0);

            for(AlunosPrincipal lista: dadosTabela){
                // Cria um array de objetos contendo os dados de cada aluno
                Object[] dados = {lista.getId(),lista.getNomeSocial(), lista.getEmail(), lista.getNascimento()};

                // Adiciona uma nova linha no modelo da tabela com os dados do aluno
                dtmAlunos.addRow(dados);
            }
            dtmAlunos.fireTableDataChanged();
        }catch(Exception e){
            log.error("Erro ao carregar dados da tabela", e);
            JOptionPane.showMessageDialog(null, "Erro ao buscar todos os alunos", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFuncoes = new javax.swing.JPanel();
        txtProcura = new javax.swing.JTextField();
        btnAdcionar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnProcura = new javax.swing.JButton();
        pnlTabela = new javax.swing.JPanel();
        slpTabela = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlFuncoes.setBackground(new java.awt.Color(8, 102, 255));
        pnlFuncoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtProcura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtProcura.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtProcura.setDoubleBuffered(true);

        btnAdcionar.setText("ADICIONAR");
        btnAdcionar.setBorder(null);
        btnAdcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcionarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.setBorder(null);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnProcura.setBackground(new java.awt.Color(8, 102, 255));
        btnProcura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lupav1.png"))); // NOI18N
        btnProcura.setBorder(null);
        btnProcura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcuraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFuncoesLayout = new javax.swing.GroupLayout(pnlFuncoes);
        pnlFuncoes.setLayout(pnlFuncoesLayout);
        pnlFuncoesLayout.setHorizontalGroup(
            pnlFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcura)
                .addGap(56, 56, 56)
                .addComponent(btnAdcionar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        pnlFuncoesLayout.setVerticalGroup(
            pnlFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncoesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdcionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFuncoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProcura)
                        .addComponent(txtProcura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnlTabela.setBackground(new java.awt.Color(8, 102, 255));
        pnlTabela.setFocusable(false);

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Aluno", "Nome Social", "Nome Responsável", "Telefone", "Email", "Data de Nascimento"
            }
        ));
        tblAlunos.getTableHeader().setReorderingAllowed(false);
        slpTabela.setViewportView(tblAlunos);

        javax.swing.GroupLayout pnlTabelaLayout = new javax.swing.GroupLayout(pnlTabela);
        pnlTabela.setLayout(pnlTabelaLayout);
        pnlTabelaLayout.setHorizontalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slpTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTabelaLayout.setVerticalGroup(
            pnlTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slpTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFuncoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void btnAdcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcionarActionPerformed
        // Instanciamento da tela da de adição de alunos
        log.info("Ação de adicionar aluno iniciada");
        TelaAdicionar novaTela = new TelaAdicionar(gestaoAlunoController);
        novaTela.setVisible(true);
        
        // Adiciona um ouvinte de eventos de janela à nova tela
        novaTela.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                log.info("Tela de adicionar aluno fechada");
                refresh();
            } 
        });
    }//GEN-LAST:event_btnAdcionarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Verifica se há uma linha selecionada na tabela
        if(tblAlunos.getSelectedRow() != -1){
            log.info("Ação de exclusão de aluno iniciada");
            // Exibe uma caixa de diálogo de confirmação ao usuário
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (resposta == JOptionPane.YES_OPTION) {
                try{    
                    // Obtém o ID do aluno a ser removido da linha selecionada na tabela
                    Object idAlunoRemover = tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 0);
                    log.info("Excluindo aluno com ID: {}", idAlunoRemover);
                    //Encontra o aluno
                    AlunosPrincipal alunoRemover = this.gestaoAlunoController.findById((Long)idAlunoRemover);
                    //Exclui o aluno
                    this.gestaoAlunoController.delete(alunoRemover);
                    log.info("Aluno excluído com sucesso");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao deletar o aluno", "ERRO", JOptionPane.ERROR_MESSAGE);
                    log.error("Erro ao excluir aluno", e);
                }
            }else{
                // Exibe uma mensagem indicando que a operação foi cancelada
                JOptionPane.showConfirmDialog(null, "Operaçao Cancelada", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.CANCEL_OPTION);
                log.info("Ação de exclusão de aluno cancelada");
            }
        }else{
            // Exibe uma mensagem de erro se nenhuma linha estiver selecionada
            JOptionPane.showConfirmDialog(null, "Selecione um Aluno para Excluir", "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            log.warn("Nenhum aluno selecionado para exclusão");
        }
        // Atualiza a tabela recarregando os dados
        refresh();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnProcuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcuraActionPerformed
        // Obtém o nome do aluno que o usuário deseja pesquisar
        log.info("Ação de pesquisa de aluno iniciada");
        String busca = txtProcura.getText();
        List<AlunosPrincipal> alunosBuscados;
        try {
            log.info("Procurando alunos com texto: {}", busca);
            // Tenta obter a lista de resultados da consulta
            alunosBuscados = this.gestaoAlunoController.findByNome(busca);
        } catch (NoResultException e) {
            alunosBuscados = null;
        }

        if (alunosBuscados != null) {
            // Atualiza a tabela para mostrar os resultados
            DefaultTableModel dtmAlunos = (DefaultTableModel) tblAlunos.getModel();
            dtmAlunos.setRowCount(0);  // Limpa todos os dados da tabela

            for(AlunosPrincipal lista: alunosBuscados){
                // Cria um array de objetos contendo os dados de cada aluno
                Object[] dados = {lista.getId(),lista.getNomeSocial(), lista.getPai().getNome(), lista.getEmail(), lista.getNascimento()};

                // Adiciona uma nova linha no modelo da tabela com os dados do aluno
                dtmAlunos.addRow(dados);
            }
            // Limpa o texto de busca da caixa de texto
            txtProcura.setText("");
        } else {
            log.error("Aluno com texto: {} não encontrado", busca);
            JOptionPane.showMessageDialog(null, "Erro ao procurar o aluno pelo nome " + busca, "Erro", JOptionPane.WARNING_MESSAGE);
            refresh();
        }
    }//GEN-LAST:event_btnProcuraActionPerformed
                            
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{    
            // Verifica se há uma linha selecionada na tabela
            if(tblAlunos.getSelectedRow() != -1){
                log.info("Ação de edição de aluno iniciada");
                // Obtém o ID do aluno a ser removido da linha selecionada na tabela
                Object alunoEditado = tblAlunos.getValueAt(tblAlunos.getSelectedRow(), 0);
                // Instanciamento da tela da de adição de alunos
                log.info("Editando aluno com ID: {}", alunoEditado);
                TelaEditarAluno novaTela = new TelaEditarAluno((Long)alunoEditado, this.gestaoAlunoController);
                novaTela.setVisible(true);
                // Adiciona um ouvinte de eventos de janela à nova tela
                novaTela.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        log.info("Tela de edição de aluno fechada");
                        refresh();
                    }
                });
            }else{
                log.warn("Nenhum aluno selecionado para edição");
                JOptionPane.showConfirmDialog(null, "Selecione um Aluno para Editar", "Erro", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            log.error("Aluno com ID: {} não encontrado para edição",e);
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados do aluno", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form*/ 
            ConfigurableApplicationContext context = 
        new SpringApplicationBuilder(Prg03SceduApplication.class)
        .headless(false)
        .run(args);

        TelaListar telaListar = context.getBean(TelaListar.class);
        telaListar.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdcionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnProcura;
    private javax.swing.JPanel pnlFuncoes;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JScrollPane slpTabela;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txtProcura;
    // End of variables declaration//GEN-END:variables
}

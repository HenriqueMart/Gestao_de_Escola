/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prg03_scedu.gestaoprofessor.view;

import br.com.ifba.prg03_scedu.gestaoprofessor.controller.ProfessorIController;
import br.com.ifba.prg03_scedu.gestaoprofessor.entity.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class ProfessorCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form ProfessorCadastrar
     */
    
    private final ProfessorIController professorControler;
    private static final Logger logger = Logger.getLogger(ProfessorEditar.class.getName());
    
    public ProfessorCadastrar(ProfessorIController professorControler) {
        initComponents();
        this.professorControler = professorControler;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtN1 = new javax.swing.JLabel();
        lblMateria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JTextField();
        lblNome = new javax.swing.JTextField();
        lblFormado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtN1.setBackground(new java.awt.Color(0, 0, 0));
        txtN1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtN1.setForeground(new java.awt.Color(255, 255, 255));
        txtN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtN1.setText("Cadastro De Professor");

        lblMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMateriaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Formado");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de Nascimento");

        lblNascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNascimento.setText("01/01/2024");
        lblNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNascimentoActionPerformed(evt);
            }
        });

        lblNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNomeActionPerformed(evt);
            }
        });

        lblFormado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFormado.setText("Sim");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");

        lblCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCpfActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Área de Formação");

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        BtnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnCadastrar.setText("CADASTRAR");
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 310, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFormado)
                                .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(148, 148, 148))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNomeActionPerformed

    private void lblCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCpfActionPerformed

    private void lblMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMateriaActionPerformed

    private void lblNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNascimentoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        try {  
            cadastramento();
        } catch (ParseException ex) {
            Logger.getLogger(ProfessorCadastrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    
    private void cadastramento() throws ParseException{
        
        Professor professor = new Professor();

        String nome = lblNome.getText();
        String cpf = lblCpf.getText();
        String materia = lblMateria.getText();

        // Verificando se o campo nome, cpf e materia estão preenchidos
        if (nome == null || nome.trim().isEmpty() || cpf == null || cpf.trim().isEmpty() || materia == null || materia.trim().isEmpty()) {
            JOptionPane.showInternalMessageDialog(null, "Por favor, preencha todos os campos obrigatórios!");
            return;
        }

        // Atribuindo os valores ao objeto professor
        professor.setNome(nome);
        professor.setCpf(cpf);
        professor.setMateria(materia);

        // Verificação e conversão da data de nascimento 
        SimpleDateFormat nascimento = new SimpleDateFormat("dd/MM/yyyy");
        
        Calendar calendario = Calendar.getInstance();
        
        
        if(isDataValida(lblNascimento.getText())){
            Date nascimentostr = nascimento.parse(lblNascimento.getText()); // Converte a String para Datecalendario.setTime(nascimentostr);
            calendario.setTime(nascimentostr);
            int ano = calendario.get(Calendar.YEAR);
            if (ano < 1920 || ano > 2024) {
                JOptionPane.showInternalMessageDialog(null, "Ano de nascimento inválido. O ano deve estar entre 1920 e 2024.");
                return;
            }
        
        //Verificando Erro na chamada no método
       try { 
            professor.setNascimento(nascimentostr);
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Data de Nascimento Inválida");
            return;
        }
       
       

        // Salvando se o professor é formado
        professor.setFormado(lblFormado.isSelected());

        // Salvando o professor no banco de dados
        this.professorControler.save(professor);
        
        

        // Mensagem de confirmação
        JOptionPane.showInternalMessageDialog(null, "Salvo com sucesso!");
        dispose();  
        return;
        }else{
        JOptionPane.showInternalMessageDialog(null, "Digita o dia e o mês Corretamente: 31/12/....");
        }
    }
    public static boolean isDataValida(String dataStr) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); // Força a validação estrita da data

        try {
            Date data = formato.parse(dataStr); // Tenta converter a string em uma data válida
            return true; // A data é válida
        } catch (ParseException e) {
            return false; // A data é inválida
        }
    }
    
    public static void main(String args[]) { 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblCpf;
    private javax.swing.JCheckBox lblFormado;
    private javax.swing.JTextField lblMateria;
    private javax.swing.JTextField lblNascimento;
    private javax.swing.JTextField lblNome;
    private javax.swing.JLabel txtN1;
    // End of variables declaration//GEN-END:variables
}

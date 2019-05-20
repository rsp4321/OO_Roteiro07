package gui;

import classes.*;
import controller.*;
import java.util.*;

/*
 * @author Arma X
 */
public class FrPrincipal extends javax.swing.JFrame {

    public ArrayList<Cliente> lstCliente;
    public ArrayList<Engenheiro> lstEngenheiro;
    public ArrayList<Diretor> lstDiretor;
    public ArrayList<Secretario> lstSecretario;
    public ArrayList<Gerente> lstGerente;

    public FrPrincipal() {
        initComponents();
        edtNome.setEnabled(false);
        edtIdade.setEnabled(false);
        edtSexo.setEnabled(false);
        edtSalario.setEnabled(false);
        edtCpf.setEnabled(false);
        edtGerenciaFuncionarios.setEnabled(false);
        edtSenha.setEnabled(false);
        edtCargaHoraria.setEnabled(false);

        this.lstCliente = new ArrayList();
        this.lstEngenheiro = new ArrayList();
        this.lstGerente = new ArrayList();
        this.lstDiretor = new ArrayList();
        this.lstSecretario = new ArrayList();
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblCargaHoraria = new javax.swing.JLabel();
        lblGerenciaFuncionarios = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtSexo = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        edtCpf = new javax.swing.JTextField();
        edtSalario = new javax.swing.JTextField();
        edtSenha = new javax.swing.JTextField();
        edtCargaHoraria = new javax.swing.JTextField();
        edtGerenciaFuncionarios = new javax.swing.JTextField();
        btnCliente = new javax.swing.JRadioButton();
        btnEngenheiro = new javax.swing.JRadioButton();
        btnGerente = new javax.swing.JRadioButton();
        btnDiretor = new javax.swing.JRadioButton();
        btnSecretario = new javax.swing.JRadioButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("CADASTRO");

        lblNome.setText("Nome");

        lblSexo.setText("Sexo");

        lblIdade.setText("Idade");

        lblCpf.setText("CPF");

        lblSalario.setText("Salário");

        lblSenha.setText("Senha");

        lblCargaHoraria.setText("Carga Horária");

        lblGerenciaFuncionarios.setText("Nº Funcionários");

        btnGrupo.add(btnCliente);
        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnGrupo.add(btnEngenheiro);
        btnEngenheiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEngenheiro.setText("Engenheiro");
        btnEngenheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngenheiroActionPerformed(evt);
            }
        });

        btnGrupo.add(btnGerente);
        btnGerente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGerente.setText("Gerente");
        btnGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenteActionPerformed(evt);
            }
        });

        btnGrupo.add(btnDiretor);
        btnDiretor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDiretor.setText("Diretor");
        btnDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiretorActionPerformed(evt);
            }
        });

        btnGrupo.add(btnSecretario);
        btnSecretario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSecretario.setText("Secretario");
        btnSecretario.setToolTipText("");
        btnSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecretarioActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setMaximumSize(new java.awt.Dimension(150, 45));
        btnNovo.setMinimumSize(new java.awt.Dimension(150, 45));
        btnNovo.setPreferredSize(new java.awt.Dimension(150, 45));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setMaximumSize(new java.awt.Dimension(150, 45));
        btnEditar.setMinimumSize(new java.awt.Dimension(150, 45));
        btnEditar.setPreferredSize(new java.awt.Dimension(150, 45));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setMaximumSize(new java.awt.Dimension(150, 45));
        btnSalvar.setMinimumSize(new java.awt.Dimension(150, 45));
        btnSalvar.setPreferredSize(new java.awt.Dimension(150, 45));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setMaximumSize(new java.awt.Dimension(150, 45));
        btnExcluir.setMinimumSize(new java.awt.Dimension(150, 45));
        btnExcluir.setPreferredSize(new java.awt.Dimension(150, 45));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setMaximumSize(new java.awt.Dimension(150, 45));
        btnCancelar.setMinimumSize(new java.awt.Dimension(150, 45));
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 45));

        edtResultado.setColumns(20);
        edtResultado.setRows(5);
        jScrollPane1.setViewportView(edtResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblSalario)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(edtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(lblCargaHoraria)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(edtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblNome)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(33, 33, 33)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(39, 39, 39)
                                                    .addComponent(lblGerenciaFuncionarios)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(edtGerenciaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lblSenha)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(lblSexo)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lblIdade)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(29, 29, 29)
                                                    .addComponent(lblCpf)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnCliente)
                                            .addGap(32, 32, 32)
                                            .addComponent(btnEngenheiro)
                                            .addGap(43, 43, 43)
                                            .addComponent(btnGerente)
                                            .addGap(38, 38, 38)
                                            .addComponent(btnDiretor)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSecretario)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliente)
                    .addComponent(btnEngenheiro)
                    .addComponent(btnGerente)
                    .addComponent(btnDiretor)
                    .addComponent(btnSecretario))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIdade)
                            .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo)
                            .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf)
                            .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGerenciaFuncionarios)
                            .addComponent(edtGerenciaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha)
                            .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSalario)
                                .addComponent(edtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lblCargaHoraria))
                                .addComponent(edtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        edtNome.setEnabled(true);
        edtIdade.setEnabled(true);
        edtSexo.setEnabled(true);
        edtSalario.setEnabled(false);
        edtCpf.setEnabled(true);
        edtGerenciaFuncionarios.setEnabled(false);
        edtSenha.setEnabled(false);
        edtCargaHoraria.setEnabled(false);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnEngenheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngenheiroActionPerformed
        // TODO add your handling code here:
        edtNome.setEnabled(true);
        edtIdade.setEnabled(true);
        edtSexo.setEnabled(true);
        edtSalario.setEnabled(true);
        edtCpf.setEnabled(false);
        edtGerenciaFuncionarios.setEnabled(false);
        edtSenha.setEnabled(false);
        edtCargaHoraria.setEnabled(true);
    }//GEN-LAST:event_btnEngenheiroActionPerformed

    private void btnGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenteActionPerformed
        // TODO add your handling code here:
        edtNome.setEnabled(true);
        edtIdade.setEnabled(true);
        edtSexo.setEnabled(true);
        edtSalario.setEnabled(true);
        edtCpf.setEnabled(false);
        edtGerenciaFuncionarios.setEnabled(true);
        edtSenha.setEnabled(true);
        edtCargaHoraria.setEnabled(true);
    }//GEN-LAST:event_btnGerenteActionPerformed

    private void btnDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiretorActionPerformed
        // TODO add your handling code here:
        edtNome.setEnabled(true);
        edtIdade.setEnabled(true);
        edtSexo.setEnabled(true);
        edtSalario.setEnabled(true);
        edtCpf.setEnabled(false);
        edtGerenciaFuncionarios.setEnabled(false);
        edtSenha.setEnabled(true);
        edtCargaHoraria.setEnabled(true);
    }//GEN-LAST:event_btnDiretorActionPerformed

    private void btnSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecretarioActionPerformed
        // TODO add your handling code here:
        edtNome.setEnabled(true);
        edtIdade.setEnabled(true);
        edtSexo.setEnabled(true);
        edtSalario.setEnabled(true);
        edtCpf.setEnabled(false);
        edtGerenciaFuncionarios.setEnabled(false);
        edtSenha.setEnabled(false);
        edtCargaHoraria.setEnabled(true);
    }//GEN-LAST:event_btnSecretarioActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if(btnCliente.isSelected()){
            salvarCliente();
            limparTexto();
        }
        if(btnEngenheiro.isSelected()){
            salvarEngenheiro();
            limparTexto();
        }
        if(btnDiretor.isSelected()){
            salvarDiretor();
            limparTexto();
        }
        if(btnSecretario.isSelected()){
            salvarSecretario();
            limparTexto();
        }
        if(btnGerente.isSelected()){
            salvarGerente();
            limparTexto();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void limparTexto() {
        edtNome.setText("");
        edtIdade.setText("");
        edtSexo.setText("");
        edtSalario.setText("");
        edtCpf.setText("");
        edtGerenciaFuncionarios.setText("");
        edtSenha.setText("");
        edtCargaHoraria.setText("");
    }

    private void salvarCliente() {
        String nome = edtNome.getText();
        int idade = Integer.parseInt(edtIdade.getText());
        char sexo = edtSexo.getText().charAt(0);
        String cpf = edtCpf.getText();

        Cliente c = new Cliente();
        c.preencher(nome, sexo, idade, cpf);

        lstCliente.add(c);

        String imprimirFr = "";
        for (int i = 0; i < lstCliente.size(); ++i) {
            imprimirFr = imprimirFr + lstCliente.get(i).imprimir() + "\n\n";
        }
        edtResultado.setText(imprimirFr);

    }

    private void salvarEngenheiro() {
        String nome = edtNome.getText();
        int idade = Integer.parseInt(edtIdade.getText());
        char sexo = edtSexo.getText().charAt(0);
        float horasTrabalho = Float.parseFloat(edtCargaHoraria.getText());
        float salario = Float.parseFloat(edtSalario.getText());

        Engenheiro e = new Engenheiro();
        e.preencher(nome, sexo, idade, horasTrabalho, salario);
        lstEngenheiro.add(e);

        String imprimirFr = "";
        for (int i = 0; i < lstEngenheiro.size(); ++i) {
            imprimirFr = imprimirFr + lstEngenheiro.get(i).imprimir() + "\n\n";
        }

        edtResultado.setText(imprimirFr);
    }

    private void salvarDiretor() {
        String nome = edtNome.getText();
        int idade = Integer.parseInt(edtIdade.getText());
        char sexo = edtSexo.getText().charAt(0);
        float horasTrabalho = Float.parseFloat(edtCargaHoraria.getText());
        float salario = Float.parseFloat((edtSalario.getText()));
        String senha = edtSenha.getText();

        Diretor d = new Diretor();
        d.preencher(nome, sexo, idade, horasTrabalho, salario, senha);

        lstDiretor.add(d);

        String imprimirFr = "";
        for (int i = 0; i < lstDiretor.size(); ++i) {
            imprimirFr = imprimirFr + lstDiretor.get(i).imprimir() + "\n\n";
        }

        edtResultado.setText(imprimirFr);
    }

    private void salvarSecretario() {
        String nome = edtNome.getText();
        int idade = Integer.parseInt(edtIdade.getText());
        char sexo = edtSexo.getText().charAt(0);
        float horasTrabalho = Float.parseFloat(edtCargaHoraria.getText());
        float salario = Float.parseFloat((edtSalario.getText()));

        Secretario s = new Secretario();
        s.preencher(nome, sexo, idade, horasTrabalho, salario);

        lstSecretario.add(s);

        String imprimirFr = "";
        for (int i = 0; i < lstSecretario.size(); ++i) {
            imprimirFr = imprimirFr + lstSecretario.get(i).imprimir() + "\n\n";
        }

        edtResultado.setText(imprimirFr);
    }

    private void salvarGerente() {
        String nome = edtNome.getText();
        int idade = Integer.parseInt(edtIdade.getText());
        char sexo = edtSexo.getText().charAt(0);
        float horasTrabalho = Float.parseFloat(edtCargaHoraria.getText());
        float salario = Float.parseFloat((edtSalario.getText()));
        String senha = edtSenha.getText();
        int pessoasGerenciadas = Integer.parseInt(edtGerenciaFuncionarios.getText());

        Gerente g = new Gerente();
        g.preencher(nome, sexo, idade, horasTrabalho, salario, senha, pessoasGerenciadas);

        lstGerente.add(g);

        String imprimirFr = "";
        for (int i = 0; i < lstGerente.size(); ++i) {
            imprimirFr = imprimirFr + lstGerente.get(i).imprimir() + "\n\n";
        }

        edtResultado.setText(imprimirFr);
    }

    public void atualizarTabela() {/*
        TMCliente clientes = new TMCliente(lstCliente);
        grdCliente.setModel(clientes);*/
    }

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
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnCliente;
    private javax.swing.JRadioButton btnDiretor;
    private javax.swing.JButton btnEditar;
    private javax.swing.JRadioButton btnEngenheiro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JRadioButton btnGerente;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JRadioButton btnSecretario;
    private javax.swing.JTextField edtCargaHoraria;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtGerenciaFuncionarios;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextArea edtResultado;
    private javax.swing.JTextField edtSalario;
    private javax.swing.JTextField edtSenha;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargaHoraria;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblGerenciaFuncionarios;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}

package gui;

import classes.*;
import controller.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * @author Arma X
 */
public class FrCadCliente extends javax.swing.JFrame implements TabelaAtualizavel, ExportavelParaCSV, ImportavelViaCSV {

    public ArrayList<Cliente> lstCliente;

//    public ArrayList<Engenheiro> lstEngenheiro;
//    public ArrayList<Diretor> lstDiretor;
//    public ArrayList<Secretario> lstSecretario;
//    public ArrayList<Gerente> lstGerente;
//    private TMCliente tm_cliente;
//    
//    
    private final String NOME_ARQUIVO = "registro_cliente.txt";

    // Como a equipe está desenvolvendo tanto no Windows quanto no linux,
    // vou utilizar a classe java.nio.file.Path para abstrair os diretórios
    // sem precisar utlizar métodos de detecção do sistema operacional por enquanto
    private final Path caminho_arquivo = Paths.get( // O objeto "Paths" constrói o objeto "Path" conforme as "partes" do diretório dadas
            System.getProperty("user.home") // a rotina System.getProperty() retorna algumas variáveis de ambiente definidas pela JVM no momento da execução. A veriável "user.home" retorna o diretório do usuário no sistema operacional
            ,
             "OO_Roteiro07" // Essa "parte" indica que se trata da pasta "OO_Aula5"
            //                "registro.txt");                    // Essa "parte" indica o arquivo
            ,
             NOME_ARQUIVO
    );

    public FrCadCliente() {
        initComponents();
        edtNome.setEnabled(false);
        edtIdade.setEnabled(false);
        edtSexo.setEnabled(false);
        edtSalario.setEnabled(false);
        edtCpf.setEnabled(false);

//        edtGerenciaFuncionarios.setEnabled(false);
//        edtSenha.setEnabled(false);
//        edtCargaHoraria.setEnabled(false);
        this.lstCliente = new ArrayList();

//        this.lstEngenheiro = new ArrayList();
//        this.lstGerente = new ArrayList();
//        this.lstDiretor = new ArrayList();
//        this.lstSecretario = new ArrayList();
        // inicializando a tabela
//        this.tm_cliente = new TMCliente(this.lstCliente);
//        TMCliente tm_cliente = new TMCliente(this.lstCliente);
//        this.grdLista.setModel(tm_cliente);
        this.atualizarTabela();
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
        edtNome = new javax.swing.JTextField();
        edtSexo = new javax.swing.JTextField();
        edtIdade = new javax.swing.JTextField();
        edtCpf = new javax.swing.JTextField();
        edtSalario = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdLista = new javax.swing.JTable();
        btnExportarCSV = new javax.swing.JButton();
        btnImportarCSV = new javax.swing.JButton();
        lblQtdCompras = new javax.swing.JLabel();
        edtQtdCompras = new javax.swing.JTextField();
        btnCalcularBonificacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("CADASTRO");

        lblNome.setText("Nome");

        lblSexo.setText("Sexo");

        lblIdade.setText("Idade");

        lblCpf.setText("CPF");

        lblSalario.setText("Salário");

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/novo.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setMaximumSize(new java.awt.Dimension(150, 45));
        btnNovo.setMinimumSize(new java.awt.Dimension(150, 45));
        btnNovo.setPreferredSize(new java.awt.Dimension(150, 45));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

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

        grdLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(grdLista);

        btnExportarCSV.setText("Exportar para CSV");
        btnExportarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarCSVActionPerformed(evt);
            }
        });

        btnImportarCSV.setText("Importar do CSV");
        btnImportarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarCSVActionPerformed(evt);
            }
        });

        lblQtdCompras.setText("Quantidade de compras feitas");

        btnCalcularBonificacao.setText("Calcular bônus!");
        btnCalcularBonificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularBonificacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(lblCpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQtdCompras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtQtdCompras)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcularBonificacao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnExportarCSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnImportarCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImportarCSV, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnExportarCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblIdade)
                        .addComponent(edtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSexo)
                        .addComponent(edtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCpf)
                        .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSalario)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(edtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblQtdCompras)
                                .addComponent(edtQtdCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCalcularBonificacao)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
//        if(btnCliente.isSelected()){
//            salvarCliente();
//            limparTexto();
//        }
//        if(btnEngenheiro.isSelected()){
//            salvarEngenheiro();
//            limparTexto();
//        }
//        if(btnDiretor.isSelected()){
//            salvarDiretor();
//            limparTexto();
//        }
//        if(btnSecretario.isSelected()){
//            salvarSecretario();
//            limparTexto();
//        }
//        if(btnGerente.isSelected()){
//            salvarGerente();
//            limparTexto();
//        }

        salvarCliente();
        limparTexto();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        this.habilitarCampos(); // Chamando o método para abstrair o processo de habilitação dos campos
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExportarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarCSVActionPerformed

        try {

            this.exportarParaCSV( /* "lista_cliente.csv" */);  // Chamando o método de exportação

        } catch (Exception ex) {
            Logger.getLogger(FrCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportarCSVActionPerformed

    private void btnImportarCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarCSVActionPerformed
        // TODO add your handling code here:

        this.importarCSV(); // Chamando o método definido via interface
    }//GEN-LAST:event_btnImportarCSVActionPerformed

    private void btnCalcularBonificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularBonificacaoActionPerformed

        Cliente c = this.gerarObjetoCliente();

        // Exibindo o valor do bônus
        JOptionPane.showMessageDialog(this, "O valor do bônus é: " + c.getBonificacao(), "Bônus",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCalcularBonificacaoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        // Descobrir o índice do registro selecionado na tabela
        
        int indice_selecionado = this.grdLista.getSelectedRow();
        
        // Pegar os valores
        String cpf = this.lstCliente.get(indice_selecionado).getCpf();
        String nome = this.lstCliente.get(indice_selecionado).getNome();
        int qtd_compras = this.lstCliente.get(indice_selecionado).getQtd_compras();
        int idade = this.lstCliente.get(indice_selecionado).getIdade();
        char sexo = this.lstCliente.get(indice_selecionado).getSexo();
        
        // Por nos campos
        edtCpf.setText(cpf);
        edtNome.setText(nome);
        edtQtdCompras.setText(Integer.toString(qtd_compras));
        edtIdade.setText(Integer.toString(idade));
        edtSexo.setText(Character.toString(sexo));
        
        this.habilitarCampos();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void limparTexto() {
        edtNome.setText("");
        edtIdade.setText("");
        edtSexo.setText("");
        edtSalario.setText("");
        edtCpf.setText("");

//        edtGerenciaFuncionarios.setText("");
//        edtSenha.setText("");
//        edtCargaHoraria.setText("");
    }

    private void salvarCliente() {
        String nome = edtNome.getText();
        int idade = Integer.parseInt(edtIdade.getText());
        char sexo = edtSexo.getText().charAt(0);
        String cpf = edtCpf.getText();
        int qtd_compras = Integer.parseInt(edtQtdCompras.getText());

        Cliente c = new Cliente();
//        c.preencher(nome, sexo, idade, cpf);
        c.preencher(nome, sexo, idade, cpf, qtd_compras);

        lstCliente.add(c);

//        String imprimirFr = "";
//        for (int i = 0; i < lstCliente.size(); ++i) {
//            imprimirFr = imprimirFr + lstCliente.get(i).imprimir() + "\n\n";
//        }
//        edtResultado.setText(imprimirFr);
        // Readicionando a lista para atualizar o objeto jTable "grdLista
//        TMCliente tm_cliente = new TMCliente(this.lstCliente);
//        this.grdLista.setModel(tm_cliente);
        // Chamando a rotina de atualização da tabela
        this.atualizarTabela();

    }

    private Cliente gerarObjetoCliente() {
        String nome = edtNome.getText();
        int idade = Integer.parseInt(edtIdade.getText());
        char sexo = edtSexo.getText().charAt(0);
        String cpf = edtCpf.getText();
        int qtd_compras = Integer.parseInt(edtQtdCompras.getText());

        Cliente c = new Cliente();
//        c.preencher(nome, sexo, idade, cpf);
        c.preencher(nome, sexo, idade, cpf, qtd_compras);

//        lstCliente.add(c);
//        String imprimirFr = "";
//        for (int i = 0; i < lstCliente.size(); ++i) {
//            imprimirFr = imprimirFr + lstCliente.get(i).imprimir() + "\n\n";
//        }
//        edtResultado.setText(imprimirFr);
        // Readicionando a lista para atualizar o objeto jTable "grdLista
//        TMCliente tm_cliente = new TMCliente(this.lstCliente);
//        this.grdLista.setModel(tm_cliente);
        // Chamando a rotina de atualização da tabela
//        this.atualizarTabela();
        return c;

    }

    @Override
    public void atualizarTabela() {
//    private void atualizarTabela() {

        TMCliente clientes = new TMCliente(lstCliente);
        this.grdLista.setModel(clientes);
    }

    /**
     * Método para abstrair o processo de habilitação dos campos
     */
    public void habilitarCampos() {

        this.edtCpf.setEnabled(true);
        this.edtIdade.setEnabled(true);
        this.edtNome.setEnabled(true);
        this.edtSalario.setEnabled(true);
        this.edtSexo.setEnabled(true);
    }

    @Override
    public void exportarParaCSV( /* String nome_arquivo */) /* throws Exception */ {

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//
        // Vamos utilizar a classe java.file.FileWriter para salvar no arquivo
        FileWriter file_writer_arquivo = null;

        // A classe java.file.PrintWriter fará a escrita no arquivo de fato
        PrintWriter print_writer_arquivo = null;

        try {
//            FileWriter file_writer_arquivo = null;

//            this.caminho_arquivo
            file_writer_arquivo = new FileWriter(caminho_arquivo.toString());   // Instanciando com o caminho definido no início da classe

            print_writer_arquivo = new PrintWriter(file_writer_arquivo);

            // Gerando a lista em formato CSV e colocando para imprimir no arquivo usando o método PrintWriter.print() 
            print_writer_arquivo.print(this.imprimirListaCSV());

            file_writer_arquivo.close();

            JOptionPane.showMessageDialog(this,
                    "Lista de clientes salva no arquivo '" + caminho_arquivo.toString() + "' com sucesso!",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
//            Logger.getLogger(FrCadAluno2.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(FrCadCliente.class.getName()).log(Level.SEVERE, null, ex);

            // Còdigo para finalizar o recurso "print_writer_arquivo"
        } finally {

            if (print_writer_arquivo != null) {
                print_writer_arquivo.close();
            }
        }
    }

    @Override
    public String imprimirListaCSV() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        int i;
        String csv = "";

//        for (i = 0; i < lista.size(); i++) {    // loop para percorrer os registros
        for (i = 0; i < this.lstCliente.size(); i++) {    // loop para percorrer os registros

//            csv += lista.get(i).getMatricula() + ";";   // campo "matrícula"
            csv += this.lstCliente.get(i).getCpf() + ";";   // campo "matrícula"

//            csv += lista.get(i).getNome() + ";";        // campo "nome"
            csv += this.lstCliente.get(i).getNome() + ";";        // campo "nome"

//            csv += lista.get(i).getIdade() + ";";       // campo "idade"
            csv += this.lstCliente.get(i).getIdade() + ";";       // campo "idade"

//            csv += lista.get(i).getSexo() + ";\n";      // campo "sexo"
//            csv += lista.get(i).getSexo() + ";";        // Para corrigir um incidente envolvendo o método de leitura, onde se lê o caracter "\n"
            csv += this.lstCliente.get(i).getSexo() + ";";        // Para corrigir um incidente envolvendo o método de leitura, onde se lê o caracter "\n"

            csv += this.lstCliente.get(i).getQtd_compras() + ";";
        }

        return csv;
    }

    @Override
    public void importarCSV() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        FileReader file_reader_arquivo = null;
        Scanner sc_arquivo = null;

//        ArrayList<Aluno> lstAluno = new ArrayList<>();
        ArrayList<Cliente> lstCliente = new ArrayList<>();

        try {


            // Usando o método Path.toString() para retornar o diretório no formato de string
            /*FileReader */ file_reader_arquivo = new FileReader(caminho_arquivo.toString());

            /*Scanner */ sc_arquivo = new Scanner(file_reader_arquivo);  // Criando um objeto "Scanner" para ler do objeto "FileReader"

            // Como o formato de arquivo escolhido é o CSV, vamos alterar o delimitador para o caractere ";"
            sc_arquivo.useDelimiter(";");

            // Por questão de ambiguidade do verificador de sintaxe da IDE e do compilador, fiz a inicialização manual das variáveis
            int /* cpf = 0, */ idade = -1;
            String cpf = "";

            String nome = "";
            char sexo = 'M';
            int qtd_compras = -1;

            // Ordem de colunas: Matricula -> Nome -> Idade -> Sexo
            // A estratégia é percorrer os campos até não haver mais nenhum para ler (informado pelo método sc_Arquivo.hasNext() )
            // Para tal, utilizaremos um while com uma variável de controle "campo" e um contador "i"
            // ela indicará qual o tipo de campo que é
            // Para fazer isso, faremos uma matemática básica
            // Como são 4 campos, se implementarmos um contador de campos, observaremos um certo padrão:
            // 1) O campo de matrícula aparecerá quando aparecer resto 0 numa divisão de i por 4;
            // 2) O campo de nome aparecerá quando aparecer resto 1 numa divisão de i por 4;
            // 3) O campo de idade aparecerá quando aparecer resto 2 numa divisão de i por 4;
            // 4) O campo de sexo aparecerá quando aparecer resto 3 numa divisão de i por 4.
            // A partir desses padrões, faremos a identificação do campo lido e colocaremos no vetor lstAluno
            int campo = 0, i = 0;

//            final int CAMPO_MATRICULA = 0;  // a cláusula "final" indica que se trata de uma constante
            final int CAMPO_CPF = 0;  // a cláusula "final" indica que se trata de uma constante

            final int CAMPO_NOME = 1;
            final int CAMPO_IDADE = 2;
            final int CAMPO_SEXO = 3;
            final int CAMPO_QTD_COMPRAS = 4;

            while (sc_arquivo.hasNext()) {

                campo = i % 4; // Obtendo o resto da divisão de i por 4

                switch (campo) {

//                    case CAMPO_MATRICULA:
                    case CAMPO_CPF:
//                        cpf = sc_arquivo.nextInt();
                        cpf = sc_arquivo.next();
                        break;

                    case CAMPO_NOME:
                        nome = sc_arquivo.next();
                        break;

                    case CAMPO_IDADE:
                        idade = sc_arquivo.nextInt();
                        break;

                    case CAMPO_SEXO:
                        sexo = sc_arquivo.next().charAt(0); // Por se tratar de um char, tem que retirar apenas o primeiro caracter

                        
                    case CAMPO_QTD_COMPRAS:
                        
                        // Como a quantidade de compras é o último campo, vamos instanciar o objeto e armazenar na lista
                        qtd_compras = sc_arquivo.nextInt();
                        
//                        Aluno a = new Aluno(nome, sexo, idade, cpf);  // Instanciando o aluno
                        Cliente a = new Cliente();  // Instanciando o cliente
                        
//                        a.preencher(nome, sexo, idade, cpf);
                        a.preencher(nome, sexo, idade, cpf, qtd_compras);

                        lstCliente.add(a);
                        break;
                }

                i++;    // Incrementando o contador para poder fazer a divisão
            }

            file_reader_arquivo.close();

            // Código gerado automaticamente pelo NetBeans
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrCadCliente.class.getName()).log(Level.SEVERE, null, ex);  // Esse método só faz o log do erro

            // Como o método FileReader.close() dispara uma exceção diferente ("IOException"), 
            // coloquei o método genérico para a classe "IOException"
        } catch (IOException e) {
            Logger.getLogger(FrCadCliente.class.getName()).log(Level.SEVERE, null, e);

        } finally { // A cláusula "finally" é recomendada pelo Java para finalizar os objetos ligados a recursos utilizados

            if (sc_arquivo != null) {
                sc_arquivo.close();
            }

            /*
            try {
                file_reader_arquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(FrCadAluno2.class.getName()).log(Level.SEVERE, null, ex);
            }
             */
        }

//        this.lista = lstCliente;
        this.lstCliente = lstCliente;

//        edtResultado.setText(this.imprimirListaCompleta());
        this.atualizarTabela();

        JOptionPane.showMessageDialog(this, "Arquivo '" + caminho_arquivo.toString() + "' carregado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrCadCliente().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularBonificacao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExportarCSV;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnImportarCSV;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtIdade;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtQtdCompras;
    private javax.swing.JTextField edtSalario;
    private javax.swing.JTextField edtSexo;
    private javax.swing.JTable grdLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtdCompras;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

}

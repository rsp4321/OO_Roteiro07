/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author aluno
 */
public interface ExportavelParaCSV {
    
    /**
     * Método para padronizar a exportação para CSV
     * 
     * //@param nome_arquivo
     * O nome do arquivo apenas (sem o diretório absoluto)
     * 
     * //@throws Exception 
     */
    public void exportarParaCSV ( /* String nome_arquivo */) /* throws Exception */ ;
    
    public String imprimirListaCSV();
}

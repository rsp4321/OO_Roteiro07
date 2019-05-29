package controller;

import classes.Cliente;
import classes.Diretor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * @author Arma X
 */
public class TMDiretor extends  AbstractTableModel {
    
//    private List<Cliente> lista;
private List<Diretor> lista;
    
    private final int COL_NOME = 0;
    private final int COL_SEXO = 1;
    private final int COL_IDADE = 2;
    private final int COL_CPF = 3;
    private final int COL_QTD_COMPRAS = 4;

    //Construtor
//    public TMCliente(List<Cliente> lst) {
    public TMDiretor(List<Diretor> lst) {
        this.lista = lst;
    }

    //Métodos abstratos
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
//        return 4;
        return 5;
    }

    public String getColumnName(int columnIndex) {
        if (columnIndex == COL_NOME) {
            return "NOME";
        } else if (columnIndex == COL_SEXO) {
            return "SEXO";
        } else if (columnIndex == COL_IDADE) {
            return "IDADE";
        } else if (columnIndex == COL_CPF) {
            return "CPF";
        
        } else if (columnIndex == this.COL_QTD_COMPRAS)
            return "QTD_COMPRAS";
        
        // Retornando o nome "-" indicando que não foi encontrada uma coluna com o índice indicado
        return "-";
    }

    @Override
    public Object getValueAt(int row, int col) {
//        Cliente a = this.lista.get(row);
    Diretor a = this.lista.get(row);

        if (col == COL_NOME) {
            return a.getNome();
        } else if (col == COL_SEXO) {
            return a.getSexo();
        } else if (col == COL_IDADE) {
            return a.getIdade();
        } else if (col == COL_CPF) {
            return a.getCpf();
        
        } else if (col == this.COL_QTD_COMPRAS)
            return a.getQtd_compras();
        
        return "-";
    }
}

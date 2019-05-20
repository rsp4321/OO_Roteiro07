package controller;

import classes.*;
import java.util.*;
import javax.swing.table.AbstractTableModel;

/*
 * @author Arma X
 */
/* abstract */ public class TMCliente extends AbstractTableModel {

    private List<Cliente> lista;

    private final int COL_NOME = 0;
    private final int COL_SEXO = 1;
    private final int COL_IDADE = 2;
    private final int COL_CPF = 3;

    //Construtor
    public TMCliente(List<Cliente> lst) {
        this.lista = lst;
    }

    //Métodos abstratos
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
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
        }
        
        // Retornando o nome "-" indicando que não foi encontrada uma coluna com o índice indicado
        return "-";
    }

    @Override
    public Object getValueAt(int row, int col) {
        Cliente a = this.lista.get(row);

        if (col == COL_NOME) {
            return a.getNome();
        } else if (col == COL_SEXO) {
            return a.getSexo();
        } else if (col == COL_IDADE) {
            return a.getIdade();
        } else if (col == COL_CPF) {
            return a.getCpf();
        }
        return "-";
    }

}

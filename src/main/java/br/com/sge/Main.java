package br.com.sge;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome("Dell");
        
        Produto notebook = new Produto();
        
        notebook.setNome("Notebook Inspiron");
        notebook.setCategoria("Informática");
        notebook.setQuantidade(20);
        notebook.setPrecoCompra(new BigDecimal("3500"));
        notebook.setPrecoVenda(new BigDecimal("4200"));
        notebook.setFornecedor(fornecedor);
        notebook.setStatus("ATIVO");
        
        System.out.println("Produto cadastrado com sucesso!");
        System.out.println(notebook.getNome());
        System.out.println(notebook.getFornecedor().getNome());
    }   
}

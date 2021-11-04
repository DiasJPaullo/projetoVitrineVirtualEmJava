package classesJava;

// @author diasj

import java.util.ArrayList;

 
public class Produtos {
    private ArrayList<Integer> id;
    private ArrayList<String> nome;
    private ArrayList<String> descricao;
    private ArrayList<String> preco;
    private ArrayList<String> nomeImagem;
    
    public Produtos(){}

    public ArrayList<Integer> getId() {
        return id;
    }

    public void setId(ArrayList<Integer> id) {
        this.id = id;
    }

    public ArrayList<String> getNome() {
        return nome;
    }

    public void setNome(ArrayList<String> nome) {
        this.nome = nome;
    }

    public ArrayList<String> getDescricao() {
        return descricao;
    }

    public void setDescricao(ArrayList<String> descricao) {
        this.descricao = descricao;
    }

    public ArrayList<String> getPreco() {
        return preco;
    }

    public void setPreco(ArrayList<String> preco) {
        this.preco = preco;
    }

    public ArrayList<String> getNomeImagem() {
        return nomeImagem;
    }

    public void setNomeImagem(ArrayList<String> nomeImagem) {
        this.nomeImagem = nomeImagem;
    }
   

}

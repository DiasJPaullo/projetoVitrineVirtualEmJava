package dados;

// @author diasj


import classesJava.ReadJson;

import java.util.ArrayList;

 
public class Mock {
   
    private ArrayList<Integer> listaId;
    private ArrayList<String> listaNome;
    private ArrayList<String> listaImagem;
    private ArrayList<String> listaPreco;
    private ArrayList<String> listaDescricao;
    ReadJson p = new ReadJson();
    
    public Mock() {
             
            this.listaId = p.retornaListaProduto().getId();
            this.listaNome = p.retornaListaProduto().getNome();
            this.listaPreco = p.retornaListaProduto().getPreco();
            this.listaImagem = p.retornaListaProduto().getNomeImagem();
            this.listaDescricao = p.retornaListaProduto().getDescricao();
    }

    

    public ArrayList<String> getListaNome() {
        return listaNome;
    }

    public void setListaNome(ArrayList<String> listaNome) {
        this.listaNome = listaNome;
    }

    public ArrayList<String> getListaImagem() {
        return listaImagem;
    }

    public void setListaImagem(ArrayList<String> listaImagem) {
        this.listaImagem = listaImagem;
    }

    public ArrayList<String> getListaPreco() {
        return listaPreco;
    }

    public void setListaPreco(ArrayList<String> listaPreco) {
        this.listaPreco = listaPreco;
    }

    public ArrayList<String> getListaDescricao() {
        return listaDescricao;
    }

    public void setListaDescricao(ArrayList<String> listaDescricao) {
        this.listaDescricao = listaDescricao;
    }

    public ArrayList<Integer> getListaId() {
        return listaId;
    }

    public void setListaId(ArrayList<Integer> listaId) {
        this.listaId = listaId;
    }
    

   
}
    


package db;

import java.util.ArrayList;
import java.util.List;

import models.Produtos;

public class ProdutosDB {

   private List<Produtos>produtosList = new ArrayList<>();

public List<Produtos> getProdutosList() {
    return produtosList;
}
   public void addNovoProduto(Produtos produto){
      
    produtosList.add(produto);
   }
}

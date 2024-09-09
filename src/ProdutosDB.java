import java.util.ArrayList;
import java.util.List;

public class ProdutosDB {

   private List<Produtos>produtosList = new ArrayList<>();

public List<Produtos> getProdutosList() {
    return produtosList;
}
   public void addNovoProduto(Produtos produto){
    produtosList.add(produto);
   }
}

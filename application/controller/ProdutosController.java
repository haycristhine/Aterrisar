package controller;
import produtos.Produto;
import view.ProdutosView;

public class ProdutosController {
	private Produto model;
	private ProdutosView view;

	public ProdutosController(Produto model, ProdutosView view) {
		this.model = model;
		this.view = view;
	}
	
   public void setProdutoName(String name){
      model.setName(name);	
   }

   public String getProdutoName(){
      return model.getName();		
   }

   public void setProdutoValor(float valor){
      model.setValor(valor);	
   }

   public float getProdutoValor(){
      return model.getValor();		
   }
   
   public void setProdutoDesconto(float desconto){
      model.setDesconto(desconto);
   }

   public float getProdutoDeconto(){
      return model.getDesconto();
   }
   
   public float getProdutoValorFinal() {
	   return model.getValorFinal();
   }

   public void updateView(){				
      view.printProdutoDetails(model.getName(), model.getValorFinal());
   }	

}

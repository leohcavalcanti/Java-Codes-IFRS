public class Atividade6 {
     public static void main(String[] args) {
	 String nomeProduto;
	 double valorProduto, fatura, faturaTotal;
	 int qtdEstoque, produtoVendido;
	 
	 System.out.print("Digite o nome do produto: ");
	 nomeProduto = System.console().readLine();
	 System.out.print("Digite o valor do produto: ");
	 valorProduto = Double.parseDouble(System.console().readLine());
	 System.out.print("Digite a quantidade de estoque: ");
	 qtdEstoque = Integer.parseInt(System.console().readLine());
	 
	 do{
		 System.out.print("Deseja vender quantos produtos: ");
		 produtoVendido = Integer.parseInt(System.console().readLine());
		 qtdEstoque = qtdEstoque - produtoVendido;
		 fatura = valorProduto * (double)produtoVendido;
		 faturaTotal = produtoVendido * valorProduto;
		 if(qtdEstoque == 0)
			 break;
	 }while(fatura != faturaTotal);
	 }
}

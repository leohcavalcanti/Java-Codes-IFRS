public class Exercicio2{
	public Exercicio2(){
		bolsaDeValores();
	}
	private void bolsaDeValores(){
		char tipoAcao;
		do{
			System.out.println("Uma letra qualquer a ser comercializada na bolsa de valores: ");
			tipoAcao = System.console().readLine().charAt(0);
			criarAcao(tipoAcao);
		}while(tipoAcao != 'f');
	}
	private void criarAcao(char tipoAcao){
		double precoDeCompra, precoDeVenda, lucro;
		int quantDaAcaoSuperior = 0, quantDeAcaoInferior = 0;
		System.out.println("Preço de compra: ");
		precoDeCompra = Double.parseDouble(System.console().readLine());
		System.out.println("Preço de venda: ");
		precoDeVenda = Double.parseDouble(System.console().readLine());
		lucro = precoDeVenda - precoDeCompra;
		if(lucro > 1.000){
			quantDaAcaoSuperior++;
		}else if(lucro < 200){
			quantDeAcaoInferior++;
		}
		System.out.println("Tipo de Ação : "+tipoAcao);
		System.out.println("Preco de compra: R$ "+precoDeCompra);
		System.out.println("Preco de venda : R$ "+precoDeVenda);
		System.out.println("Lucro          : R$ "+lucro);
	}
	public static void main(String[] args) {
		new Exercicio2();
	}
}
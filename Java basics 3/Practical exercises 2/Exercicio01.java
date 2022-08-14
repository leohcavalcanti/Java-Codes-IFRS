public class Exercicio01{
	String[] guardaNome = new String[10];
	int[] guardaCodigo = new int[10];
	double[] guardaProco = new double[10];
	String[] nomeProduto = new String[10];
	int[] codigoProduto = new int[10];
	double[] precoProduto = new double[10];
	String nome;
	int cont, codigo;
	double preco;
	public Exercicio01(){
		cadastro();
	}
	private void cadastro(){
		System.out.print("Cadastra Produtos\n");
		for(cont = 1; cont <= 3; cont++){
			System.out.printf("Nome do %d produto: ",cont);
			nome = System.console().readLine();
			nomeProduto[cont-1] = nome;
						
			System.out.printf("Código do %d produto: ",cont);
			codigo = Integer.parseInt(System.console().readLine());
			codigoProduto[cont-1] = codigo;
			
			System.out.printf("Preço do %d produto: ",cont);
			preco = Double.parseDouble(System.console().readLine());
			precoProduto[cont-1] = preco;

			int aumento = verificar();
			if(aumento > 0){
				System.out.println("Relatório");
				System.out.printf("Nome: %s, Código: %d, Preço: %.2f, aumento de %d.\n",nome ,codigo ,preco ,aumento);
			}
		}
		
	}
	private int verificar(){
		int aumento;
		if(precoProduto[cont-1] > 1000.00){
			if((codigoProduto[cont-1] % 2 == 0)){
				return aumento = 20;
			}
			return aumento = 10;
		}
		else if((codigoProduto[cont-1] % 2 == 0)){
			return aumento = 15;
		}
		return aumento = 0;
	}
	public static void main(String[] args) {
		new Exercicio01();
	}
}
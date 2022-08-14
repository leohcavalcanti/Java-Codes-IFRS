public class Exercicio03{
	String nome;
	String[] nomes = new String[8];
	int[] quantidade = new int[8];
	int cont = 0, quant, op;
	public Exercicio03(){
		principal();
	}
	private void principal(){
		System.out.println("1. Adicionar novo\n2. Alterar\n3. Mostrar informações");
		op = Integer.parseInt(System.console().readLine());
		if(op == 1){
			amazenar();
			cont++;
		}else if(op == 2){
			alteraQuant();
		}else{
			for(int i = 0; i <= quantidade.length; i++){
				System.out.printf("Nome: %s | Quantidade de DVD locados: %d\n",nomes[i] ,quantidade[i]);
			}
		}
		principal();
	}
	private void amazenar(){
		System.out.print("Nome: ");
		nome = System.console().readLine();
		nomes[cont] = nome;
		System.out.print("Quantidade de DVD locados: ");
		quant = Integer.parseInt(System.console().readLine());
		quantidade[cont] = quant;
	}
	private boolean verificar(){
		System.out.print("Informe o nome: ");
		nome = System.console().readLine();
		for(String nomesP : nomes){
			if(nomesP.equals(nome)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	private void alteraQuant(){
		if(!verificar()){
			System.out.println("Nome não Encontrado!");
		}else{
			System.out.print("Informe o DVD novo vendidos: ");
			quant = Integer.parseInt(System.console().readLine());
			for(int i = 0; i <= nomes.length; i++){
				if(nome.equals(nomes)){
					quantidade[i] = quant;
				}
			}
		}
	}
	public static void main(String[] args) {
		new Exercicio03();
	}
}
import java.util.Random;

public class Exercicio11{
	char reposta;
	public Exercicio11(){
		principal();
	}
	private void principal(){
		System.out.println("Resposta \nS. para Sim\nN. para Não!");
		Random gerador = new Random();
		int numDado = gerador.nextInt(3) + 1;

		if(numDado == 1){
			mamiferos();
		}else if(numDado == 2){
			aves();
		}else{
			repteis();
		}
	}
	private void mamiferos(){
		System.out.println("É Mamífero?");
		reposta = System.console().readLine().charAt(0);
		if(reposta == 'S'){
			System.out.println("É Quadrúpedes? ");
			reposta = System.console().readLine().charAt(0);
			if(reposta == 'S'){
				System.out.println("É carnívoros? ");
				reposta = System.console().readLine().charAt(0);
				if(reposta == 'S'){
					System.out.println("Leão");
				}else{
					System.out.println("Cavalo");
				}
			}
			else{
				System.out.println("É Bípedes? ");
				reposta = System.console().readLine().charAt(0);
				if(reposta == 'S'){
					System.out.println("É Onívoros? ");
					reposta = System.console().readLine().charAt(0);
					if(reposta == 'S'){
						System.out.println("Homem");
					}else{
						System.out.println("Macaco");
					}
				}else{
					System.out.println("É Voadores? ");
					reposta = System.console().readLine().charAt(0);
					if(reposta == 'S'){
						System.out.println("Morcego");
					}else{
						System.out.println("É Aquáticos? ");
						reposta = System.console().readLine().charAt(0);
						if(reposta == 'S'){
							System.out.println("Baleia");
						}else{
							mamiferos();
						}
					}
				}
			}
		}else{
			aves();
		}
			
	}
	private void aves(){
		System.out.println("É Aves?");
		reposta = System.console().readLine().charAt(0);
		if(reposta == 'S'){
			System.out.println("É Não-Voadoras?");
			reposta = System.console().readLine().charAt(0);
			if(reposta == 'S'){
				System.out.println("É Tropicais?");
				reposta = System.console().readLine().charAt(0);
				if(reposta == 'S'){
					System.out.println("Avestruz");
				}else{
					System.out.println("É Polares?");
					reposta = System.console().readLine().charAt(0);
					if(reposta == 'S'){
						System.out.println("Pinguim");
					}else{
						aves();
					}
				}
			}else{
				System.out.println("É Nadadores?");
				reposta = System.console().readLine().charAt(0);
				if(reposta == 'S'){
					System.out.println("Pato");
				}else{
					System.out.println("É De rapina?");
					reposta = System.console().readLine().charAt(0);
					if(reposta == 'S'){
						System.out.println("Águia");
					}else{
						aves();
					}
				}
			}
		}else{
			repteis();
		}
	}
	private void repteis(){
		System.out.println("É Répteis?");
		reposta = System.console().readLine().charAt(0);
		if(reposta == 'S'){
			System.out.println("É Com casco?");
			reposta = System.console().readLine().charAt(0);
			if(reposta == 'S'){
				System.out.println("Tartaruga");
			}else{
				System.out.println("É carnívoros?");
				reposta = System.console().readLine().charAt(0);
				if(reposta == 'S'){
					System.out.println("Crocodilo");
				}else{
					System.out.println("É Sem patas?");
					reposta = System.console().readLine().charAt(0);
					if(reposta == 'S'){
						System.out.println("Cobra");
					}else{
						repteis();
					}
				}
			}
		}else{
			mamiferos();
		}
	}
	public static void main(String[] args) {
		new Exercicio11();
	}
}
public class Detran{
	public static void main(String[] args) {
		int lastPlateNumber = 0, placaNumber;

		System.out.print("Informe o numero da placa: ");
		placaNumber = Integer.parseInt(System.console().readLine());
		lastPlateNumber = placaNumber % 10;

		switch(lastPlateNumber){
		case 0: System.out.println
			("Placas que terminam com 0 devem realizar a vistoria em Janeiro do próximo ano");
			break;
		case 1: System.out.println
			("Placas que terminam com 1 devem realizar a vistoria em Fevereiro do próximo ano");
			break;
		case 2: System.out.println
			("Placas que terminam com 2 devem realizar a vistoria em Março do próximo ano");
			break;
		case 3: System.out.println
			("Placas que terminam com 3 devem realizar a vistoria em Abril do próximo ano");
			break;
		case 4: System.out.println
			("Placas que terminam com 4 devem realizar a vistoria em Maio do próximo ano");
			break;
		case 5: System.out.println
			("Placas que terminam com 5 devem realizar a vistoria em Junho do próximo ano");
			break;
		case 6: System.out.println
			("Placas que terminam com 6 devem realizar a vistoria em Setembro deste ano");
			break;
		case 7: System.out.println
			("Placas que terminam com 7 devem realizar a vistoria em Outubro deste ano");
			break;
		case 8: System.out.println
			("Placas que terminam com 8 devem realizar a vistoria em Novembro deste ano");
			break;
		case 9: System.out.println
			("Placas que terminam com 9 devem realizar a vistoria em Dezembro deste ano");
			break;
		}
	}
}
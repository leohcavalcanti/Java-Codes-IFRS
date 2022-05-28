public class Market {
     public static void main(String[] args) {
	 String productName;
	 double productValue, invoice, totalInvoice;
	 int quantityStock, productSold;
	 
	 System.out.print("Digite o nome do produto: ");
	 productName = System.console().readLine();
	 System.out.print("Digite o valor do produto: ");
	 productValue = Double.parseDouble(System.console().readLine());
	 System.out.print("Digite a quantidade de estoque: ");
	 quantityStock = Integer.parseInt(System.console().readLine());
	 
	 do{
		 System.out.print("Deseja vender quantos produtos: ");
		 productSold = Integer.parseInt(System.console().readLine());
		 quantityStock = quantityStock - productSold;
		 invoice = productValue * (double)productSold;
		 totalInvoice = productSold * productValue;
		 if(quantityStock == 0)
			 break;
	 }while(invoice != totalInvoice);
	 }
}
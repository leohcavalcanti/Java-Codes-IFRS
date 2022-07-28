public class Exercicio12{
	public Exercicio12(){
		principal();
	}
	private void principal(){
		//não tenho noção de como fazer esse codígo
		String atual;
		System.out.println("On the first day of Christmas, my love gave to me ");
		atual = System.console().readLine();
		switch(atual){
		case "two turtle doves,"
			System.out.println("On the first day of Christmas, my love gave to me \na partridge in a pear tree.");
			break;
		case "three french hens,"
			System.out.println("On the first day of Christmas, my love gave to me \ntwo turtle doves,\na partridge in a pear tree.");
			break;
		case "four calling birds,"
			System.out.println("On the first day of Christmas, my love gave to me \nthree french hens,\ntwo turtle doves,\na partridge in a pear tree.");
			break;
		case "five gold rings,"
			System.out.println("On the first day of Christmas, my love gave to me \nfour calling birds,\nthree french hens,\ntwo turtle doves,\na partridge in a pear tree.");
			break;
		case "six geese a-laying,"
			System.out.println("On the first day of Christmas, my love gave to me \nfive gold rings,\nfour calling birds,\nthree french hens,\ntwo turtle doves,\na partridge in a pear tree.");			
			break;
		case "seven swans a-swimming,"
			System.out.println("On the first day of Christmas, my love gave to me \nsix geese a-laying,\nfive gold rings,\nfour calling birds,\nthree french hens,\ntwo turtle doves,\na partridge in a pear tree.");
			break;
		case "eight maids a-milking,"
			System.out.println("On the first day of Christmas, my love gave to me \nseven swans a-swimming,\nsix geese a-laying,\nfive gold rings,\nfour calling birds,\nthree french hens,\ntwo turtle doves,\na partridge in a pear tree.");
			break;
		case "nine ladies waiting,"
			System.out.println("On the first day of Christmas, my love gave to me \neight maids a-milking,\nseven swans a-swimming,\nsix geese a-laying,\nfive gold rings,\nfour calling birds,\nthree french hens,\ntwo turtle doves,\na partridge in a pear tree.");
			break;
		case "ten lords a-leaping,"
			System.out.println("On the first day of Christmas, my love gave to me \nnine ladies waiting,\neight maids a-milking,\nseven swans a-swimming,\nsix geese a-laying,\nfive gold rings,\nfour calling birds,\nthree french hens,\ntwo turtle doves,\na partridge in a pear tree.");
			break;
		case "eleven pipers piping,"
			System.out.println("On the first day of Christmas, my love gave to me \nten lords a-leaping,\nnine ladies waiting,\neight maids a-milking,\nseven swans a-swimming,\nsix geese a-laying,\nfive gold rings,\nfour calling birds,\nthree french hens,\ntwo turtle doves,\na partridge in a pear tree.");
			break;
		case "twelve drummers drumming,"
			System.out.println("On the first day of Christmas, my love gave to me \neleven pipers piping,\nten lords a-leaping,\nnine ladies waiting,\neight maids a-milking,\nseven swans a-swimming,\nsix geese a-laying,\nfive gold rings,\nfour calling birds,\nthree french hens,\ntwo turtle doves,\na partridge in a pear tree.");
			break;
		}
	}
	public static void main(String[] args) {
		new Exercicio12();
	}
}
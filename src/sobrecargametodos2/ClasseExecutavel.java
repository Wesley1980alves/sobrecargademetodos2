package sobrecargametodos2;

public class ClasseExecutavel {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora("Azakem21", "Multilaser", "particular ");
		Calculadora calc1 = new Calculadora("Apple", "Zordam2120",250.00);
		Calculadora calc2=new Calculadora(120.00,"Expencer33","Zoatac","Cientifica","preta");
		System.out.println("sobrecarga de metodos ");
		System.out.println(calc.calcula(20, 21));
		System.out.println(calc.calcula(32, 54));
		System.out.println(calc.calcula("Jamais desista de aprender," , " porque na vida nao ha nada tao facil de conquistar"));
		System.out.println("<><><><><><><><><><><><><><><><><>");
		System.out.println("sobrecarga de construtores ");
		System.out.println("Primeira calculadora: \nModelo: " + calc.modelo + "\nMarca: " + calc.marca + "\nUso: " + calc.uso);
		System.out.println("<><><><><><><><><><><><><><><><><>");
		System.out.println("Segundo Modelo Calculadora: \nMarca: " +calc1.marca +"\nModelo: "+ calc1.modelo + "\nvalor: " + calc1.valorproduto);
		System.out.println("<><><><><><><><><><><><><><><><><><>");
		System.out.println("Terceira Calculadora: \nvalor: "+calc2.valorproduto+ "\nMarca: "+calc2.marca+"\nModelo: "+calc2.modelo+"\nTipo: "+calc2.tipo+"\nCor: "+calc2.cor);
	}

}

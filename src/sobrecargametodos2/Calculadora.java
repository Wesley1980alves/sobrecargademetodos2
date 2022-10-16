package sobrecargametodos2;

public class Calculadora {
	protected String modelo;
	protected String marca;
	protected String uso;
	protected double valorproduto;
	protected String tipo;
	protected String cor;
	//contrutor padrao
	public Calculadora() {

	}
	//contrutores com parametros 
	public Calculadora(String marca, String modelo, double valorproduto) {
		this.marca = marca;
		this.modelo = modelo;
		this.valorproduto = valorproduto;
	}

	public Calculadora(String marca, String modelo, String uso) {
		this.marca = marca;
		this.modelo = modelo;
		this.uso = uso;

	}
	public Calculadora(double valorproduto,String marca ,String modelo,String tipo,String cor) {
		
		this.valorproduto=valorproduto;
		this.marca=marca;
		this.modelo=modelo;
		this.tipo=tipo;
		this.cor=cor;
		
	}
//metodos 
	public int calcula(int valor, int valor2) {
		return valor + valor2;
	}

	public double calcula(double valor, double valor2) {
		return valor + valor2;
	}

	public String calcula(String nome, String nome2) {
		return nome + nome2;
	}

}

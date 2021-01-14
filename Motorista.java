public class Motorista extends Pessoa implements Trabalhador {
	private Salario salario;
	
	public Motorista (Salario salario) {
		this.salario = salario;
	}

	public Salario Salario() {
		return salario;
	}
	public void Salario(Salario salario) {
		this.salario = salario;
	}

	public double salarioBruto() {
		return this.salario.salarioBruto();
	}

	public double salarioDesconto() {
		return this.salario.INSS() + this.salario.IR();
	}

	public double salarioLiquido() {
		return this.salario.salarioLiquido();
	}
}

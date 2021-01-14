public class Professores extends Pessoa implements Trabalhador {
private Salario Salario;
	
	public Professores (Salario salario) {
		this.Salario = salario;
	}

	public Salario Salario() {
		return Salario;
	}
	public void Salario(Salario salario) {
		this.Salario = salario;
	}

	public double salarioBruto() {
		return this.Salario.salarioBruto();
	}

	public double salarioDescontos() {
		return this.Salario.INSS() + this.Salario.IR();
	}

	public double salarioLiquido() {
		return this.Salario.salarioLiquido();
	}
}

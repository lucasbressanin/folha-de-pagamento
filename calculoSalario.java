public class calculoSalario implements Salario {
	private double horasTrabalhadas = 0;
	private double valorHora = 0;
	private int nDependentes = 0;

	public double salarioBruto () {
		return horasTrabalhadas * valorHora + (50 * nDependentes);
	}
	
	public double INSS () {
		double salarioBruto = this.salarioBruto();
		if (salarioBruto <= 1000)
			return salarioBruto * 5.5 / 100;
        else
        	return salarioBruto * 9 / 100;
	}

	public double IR () {
		double salarioBruto = this.salarioBruto();
		if (salarioBruto > 1000)
			return salarioBruto * 7 /100;
        else if (salarioBruto > 500)
        	return salarioBruto * 5 / 100;
        else
        	return 0;
	}
	
	public double salarioLiquido() {
		return this.salarioBruto() - this.INSS() - this.IR();
	}
	
	
	public double horasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void horasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double valorHora() {
		return valorHora;
	}

	public void valorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int nDependentes() {
		return nDependentes;
	}

	public void nDependentes(int nDependentes) {
		this.nDependentes = nDependentes;
	}
	
}

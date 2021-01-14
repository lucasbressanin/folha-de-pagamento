 public interface Salario {	
	public double salarioBruto();
	public double INSS();
	public double IR ();
	public double salarioLiquido();
	
	public double horasTrabalhadas();
	public void horasTrabalhadas(double horasTrabalhadas);
	
	public double valorHora();
	public void valorHora(double valorHora);
	
	public int numeroDependentes();
	public void numeroDepententes(int numeroDependentes);
}

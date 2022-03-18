
public class TesteIR {
	public static void main(String[] args) {
		
		double salario = 3751.50;
		
		if (salario >= 1900 && salario <= 2800 ) {
			System.out.println("IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		} else if (salario >= 2800.01 && salario <= 3751) {
			System.out.println("IR é de 15% e pode deduzir na declaracao o valor de R$ 350");
		} else if (salario >= 3751.01 && salario <= 4664) {
			System.out.println("IR é de 22.5% e pode deduzir R$ 636");
		} else {
			System.out.println("Consulte seu IR no site oficial do governo!");
		}
	}
}

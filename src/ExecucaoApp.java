import java.util.Scanner;


public class ExecucaoApp {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	
	String cor = "";
	String modelo = "";
	double capacidadeDoTanque = 0;
	double valorGasolina = 0;
	
	
	
	
	System.out.println("Digite a cor: ");
		cor = scan.next();
	System.out.println("Digite o modelo: ");
		modelo = scan.next();
	System.out.println("Digite a capacidade do tanque: ");
		capacidadeDoTanque = scan.nextDouble();
	System.out.println("Digite o valor da gasolina:  ");
		valorGasolina = scan.nextDouble();
		
	Carro calculo = new Carro(cor, modelo, capacidadeDoTanque);
	
	System.out.println("A cor do carro é: " + calculo.getCor());
	System.out.println("O modelo do carro é: " + calculo.getModelo());
	System.out.println("A capacidade do tanque é:  " + calculo.getCapacidadeDoTanque());
	System.out.println("Valor para encher o tanque: R$ =  " + calculo.valorTanque(valorGasolina));
		
	scan.close();
	
	
	
	

	}

}

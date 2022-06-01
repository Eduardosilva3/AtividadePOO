
class Carro {
	
	
	String cor;
	String modelo;
	double capacidadeDoTanque;
	
	
	
	
	Carro(String cor, String modelo, double capacidadeDoTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	String getCor() {
		return cor;
	}
	void setCor(String cor) {
		this.cor = cor;
	}
	String getModelo() {
		return modelo;
	}
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	double getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}
	void setCapacidadeDoTanque(double capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	
	double valorTanque(double valorCombustivel) {
		
		return capacidadeDoTanque * valorCombustivel;
		
	}
	
	
	



}

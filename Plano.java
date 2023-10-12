package sistemaJAVAlar;

public class Plano extends Celula {

	public int limiteX = 15;
	public int limiteY = 15;
	protected Celula[][] matriz = new Celula[(int)limiteY][(int)limiteX];
	
	public Plano(int posX, int posY) {
		super(posX, posY);
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}
	
	public void iniciarCelulas() {
		for (int i = 0; i < limiteX; i++) {
			for (int j = 0; j < limiteY; j++) {
				matriz[j][i] = null;
			}
		}
	}
	
	public void exibirPlano() {
		System.out.println("Formato do Plano (15x15): ");
		for (int i = 0; i < limiteX; i++) {
			for (int j = 0; j < limiteY; j++) {
				if (matriz[j][i] != null) {
					System.out.print("X"); 
				} else {
					System.out.print("* "); 
				}
			}
			System.out.println();
		}
		System.out.println("Obs: A estrela JAVA estaria no equivalente ao ponto (8, 8).\n\n");
	}
	
}

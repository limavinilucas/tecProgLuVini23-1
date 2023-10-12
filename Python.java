package sistemaJAVAlar;

public class Python extends Planetas {
	
	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	double dadosDeMovimento;
	int cicloAnual = 8;
	Impressao impressora = new Impressao();
	
	public Python() {
		super(8, 9, "Python", 4, 24); // 24 horas (Python) == Padrão de 1 dia.
		limiteYMax = 9;
		limiteYMin = 7;
		limiteXMax = 9;
		limiteXMin = 7;
	}

	public void movimentarGeral(double tempo) {
		for (int i = 0; i < tempo; i++) {
			posX += movimentos[direcaoMovimento][0];
			posY += movimentos[direcaoMovimento][1];

			if (posX > limiteXMax) {
				posX = limiteXMax;
				direcaoMovimento = (direcaoMovimento + 1) % 4; // Muda a direção para baixo
				dadosDeMovimento = dadosDeMovimento + 1;
			} else if (posX < limiteXMin) {
				posX = limiteXMin;
				direcaoMovimento = (direcaoMovimento + 1) % 4; // Muda a direção para cima
				dadosDeMovimento = dadosDeMovimento + 1;
			}

			if (posY > limiteYMax) {
				posY = limiteYMax;
				direcaoMovimento = (direcaoMovimento + 1) % 4; // Muda a direção para esquerda
				dadosDeMovimento = dadosDeMovimento + 1;
			} else if (posY < limiteYMin) {
				posY = limiteYMin;
				direcaoMovimento = (direcaoMovimento + 1) % 4; // Muda a direção para direita
				dadosDeMovimento = dadosDeMovimento + 1;
			}
		}
		setPosX(posX);
		setPosY(posY);
		AreaPlanetas = posX * posY;
		impressora.imprimirMensagens("\nPlaneta: " + nome +
				"\nA posicao X no instante é: " + posX +
				"\nA posicao Y no instante é: " + posY +
				"\nAno " + nome + ": " + cicloAnual / dadosDeMovimento +
				"\nArea do planeta " + nome + ":" + AreaPlanetas);
		impressora.imprimirApresentacoes("-> Apresentação:\nPython é uma linguagem de programação de alto nível e de propósito geral.\r\n"
						+ "É conhecida por sua sintaxe simples e legibilidade,"
						+ "\no que a torna uma escolha popular para iniciantes.");
	}

}

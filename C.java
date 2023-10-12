package sistemaJAVAlar;

public class C extends Planetas {

	public int limiteYMax = 15;
	public int limiteYMin = 1;
	public int limiteXMax = 15;
	public int limiteXMin = 1;
	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	double dadosDeMovimento;
	int cicloAnual = 56;
	Impressao impressora = new Impressao();
	
	public C() {
		super(8, 15, "C", 10, 1); // Padrão de 0.0416 dias Python.
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
		impressora.imprimirApresentacoes("-> Apresentacao:\nC é uma linguagem de programação de baixo nível e procedural.\r\n"
				+ "É frequentemente usado no desenvolvimento de sistemas operacionais, drivers de dispositivo e"
				+ "\nsoftwares de baixo nível devido à sua eficiência e controle direto sobre o hardware.");
	}

}

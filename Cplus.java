package sistemaJAVAlar;

public class Cplus extends Planetas {

	public int limiteYMax = 14;
	public int limiteYMin = 2;
	public int limiteXMax = 14;
	public int limiteXMin = 2;
	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	double dadosDeMovimento;
	int cicloAnual = 48;
	Impressao impressora = new Impressao();
	
	public Cplus() {
		super(8, 14, "C++", 2, 0.5); // Padrão de 0.02083 dias Python;
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
		impressora.imprimirApresentacoes("-> Apresentacao:\nC++ é uma extensão da linguagem de programação C.\r\n"
				+ "É conhecido por sua eficiência e é amplamente usado no desenvolvimento de sistemas,"
				+ "\njogos, aplicativos de alto desempenho e software de sistemas.");
	}

}

package sistemaJAVAlar;

public class Csharp extends Planetas {

	public int limiteYMax = 13;
	public int limiteYMin = 3;
	public int limiteXMax = 13;
	public int limiteXMin = 3;
	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	double dadosDeMovimento;
	int cicloAnual = 40;
	Impressao impressora = new Impressao();

	public Csharp() {
		super(8, 13, "C#", 1, 4); // Padrão de 0.166 (aproximadamente) dias Python.
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
		impressora.imprimirApresentacoes("-> Apresentacao:\nC# é uma linguagem de programação desenvolvida pela Microsoft.\r\n"
				+ "É frequentemente usada para criar aplicativos Windows e jogos com a plataforma Unity.");
	}

}

package sistemaJAVAlar;

public class Planetas extends Celula {

	public String nome;
	protected int veloTranslacao;
	protected int veloRotacao;
	protected int posY;
	protected int posX;
	protected int limiteYMax;
	protected int limiteXMax;
	protected int limiteYMin;
	protected int limiteXMin;
	protected int BugsQntPorPlaneta;
	protected int DevsQntPorPlaneta;
	int AreaPlanetas;
	double dadosDeMovimento;
	int cicloAnual; // Quantidade de movimentos que o planeta realiza para completar 1 ano
	protected double tempoRotacao; // Tempo Rotacao é mensurado em horas Terrestres (chamemos de horasM)
	protected int[][] movimentos = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	protected int direcaoMovimento = 0;
	Impressao impressora = new Impressao();
	
	public Planetas(int posX, int posY, String nome, int veloTranslacao, double horasM) {
		super(posX, posY);
		this.nome = nome;
		this.veloTranslacao = veloTranslacao;
		this.tempoRotacao = horasM;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
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
		AreaPlanetas = posX*posY;
		impressora.imprimirMensagens("\nPlaneta: " + nome +
				"\nA posicao X no instante é: " + posX +
				"\nA posicao Y no instante é: " + posY +
				"\nAno " + nome + ": " + cicloAnual / dadosDeMovimento +
				"\nArea do planeta " + nome + ":" + AreaPlanetas);			
	}

}
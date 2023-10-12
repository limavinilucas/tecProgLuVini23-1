package sistemaJAVAlar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ControleGalactico {
	
	Random sementeRandomica = new Random();
	Scanner generalScan = new Scanner(System.in);
	Impressao impressora = new Impressao();
	double InstQnt;
	int qntPlanetasExplodidos;
	int BugsQnt;
	int DevsQnt;
	double tempoHoras;
	double contagemDiasPlaneta;
	Bugs BugsPosicoes = new Bugs(sementeRandomica.nextInt(15), sementeRandomica.nextInt(15));
	Devs DevsPosicoes = new Devs(sementeRandomica.nextInt(15), sementeRandomica.nextInt(15));
	ArrayList<Planetas> PlanetasDoSistema = new ArrayList<>();

	public void guardarPlanetas(ArrayList<Planetas> PlanetasDoSistema) {

		PlanetasDoSistema.add(new Python());
		PlanetasDoSistema.add(new JavaScript());
		PlanetasDoSistema.add(new RoR());
		PlanetasDoSistema.add(new PHP());
		PlanetasDoSistema.add(new Csharp());
		PlanetasDoSistema.add(new Cplus());
		PlanetasDoSistema.add(new C());

	}
	
	public void verificarGeral() {
		guardarPlanetas(PlanetasDoSistema);
		for (Planetas planetas : PlanetasDoSistema) {
			System.out.println("\n");
			tempoHoras = planetas.tempoRotacao * InstQnt;
			contagemDiasPlaneta = tempoHoras / 24;

			System.out.println();
			if (BugsPosicoes.posX == planetas.posX && BugsPosicoes.posY == planetas.posY) {
				planetas.veloTranslacao--;
				BugsQnt--;
				planetas.BugsQntPorPlaneta++;
			}

			if (DevsPosicoes.posX == planetas.posX && DevsPosicoes.posY == planetas.posY) {
				planetas.veloTranslacao++;
				DevsQnt--;
				planetas.DevsQntPorPlaneta++;
			}
			if (planetas.veloTranslacao == 0) {
				qntPlanetasExplodidos++;
			}

			planetas.movimentarGeral(InstQnt);
			impressora.imprimirMensagens("Tempo em Dias: " + contagemDiasPlaneta + "\nVelocidade de Translacao de "
					+ planetas.nome + ": " + planetas.veloTranslacao + "\nVelocidade MEDIA de Translacao de "
					+ planetas.nome + ": " + planetas.veloTranslacao / InstQnt + "\nTempo de Rotacao de "
					+ planetas.nome + ": " + planetas.tempoRotacao + "\nQuantidade de Bugs colididos "
					+ planetas.nome + ": " + planetas.BugsQntPorPlaneta + "\nQuantidade de Devs colididos "
					+ planetas.nome + ": " + planetas.DevsQntPorPlaneta);
		}
		impressora.imprimirMensagens("\nPlanetas a Norte de JAVA:"
				+ verificarNorteJAVA(PlanetasDoSistema) + "\nPlanetas a Sul de JAVA:"
				+ verificarSulJAVA(PlanetasDoSistema) + "\nPlanetas Alinhados com JAVA:"
				+ verificarAlinhamentoJAVA(PlanetasDoSistema) + "\nPlanetas Explodidos: "
				+ qntPlanetasExplodidos + "\nPosicao dos Bugs: " + BugsPosicoes.posX + ", " + BugsPosicoes.posY
				+ "\nPosicao dos Devs: " + DevsPosicoes.posX + ", " + DevsPosicoes.posY + "\nInstantes:" + InstQnt
				+ " dia(s)");
	}
	
	public int verificarNorteJAVA(ArrayList<Planetas> PlanetasDoSistema) {

		int contadorPlanetasNorte = 0;
		for (int i = 0; i < PlanetasDoSistema.size(); i++) {
			if (PlanetasDoSistema.get(i).posY > 8) {
				contadorPlanetasNorte++;
			}
		}
		return contadorPlanetasNorte;
	}

	public int verificarSulJAVA(ArrayList<Planetas> PlanetasDoSistema) {

		int contadorPlanetasSul = 0;
		for (int i = 0; i < PlanetasDoSistema.size(); i++) {
			if (PlanetasDoSistema.get(i).posY < 8) {
				contadorPlanetasSul++;
			}
		}
		return contadorPlanetasSul;
	}

	public int verificarAlinhamentoJAVA(ArrayList<Planetas> PlanetasDoSistema) {
		
		/* OBS: Não é o Alinhamento especifico requisitado, é somente para ver se tem algum planeta
		/* na mesma linha que java, seja para cima ou para os lados. */
		
		int contadorPlanetasAlinhados = 0;
		for (int i = 0; i < PlanetasDoSistema.size(); i++) {
			if (PlanetasDoSistema.get(i).posX == 8 && PlanetasDoSistema.get(i).posY == 8) {
				contadorPlanetasAlinhados++;
			}
		}
		return contadorPlanetasAlinhados;
	}
	

	public void limparTela() {
		for (int i = 0; i < 123; i++) {
			System.out.println("\n");
		}
	}
	
	public void inserirInstantes() {
		impressora.imprimirMensagens("    Bem-vindo ao Sistema JAVAlar     "
				+ "\n - Digite a seguir o valor desejado como parametro de instante:");
		InstQnt = generalScan.nextInt();
		if (InstQnt < 0) {
			impressora.imprimirMensagens("Programa encerrado.");
			System.exit(0);
		}
	}
	
	public void inserirBugs() {
		System.out.println("Certo, agora insira a quantidade de Bugs para essa rodada:");
		BugsQnt = generalScan.nextInt();
	}

	public void inserirDevs() {
		impressora.imprimirMensagens("Insira, por fim, a quantidade de Developers que deseja nesta rodada:");
		DevsQnt = generalScan.nextInt();
	}
	
	public void calcularDistEuclidiana() {
		for (int i = 0; i < PlanetasDoSistema.size(); i++) {
			for (int j = i + 1; j < PlanetasDoSistema.size(); j++) {
				Planetas planeta1 = PlanetasDoSistema.get(i);
				Planetas planeta2 = PlanetasDoSistema.get(j);
				
				double distEuclidiana = Math.sqrt(Math.pow(planeta1.posX - planeta2.posX, 2) + Math.pow(planeta1.posY - planeta2.posY, 2));
				System.out.println("Distância Euclidiana entre " + planeta1.nome + " e " + planeta2.nome + ": " + distEuclidiana);
				
			}
		}
	}
	
}

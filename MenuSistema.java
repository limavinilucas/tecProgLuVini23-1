package sistemaJAVAlar;

import java.util.ArrayList;

public class MenuSistema {

	ControleGalactico verificadorMestre = new ControleGalactico();
	Plano planoPlotado = new Plano(15, 15);
	ArrayList<Planetas> PlanetasDoSistema = new ArrayList<>();

	public void SistemaJAVALAR() {
		
		verificadorMestre.guardarPlanetas(PlanetasDoSistema);
		verificadorMestre.inserirInstantes();
		verificadorMestre.inserirBugs();
		verificadorMestre.inserirDevs();
		verificadorMestre.limparTela();
		planoPlotado.iniciarCelulas();
		planoPlotado.exibirPlano();
		verificadorMestre.verificarGeral();
		System.out.println();
		verificadorMestre.calcularDistEuclidiana();
		
	}

	

}
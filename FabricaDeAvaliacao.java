public class FabricaDeAvaliacao implements Fabrica {
	private int totalAvaliacao;
	protected static FabricaDeAvaliacao instancia;
	private Avalicao avalicao;
	private AvaliacaoFisica avaliacaoFisica;
	private AvaliacaoAntropometrica avaliacaoAntropometrica;
	private AvaliacaoBioquimica avaliacaoBioquimica;
	private AvaliacaoAlimentar avaliacaoAlimentar;

	protected FabricaDeAvaliacao() {

	}

	public static FabricaDeAvaliacao getInstancia() {
		return null;
	}

	public void FactoryMethod() {

	}

	public Avalicao getAvaliacao() {
		return null;
	}
}

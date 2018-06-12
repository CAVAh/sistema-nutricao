public class FabricaDeAvaliacao implements Fabrica {
	private int totalAvAlimentar;
	private int totalAvAntropometrica;
	private int totalAvBioquimica;
	private int totalAvFisica;
	protected static FabricaDeAvaliacao instancia;
	private AvaliacaoFisica avaliacaoFisica;
	private AvaliacaoAntropometrica avaliacaoAntropometrica;
	private AvaliacaoBioquimica avaliacaoBioquimica;
	private AvaliacaoAlimentar avaliacaoAlimentar;

	protected FabricaDeAvaliacao() {
		if (this.instancia == null) {
			this.instancia = new FabricaDeAvaliacao();
			this.totalAvAlimentar = 0;
			this.totalAvAntropometrica = 0;
			this.totalAvBioquimica = 0;
			this.totalAvFisica = 0;
		}
	}

	public static FabricaDeAvaliacao getInstancia() {
		if (instancia == null) instancia = new FabricaDeAvaliacao();
	    return instancia;
	}

	@Override
	public void criaAvAlimentar() {
		this.avaliacaoAlimentar = new AvaliacaoAlimentar();
		this.totalAvAlimentar ++;
	}

	@Override
	public void criaAvAntropometrica() {
		this.avaliacaoAntropometrica = new AvaliacaoAntropometrica();
		this.totalAvAntropometrica ++;
	}

	@Override
	public void criaAvBioquimica() {
		this.avaliacaoBioquimica = new AvaliacaoBioquimica();
		this.totalAvBioquimica ++;
	}

	@Override
	public void criaAvFisica() {
		this.avaliacaoFisica = new AvaliacaoFisica();
		this.totalAvFisica ++;
	}

}

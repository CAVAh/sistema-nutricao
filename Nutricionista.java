public class Nutricionista implements Avalicao {
	private String CRN;
	private FabricaDeAvaliacao fabricaDeAvaliacao;
	private Avalicao avalicao;

	public Consulta() {

	}

	public boolean agendaConsulta(Paciente paciente, Nutricionista nutricionista, Time horario, Date data) {
		return false;
	}

	public void requisitarExame() {

	}

	public void ReceitarMedicamento() {

	}

	public Avalicao getDados() {
		return null;
	}

	public boolean setConsulta(Avalicao consulta) {
		return false;
	}
}

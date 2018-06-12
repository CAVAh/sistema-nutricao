import java.sql.Date;
import java.sql.Time;

public class AvaliacaoBioquimica implements Avaliacao {
	private String medicamentos;
	private String parecer;
	private Time horario;
	private Date data;
	private Paciente paciente;
	private Nutricionista nutricionista;
	private Avaliacao avaliacao;

	public AvaliacaoBioquimica() {
		this.medicamentos = null;
		this.parecer = null;
		this.horario = null;
		this.data = null;
		this.paciente = null;
		this.nutricionista = null;
		this.avaliacao = new AvaliacaoBioquimica();
	}

	@Override
	public void Consulta(String str1, String str2) {
		this.medicamentos = str1;
		this.parecer = str2;
	}

	@Override
	public boolean agendaConsulta(Paciente paciente, Nutricionista nutricionista, Time horario, Date data) {
		if (/*horario disponivel*/) {
			this.horario = horario;
			this.data = data;
			this.paciente = paciente;
			this.nutricionista = nutricionista;
			return true;
		}
		
		return false;
	}

	@Override
	public void requisitarExame(String exame) {
		this.parecer += exame;
	}

	@Override
	public void ReceitarMedicamento(String remedio) {
		this.parecer += remedio;
	}

	@Override
	public Avaliacao getDados() {
		if (avaliacao == null) avaliacao = new AvaliacaoBioquimica();
	    return avaliacao;
	}

	@Override
	public boolean setConsulta(Time horario, Date data) {
		if (/*horario disponivel*/) {
			this.horario = horario;
			this.data = data;
			return true;
		}
		return false;
	}
}

public interface Avalicao {
	public String parecer;
	public Time horario;
	public Date data;
	public Paciente paciente;
	public Nutricionista nutricionista;

	public Consulta();
	public boolean agendaConsulta(Paciente paciente, Nutricionista nutricionista, Time horario, Date data);
	public void requisitarExame();
	public void ReceitarMedicamento();
	public Avalicao getDados();
	public boolean setConsulta(Avalicao consulta);
}

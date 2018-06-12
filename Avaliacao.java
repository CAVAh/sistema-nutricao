import java.sql.Date;
import java.sql.Time;

public interface Avaliacao {
	
	public void Consulta(String str1, String str2);
	public boolean agendaConsulta(Paciente paciente, Nutricionista nutricionista, Time horario, Date data);
	public void requisitarExame(String exame);
	public void ReceitarMedicamento(String remedio);
	public Avaliacao getDados();
	public boolean setConsulta(Time horario, Date data);
}

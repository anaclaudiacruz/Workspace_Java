
public class Horario {

	private int hora;
	private int minuto;
	private int segundo;

	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public String exibirHoraUniversal() {
		String horauniv;
		horauniv = hora + ":" + minuto + ":" + segundo;
		return horauniv;
	}


	public String exibirHoraPadrao() {
		String horapadrao;

		if (hora < 12) {
			horapadrao = hora + ":" + minuto + ":" + segundo + " AM";

		} else if (hora == 12) {
			horapadrao = 01 + ":" + minuto + ":" + segundo + " PM";

		} else if (hora == 24) {
			horapadrao = 12 + ":" + minuto + ":" + segundo + " PM";

		} else {
			horapadrao = hora - 12 + ":" + minuto + ":" + segundo + " PM";
		}

		return horapadrao;
	}

}

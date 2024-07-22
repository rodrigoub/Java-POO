package ProjetoFinal;

public class Visualizacao {

	private Video filme;
	private Gafanhoto espectador;
	
	//Métodos Abstratos
		public void avaliar() {
			this.filme.setAvaliacao(5);
		}
		public void avaliar(int nota) {
			this.filme.setAvaliacao(nota);
		}
		public void avaliar(double porc) {
			int tot = 0;
			if (porc <= 20) {
				tot = 3;
			} else if(porc <= 50) {
				tot = 5;
			} else if (porc <= 90) {
				tot = 8;
			} else {
				tot = 10;
			}
		this.filme.setAvaliacao(tot);
		}
	
	//Métodos Especiais
	public Visualizacao(Video filme, Gafanhoto espectador) {
		this.filme = filme;
		this.espectador = espectador;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);

	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	@Override
	public String toString() {
		return "Visualizacao [" + "filme=" + filme + ", espectador=" + espectador + "]";
	}
	
}


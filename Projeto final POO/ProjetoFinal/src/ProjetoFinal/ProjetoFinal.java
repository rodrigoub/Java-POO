package ProjetoFinal;

public class ProjetoFinal {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 PHP");
		v[2] = new Video("Aula 10 HTML5");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", "M", 22, "juba");
		g[1] = new Gafanhoto("Creuza", "F", 12, "Creuzita");
		
		Visualizacao vis[] = new Visualizacao [5];
		vis[0] = new Visualizacao(v[2], g[0]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(v[1], g[0]);
		vis[0].avaliar(87);
		System.out.println(vis[1].toString());
		

	}

}

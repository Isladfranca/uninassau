package classes;

public class Teste {
	public static void main(String[] args) {
	Camera camera = new Camera("Nikon","1554");
	
	System.out.println(camera);
	System.out.println("Tela: " + camera.getTipoTela());
	System.out.println("Resolução: " + camera.getResolucao());
	System.out.println("Resolução do video: " + camera.getResolucaoVideo());
	System.out.println("Abertura do Diafragma: " + camera.getAberturaDiafragma());
	camera.carregar();
	}
}

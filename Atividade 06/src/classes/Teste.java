package classes;

public class Teste {
	public static void main(String[] args) {
	Camera camera = new Camera("Nikon","1554");
	
	System.out.println(camera);
	System.out.println("Tela: " + camera.getTipoTela());
	System.out.println("Resolu��o: " + camera.getResolucao());
	System.out.println("Resolu��o do video: " + camera.getResolucaoVideo());
	System.out.println("Abertura do Diafragma: " + camera.getAberturaDiafragma());
	camera.carregar();
	}
}

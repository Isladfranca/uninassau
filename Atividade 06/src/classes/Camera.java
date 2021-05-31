package classes;

import interfaces.Bateria;
import interfaces.Lente;
import interfaces.Tela;

public class Camera implements Bateria, Lente, Tela {

	private boolean carregado;
	private int porcentagem;
	private String marca; 
	private String modelo;
	
	
	
	public Camera(String marca, String modelo) {
		this.setCarregado(false);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPorcentagem(porcentagem);
	}
	
	@Override
	public void carregar() {
		System.out.println("Camera carregada!");
		this.setCarregado(true);
		this.setPorcentagem(100);
	}
	@Override
	public int porcentagem() {
		return this.getPorcentagem();
	}
	@Override
	public String getResolucaoVideo() {
		return "1080p";
	}
	@Override
	public String getAberturaDiafragma() {
		return " 3.5 f";
	}
	@Override
	public String getTipoTela() {
		return "LCD";
	}
	@Override
	public String getResolucao() {
		return "24,2 MP";
	}

	public boolean isCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public int getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Camera marca =" + marca + " modelo =" + modelo;
	}
	
}

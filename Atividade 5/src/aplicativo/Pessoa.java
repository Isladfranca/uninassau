package aplicativo;
import java.util.ArrayList;

public abstract class Pessoa {
    protected String nome;
    protected String  enderešo;
    
    public Pessoa() {
    	
    }
	public Pessoa(String nome, String enderešo) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
	}
	public String getNome() {
		return nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", enderešo=" + enderešo + "]";
	}

}
package MinhasLeituras;

public class Cadastro {

	private String nomeDoLivro, autor, dataLeitura, estiloLiterario, editora, avaliacao;
	
	
	public Cadastro() {
		super();
	}

	public Cadastro(String nomeDoLivro, String autor, String dataLeitura, String estiloLiterario, String editora, String avaliacao) {
		super();
		this.nomeDoLivro = nomeDoLivro;
		this.autor = autor;
		this.dataLeitura = dataLeitura;
		this.editora = editora;
		this.avaliacao = avaliacao;
	}

	public String getNomeDoLivro() {
		return nomeDoLivro;
	}

	public void setNomeDoLivro(String nomeDoLivro) {
		this.nomeDoLivro = nomeDoLivro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDataLeitura() {
		return dataLeitura;
	}

	public void setDataLeitura(String dataLeitura) {
		this.dataLeitura = dataLeitura;
	}
	
	public String getEstiloLiterario() {
		return estiloLiterario;
	}
	
	public void setEstiloLiterario(String estiloLiterario) {
		this.estiloLiterario = estiloLiterario;
	}
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	@Override
	public String toString() {
		return "Cadastro [nomeDoLivro=" + nomeDoLivro + ", autor=" + autor + ", dataLeitura=" + dataLeitura
				+ ", estiloLiterario=" + estiloLiterario + ", avaliacao=" + avaliacao + ", getNomeDoLivro()="
				+ getNomeDoLivro() + ", getAutor()=" + getAutor() + ", getDataLeitura()=" + getDataLeitura()
				+ ", getEstiloLiterario()=" + getEstiloLiterario() + ", getAvaliacao()=" + getAvaliacao() + "]";
	}

	
	
}
package dio.aula_spring_data_jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // criou uma entidade de banco de dados
@Table(name = "tab_usuario") // Tabela com o nome
public class Usuario {
	@Id // valor do ig
	@GeneratedValue(strategy = GenerationType.IDENTITY) // forma de gerar id automaticamente
	private Integer id;
	
	@Column(name = "nome_completo", length = 50, nullable = false)  // nome da coluna, tamanho e outras caracteristicas
	private String nomeCompleto;
	
	private String email; // aqui nao precisou por @column pq o nome da coluna é igual o da variavel, entao o jpa indentifica
	
	@Column(length = 20, nullable = false)
	private String login;
	
	@Column(length = 100, nullable = false)
	private String senha;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}
	
	
}
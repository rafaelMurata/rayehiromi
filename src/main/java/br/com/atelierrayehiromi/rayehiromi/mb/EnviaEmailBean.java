package br.com.atelierrayehiromi.rayehiromi.mb;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import br.com.atelierrayehiromi.rayehiromi.dao.EnviarEmail;
@SessionScoped
@ManagedBean
@Named("enviaEmailBean")
public class EnviaEmailBean {

	public String nome;

	public String email;

	public String estado;

	public String mensagem;
		
		public void enviar(){
			
		EnviarEmail sm = new EnviarEmail("smtp.gmail.com","465");
		sm.sendMail(nome,email,"sp",mensagem); 
		}

		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getEstado() {
			return estado;
		}


		public void setEstado(String estado) {
			this.estado = estado;
		}


		public String getMensagem() {
			return mensagem;
		}


		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

}

package Questao02;

public class Elevador {
		
		private int andarAtual;
		private int totalAndares;
		private int capElevador;
		private int quantAtualPessoas;
		
		public Elevador (int capElevador, int totalAndares) {
			this.capElevador = capElevador;
			this.totalAndares = totalAndares;
			this.andarAtual = 0;
			this.quantAtualPessoas = 0;	
		}
		
		public void entrar() {
			if (quantAtualPessoas < capElevador) {
				quantAtualPessoas++;
			}else {
				System.out.println("Elevador Lotado");
			}
		}
		
		public void sair() {
			if(quantAtualPessoas != 0) {
				quantAtualPessoas--;
			}else {
				System.out.println("Elevador Vazio");
			}
		}
		
		public boolean subir() {
			if(andarAtual < capElevador) {
				andarAtual++;
				return true;
			}else{
				return false;
			}
		}
		
		public void descer() {
			if(andarAtual != 0) {
				andarAtual--;
			}else {
				System.out.println("Elevador no terreo");
			}
		}
		
		public int getAndarAtual() {
			return andarAtual;
		}
		public void setAndarAtual(int andarAtual) {
			andarAtual = andarAtual;
		}
		
		public int getTotalAndares() {
			return totalAndares;
		}
		
		public void setTotalAndares(int totalAndares) {
			totalAndares = totalAndares;
		}
		
		public int getCapElevador() {
			return capElevador;
		}
		
		public void setCapElevador(int capElevador) {
			capElevador = capElevador;
		}
		
		public int getQuantPessoas() {
			return quantAtualPessoas;
		}
		
		public void setQuantPessoas(int quantAtualPessoas) {
			quantAtualPessoas = quantAtualPessoas;
		}
		
	}


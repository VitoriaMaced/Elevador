package Questao02;

public class Principal {

	public static void main(String[] args) {
		
		Elevador e = new Elevador(1,10);
		
		
		if (e.subir()){
			System.out.println("Deu tudo certo");
		}else{
			System.out.println("Tudo errado");
		}

}
	
}

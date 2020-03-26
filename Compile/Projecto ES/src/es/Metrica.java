package es;


public class Metrica {
	
	/**
	 * O atributo nome ser� o nome da metrica,
	 * o atributo operadorLogic ser� o operador logico,
	 * O atributo valor ser� o valor da metrica.
	 */	
	private String nome;
	private int operadorLogic;
	private int valor;
	
	/**
	 * @param nome � o nome da metrica
	 * @param operadorLogic � o operador logico
	 * @param valor � o valor da metrica
	 * O construtor da nossa m�trica a inicializar os nossos atributos.
	 */
	public Metrica(String nome,int operadorLogic,int valor) {
		this.nome=nome;
		this.operadorLogic=operadorLogic;
		this.valor=valor;
	}
	
	/**
	 * @param nome � o parametro que representar� o nome da metrica.
	 * O construtor so com o parametro nome
	 */
	public Metrica(String nome) {
		this.nome=nome;
	}
	
	//Valores para operadorLogic
	// 0 - <
	// 1 - >
	
	
	//nome tem de ser LOC ou CYCLO ou LAA ou CD

	public String getNome() {
		return nome;
	}


	public void setOperadorLogic(int operadorLogic) {
		this.operadorLogic = operadorLogic;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	/**
	 * @return Esta fun�ao retorna-nos a string a representar o maior ou menor, dependendo do valor
	 * do operador, cajo seja 1 retorna maior e caso contrario retorna menor.
	 */
	public String getOperador(){
		if(this.operadorLogic==0){
			return "menor";
		}else
			return "maior";
	}
	
	
	
	
	
}

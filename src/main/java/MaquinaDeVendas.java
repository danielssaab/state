public class MaquinaDeVendas {
	private Estado estadoSemMoeda;
	private Estado estadoComMoeda;
	private Estado estadoDispensando;
	private Estado estadoAguardandoRetirada;
	private Estado estadoEsgotado;

	private Estado estadoAtual;
	private int quantidadeProdutos;

	private String saida;

	public MaquinaDeVendas(int quantidadeProdutos) {
		estadoSemMoeda = new EstadoSemMoeda(this);
		estadoComMoeda = new EstadoComMoeda(this);
		estadoDispensando = new EstadoDispensando(this);
		estadoAguardandoRetirada = new EstadoAguardandoRetirada(this);
		estadoEsgotado = new EstadoEsgotado(this);

		this.quantidadeProdutos = quantidadeProdutos;
		if (quantidadeProdutos > 0) {
			estadoAtual = estadoSemMoeda;
		} else {
			estadoAtual = estadoEsgotado;
		}
	}

	public void setEstado(Estado estado) {
		estadoAtual = estado;
	}

	public void inserirMoeda() {
		estadoAtual.inserirMoeda();
	}

	public void ejetarMoeda() {
		estadoAtual.ejetarMoeda();
	}

	public void selecionarProduto() {
		estadoAtual.selecionarProduto();
	}

	public void dispensar() {
		estadoAtual.dispensar();
	}

	void liberarProduto() {
		if (quantidadeProdutos > 0) {
			quantidadeProdutos--;
		}
	}

	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}

	public Estado getEstadoSemMoeda() {
		return estadoSemMoeda;
	}

	public Estado getEstadoComMoeda() {
		return estadoComMoeda;
	}

	public Estado getEstadoDispensando() {
		return estadoDispensando;
	}

	public Estado getEstadoAguardandoRetirada() {
		return estadoAguardandoRetirada;
	}

	public Estado getEstadoEsgotado() {
		return estadoEsgotado;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}
}

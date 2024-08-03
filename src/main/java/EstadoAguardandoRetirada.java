public class EstadoAguardandoRetirada implements Estado {
	private MaquinaDeVendas maquinaDeVendas;

	public EstadoAguardandoRetirada(MaquinaDeVendas maquinaDeVendas) {
		this.maquinaDeVendas = maquinaDeVendas;
	}

	@Override
	public void inserirMoeda() {
		this.maquinaDeVendas.setSaida("Por favor, retire o produto primeiro.");
	}

	@Override
	public void ejetarMoeda() {
		this.maquinaDeVendas.setSaida("Não é possível ejetar a moeda, retire o produto primeiro.");
	}

	@Override
	public void selecionarProduto() {
		this.maquinaDeVendas.setSaida("Produto já dispensado. Retire-o primeiro.");
	}

	@Override
	public void dispensar() {
		this.maquinaDeVendas.setSaida("Produto já dispensado. Retire-o primeiro.");
	}
}
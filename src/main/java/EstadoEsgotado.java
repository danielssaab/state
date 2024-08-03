public class EstadoEsgotado implements Estado {
	private MaquinaDeVendas maquinaDeVendas;

	public EstadoEsgotado(MaquinaDeVendas maquinaDeVendas) {
		this.maquinaDeVendas = maquinaDeVendas;
	}

	@Override
	public void inserirMoeda() {
		this.maquinaDeVendas.setSaida("Sem produtos disponíveis.");
	}

	@Override
	public void ejetarMoeda() {
		this.maquinaDeVendas.setSaida("Nenhuma moeda para ejetar.");
	}

	@Override
	public void selecionarProduto() {
		this.maquinaDeVendas.setSaida("Sem produtos disponíveis.");
	}

	@Override
	public void dispensar() {
		this.maquinaDeVendas.setSaida("Sem produtos para dispensar.");
	}
}

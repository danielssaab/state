public class EstadoComMoeda implements Estado {
	private MaquinaDeVendas maquinaDeVendas;

	public EstadoComMoeda(MaquinaDeVendas maquinaDeVendas) {
		this.maquinaDeVendas = maquinaDeVendas;
	}

	@Override
	public void inserirMoeda() {
		this.maquinaDeVendas.setSaida("Moeda já inserida.");
	}

	@Override
	public void ejetarMoeda() {
		this.maquinaDeVendas.setSaida("Moeda ejetada.");
		maquinaDeVendas.setEstado(maquinaDeVendas.getEstadoSemMoeda());
	}

	@Override
	public void selecionarProduto() {
		this.maquinaDeVendas.setSaida("Produto selecionado.");
		maquinaDeVendas.setEstado(maquinaDeVendas.getEstadoDispensando());
	}

	@Override
	public void dispensar() {
		this.maquinaDeVendas.setSaida("Selecione um produto primeiro.");
	}
}

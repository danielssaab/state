public class EstadoSemMoeda implements Estado {
	private MaquinaDeVendas maquinaDeVendas;

	public EstadoSemMoeda(MaquinaDeVendas maquinaDeVendas) {
		this.maquinaDeVendas = maquinaDeVendas;
	}

	@Override
	public void inserirMoeda() {
		this.maquinaDeVendas.setSaida("Moeda inserida.");
		maquinaDeVendas.setEstado(maquinaDeVendas.getEstadoComMoeda());
	}

	@Override
	public void ejetarMoeda() {
		this.maquinaDeVendas.setSaida("Nenhuma moeda para ejetar.");
	}

	@Override
	public void selecionarProduto() {
		this.maquinaDeVendas.setSaida("Insira uma moeda primeiro.");
	}

	@Override
	public void dispensar() {
		this.maquinaDeVendas.setSaida("Insira uma moeda primeiro.");
	}
}

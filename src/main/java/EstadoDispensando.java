public class EstadoDispensando implements Estado {
	private MaquinaDeVendas maquinaDeVendas;

	public EstadoDispensando(MaquinaDeVendas maquinaDeVendas) {
		this.maquinaDeVendas = maquinaDeVendas;
	}

	@Override
	public void inserirMoeda() {
		this.maquinaDeVendas.setSaida("Por favor, espere, produto sendo dispensado.");
	}

	@Override
	public void ejetarMoeda() {
		this.maquinaDeVendas.setSaida("Não é possível ejetar a moeda, já está dispensando.");
	}

	@Override
	public void selecionarProduto() {
		this.maquinaDeVendas.setSaida("Já estamos dispensando o produto.");
	}

	@Override
	public void dispensar() {
		maquinaDeVendas.liberarProduto();
		if (maquinaDeVendas.getQuantidadeProdutos() > 0) {
			maquinaDeVendas.setEstado(maquinaDeVendas.getEstadoAguardandoRetirada());
		} else {
			maquinaDeVendas.setEstado(maquinaDeVendas.getEstadoEsgotado());
		}
	}
}

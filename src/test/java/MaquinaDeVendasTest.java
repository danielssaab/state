import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaquinaDeVendasTest {

	@Test
	void deveInserirMoeda() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(2);
		maquina.inserirMoeda();
		assertEquals("Moeda inserida.", maquina.getSaida());
	}

	@Test
	void deveEjetarMoeda() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(2);
		maquina.inserirMoeda();
		maquina.ejetarMoeda();
		assertEquals("Moeda ejetada.", maquina.getSaida());
	}

	@Test
	void deveSelecionarProduto() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(2);
		maquina.inserirMoeda();
		maquina.selecionarProduto();
		assertEquals("Produto selecionado.", maquina.getSaida());
	}

	@Test
	void deveDispensarProduto() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(2);
		maquina.inserirMoeda();
		maquina.selecionarProduto();
		maquina.dispensar();
		assertEquals(1, maquina.getQuantidadeProdutos());
		maquina.ejetarMoeda();  // Tenta ejetar moeda após dispensar
		assertEquals("Não é possível ejetar a moeda, retire o produto primeiro.", maquina.getSaida());
		maquina.inserirMoeda();  // Tenta inserir moeda após dispensar
		assertEquals("Por favor, retire o produto primeiro.", maquina.getSaida());
	}

	@Test
	void naoDeveInserirMoedaQuandoEsgotado() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(0);
		maquina.inserirMoeda();
		assertEquals("Sem produtos disponíveis.", maquina.getSaida());
	}

	@Test
	void naoDeveEjetarMoedaSemInserirMoeda() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(2);
		maquina.ejetarMoeda();
		assertEquals("Nenhuma moeda para ejetar.", maquina.getSaida());
	}

	@Test
	void naoDeveSelecionarProdutoSemInserirMoeda() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(2);
		maquina.selecionarProduto();
		assertEquals("Insira uma moeda primeiro.", maquina.getSaida());
	}

	@Test
	void naoDeveDispensarSemSelecionarProduto() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(2);
		maquina.inserirMoeda();
		maquina.dispensar();
		assertEquals("Selecione um produto primeiro.", maquina.getSaida());
	}

	@Test
	void naoDeveInserirMoedaEnquantoDispensando() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(2);
		maquina.inserirMoeda();
		maquina.selecionarProduto();
		maquina.dispensar();
		maquina.inserirMoeda();
		assertEquals("Por favor, retire o produto primeiro.", maquina.getSaida());
	}

	@Test
	void naoDeveEjetarMoedaEnquantoDispensando() {
		MaquinaDeVendas maquina = new MaquinaDeVendas(2);
		maquina.inserirMoeda();
		maquina.selecionarProduto();
		maquina.dispensar();
		maquina.ejetarMoeda();
		assertEquals("Não é possível ejetar a moeda, retire o produto primeiro.", maquina.getSaida());
	}
}
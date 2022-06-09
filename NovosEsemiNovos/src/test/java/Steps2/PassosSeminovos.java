package Steps2;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PassosSeminovos {

	Metodos met = new Metodos();
	Elementos el = new Elementos();

	
	//TESTE 1
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
		met.abrirNavegador(site);
	}

	@When("clico em Ofertas SemiNovos")
	public void clico_em_ofertas_semi_novos() throws InterruptedException {
		met.clicar(el.getOfertas());
		met.clicar(el.getOfertaSemiNovos());
		Thread.sleep(5000);
	}

	@Then("sou direcionado para o catalogo de carros SemiNovos")
	public void sou_direcionado_para_o_catalogo_de_carros_semi_novos() throws IOException, InterruptedException {
		met.printScr("EvidenciaSemi teste 01");
		met.fecharNavegador();
		Thread.sleep(5000);
	}

	//TESTE 2

	@When("clico em voltar")
	public void clico_em_voltar() throws InterruptedException {
		met.voltarPagina();
		Thread.sleep(5000);
	}

	@Then("entao sou direcionado para pagina anterior")
	public void entao_sou_direcionado_para_pagina_anterior() throws IOException, InterruptedException {
		met.printScr("EvidenciaSemi teste 02");
		met.fecharNavegador();
		Thread.sleep(5000);
	}

	//TESTE 3

	@Then("valido o titulo da pagina")
	public void valido_o_titulo_da_pagina() throws InterruptedException {
		String tituloPagina = met.pegarTitulo();
		assertEquals("Alta Veículos Ofertas seminovos", tituloPagina);
		met.fecharNavegador();
		Thread.sleep(5000);
	}

	//TESTE 4

	@Then("valido o subtitulo da pagina")
	public void valido_o_subtitulo_da_pagina() throws InterruptedException {
		String subtituloPagina = met.pegarTexto(el.getSubTitulo());
		assertEquals("Ofertas Seminovos", subtituloPagina);
		met.fecharNavegador();
		Thread.sleep(5000);
	}
	
	//TESTE 5
	
	@When("filtro a opcao de busca pelo modelo polo")
	public void filtro_a_opcao_de_busca_pelo_modelo_polo() throws InterruptedException {
		met.clicar(el.getModelosPoloSemi());
		Thread.sleep(5000);
	}

	@Then("sou direcionado para o catalogo de carros com o nome polo")
	public void sou_direcionado_para_o_catalogo_de_carros_com_o_nome_polo() throws IOException, InterruptedException {
	    met.printScr("EvidenciaSemi Teste 05");
	    met.fecharNavegador();
	    Thread.sleep(5000);
	}

	//TESTE 6

	@When("filtro a opcao de busca pela marca Volkswagen")
	public void filtro_a_opcao_de_busca_pela_marca_volkswagen() throws InterruptedException {
		met.clicar(el.getVolkswagen());
		Thread.sleep(5000);
	}

	@Then("sou direcionado para o catalogo de carros com a marca Volkswagen")
	public void sou_direcionado_para_o_catalogo_de_carros_com_a_marca_volkswagen() throws IOException, InterruptedException {
		met.printScr("EvidenciaSemi Teste 06");
		met.fecharNavegador();
		Thread.sleep(5000);
	}

	//TESTE 7

	@When("filtro a opcao de busca pela marca Hyundai")
	public void filtro_a_opcao_de_busca_pela_marca_hyundai() throws InterruptedException {
		met.clicar(el.getHyundai());
		Thread.sleep(5000);
	}

	@Then("sou direcionado para o catalogo de carros com a marca Hyundai")
	public void sou_direcionado_para_o_catalogo_de_carros_com_a_marca_hyundai() throws IOException, InterruptedException {
		met.printScr("EvidenciaSemi teste 07");
		met.fecharNavegador();
		Thread.sleep(5000);
	}

	//TESTE 8

	@When("filtro a opcao de busca pela marca Honda")
	public void filtro_a_opcao_de_busca_pela_marca_honda() throws InterruptedException {
		met.clicar(el.getHonda());
	}

	@Then("sou direcionado para o catalogo de carros com a marca Honda")
	public void sou_direcionado_para_o_catalogo_de_carros_com_a_marca_honda() throws IOException, InterruptedException {
		met.printScr("EvidenciaSemi Teste 08");
		met.fecharNavegador();
		Thread.sleep(5000);
	}

	//TESTE 9

	@When("filtro a opcao de busca pelo modelo Tracker")
	public void filtro_a_opcao_de_busca_pelo_modelo_tracker() throws InterruptedException {
		met.clicar(el.getTracker());
		Thread.sleep(5000);
	}

	@Then("sou direcionado para o catalogo de carros de modelo Tracker")
	public void sou_direcionado_para_o_catalogo_de_carros_de_modelo_tracker() throws IOException, InterruptedException {
		met.printScr("EvidenciaSemi Teste 09");
		met.fecharNavegador();
		Thread.sleep(5000);
	}

	//TESTE 10

	@When("filtro a opcao de busca pela cor Cinza")
	public void filtro_a_opcao_de_busca_pela_cor_cinza() throws InterruptedException {
		met.clicar(el.getCinzaColor());
		Thread.sleep(5000);
	}

	@Then("sou direcionado para o catalogo de carros com a cor Cinza")
	public void sou_direcionado_para_o_catalogo_de_carros_com_a_cor_cinza() throws IOException, InterruptedException {
		met.printScr("EvidenciaSemi teste 10");
		met.fecharNavegador();
		Thread.sleep(5000);
	}

	//TESTE 11

	@Given("escolho um modelo de veiculo seminovo")
	public void escolho_um_modelo_de_veiculo_seminovo() {
		met.clicar(el.getEuQuero());
		
	}

	@When("sou direcionado para pagina do veiculo para realizar um orcamento")
	public void sou_direcionado_para_pagina_do_veiculo_para_realizar_um_orcamento() throws InterruptedException {
		Thread.sleep(5000);
	}

	@When("preencho todas as informacoes corretamente")
	public void preencho_todas_as_informacoes_corretamente() throws InterruptedException {
		met.preencherInformacoesSemi("Felipe Silva", "teste@gmail.com", "11998767564", "Gostaria de obter mais informacoes");
		met.clicar(el.getQueroFinanciar());
		met.clicar(el.getQueroDarVeiculoNaTroca());
		met.clicar(el.getLgpd());
		met.clicar(el.getBotaoEnviarSemi());
		Thread.sleep(5000);
		
	}

	@Then("o sistema exibe um aviso de sucesso")
	public void o_sistema_exibe_um_aviso_de_sucesso() throws IOException, InterruptedException {
		met.printScr("EvidenciaSemi Teste 10");
		met.fecharNavegador();
		Thread.sleep(5000);
	}

	//TESTE 12

	@Given("que eu esteja na home de algum veiculo seminovo")
	public void que_eu_esteja_na_home_de_algum_veiculo_seminovo() {
		met.abrirNavegador("https://www.altavw.com.br/ofertas-seminovos?view=62275757df603fb10a8b45e0");
	}

	@When("clico no link de telefone do consultor")
	public void clico_no_link_de_telefone_do_consultor() throws InterruptedException {
		met.clicar(el.getConsultorTel());
		Thread.sleep(2500);
	}

	@Then("o sistema abre uma conexao com o celular do usuario")
	public void o_sistema_abre_uma_conexao_com_o_celular_do_usuario() throws IOException {
		met.printScr("EvidenciaSemi Teste 11");
		met.fecharNavegador();
	}

	//TESTE 13

	@When("clico nos links do twitter e facebook")
	public void clico_nos_links_do_twitter_e_facebook() throws InterruptedException, IOException {
		met.clicar(el.getTwitter());
		Thread.sleep(3000);
		met.printScr("Evidencia Semi Twitter");
		met.fecharAba();
		Thread.sleep(3000);
		met.clicar(el.getFacebook());
		Thread.sleep(3000);
		met.printScr("Evidencia Semi Facebook");
		
		
	}

	@Then("sou direcionado para os sites para compartilhamento da oferta")
	public void sou_direcionado_para_os_sites_para_compartilhamento_da_oferta() {
		
		met.fecharNavegador();
		
	}
	
	
	
	

}

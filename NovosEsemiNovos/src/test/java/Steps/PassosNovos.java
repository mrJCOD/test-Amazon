package Steps;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PassosNovos {
	
	Metodos met = new Metodos();
	Elementos el = new Elementos();
	
	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
	    met.abrirNavegador(site);
	}

	@When("clico em Ofertas Novos")
	public void clico_em_ofertas_novos() throws InterruptedException {
	    met.clicar(el.getOfertas());
	    met.clicar(el.getOfertaNovos());
	    Thread.sleep(3000);
	}

	@Then("sou direcionado para o catalogo de carros 0km")
	public void sou_direcionado_para_o_catalogo_de_carros_0km() throws IOException {
	    met.printScr("EvidenciaNovo teste 01");
	    met.fecharNavegador();
	    
	}
	
	//TESTE 2

	@When("clico em voltar")
	public void clico_em_voltar() throws InterruptedException {
	    met.voltarPagina();
	    Thread.sleep(5000);
	}

	@Then("entao sou direcionado para pagina anterior")
	public void entao_sou_direcionado_para_pagina_anterior() throws IOException {
	    met.printScr("EvidenciaNovos teste 02");
	    met.fecharNavegador();
	}
	
	//TESTE 3

	@Then("valido o titulo da pagina")
	public void valido_o_titulo_da_pagina() throws IOException {
	    String tituloPagina = met.pegarTitulo();
	    met.printScr("EvidenciaNovo teste 01");
	    assertEquals("Alta Veículos Ofertas 0km", tituloPagina);
	    met.fecharNavegador();
	    met.printScr("EvidenciaNovo teste 01");
	}
	
	//TESTE 4

	@Then("valido o subtitulo da pagina")
	public void valido_o_subtitulo_da_pagina() throws IOException {
		String subtituloPagina = met.pegarTexto(el.getSubTitulo());
		met.printScr("EvidenciaNovo teste 01");
		met.printScr("EvidenciaNovo teste 01");
		met.printScr("EvidenciaNovo teste 01");
	    assertEquals("Ofertas 0KM", subtituloPagina);
	    met.fecharNavegador();
	}
	
	//TESTE 5

	@When("filtro a opcao de busca pelo modelo Nivus")
	public void filtro_a_opcao_de_busca_pelo_modelo_nivus() throws InterruptedException {
	    met.clicar(el.getModelosNivus());
	    Thread.sleep(3000);
	}

	@Then("sou direcionado para o catalogo de carros com o nome Nivus")
	public void sou_direcionado_para_o_catalogo_de_carros_com_o_nome_nivus() throws IOException, InterruptedException {
	    met.printScr("EvidenciaNovos Teste 05");
	    met.fecharNavegador();
	    Thread.sleep(5000);
	}
	
	//TESTE 6

	@When("filtro a opcao de busca pelo modelo T-cross")
	public void filtro_a_opcao_de_busca_pelo_modelo_t_cross() throws InterruptedException {
	    met.clicar(el.getModelosTcross());
	    Thread.sleep(3000);
	}

	@Then("sou direcionado para o catalogo de carros com o nome T-cross")
	public void sou_direcionado_para_o_catalogo_de_carros_com_o_nome_t_cross() throws IOException, InterruptedException {
	    met.printScr("EvidenciaNovos Teste 06");
	    met.fecharNavegador();
	    Thread.sleep(5000);
	}
	
	//TESTE 7

	@When("filtro a opcao de busca pelo modelo Virtus")
	public void filtro_a_opcao_de_busca_pelo_modelo_virtus() throws InterruptedException {
	    met.clicar(el.getModelosVirtus());
	    Thread.sleep(3000);
	}

	@Then("sou direcionado para o catalogo de carros com o nome Virtus")
	public void sou_direcionado_para_o_catalogo_de_carros_com_o_nome_virtus() throws IOException, InterruptedException {
	    met.printScr("EvidenciasNovos Teste 07");
	    met.fecharNavegador();
	    Thread.sleep(5000);
	}
	
	//TESTE 8

	@When("filtro a opcao de busca pelo modelo Polo")
	public void filtro_a_opcao_de_busca_pelo_modelo_polo() throws InterruptedException {
	    met.clicar(el.getModelosPolo());
	    Thread.sleep(3000);
	}

	@Then("sou direcionado para o catalogo de carros com o nome Polo")
	public void sou_direcionado_para_o_catalogo_de_carros_com_o_nome_polo() throws IOException, InterruptedException {
	    met.printScr("EvidenciasNovos teste 08");
	    met.fecharNavegador();
	    Thread.sleep(5000);
	}
	
	//TESTE 9

	@When("filtro a opcao de busca pelo modelo Suv")
	public void filtro_a_opcao_de_busca_pelo_modelo_suv() throws InterruptedException {
	    met.clicar(el.getCategoriaSuv());
	    Thread.sleep(3000);
	}

	@Then("sou direcionado para o catalogo de carros com o nome Suv")
	public void sou_direcionado_para_o_catalogo_de_carros_com_o_nome_suv() throws IOException, InterruptedException {
	    met.printScr("EvidenciaNovos teste 09");
	    met.fecharNavegador();
	    Thread.sleep(5000);
	}
	
	//TESTE 10

	@When("filtro a opcao de busca pela categoria Blindado")
	public void filtro_a_opcao_de_busca_pela_categoria_blindado() throws InterruptedException {
	    met.clicar(el.getCategoriaBlindado());
	    Thread.sleep(3000);
	}

	@Then("sou direcionado para o catalogo de carros de categoria blindados")
	public void sou_direcionado_para_o_catalogo_de_carros_de_categoria_blindados() throws IOException, InterruptedException {
	    met.printScr("EvidenciaNovos teste 10");
	    met.fecharNavegador();
	    Thread.sleep(5000);
	}
	
	//TESTE 11

	@When("filtro a opcao de busca pela categoria Sedan")
	public void filtro_a_opcao_de_busca_pela_categoria_sedan() throws InterruptedException {
	    met.clicar(el.getCategoriaSedan());
	    Thread.sleep(3000);
	}

	@Then("sou direcionado para o catalogo de carros de categoria Sedan")
	public void sou_direcionado_para_o_catalogo_de_carros_de_categoria_sedan() throws IOException, InterruptedException {
	    met.printScr("EvidenciaNovos teste 11");
	    met.fecharNavegador();
	    Thread.sleep(5000);
	}
	
	//TESTE 12

	@When("filtro a opcao de busca pela categoria Hatch")
	public void filtro_a_opcao_de_busca_pela_categoria_hatch() {
	    met.clicar(el.getCategoriaHatch());
	    met.escrever("dhsjidahsjfkd", el.getAcessorios());
	}

	@Then("sou direcionado para o catalogo de carros de categoria Hatch")
	public void sou_direcionado_para_o_catalogo_de_carros_de_categoria_hatch() throws IOException, InterruptedException {
       Thread.sleep(2000);
	   met.printScr("EvidenciaNovos teste 12");
	   met.fecharNavegador();
	   Thread.sleep(5000);
	}

}

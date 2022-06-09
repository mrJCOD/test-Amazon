package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	//HOME
	private By ofertas = By.xpath("//*[@id=\"navbar\"]/ul/li[8]/a/span");
	private By ofertaNovos = By.xpath("//a[text()='Ofertas Novos'][@target='_self']");
	private By ofertaSemiNovos = By.xpath("//a[text()='Ofertas Seminovos'][@target='_self']");
	
	//OFERTAS 0KM
	private By modelosNivus = By.xpath("//a[text()='Nivus']");
	private By modelosTcross = By.xpath("//a[text()='T-Cross']");
	private By modelosVirtus = By.xpath("//a[text()='Virtus']");
	private By modelosPolo = By.xpath("//a[text()='Polo']");
	private By categoriaSuv = By.xpath("//a[text()='Suv']");
	private By categoriaBlindado = By.xpath("//a[text()='Blindado']");
	private By categoriaSedan = By.xpath("//a[text()='Sedan']");
	private By categoriaHatch = By.xpath("//a[text()='Hatch']");
	private By saibaMais = By.xpath("//*[@id=\"fixed_result\"]/div/ol/li[1]/div/a/div[2]");
	private By subTitulo = By.xpath("//*[@id=\"main-content\"]/div/h3");

	//HOME DO CARRO PARA ENVIAR PROPOSTA
	private By selecionaUmaLoja = By.name("dealer_id");
	private By lojaAltaJafet = By.xpath("//*[@id=\"main-content\"]/div/div/div[3]/div[2]/form/div[1]/select/option[2]");
	private By lojaAltaBrazLeme = By.xpath("//*[@id=\"main-content\"]/div/div/div[3]/div[2]/form/div[1]/select/option[3]");
	private By lojaAltaVergueiro = By.xpath("//*[@id=\"main-content\"]/div/div/div[3]/div[2]/form/div[1]/select/option[4]");
	private By campoNome = By.name("name");
	private By campoEmail = By.name("email");
	private By campoTel = By.name("phone");
	private By captcha = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]");
	private By checkBoxPrivacidade = By.name("add[lgpd]");
	private By enviar = By.id("default-form-submit");
	
	//OFERTAS SEMINOVOS
	private By marcaModeloCor = By.name("q");
	private By precoMin = By.name("price_from");
	private By precoMax = By.name("price_to");
	private By anoMin = By.name("year_from");
	private By ano1981 = By.xpath("//*[@id=\"cc-plugin-advanced-form\"]/form/div[1]/div[6]/select/option[44]");
	private By ano2023 = By.xpath("//*[@id=\"cc-plugin-advanced-form\"]/form/div[1]/div[6]/select/option[2]");
	private By anoMax = By.name("year_to");
	private By acessorios = By.xpath("//*[@id=\"cc-plugin-advanced-form\"]/form/div[1]/div[7]/a");
	private By buscarLojas = By.name("dealer");
	private By buscarLojaAltaJafet = By.xpath("//*[@id=\"cc-plugin-advanced-form\"]/form/div[1]/div[4]/select/option[3]");
	private By buscarLojaAltaBrazLeme = By.xpath("//*[@id=\"cc-plugin-advanced-form\"]/form/div[1]/div[4]/select/option[5]");
	private By buscarLojaAltaVergueiro = By.xpath("//*[@id=\"cc-plugin-advanced-form\"]/form/div[1]/div[4]/select/option[2]");
	private By buscarLojaAltaBlindados = By.xpath("//*[@id=\"cc-plugin-advanced-form\"]/form/div[1]/div[4]/select/option[6]");
	private By buscarLojaAltaSemiNovos = By.xpath("//*[@id=\"cc-plugin-advanced-form\"]/form/div[1]/div[4]/select/option[4]");
	private By volkswagen = By.xpath("//*[@id=\"cc-plugin-advanced-result\"]/div[2]/div[1]/div[1]/ul/li[1]/a");
	private By hyundai = By.xpath("//*[@id=\"cc-plugin-advanced-result\"]/div[2]/div[1]/div[1]/ul/li[2]/a");
	private By honda = By.xpath("//*[@id=\"cc-plugin-advanced-result\"]/div[2]/div[1]/div[1]/ul/li[3]/a");
	private By tracker = By.xpath("//*[@id=\"cc-plugin-advanced-result\"]/div[2]/div[1]/div[2]/ul/li[4]/a");
	private By cinzaColor = By.xpath("//*[@id=\"cc-plugin-advanced-result\"]/div[2]/div[1]/div[3]/ul/li[2]/a");
	private By euQuero = By.xpath("//*[@id=\"cc-plugin-advanced-result\"]/div[2]/div[2]/div/ol[1]/li[1]/div/a");
	private By queroFinanciar = By.name("financiar");
	private By queroDarVeiculoNaTroca = By.name("troca");
	private By lgpd = By.name("lgpd");
	private By consultorTel = By.xpath("//*[@id=\"cc-plugin-loader\"]/div/div/div[3]/div[1]/p/a");
	private By twitter = By.id("twitter-share");
	private By facebook = By.id("facebook-share");
	private By campoMsg = By.name("message");
	private By botaoEnviarSemi = By.xpath("//*[@id=\"used-form\"]/div[8]/button");
	private By modelosPoloSemi = By.xpath("//*[@id=\"cc-plugin-advanced-result\"]/div[2]/div[1]/div[2]/ul/li[1]/a");
	
	
	
	public By getOfertas() {
		return ofertas;
	}
	public By getOfertaNovos() {
		return ofertaNovos;
	}
	public By getOfertaSemiNovos() {
		return ofertaSemiNovos;
	}
	public By getModelosNivus() {
		return modelosNivus;
	}
	public By getModelosTcross() {
		return modelosTcross;
	}
	public By getModelosVirtus() {
		return modelosVirtus;
	}
	public By getModelosPolo() {
		return modelosPolo;
	}
	public By getCategoriaSuv() {
		return categoriaSuv;
	}
	public By getCategoriaBlindado() {
		return categoriaBlindado;
	}
	public By getCategoriaSedan() {
		return categoriaSedan;
	}
	public By getCategoriaHatch() {
		return categoriaHatch;
	}
	public By getSaibaMais() {
		return saibaMais;
	}
	public By getSelecionaUmaLoja() {
		return selecionaUmaLoja;
	}
	public By getLojaAltaJafet() {
		return lojaAltaJafet;
	}
	public By getLojaAltaBrazLeme() {
		return lojaAltaBrazLeme;
	}
	public By getLojaAltaVergueiro() {
		return lojaAltaVergueiro;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoTel() {
		return campoTel;
	}
	public By getCaptcha() {
		return captcha;
	}
	public By getCheckBoxPrivacidade() {
		return checkBoxPrivacidade;
	}
	public By getEnviar() {
		return enviar;
	}
	public By getMarcaModeloCor() {
		return marcaModeloCor;
	}
	public By getPrecoMin() {
		return precoMin;
	}
	public By getPrecoMax() {
		return precoMax;
	}
	public By getAnoMin() {
		return anoMin;
	}
	public By getAno1981() {
		return ano1981;
	}
	public By getAno2023() {
		return ano2023;
	}
	public By getAnoMax() {
		return anoMax;
	}
	public By getAcessorios() {
		return acessorios;
	}
	public By getBuscarLojas() {
		return buscarLojas;
	}
	public By getBuscarLojaAltaJafet() {
		return buscarLojaAltaJafet;
	}
	public By getBuscarLojaAltaBrazLeme() {
		return buscarLojaAltaBrazLeme;
	}
	public By getBuscarLojaAltaVergueiro() {
		return buscarLojaAltaVergueiro;
	}
	public By getBuscarLojaAltaBlindados() {
		return buscarLojaAltaBlindados;
	}
	public By getBuscarLojaAltaSemiNovos() {
		return buscarLojaAltaSemiNovos;
	}
	public By getSubTitulo() {
		return subTitulo;
	}
	public By getVolkswagen() {
		return volkswagen;
	}
	public By getHyundai() {
		return hyundai;
	}
	public By getHonda() {
		return honda;
	}
	public By getTracker() {
		return tracker;
	}
	public By getCinzaColor() {
		return cinzaColor;
	}
	public By getEuQuero() {
		return euQuero;
	}
	public By getQueroFinanciar() {
		return queroFinanciar;
	}
	public By getQueroDarVeiculoNaTroca() {
		return queroDarVeiculoNaTroca;
	}
	public By getLgpd() {
		return lgpd;
	}
	public By getConsultorTel() {
		return consultorTel;
	}
	public By getTwitter() {
		return twitter;
	}
	public By getFacebook() {
		return facebook;
	}
	public By getCampoMsg() {
		return campoMsg;
	}
	public By getBotaoEnviarSemi() {
		return botaoEnviarSemi;
	}
	public By getModelosPoloSemi() {
		return modelosPoloSemi;
	}
	
	
	
	
	
	
	
	
	
	
}


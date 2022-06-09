#Author: your.email@your.domain.com

@tag
Feature: Validar os campos e links de Ofertas de Novos
Validar os campos e links das paginas

  @tag1
  Scenario: Validar se o link direciona para a pagina correta
    Given que eu esteja no "https://www.altavw.com.br/"
    When clico em Ofertas SemiNovos
    Then sou direcionado para o catalogo de carros SemiNovos


  @tag2
  Scenario Outline: Validar se o botao voltar direciona para a pagina anterior sem erro
    Given que eu esteja no "https://www.altavw.com.br/ofertas-seminovos"
    When clico em voltar
    Then entao sou direcionado para pagina anterior
    
  @tag3
  Scenario Outline: Validar o titulo da pagina
    Given que eu esteja no "https://www.altavw.com.br/ofertas-seminovos"
    Then valido o titulo da pagina
    
  @tag4
  Scenario Outline: Validar subtitulo da pagina
    Given que eu esteja no "https://www.altavw.com.br/ofertas-seminovos"
    Then valido o subtitulo da pagina
    
  @tag5
  Scenario Outline: Fazer uma busca de veiculo SemiNovo
    Given que eu esteja no "https://www.altavw.com.br/ofertas-seminovos"
    When filtro a opcao de busca pelo modelo polo
    Then sou direcionado para o catalogo de carros com o nome polo
    
    
  @tag6
  Scenario Outline: Fazer uma busca pela marca Volkswagen utilizando o filtro de Marcas
    Given que eu esteja no "https://www.altavw.com.br/ofertas-seminovos"
    When filtro a opcao de busca pela marca Volkswagen
    Then sou direcionado para o catalogo de carros com a marca Volkswagen
    
  @tag7
  Scenario Outline: Fazer uma busca pela marca Hyundai utilizando o filtro de Marcas
    Given que eu esteja no "https://www.altavw.com.br/ofertas-seminovos"
    When filtro a opcao de busca pela marca Hyundai
    Then sou direcionado para o catalogo de carros com a marca Hyundai
    
  @tag8
  Scenario Outline: Fazer uma busca pela marca Honda utilizando o filtro de Marcas
    Given que eu esteja no "https://www.altavw.com.br/ofertas-seminovos"
    When filtro a opcao de busca pela marca Honda
    Then sou direcionado para o catalogo de carros com a marca Honda
    
  @tag9
  Scenario Outline: Fazer uma busca por modelo utilizando o filtro de Modelos
    Given que eu esteja no "https://www.altavw.com.br/ofertas-seminovos"
 		When filtro a opcao de busca pelo modelo Tracker
    Then sou direcionado para o catalogo de carros de modelo Tracker
    
  @tag10
  Scenario Outline: Fazer uma busca por cor utilizando o filtro de Cores
    Given que eu esteja no "https://www.altavw.com.br/ofertas-seminovos"
    When filtro a opcao de busca pela cor Cinza
    Then sou direcionado para o catalogo de carros com a cor Cinza
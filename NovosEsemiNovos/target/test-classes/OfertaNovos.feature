#Author: your.email@your.domain.com

@teste
Feature: Validar os campos e links de Ofertas de Novos
Validar os campos e links das páginas

  @teste1
  Scenario: Validar se o link direciona para a pagina correta
    Given que eu esteja no "https://www.altavw.com.br/"
    When clico em Ofertas Novos
    Then sou direcionado para o catalogo de carros 0km


  @teste2
  Scenario Outline: Validar se o botao voltar direciona para a pagina anterior sem erro
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    When clico em voltar
    Then entao sou direcionado para pagina anterior
    
  @teste3
  Scenario Outline: Validar o titulo da pagina
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    Then valido o titulo da pagina
    
  @teste4
  Scenario Outline: Validar subtitulo da pagina
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    Then valido o subtitulo da pagina
    
  @teste5
  Scenario Outline: Fazer uma busca pelo modelo Nivus utilizando o filtro de Modelos
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    When filtro a opcao de busca pelo modelo Nivus
    Then sou direcionado para o catalogo de carros com o nome Nivus
    
    
  @teste6
  Scenario Outline: Fazer uma busca pelo modelo T-cross utilizando o filtro de Modelos
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    When filtro a opcao de busca pelo modelo T-cross
    Then sou direcionado para o catalogo de carros com o nome T-cross
    
  @teste7
  Scenario Outline: Fazer uma busca pelo modelo Virtus utilizando o filtro de Modelos
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    When filtro a opcao de busca pelo modelo Virtus
    Then sou direcionado para o catalogo de carros com o nome Virtus
    
  @teste8
  Scenario Outline: Fazer uma busca pelo modelo Polo utilizando o filtro de Modelos
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    When filtro a opcao de busca pelo modelo Polo
    Then sou direcionado para o catalogo de carros com o nome Polo
    
  @teste9
  Scenario Outline: Fazer uma busca pela categoria Suv utilizando o filtro de Categoria
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    When filtro a opcao de busca pelo modelo Suv
    Then sou direcionado para o catalogo de carros com o nome Suv
    
  @teste10
  Scenario Outline: Fazer uma busca pela categoria Blindado utilizando o filtro de Categoria
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    When filtro a opcao de busca pela categoria Blindado
    Then sou direcionado para o catalogo de carros de categoria blindados
    
  @teste11
  Scenario Outline: Fazer uma busca pela categoria Sedan utilizando o filtro de Categoria
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    When filtro a opcao de busca pela categoria Sedan
    Then sou direcionado para o catalogo de carros de categoria Sedan
    
  @teste12
  Scenario Outline: Fazer uma busca pela categoria Hatch utilizando o filtro de Categoria
    Given que eu esteja no "https://www.altavw.com.br/ofertas-0km"
    When filtro a opcao de busca pela categoria Hatch
    Then sou direcionado para o catalogo de carros de categoria Hatch
    
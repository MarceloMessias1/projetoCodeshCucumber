#Author: teste@teste.com.br

Feature: Login codesh
  Como usuario quero cadastrar usuario para fazer login

Background:
Given que eu esteja no site "https://beta.coodesh.com/"


 Scenario: clicar cookies
 
    When clico cookies
    Then preencho dados validos

    
    
    Scenario: Login valido
    
    When clicar login
    Then preencher dados 
    
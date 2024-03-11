#language: pt
#encoding: UTF-8

Funcionalidade: Tela women

  @ID_001 @women @telaWomen
  Cenario: ID_001 - Retorno tela women
   Dado que o usuario acessa o site
   Quando aciona a opção Women
   Então retorna tela Women
   
  @ID_002 @women @opcaoTops
  Cenario: ID_002 - Retorno tela tops
   Dado que o usuario acessa o site
   Quando aciona a opção Women
   E aciona a opção Tops
   Então retorna tela Tops
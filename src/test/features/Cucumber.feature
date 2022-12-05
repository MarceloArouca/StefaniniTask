#language:pt
Funcionalidade: Cadastrar Usuario
  Esquema do Cenário: Realizar Cadastro Usuario Stefanini
    Dado que usuario acessar link: "http://www.stefanini.com.br/cadastro"
    Quando usuario preencher formulario nome: "Stefanini" email: "Stefanini@stefanini.com" e senha:"stefanini123"
    Entao verificar dados do formulario: "Stefanini" "Stefanini@stefanini.com"
    Exemplos:

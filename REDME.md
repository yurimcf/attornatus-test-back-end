# attornatus-test-back-end

## API de Gerenciamento de Pessoas
Essa API foi desenvolvida utilizando o framework Spring Boot e permite a criação, edição, consulta e listagem de pessoas. Além disso, permite a criação e listagem de endereços associados a cada pessoa, bem como a indicação de um endereço como principal.

### Funcionalidades
A API oferece as seguintes funcionalidades:

### Pessoa
**Criação de pessoa:** permite a criação de uma pessoa com nome e data de nascimento.

**Edição de pessoa:** permite a edição dos dados de uma pessoa existente.

**Consulta de pessoa:** permite a consulta dos dados de uma pessoa a partir do seu ID.

**Listagem de pessoas:** permite a listagem de todas as pessoas cadastradas na base de dados.

### Endereço
**Criação de endereço:** permite a criação de um endereço associado a uma pessoa. Cada endereço é composto por um logradouro, CEP, número e cidade.

**Listagem de endereços:** permite a listagem de todos os endereços associados a uma determinada pessoa.

**Definição de endereço principal:** permite a indicação de um dos endereços associados a uma pessoa como endereço principal.

### Campos
Cada pessoa tem os seguintes campos:

**ID:** identificador único da pessoa na base de dados.

**Nome:** nome da pessoa.

**Data de nascimento:** data de nascimento da pessoa.

Cada endereço tem os seguintes campos:

**ID:** identificador único do endereço na base de dados.

**Logradouro:** logradouro do endereço.

**CEP:** CEP do endereço.

**Número:** número do endereço.

**Cidade:** cidade do endereço.

### Respostas
Todas as respostas da API são fornecidas no formato JSON.

### Banco de Dados
A API utiliza o banco de dados H2.

### Execução da Aplicação
Para executar a aplicação, é necessário seguir os seguintes passos:

Clone este repositório: git clone https://github.com/yurimcf/attornatus-test-back-end.git
A aplicação estará disponível no endereço http://localhost:8080.

### Autor
Este projeto foi desenvolvido por Yuri Mathaus.
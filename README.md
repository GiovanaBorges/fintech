# Readme do Projeto Fintech para Gestão de Finanças Pessoais

Bem-vindo ao projeto Fintech para Gestão de Finanças Pessoais! Esta API Spring Boot foi desenvolvida com o propósito de ajudar pessoas endividadas financeiramente a aprender a lidar com suas finanças de forma mais eficiente. Com a capacidade de criar, listar e excluir usuários, bem como adicionar e consultar informações de investimentos, esta aplicação visa simplificar o processo de controle financeiro pessoal.

## observação

existe uma collection de requests em json , nomeada de collection.json . importe ela em alguma ferramenta como insomnia ou postman para interagir com a API.

## Funcionalidades

### Usuários (User)

- **GET /user**: Esta rota permite a recuperação de informações de usuário existentes, fornecendo uma lista de todos os usuários cadastrados.

- **POST /user**: Utilize esta rota para criar um novo usuário, fornecendo as informações necessárias, como nome, cpf , e-mail e outras informações relevantes.

- **DELETE /user/{id}**: Essa rota permite a exclusão de um usuário específico, identificado pelo seu ID. Isso pode ser útil para remover informações de usuário quando necessário.

### Investimentos (Investimento)

- **GET /investimento**: Esta rota permite a consulta de informações de investimento, incluindo detalhes sobre os tipos de investimento, rendimentos, entre outros.

- **POST /investimento**: Utilize esta rota para adicionar informações de investimento. Você pode inserir informações sobre o tipo de investimento, o valor investido e a data de início.

**DELETE /investimento/{id}**: Essa rota permite a exclusão de um investimento específico, identificado pelo seu ID. Isso pode ser útil para remover informações de investimento quando necessário.

## Pré-requisitos

Antes de começar a usar a API Fintech, certifique-se de que você tenha instalado o seguinte:

- **Java Development Kit (JDK)**: A aplicação é desenvolvida em Java e requer o JDK para ser executada.

## Como usar a API

1. Clone o repositório do projeto:

   ```bash
   git clone https://github.com/GiovanaBorges/fintech.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd fintech
   ```

3. Compile o projeto:

   ```bash
   ./mvnw clean package
   ```

4. Execute a aplicação:

   ```bash
   java -jar target/fintech-1.0.jar
   ```

Agora, a API Fintech está em execução localmente em `http://localhost:8080`. Você pode usar ferramentas como Postman ou cURL para interagir com as rotas disponíveis.


Esperamos que esta API ajude a melhorar suas habilidades financeiras e a alcançar uma vida financeira mais saudável. Boa sorte em sua jornada financeira!
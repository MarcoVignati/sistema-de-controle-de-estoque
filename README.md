
# API de Gerenciamento de Estoque

Esta é uma API simples de gerenciamento de estoque desenvolvida em Java com Spring, que permite que você crie, liste, atualize e delete produtos e fornecedores de forma eficiente. Esta API é ideal para ser usada como backend para aplicativos de controle de estoque.


## Funcionalidades

- **Cadastro**: Cadastre novos produtos com nome, descrição, preço e quantidade em estoque, ou cadastre novos fornecedores com nome, endereço, telefone e email.
- **Listagem**: Liste todos os produtos ou todos os fornecedores existentes ou filtre-os com base em seu id.
- **Atualização**: Atualize o nome, a descrição, o preço ou qualquer outra informação de um produto existente, ou atualize o nome, endereço, telefone, email ou qualquer outra informação de um fornecedor existente.
- **Deleção**: Exclua produtos ou fornecedores cadastrados.


## Rodando localmente

Antes de rodar a aplicação é preciso garantir que as seguintes dependências estejam corretamente instaladas:
```
  Java 21
  Maven 4.0.0
```

Clone o projeto

```bash
  git clone https://github.com/MarcoVignati/sistema-de-controle-de-estoque
```

Entre no diretório do projeto

```bash
  cd sistema-de-controle-de-estoque
```

É preciso compilar o código e baixar as dependências do projeto:

```bash
  mvn clean package
```

Finalizado esse passo, vamos iniciar a aplicação:

```bash
  mvn spring-boot:run
```

Pronto. A aplicação está disponível em http://localhost:8080
## Documentação da API

#### Retorna todos os produtos

```http
  GET /api/produtos
```

#### Retorna um produto

```http
  GET /api/produtos/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do produto que você quer. |

#### Atualiza um produto

```http
  PUT /api/produtos/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do produto que você quer atualizar.|

#### Deleta um produto

```http
  DELETE /api/produtos/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do produto que você quer deletar.|

###

#### Retorna todos os fornecedores

```http
  GET /api/fornecedores
```

#### Retorna um fornecedor

```http
  GET /api/fornecedores/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do fornecedor que você quer. |

#### Atualiza um fornecedor

```http
  PUT /api/fornecedores/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do fornecedor que você quer atualizar.|

#### Deleta um fornecedor

```http
  DELETE /api/fornecedores/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do fornecedor que você quer deletar.|


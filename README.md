# API de Gerenciamento de Estoque

Esta é uma API simples de gerenciamento de estoque desenvolvida em Java com Spring, que permite que você crie, liste, atualize e delete produtos e fornecedores de forma eficiente. Esta API é ideal para ser usada como backend para aplicativos de controle de estoque.


## Funcionalidades

- **Cadastro de Produtos**: Cadastre novos produtos com nome, descrição, preço e quantidade em estoque.
- **Listagem de Produtos**: Liste todas os produtos existentes ou filtre-os com base no id do produto.
- **Atualização de Produtos**: Atualize o nome, a descrição, o preço ou qualquer outra informação de um produto existente.
- **Deleção de Produto**: Exclua produtos cadastrados.


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
| `id`      | `string` | **Obrigatório**. O ID do to-do que você quer. |

#### Atualiza um produto

```http
  PUT /api/produtos/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do to-do que você quer atualizar.|

#### Deleta um produto

```http
  DELETE /api/produtos/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do to-do que você quer deletar.|

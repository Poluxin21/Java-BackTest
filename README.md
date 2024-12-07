# Sistema de Login - Backend (Spring Boot)

Este projeto é uma API de autenticação simples com Spring Boot. Ele permite que os usuários façam login utilizando um nome de usuário e senha, e em troca, recebem um **token JWT** que pode ser usado para acessar o painel de administração.

## Estrutura de Pastas

A estrutura do projeto está organizada em pacotes para manter o código modular e fácil de gerenciar. Aqui estão as pastas principais e o propósito de cada uma:

### 1. **`models`**

A pasta **`models`** contém as classes que representam as entidades do sistema. Estas entidades são mapeadas para o banco de dados e são usadas para armazenar e recuperar dados.

- **Exemplo de arquivo**: `User.java`
- **Função**: Representar os dados do usuário no sistema, como o nome de usuário e senha.

### 2. **`services`**

A pasta **`services`** contém as classes responsáveis pela lógica de negócio da aplicação. São essas classes que executam operações complexas, como validação, manipulação de dados, geração de tokens JWT, etc.

- **Exemplo de arquivo**: `AuthService.java`
- **Função**: Implementar a lógica de autenticação, validando as credenciais do usuário e gerando o token JWT.

### 3. **`controllers`**

A pasta **`controllers`** contém as classes que gerenciam as requisições HTTP. Cada classe geralmente está associada a uma URL específica e lida com o processamento de dados enviados pelo usuário (normalmente através de **POST**, **GET**, **PUT**, **DELETE**).

- **Exemplo de arquivo**: `AuthController.java`
- **Função**: Gerenciar as requisições de login, recebendo dados do usuário e passando para o serviço de autenticação.

### 4. **`config`**

A pasta **`config`** contém as classes responsáveis pela configuração e personalização do comportamento do Spring Boot. Essas classes podem configurar a segurança, os beans de dependência e outras configurações importantes.

- **Exemplo de arquivo**: `SecurityConfig.java`
- **Função**: Configurar a segurança da aplicação, como quais rotas são protegidas por autenticação, como o CSRF é tratado e como as requisições HTTP são autorizadas.

---

## Explicação das Anotações no Código

O Spring Boot e o Spring Framework usam várias anotações para facilitar a configuração e o funcionamento da aplicação. Aqui está um resumo das anotações mais comuns usadas no backend.

### 1. **`@SpringBootApplication`**

- **Função**: Esta anotação marca a classe principal de um aplicativo Spring Boot. Ela combina várias anotações importantes:
  - **`@Configuration`**: Indica que a classe contém configurações de Spring.
  - **`@EnableAutoConfiguration`**: Habilita a configuração automática do Spring.
  - **`@ComponentScan`**: Permite ao Spring escanear automaticamente os pacotes em busca de componentes como **`@Controller`**, **`@Service`**, **`@Repository`**, etc.

### 2. **`@RestController`**

- **Função**: Marca a classe como um controlador REST. Isso significa que ela irá lidar com requisições HTTP e retornar respostas no formato JSON ou XML. A anotação combina **`@Controller`** e **`@ResponseBody`**, eliminando a necessidade de retornar explicitamente objetos de resposta.

### 3. **`@RequestMapping`**

- **Função**: Define uma rota para um controlador ou um método dentro de um controlador. Pode ser configurado para um verbo HTTP específico (como **GET**, **POST**, **PUT**, **DELETE**) com as anotações **`@GetMapping`**, **`@PostMapping`**, etc.

### 4. **`@Autowired`**

- **Função**: Permite que o Spring injete automaticamente dependências nas classes. Ao usar **`@Autowired`** em um campo, o Spring irá procurar uma instância do tipo requerido e injetá-la na classe onde a anotação foi usada.

### 5. **`@Service`**

- **Função**: Marca a classe como um **serviço** Spring. Isso indica que a classe contém a lógica de negócio da aplicação. O Spring gerencia a instância da classe, permitindo a injeção de dependências em outros componentes.

### 6. **`@Entity`**

- **Função**: Marca uma classe como uma entidade JPA, o que significa que ela será mapeada para uma tabela em um banco de dados. Essa anotação é usada para indicar que a classe é um modelo de dados persistente.

### 7. **`@Id`**

- **Função**: Marca um campo de uma classe **`@Entity`** como a chave primária da tabela no banco de dados. Isso é necessário para garantir a unicidade de cada registro na tabela.

### 8. **`@Configuration`**

- **Função**: Marca uma classe como uma classe de configuração que define configurações adicionais para o Spring. Essa anotação é usada para configurar a segurança, o acesso ao banco de dados e outros aspectos da aplicação.

### 9. **`@EnableWebSecurity`**

- **Função**: Ativa a configuração de segurança da aplicação web no Spring. Com ela, você pode definir regras específicas de acesso para as rotas da aplicação, como quais páginas podem ser acessadas sem autenticação e quais exigem autenticação.

---

## Como Rodar o Projeto

### Backend (Spring Boot):
1. Baixe o repositorio
2. Baixe o Maven para windows
3. Rode o comando
   ```bash
    mvn spring-boot:run
   ```

o servidor ira ser iniciado em localhost:8080


### Explicação:
1. **Estrutura de Pastas**:
   - Cada pasta tem uma função específica: **models** armazena os dados, **services** lida com a lógica de negócio, **controllers** recebe as requisições HTTP e **config** configura o comportamento da aplicação, como segurança e banco de dados.
   
2. **Explicação das Anotações**:
   - O Spring Boot usa anotações para configurar comportamentos automaticamente. A documentação fornece um resumo de como cada anotação no backend funciona para garantir que a dev iniciante possa entender o propósito de cada uma delas.


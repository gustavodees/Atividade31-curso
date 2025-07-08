# Cadastro de Empregado em Java

Este projeto consiste em um programa Java simples para cadastrar informações de um empregado (nome e salário) e exibir o salário líquido após a dedução de um imposto.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o ponto de entrada do programa e a interação com o usuário para inserir os dados do empregado.
* `model/Empregado.java`: Define a classe `Empregado`, que representa um empregado com atributos como nome, salário e imposto, e métodos para calcular o salário líquido e exibir as informações.

## Como Usar

1.  **Salve os arquivos:** Salve o código fornecido nas respectivas pastas:
    * Crie uma pasta chamada `principal`. Dentro dela, crie um arquivo chamado `Main.java`.
    * Crie uma pasta chamada `model`. Dentro dela, crie um arquivo chamado `Empregado.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile os arquivos Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java model/Empregado.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` a partir do terminal:

    ```bash
    java principal.Main
    ```

4.  **Entrada:** O programa solicitará que você digite o nome do empregado e o valor do seu salário. Insira as informações solicitadas e pressione Enter após cada entrada.

5.  **Saída:** O programa exibirá o nome do funcionário e o seu salário líquido (salário original menos o imposto).

## Explicação do Código

### `model/Empregado.java`

Este arquivo define a classe `Empregado`, que representa um funcionário.

* **Atributos:**
    * `nome` (String): Representa o nome do empregado.
    * `salario` (double): Representa o salário bruto do empregado.
    * `imposto` (double): Representa o valor do imposto a ser deduzido do salário.
* **Construtores:**
    * `Empregado()`: Construtor padrão que inicializa o nome como uma string vazia, o salário com 0.00 e o imposto com 1000.00.
    * `Empregado(String nome, double salario, double imposto)`: Construtor que permite definir o nome, salário e imposto iniciais do empregado.
* **Getters e Setters:** Fornece métodos públicos para acessar e modificar os atributos da classe.
    * `getNome()`: Retorna o nome do empregado.
    * `setNome(String nome)`: Define o nome do empregado.
    * `getSalario()`: Retorna o salário bruto do empregado.
    * `setSalario(double salario)`: Define o salário bruto do empregado.
    * `getImposto()`: Retorna o valor do imposto a ser deduzido.
* **Métodos:**
    * `getsalarioLiquido()`: Calcula e retorna o salário líquido do empregado subtraindo o imposto do salário bruto.
    * `@Override public String toString()`: Sobrescreve o método `toString` para retornar uma representação em string do objeto `Empregado`, mostrando o nome e o salário líquido.

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria uma instância da classe `Empregado`.
    2.  Cria um objeto `Scanner` para receber a entrada do usuário.
    3.  Solicita e lê o nome do empregado.
    4.  Solicita e lê o valor do salário do empregado.
    5.  Chama o método `setNome()` e `setSalario()` para definir os atributos do objeto `Empregado`.
    6.  Imprime as informações do empregado, utilizando o método `toString()` da classe `Empregado`, que exibe o nome e o salário líquido.
    7.  Fecha o objeto `Scanner` para liberar os recursos.

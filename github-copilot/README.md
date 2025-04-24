## Projeto de Validação de Cartão de Crédito

Este projeto foi desenvolvido como parte do curso **Microsoft 50 Anos - GitHub Copilot**. O objetivo principal deste projeto é validar números de cartões de crédito, garantindo que eles estejam no formato correto e que sejam válidos de acordo com o algoritmo de Luhn.

### Funcionalidades

O projeto contém uma função chamada `validarCartao`, que realiza as seguintes operações:

1. **Remoção de Formatação**: A função remove espaços e traços do número do cartão para facilitar a validação.
2. **Verificação de Bandeira**: Utiliza expressões regulares para identificar a bandeira do cartão (como Visa, MasterCard, etc.).
3. **Validação com Algoritmo de Luhn**: Implementa a função `validarLuhn`, que soma os dígitos do cartão de forma alternada e verifica se o total é divisível por 10, confirmando a validade do número.

### Uso

Um exemplo de uso da função `validarCartao` está incluído no código, onde um número de cartão é validado e o resultado é exibido no console, indicando se o cartão é válido e qual a sua bandeira.

### Implementação

O arquivo `src/index.js` contém a implementação das funções mencionadas. A função `validarCartao` é responsável por orquestrar o processo de validação, chamando as funções auxiliares para remover a formatação, verificar a bandeira e validar o número usando o algoritmo de Luhn.

### Sobre o Desenvolvimento

Este projeto foi desenvolvido com a ajuda do GitHub Copilot, uma ferramenta que forneceu sugestões e assistências durante a implementação do código. A utilização do Copilot foi uma escolha intencional para explorar seu potencial no contexto do curso **Microsoft 50 Anos - GitHub Copilot**, demonstrando como ele pode facilitar o desenvolvimento e a criação de funcionalidades de forma eficiente.

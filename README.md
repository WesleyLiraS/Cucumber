# Projeto Cucumber

Este é um projeto de exemplo que demonstra como usar o Cucumber com Java para automação de testes de aceitação.

## Requisitos

Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- Java Development Kit (JDK)
- Maven
- Cucumber
- Selenium WebDriver (opcional, dependendo dos testes)

## Configuração do Projeto

1. Clone este repositório em seu ambiente local:

   ```shell
   git clone https://github.com/WesleyLiraS/Cucumber.git

2. Importe o projeto em sua IDE preferida como um projeto Maven existente.

3. Certifique-se de que todas as dependências do Maven foram baixadas e configuradas corretamente.

## Executando os Testes

1. Navegue até a classe de teste ou diretório de features onde estão definidos os cenários de teste.

2. Execute os testes utilizando o comando Maven:
	
	```shell
	mvn test
	
3. Os testes serão executados em um navegador web (por padrão, o Chrome) e você poderá ver os resultados no console.

## Estrutura do Projeto

- `src/main/java`: Contém as classes principais do projeto.
- `src/test/java`: Contém as classes de teste e os steps definitions do Cucumber.
- `src/test/resources`: Contém os arquivos de configuração do Cucumber e os arquivos de features com os cenários de teste.

## Contribuindo

Sinta-se à vontade para contribuir com melhorias ou correções de bugs. Basta enviar um pull request!

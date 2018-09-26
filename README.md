# Desafio da e-core

## Desenvolvimento
* Testes automatizados utilizando:
  1. Java
  1. Junit
  1. Selenium Webdriver
  1. Google Chrome
  1. Cucumber
  1. Gradle (semelhante ao maven)

## Código

### Pages
Contem a classe com os elementos de cada página. Baseado no Page objects pattern.

__1. LoginPage:__ Contém os localizadores de cada elemento usado e os métodos que podem estar relacionados a esse elemento.
   
__1. MyAccountPage:__ Contém os localizadores de cada elemento usado e os métodos que podem estar relacionados a esse elemento.


### Steps

__1. Background steps definition__ Define a "Background steps definition", necessárias para ser executado como "requirements"

__1. LoginStepDefinition__ Define os testes da feature login. 

__1. InvoiceStepDefinition__ Define os testes da feature invoice. 

__1. SettingsStartingEndingSteps__ Define as ações necessárias para serem executadas antes e depois da execução dos cenários.

### Test

__1. RunTest__ Define que os testes serão executados com o Cucumber e as opções relacionadas a ele (por exemplo, caminho para o arquivo feature, formatação do report... etc.).


### Utils

__1. CommonMethods__ Define que os métodos comuns que possam ser compartilhados entre os testes

__1. Selenium__ Pacote que define o driver a ser usado, configuração de timeout, inicialização do driver, metodos waits que possam ser comuns.

### Resources

__1. Login.feature__ Define os cenários de testes a serem abordados pela feature de Login

__1. Invoice.feature__ Define os cenários de testes a serem abordados pela feature de Invoice

## Como rodar?

1. `./gradlew setupCucumberTestWithGoogleChrome` - Para baixar o driver a ser usado na pasta SeleniumDriver, de acordo com seu sistema operacional. (GoogleChrome currently the driver is 2.42)
1. `./gradlew test` - Para executar todos os testes
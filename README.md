# Projeto Final Academia Accenture <br>

# Integrante: <br>

- [![Linkedin Badge](https://img.shields.io/badge/-Sigrid-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/sigrid-rodrigues/)](https://www.linkedin.com/in/sigrid-rodrigues/)[Sigrid Rodrigues](https://github.com/sigrid-fr)


# Descrição do desafio 🚀
### Criar uma aplicação Selenium com os seguintes casos de teste
### Caso de teste 
Acessar o site da accenture e aceitar os cookies do LGPD<br>

<b>Cenário</b>: Entrar no site do tricentis e preencher formulario um usando tdd e bdd <br>
dado que estou na pagina de formulario <br>

<b>Cenário</b>: Forumulario Enter Vehicle Data <br>
dado que eu estou no site da tricentis<br>


--------------------------------------------------------------------
## Dependencias
- Projeto Java do repo abaixo rodando no site da Tricentis<br>
http://sampleapp.tricentis.com/101/app.php <br>
Link do repositório: https://github.com/sigrid-fr/testeSelenium <br>

--------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/sigrid-fr/testeSelenium
 ```

- Entrando na pasta do projeto
 ```bash
cd testeSelenium
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

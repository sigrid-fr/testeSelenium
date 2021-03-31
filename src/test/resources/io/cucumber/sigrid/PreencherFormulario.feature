# language: pt
Funcionalidade: Preencher formulario 
  O objetivo deste teste é fazer o preenchimento de um formulario usando TDD e BDD no site do Tricentis

  Cenario: Entrar no site do tricentis e preencher formulario um usando tdd e bdd
    Dado que estou na pagina de formulario

    Quando eu estou na aba preecha os dados do veiculo
    E eu preencho os campos do veiculo com os valores
        | campos              | valores       |
        | model               | Scooter       |
        | cylindercapacity    | 130           |
        | engineperformance   | 200           |
        | dateofmanufacture   | 02/01/2020    |
        | numberofseats       | 2             |
    E seleciono a direcao direita como nao
    E preencho os outros campos do veiculo com os valores
        | campos                  | valores   |
        | numberofseatsmotorcycle | 1         |
        | fuel                    | Petrol    |
        | payload                 | 150       |
        | totalweight             | 1400      |
        | listprice               | 3         |
        | licenseplatenumber      | zzz-9999  |
        | annualmileage           | 11000     |
    E clico em proximo na pagina veiculo
    Entao eu vou para a dados do seguro


    Quando eu estou na aba preecha os dados do seguro
    E eu preencho os campos do seguro com os valores
        | campos      | valores          |
        | firstname   | Si               |
        | lastname    | Rodrigues        |
        | birthdate   | 01/06/1990       |
    E seleciono o genero como masculino
    E preencho os outros campos do seguro com os valores
        | campos        | valores        |
        | streetaddress | Avenida Sampaio| 
        | country       | Brasil         |
        | zipcode       | 37915000       |
        | city          | Sao Paulo      |
        | occupation    | Employee       |
    E seleciono dois hobbies
    E preencho o campo website com o link
        | campo         | link           |
        | website       | www.google.com |
    E clico em proximo para pagina do produto
    Entao eu vou para a aba dados do produto


    Quando eu estou na aba preecha os dados do produto
    E eu preencho os campos do produto com os valores
        | campos          | valores           |
        | startdate       | 01/01/2021        |
        | insurancesum    | 2000000           |
        | meritrating     | Rodrigues         |
        | damageinsurance | Partial Coverage  |
    E seleciono o produto opcional defesa legal
    E preencho o campo de carro reserva como nao
    E clico em proximo para selecionar opcao de preco
    Entao eu vou para a aba opcao de preco


    Quando eu estou na aba selecione uma opcao de preco
    E eu seleciono uma opcao
    E clico em proximo para a aba enviar cotacao
    Entao eu vou para a aba enviar cotacao

    Quando eu estou na aba para enviar cotacao
    E eu prencho os campos da cotacao com os valores
        | campos          | valores                  |
        | email           | sigferodrigues@gmail.com |
        | phone           | 556199876543             |
        | username        | si_rodrigues             |
        | password        | 12345                    |
        | confirmpassword | 12345                    |
        | Comments        | Formulario muito grande! |
    E clico no botao enviar cotacao
    Entao eu recebo a mensagem de sucesso
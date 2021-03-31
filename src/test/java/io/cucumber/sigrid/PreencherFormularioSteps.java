package io.cucumber.sigrid;

import io.cucumber.java.pt.*;
import io.cucumber.sigrid.servicos.Configuracao;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PreencherFormularioSteps {

  @Quando("eu estou na aba preecha os dados do veiculo")
  public void eu_estou_na_aba_preecha_os_dados_do_veiculo() {
    Configuracao.browser.findElement(By.cssSelector("#entervehicledata"));
  }

  @Quando("eu preencho os campos do veiculo com os valores")
  public void eu_preencho_os_campos_do_veiculo_com_os_valores(List<List<String>> table) throws Throwable {
    Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(table);
    String nameValue = mapTable.get("make");         
    String modelValue = mapTable.get("model");      
    String cylinderValue = mapTable.get("cylindercapacity");
    String engineValue = mapTable.get("engineperformance");         
    String dateofValue = mapTable.get("dateofmanufacture");      
    String numberofValue = mapTable.get("numberofseats");    
  }

  @Quando("seleciono a direcao direita como nao")
  public void seleciono_a_direcao_direita_como_nao() {
    Configuracao.browser.findElement( By.cssSelector("#insurance-form")).click();
  }

  @Quando("preencho os outros campos do veiculo com os valores")
  public void preencho_os_outros_campos_do_veiculo_com_os_valores(List<List<String>> table) throws Throwable {
    Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(table);
    String numberofValue = mapTable.get("numberofseatsmotorcycle");         
    String fuelValue = mapTable.get("fuel");      
    String payloadValue = mapTable.get("payload");
    String totalValue = mapTable.get("totalweight");         
    String listValue = mapTable.get("listprice");      
    String licenseValue = mapTable.get("licenseplatenumber");
    String annualValue = mapTable.get("annualmileage");  
  }

  @Quando("clico em proximo na pagina veiculo")
  public void clico_em_proximo_na_pagina_veiculo() {
    Configuracao.seletorQueryCss("a[button_id='nextenterinsurantdata']").click();
  }

  @Entao("eu vou para a dados do seguro")
  public void eu_vou_para_a_dados_do_seguro() {
    WebElement input = Configuracao.browser.findElement( By.cssSelector("h3[class='sectionTitle']"));
    assertEquals(true, input.getText());
    input.click();
    Configuracao.fechar();
  }

  private void assertEquals(boolean b, String text) {
  }

  @Quando("eu estou na aba preecha os dados do seguro")
  public void eu_estou_na_aba_preecha_os_dados_do_seguro() {
    Configuracao.browser.findElement(By.cssSelector("a[id='entervehicledata']"));
  }

  @Quando("eu preencho os campos do seguro com os valores")
  public void eu_preencho_os_campos_do_seguro_com_os_valores(List<List<String>> table) throws Throwable {
    Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(table);
    String firstnameValue = mapTable.get("firstname");         
    String lastnameValue = mapTable.get("lastname");      
    String birthdateValue = mapTable.get("birthdate");
  }

  @Quando("seleciono o genero como masculino")
  public void seleciono_o_genero_como_masculino() {
    Configuracao.browser.findElement(By.cssSelector("#insurance-form"));
  }

  @Quando("preencho os outros campos do seguro com os valores")
  public void preencho_os_outros_campos_do_seguro_com_os_valores(List<List<String>> table) throws Throwable {
    Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(table);
    String streetValue = mapTable.get("streetaddress");         
    String countryValue = mapTable.get("country");      
    String zipcodeValue = mapTable.get("zipcode");
    String cityValue = mapTable.get("city");      
    String occupationValue = mapTable.get("occupation");
  }

  @Quando("seleciono dois hobbies")
  public void seleciono_dois_hobbies() {
    Configuracao.browser.findElement(By.cssSelector("#insurance-form"));
    Configuracao.browser.findElement(By.cssSelector("#insurance-form"));
  }

  @Quando("preencho o campo website com o link")
  public void preencho_o_campo_website_com_o_link(io.cucumber.datatable.DataTable dataTable) {
    ((WebElement) Configuracao.browser).sendKeys("[element_id= 'website', content= 'www.google.com']");
  }

  @Quando("clico em proximo para pagina do produto")
  public void clico_em_proximo_para_pagina_do_produto() {
    Configuracao.seletorQueryCss("a[button_id='nextenterinsurantdata']").click();
  }

  @Entao("eu vou para a aba dados do produto")
  public void eu_vou_para_a_aba_dados_do_produto() {
    WebElement input = Configuracao.browser.findElement( By.cssSelector("h3[class='sectionTitle']"));
    assertEquals(true, input.getText());
    input.click();
    Configuracao.fechar();
  }

  @Quando("eu estou na aba preecha os dados do produto")
  public void eu_estou_na_aba_preecha_os_dados_do_produto() {
    Configuracao.browser.findElement(By.cssSelector("a[id='enterproductdata']"));
  }

  @Quando("eu preencho os campos do produto com os valores")
  public void eu_preencho_os_campos_do_produto_com_os_valores(List<List<String>> table) throws Throwable {
    Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(table);
    String startdateValue = mapTable.get("startdate");         
    String insurancesumValue = mapTable.get("insurancesum");      
    String meritratingValue = mapTable.get("meritrating");
    String damageValue = mapTable.get("damageinsurance");      
  }

  @Quando("seleciono o produto opcional defesa legal")
  public void seleciono_o_produto_opcional_defesa_legal() {
    Configuracao.browser.findElement(By.cssSelector("#insurance-form"));
  }

  @Quando("preencho o campo de carro reserva como nao")
  public void preencho_o_campo_de_carro_reserva_como_nao() {
    Configuracao.browser.findElement( By.cssSelector("#courtesycar")).click();
  }

  @Quando("clico em proximo para selecionar opcao de preco")
  public void clico_em_proximo_para_selecionar_opcao_de_preco() {
    Configuracao.browser.findElement( By.cssSelector("#nextselectpriceoption")).click();
  }

  @Entao("eu vou para a aba opcao de preco")
  public void eu_vou_para_a_aba_opcao_de_preco() {
    WebElement input = Configuracao.browser.findElement( By.cssSelector("h3[class='sectionTitle']"));
    assertEquals(true, input.getText());
    input.click();
    Configuracao.fechar();
  }

  @Quando("eu estou na aba selecione uma opcao de preco")
  public void eu_estou_na_aba_selecione_uma_opcao_de_preco() {
    Configuracao.browser.findElement( By.cssSelector("#selectpriceoption")).click();
  }

  @Quando("eu seleciono uma opcao")
  public void eu_seleciono_uma_opcao() {
    Configuracao.browser.findElement(By.cssSelector("#priceTable"));
  }

  @Quando("clico em proximo para a aba enviar cotacao")
  public void clico_em_proximo_para_a_aba_enviar_cotacao() {
    Configuracao.browser.findElement(By.cssSelector("#nextsendquote"));
  }

  @Entao("eu vou para a aba enviar cotacao")
  public void eu_vou_para_a_aba_enviar_cotacao() {
    WebElement input = Configuracao.browser.findElement( By.cssSelector("h3[class='sectionTitle']"));
    assertEquals(true, input.getText());
    input.click();
    Configuracao.fechar();
  }

  @Quando("eu estou na aba para enviar cotacao")
  public void eu_estou_na_aba_para_eviar_cotacao() {
    Configuracao.browser.findElement(By.cssSelector("#sendquote"));
  }

  @Quando("eu prencho os campos da cotacao com os valores")
  public void eu_prencho_os_campos_da_cotacao_com_os_valores(List<List<String>> table) throws Throwable {  
    Map<String, String> mapTable = CucumberUtil.TableDictionaryConverter(table);
    String emailValue = mapTable.get("email");         
    String phoneValue = mapTable.get("phone");      
    String usernameValue = mapTable.get("username");
    String passwordValue = mapTable.get("password"); 
    String confirmpasswordValue = mapTable.get("confirmpassword"); 
    String CommentsValue = mapTable.get("Comments");  
  }

  @Quando("clico no botao enviar cotacao")
  public void clico_no_botao_enviar_cotacao() {
    WebDriverWait wait = new WebDriverWait(Configuracao.browser, 10);
    WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sendemail")));
    input.click();
  }

  @Entao("eu recebo a mensagem de sucesso")
  public void eu_recebo_a_mensagem_de_sucesso() {
    WebElement input = Configuracao.browser.findElement( By.cssSelector("h3[class='sectionTitle']"));
    assertEquals(true, input.getText());
    input.click();
    Configuracao.fechar();
  }
  
}

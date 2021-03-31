package io.cucumber.sigrid;

import io.cucumber.java.pt.*;
import io.cucumber.sigrid.servicos.Configuracao;

public class CompartilhadoSteps {

  @Dado("que estou na pagina de formulario") 
  public void entrandoNoSite() {
    Configuracao.abrir("http://sampleapp.tricentis.com/101/app.php/"); 
    Configuracao.browser.manage().window().maximize();      
  }
  
}

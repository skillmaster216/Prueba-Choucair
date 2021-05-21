package com.choucair.empleos.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import com.choucair.empleos.questions.Results;
import com.choucair.empleos.tasks.OpenTheBrowser;
import com.choucair.empleos.tasks.Search;
import com.choucair.empleos.user_interfaces.ChoucairEmpleosPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class ChoucairEmpleosStepDefinitions {

  private ChoucairEmpleosPage choucairEmpleosPage;

  @Before
  public void setTheStage() {
      OnStage.setTheStage(new OnlineCast());
  }

  /*@Given("the browser is open")
  public void the_browser_is_open() {
    theActorCalled("ro").wasAbleTo(OpenTheBrowser.on(googlePage));
  }

  @When("el ro search {string}")
  public void el_ro_search(String keyword) {
    theActorInTheSpotlight().attemptsTo(Search.theTerm(keyword));
  }

  @Then("verify the first result is from {string}")
  public void verify_the_first_result_is_from(String pageName) {
    theActorInTheSpotlight()
      .should(
        seeThat(Results.firstResultPageName(), 
          containsString(pageName)
        )
      );
  }*/

  @Given("que la pagina de choucair empleos este abierta")
    public void que_la_pagina_de_choucair_empleos_este_abierta(){
        theActorCalled("Usuario").wasAbleTo(OpenTheBrowser.on(choucairEmpleosPage));
    }

    @When("el usuario busque un empleo con la palabra clave {string}")
    public void el_usuario_busque_un_empleo_con_la_palabra_clave_something(String keyword){
        theActorInTheSpotlight().attemptsTo(Search.theTerm(keyword, ChoucairEmpleosPage.KEYWORDS_SEARCH));
    }

    @When("el usuario busque un empleo en la ciudad de {string}")
    public void el_usuario_busque_un_empleo_en_la_ciudad_de_something(String location){
        theActorInTheSpotlight().attemptsTo(Search.theTerm(location, ChoucairEmpleosPage.LOCATION_SEARCH));
    }

     @And("el usuario le de click al boton buscar")
    public void el_usuario_le_de_click_al_boton_buscar(){
        theActorInTheSpotlight().attemptsTo(Click.on(ChoucairEmpleosPage.SEARCH_BUTTON));
    }

    @Then("deberian aparecer {string} resultados")
    public void deberian_aparecer_something_resultados(String resultados){
        theActorInTheSpotlight()
            .should(
            seeThat(Results.resultMessage(), 
            containsString(resultados)
        )
      );
    }

}

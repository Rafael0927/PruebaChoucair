package co.com.choucair.certification.prueba.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChoucairAcademyStepDefinition {





        @Before
        public void set_the_stage() {
            OnStage.setTheStage(new OnlineCast());
        }

        @Given("than brandon wants  to learn  automation at the academy Choucair")
        public void than brandon wants  to learn  automation at the academy Choucair {

        }

        @When("than brandon wants  to learn  automation at the academy Choucair")
        public void than brandon wants  to learn  automation at the academy Choucair  {

        }

        @Then("than brandon wants  to learn  automation at the academy Choucair")
        public void than brandon wants  to learn  automation at the academy Choucair{

        }
    }



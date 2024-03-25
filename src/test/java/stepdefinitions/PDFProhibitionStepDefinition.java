package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Download;
import tasks.OpenUp;
import questions.Review;

public class PDFProhibitionStepDefinition {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());
    }

    @Given("that the user wants to use the Bancolombia Web")
    public void thatTheUserWantsToUseTheBancolombiaWeb() {
        OnStage.theActorCalled("Client").wasAbleTo(OpenUp.thePageBancolombia());
    }

    @When("he download the PDF of prohitions")
    public void heDownloadThePDFOfProhitions() {
        OnStage.theActorInTheSpotlight().attemptsTo(Download.thePDFProhibitions());
    }

    @Then("verify that see the PDF (.*)$")
    public void verifyThatSeeThePDFProhibiciones(String prohibitions) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Review.toThePDF(prohibitions)));

    }
}
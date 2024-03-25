package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify that see the PDF")
    public void verifyThatSeeThePDF() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}

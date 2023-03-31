package login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.search.WikipediaArticle;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class MyStepdefs {
    @Given("{actor} is trying to login to Wikipedia")
    public void sergeyIsTryingToLoginToWikipedia(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("he enters {string} and {string}")
    public void heEntersAnd(String username, String password) {
        theActorInTheSpotlight().attemptsTo(SelectLoginButton.Session(username, password));
    }

    @Then("he should see {string}")
    public void heShouldSee(String header) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(WikipediaArticle.HEADING).hasText(header));
    }
}

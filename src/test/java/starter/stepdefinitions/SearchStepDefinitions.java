package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import navigation.NavigateTo;
import search_soccer.search.LookForSoccerHeader;
import search_soccer.search.SoccerArticle;
import starter.search.LookForInformation;
import starter.search.WikipediaArticle;

public class SearchStepDefinitions {

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(WikipediaArticle.HEADING).hasText(term)
        );
    }

    @Given("{actor} is researching soccer on the internet")
    public void researchingSoccer(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesForSoccer(Actor actor, String term) {
        actor.attemptsTo(
                LookForSoccerHeader.about(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about_soccer(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(SoccerArticle.HEADING).hasText(term)
        );
    }

}

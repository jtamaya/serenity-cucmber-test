package search_soccer.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import search_soccer.search.LookForSoccerHeader;
import search_soccer.search.SoccerArticle;
import starter.search.LookForInformation;
import starter.search.WikipediaArticle;

public class SoccerSearchStepDefinitions {
    @Given("{actor} is researching soccer on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForSoccerHeader.about(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(SoccerArticle.HEADING).hasText(term)
        );
    }
}

package cv.library.uk.steps;

import cv.library.uk.pages.HomePage;
import cv.library.uk.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class VerifySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I accept the cookies")
    public void iAcceptTheCookies() {
        new HomePage().acceptCookies();
    }

    @And("I enter job title {string}")
    public void iEnterJobTitle(String JobTitle) {
        new HomePage().setJobTitle(JobTitle);
    }

    @And("I enter location {string}")
    public void iEnterLocation(String Location) {
        new HomePage().setLocation(Location);
    }

    @And("I enter Distance {string}")
    public void iEnterDistance(String Distance) {
        new HomePage().setMiles(Distance);
    }

    @And("I click on more search option")
    public void iClickOnMoreSearchOption() {
        new HomePage().setMoreSearchOption();
    }

    @And("I enter minimum salary {string}")
    public void iEnterMinimumSalary(String salaryMin) {
        new HomePage().setSalaryMin(salaryMin);
    }

    @And("I enter maximum salary {string}")
    public void iEnterMaximumSalary(String salaryMax) {
        new HomePage().setSalaryMax(salaryMax);
    }

    @And("I select salary type {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().setSalaryType(salaryType);
    }

    @And("I select job type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().setJobType(jobType);
    }

    @And("I click on find jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().setClickFindJobButton();
    }

    @Then("I should see the job search result {string}")
    public void iShouldSeeTheJobSearchResult(String result) {
        Assert.assertEquals("Result not match",result,new ResultPage().getMessage());

    }
}

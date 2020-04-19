package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalenderEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateCalendarEventsStepDefinition {
    CalenderEventsPage calenderEventsPage  = new CalenderEventsPage();

    @Then("user clicks on create calendar event button")
    public void user_clicks_on_create_calendar_event_button() {
        System.out.println("User click on create calendar event button");
        calenderEventsPage.clickToCreateCalendarEvent();
    }

    @Then("user enters {string} as a title")
    public void user_enters_as_a_title(String title) {
        System.out.println("user enters "+ title + " title");
        calenderEventsPage.enterCalendarEventTitle(title);
    }

    @Then("user enters {string} as a description")
    public void user_enters_as_a_description(String description) {
        System.out.println("user enters "+ description + " description");
        calenderEventsPage.enterCalendarEventDescription(description);
    }

    @Then("user clicks on save and close button")
    public void user_clicks_on_save_and_close_button() {
        System.out.println("User clicks on save and close button");
        calenderEventsPage.clickOnSaveAndClose();
    }

    @Then("user verifies that description of new calendar event is {string}")
    public void user_verifies_that_description_of_new_calendar_event_is(String description) {
        Assert.assertEquals(description, calenderEventsPage.getGeneralInfoDescriptionText());
    }

    @Then("user verifies that title of new calendar event is {string}")
    public void user_verifies_that_title_of_new_calendar_event_is(String title) {
        Assert.assertEquals(title, calenderEventsPage.getGeneralInfoTitleText());
    }



}

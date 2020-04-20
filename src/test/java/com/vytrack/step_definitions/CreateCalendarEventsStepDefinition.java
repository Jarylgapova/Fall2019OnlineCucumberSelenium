package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalenderEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

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

    @Then("user enters new calendar event information:")
    public void user_enters_new_calendar_event_information(Map<String, String> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        calenderEventsPage.enterCalendarEventDescription(dataTable.get("description"));
        calenderEventsPage.enterCalendarEventTitle(dataTable.get("title"));

    }

    @Then("user verifies new calendar event was created successfully")
    public void user_verifies_new_calendar_event_was_created_successfully(Map<String, String>  dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        Assert.assertEquals(dataTable.get("description"), calenderEventsPage.getGeneralInfoDescriptionText());
        Assert.assertEquals(dataTable.get("title"),calenderEventsPage.getGeneralInfoTitleText());
    }





}

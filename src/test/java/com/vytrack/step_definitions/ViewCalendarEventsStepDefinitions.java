package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalenderEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ViewCalendarEventsStepDefinitions {

    CalenderEventsPage calenderEventsPage = new CalenderEventsPage();
    @Then("view Per Page menu should have fallowing options")
    public void view_Per_Page_menu_should_have_fallowing_options(List<String> dataTable) {
        Assert.assertEquals(dataTable, calenderEventsPage.getViewPerPageOptions());
    }

}

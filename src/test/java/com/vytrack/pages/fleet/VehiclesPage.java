package com.vytrack.pages.fleet;


import com.vytrack.pages.AbstractPageBase;
import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehiclesPage extends AbstractPageBase {

    @FindBy(partialLinkText = "Create Car")
    private WebElement createCar;

    @FindBy(css = "input[name='custom_entity_type[LicensePlate]']")
    private WebElement licencePlateInput;

    @FindBy(css = "input[name='custom_entity_type[Driver]']")
    private WebElement driverInput;

    @FindBy(css = "input[name='custom_entity_type[Location]']")
    private WebElement locationInput;

    @FindBy(css = "input[name='custom_entity_type[ModelYear]']")
    private WebElement modelYear;

    @FindBy(css = "input[name='custom_entity_type[Color]']")
    private WebElement color;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement submit;

    @FindBy(css = "[class='btn-group pull-right'] > button")
    private WebElement saveAndClose;

    public void clickOnSaveAndClose() {
        BrowserUtils.wait(3);
        wait.until(ExpectedConditions.elementToBeClickable(saveAndClose)).click();
    }

    public void clickToCreateCar(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(createCar)).click();
        waitForLoaderMask();

    }

    public void setLicencePlateInput(String licencePlate) {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='custom_entity_type[LicensePlate]']")));
        wait.until(ExpectedConditions.visibilityOf(licencePlateInput));
        licencePlateInput.sendKeys(licencePlate);
    }

    public void setDriverInput(String driver) {
        driverInput.sendKeys(driver);
    }

    public void setLocationInput(String location) {
        locationInput.sendKeys(location);
    }

    public void setModelYear(String year) {
        modelYear.sendKeys(year);
    }

    public void setColor(String color) {
        this.color.sendKeys(color);
    }

    public void submit() {
        submit.click();
    }

    public String getCarGeneralInfo(String parameter) {
        String xpath = "//label[text()='" + parameter + "']/following-sibling::div/div";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        return driver.findElement(By.xpath(xpath)).getText().trim();
    }
}

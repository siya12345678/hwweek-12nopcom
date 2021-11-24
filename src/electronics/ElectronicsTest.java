package electronics;

import homepage.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElectronicsTest extends Utility {

    @Before
    public void setUp() {
        openBrowser();

    }

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        // Mouse Hover on “Electronics” Tab
        mouseHover(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));

        //Mouse Hover on “Cell phones” and click
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHover(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']"))).click().build().perform();

        // Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        verifyPage(expectedMessage, By.xpath("//h1[contains(text(),'Cell phones')]"), "Cell Phone is not Match");

    }


        @Test
        public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

            this.verifyUserShouldNavigateToCellPhonesPageSuccessfully();
            //4 Click on List View Tab
            Thread.sleep(1000);
            clickOnElement(By.xpath("//a[contains(text(),'List')]"));

            //5 Click on product name “Nokia Lumia 1020” link
            Thread.sleep(1000);
            clickOnElement(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]"));

            //6 Verify the text “Nokia Lumia 1020”
            Thread.sleep(1000);
            String expectedMessage1 = "Nokia Lumia 1020";
            verifyPage(expectedMessage1,By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"),"This is Not Lumia 1020");

            //7 Verify the price “$349.00”
            Thread.sleep(1000);
            String expectedMessage2 = "$349.00";
            verifyPage(expectedMessage2,By.xpath("//span[@id='price-value-20']"),"This is Not Match");

            //7 1 Clear the value
            Thread.sleep(1000);
            clearValue(By.xpath("//input[@id='product_enteredQuantity_20']"));

            //8 Change quantity to 2
            Thread.sleep(1000);
            sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"), "2");

            //9 Click on “ADD TO CART” tab
            Thread.sleep(1000);
            clickOnElement(By.xpath("//button[@id='add-to-cart-button-20']"));

            //10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
            Thread.sleep(1000);
            String expectedMessage3 = "The product has been added to your shopping cart";
            verifyPage(expectedMessage3,By.xpath("//p[text()='The product has been added to your ']"),"Product not added");

            //10 1 close the bar clicking on the cross button.
            Thread.sleep(1000);
            clickOnElement(By.xpath("//span[@class='close']"));

            //11 MouseHover on "Shopping cart"
            Thread.sleep(1000);
            mouseHover(By.xpath("//span[text()='Shopping cart']"));

            //11 1 Click on "GO TO CART" button.
            Thread.sleep(1000);
            clickOnElement(By.xpath("//button[text()='Go to cart']"));

            //12 Verify the message "Shopping cart"
            Thread.sleep(1000);
            String expectedMessage4 = "Shopping cart";
            verifyPage(expectedMessage4,By.xpath("//h1[contains(text(),'Shopping cart')]"),"Shopping cart not Match");

            //13Verify the quantity is 2
           /* Thread.sleep(1000);
            String expectedMessage5 = "2";
            verifyPage(expectedMessage5,By.xpath("//input[@id='itemquantity11246']"),"value");

            */

            //14 Verify the Total $698.00
            Thread.sleep(1000);
            String expectedMessage6 = "$698.00";
            verifyPage(expectedMessage6,By.xpath("//tbody/tr[4]/td[2]/span[1]"),"Price not Match");

            //15 click on checkbox “I agree with the terms of service”
            Thread.sleep(1000);
            clickOnElement(By.xpath("//input[@id='termsofservice']"));

            //16 Click on “CHECKOUT”
            Thread.sleep(1000);
            clickOnElement(By.xpath("//button[@id='checkout']"));

            //17 Verify the Text “Welcome, Please Sign In!”
            Thread.sleep(1000);
            String expectedMessage7 = "Welcome, Please Sign In!";
            verifyPage(expectedMessage7,By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"),"Welcome Message is not display");

            //18 Click on “REGISTER” tab
            Thread.sleep(1000);
            clickOnElement(By.xpath("//button[contains(text(),'Register')]"));

            //19 Verify the text “Register”
            Thread.sleep(1000);
            String expectedMessage8 = "Register";
            verifyPage(expectedMessage8,By.xpath("//h1[contains(text(),'Register')]"),"Register page is not showing");

            //20  Fill the mandatory fields
            Thread.sleep(1000);
            sendTextToElement(By.xpath("//input[@id='FirstName']"), "Jinal");
            Thread.sleep(500);
            sendTextToElement(By.xpath("//input[@id='LastName']"), "Patel");
            Thread.sleep(500);
            sendTextToElement(By.xpath("//input[@id='Email']"), "jinalpatel" +"Int"+ "@yahoo.com");
            Thread.sleep(500);
            sendTextToElement(By.xpath("//input[@id='Password']"), "Abcd1234");
            Thread.sleep(500);
            sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"), "Abcd1234");

            //21 Click on “REGISTER” Button
            Thread.sleep(1000);
            clickOnElement(By.xpath("//button[@id='register-button']"));

            //22 Verify the message “Your registration completed”
            Thread.sleep(1000);
            String expectedMessage9 = "Your registration completed";
            verifyPage(expectedMessage9,By.xpath("//div[contains(text(),'Your registration completed')]"),"Registration Not Completed");

            //23 Click on “CONTINUE” tab
            Thread.sleep(1000);
            clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));

            //24 Verify the text “Shopping card”
            Thread.sleep(1000);
            String expectedMessage10 = "Shopping cart";
            verifyPage(expectedMessage10,By.xpath("//h1[contains(text(),'Shopping cart')]"),"Shopping cart is empty");

            //25 click on checkbox “I agree with the terms of service”
            Thread.sleep(1000);
            clickOnElement(By.xpath("//input[@id='termsofservice']"));

            //26 Click on “CHECKOUT”
            Thread.sleep(1000);
            clickOnElement(By.xpath("//button[@id='checkout']"));

            //27 Fill the Mandatory fields
            Thread.sleep(1000);
            clearValue(By.xpath("//input[@id='BillingNewAddress_FirstName']"));
            clearValue(By.xpath("//input[@id='BillingNewAddress_LastName']"));
            clearValue(By.xpath("//input[@id='BillingNewAddress_Email']"));
            Thread.sleep(1000);
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"), "Jinal");
            Thread.sleep(500);

            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_LastName']"), "Patel");
            Thread.sleep(500);
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Email']"), "jinalpatel3990@yahoo.com");
            Thread.sleep(500);
            selectFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "233");
            Thread.sleep(500);
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_City']"), "London");
            Thread.sleep(500);
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"), "12 Foxlees");
            Thread.sleep(500);
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "HA0 2PR");
            Thread.sleep(500);
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "07440685170");
            Thread.sleep(500);

            //28 Click on “CONTINUE”
            clickOnElement(By.xpath("//button[@name='save' and @class='button-1 new-address-next-step-button']"));
            Thread.sleep(1000);

            //29 Click on Radio Button “2nd Day Air ($0.00)”
            Thread.sleep(1000);
            clickOnElement(By.xpath("//label[contains(text(),'2nd Day Air ($0.00)')]"));

            //30 Click on “CONTINUE”
            Thread.sleep(1000);
            clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));

            //31 Select Radio Button “Credit Card”
            Thread.sleep(1000);
            clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));

            //31 1 Click on continue
            Thread.sleep(1000);
            clickOnElement(By.xpath("//div[@id='payment-method-buttons-container']//button[text()='Continue']"));

            //32 Select “Visa” From Select credit card dropdown
            Thread.sleep(1000);
            sendTextToElement(By.xpath("//select[@id='CreditCardType']"), "1");

            //33 Fill all the details
            Thread.sleep(1000);
            sendTextToElement(By.xpath("//input[@id='CardholderName']"), "Jinal Patel");
            Thread.sleep(1000);
            sendTextToElement(By.xpath("//input[@id='CardNumber']"), "4916360129110618");
            Thread.sleep(1000);
            selectFromDropDown(By.xpath("//select[@id='ExpireMonth']"), "6");
            Thread.sleep(1000);
            selectFromDropDown(By.xpath("//select[@id='ExpireYear']"), "2026");
            Thread.sleep(1000);
            sendTextToElement(By.xpath("//input[@id='CardCode']"), "671");

            //34 Click on “CONTINUE”
            Thread.sleep(1000);
            clickOnElement(By.xpath("//div[@id='payment-info-buttons-container']//button[contains(text(),'Continue')]"));

            //35 Verify “Payment Method” is “Credit Card”
            Thread.sleep(1000);
            String expectedMessage11 = "Credit Card";
            verifyPage(expectedMessage11,By.xpath("//span[contains(text(),'Credit Card')]"),"Credit card not match");

            //36 Verify “Shipping Method” is “2nd Day Air”
            Thread.sleep(1000);
            String expectedMessage12 = "2nd Day Air";
           verifyPage(expectedMessage12,By.xpath("//li[@class='shipping-method']//span[2]"),"Shipping method not correct");

           //37 Verify Total is “$698.00”
            Thread.sleep(1000);
            String expectedMessage13 = "$698.00";
            verifyPage(expectedMessage13,By.xpath("//span[@class='value-summary']//strong[text()='$698.00']"),"Total not Match");


            //38 Click on “CONFIRM”
            Thread.sleep(1000);
            clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));

            //39 Verify the Text “Thank You”
            Thread.sleep(500);
            String expectedMessage14 = "Thank you";
            verifyPage(expectedMessage14,By.xpath("//h1[contains(text(),'Thank you')]"),"Message is not Match");

            //40 Verify the message “Your order has been successfully processed!”
            Thread.sleep(500);
            String expectedMessage15 = "Your order has been successfully processed!";
            verifyPage(expectedMessage15,By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"),"Thankful message is not Match");


            //41 Click on “CONTINUE”
            clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));

            //42 Verify the text “Welcome to our store”
            Thread.sleep(500);
            String expectedMessage16 = "Welcome to our store";
            verifyPage(expectedMessage16,By.xpath("//h2[contains(text(),'Welcome to our store')]"),"Promising message appear not Sucessfully");

            //43 Click on “Logout” link
            Thread.sleep(500);
            clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));


            //44 Verify the URL is “https://demo.nopcommerce.com/”
            String expectedUrl = "https://demo.nopcommerce.com/";
            String actualUrl = getUrl();
            Assert.assertEquals("Url is NotMatch",expectedUrl,actualUrl);
    }
    @After
    public void tearUp(){
        closeBrowser();
    }


}




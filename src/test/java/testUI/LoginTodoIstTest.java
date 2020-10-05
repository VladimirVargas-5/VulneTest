package testUI;


import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginModalPage;
import pages.MainPage;
import session.Session;

public class LoginTodoIstTest {

    LoginModalPage loginModalPage = new LoginModalPage();
    MainPage mainPage = new MainPage();

    @Before
    public void before(){
        Session.getInstance().getDriver().get("https://todoist.com/");
    }

    @DisplayName("verify The Login Using User And Password")
    @Description("This test case is to verify verify The Login Using User And Password")
    @Owner("Vladimir Vargas")
    @Test
    public void verifyTheLoginUsingUserAndPassword() throws InterruptedException {
        mainPage.singUpFreeButton.click();
        loginModalPage.emailTextBox.type("vladimir.vargas.a@gmail.com");
        loginModalPage.passwordTextBox.type("Sample12345");
        loginModalPage.signupButton.click();
        // Verification
        Thread.sleep(2000);
        Assert.assertFalse("ERROR , no se pudo realizar el login!",loginModalPage.signupButton.isDisplayedOnPage());
    }

    @After
    public void after(){
        Session.getInstance().closeBrowser();
    }

}
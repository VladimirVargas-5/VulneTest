package pages;

import controles.Button;
import controles.CheckBox;
import controles.TextBox;
import org.openqa.selenium.By;

public class LoginModalPage {

    public TextBox emailTextBox= new TextBox(By.id("email"),"[email] textbox on Login Modal Page");
    public TextBox passwordTextBox= new TextBox(By.id("password"),"[password] textbox on Login Modal Page");
    public Button signupButton= new Button(By.xpath("//*[@id=\"login_form\"]/button"),"[signup] button on Login Modal Page");

    public LoginModalPage(){}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Automation {

    public static void main (String []args ) {

        // 1
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver robot = new ChromeDriver();
        robot.get("https://utest.com/");
        robot.manage().window().maximize();


        //MAPEO DE LOS ELEMENTOS
        By llbSingIn=By.className("unauthenticated-nav-bar__sign-up");

        By txtfirstfirstName=By.name("firstName");
        By txtLastName =By.id("lastName");
        By txtEmail = By.name("email");
        By lstDays= By.name("birthDay");
        By lstMonths= By.name("birthMonth");
        By lstYears= By.name("birthYear");

        // ACCIONES
        robot.findElement(llbSingIn).click();
        robot.findElement(txtfirstfirstName).sendKeys("Rafael");
        robot.findElement(txtLastName).sendKeys("Navarro ");
        robot.findElement(txtEmail).sendKeys("rararar@gmail.com");
        robot.findElement(lstDays).sendKeys("27");
        robot.findElement(lstMonths).sendKeys("09");
        robot.findElement(lstYears).sendKeys("1999");


        //Manejo de listas desplegables
        Select lista =new Select(robot.findElement(lstDays));
        Select listaMonts =new Select(robot.findElement(lstMonths));
        Select listaYears =new Select(robot.findElement(lstYears));
        lista.selectByVisibleText("27");
        listaMonts.selectByVisibleText("09");
         listaYears.selectByVisibleText("1999");
    }
}

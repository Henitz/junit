package atda;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() { driver.get("https://itbi.prefeitura.sp.gov.br/valorreferencia/tvm/frm_tvm_consulta_valor.aspx");}

    public boolean isLoaded() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt_setor"))).isDisplayed();
    }
    public void login(String userSetor, String userQuadra, String userLote, String userDigito, String userData) {
        driver.findElement(By.id("txt_setor")).sendKeys(userSetor);
        driver.findElement(By.id("txt_quadra")).sendKeys(userQuadra);
        driver.findElement(By.id("txt_lote")).sendKeys(userLote);
        driver.findElement(By.id("txt_digito")).sendKeys(userDigito);
        driver.findElement(By.id("txtData")).sendKeys(userData);

        driver.findElement(By.id("btnPesquisar")).click();


        String textSql = driver.findElement(By.id("codigoSql")).getText();
        String textValor = driver.findElement(By.id("valorSql")).getText();
        String textEndereco = driver.findElement(By.id("nomeEndereco")).getText();


//        WebElement sql = driver.findElement(By.id("codigoSql"));
//        String textSql =  sql.getAttribute("value");

//        WebElement valor = driver.findElement(By.id("valorSql"));
//        String textValor = valor.getAttribute("value");
//
//        WebElement endereco = driver.findElement(By.id("nomeEndereco"));
//        String textEndereco = endereco.getAttribute("value");

        System.out.println("SQL = " + textSql);
        System.out.println("Valor = " + textValor);
        System.out.println("Endereco = " + textEndereco);

        String setor = textSql.substring(0,3);
        System.out.println("setor = " + setor);

        String quadra = textSql.substring(4,7);
        System.out.println("quadra = " + quadra);

        String lote = textSql.substring(8, 12);
        System.out.println("lote = " + lote);

        String digito = textSql.substring(13, 14);
        System.out.println("digito = " + digito);

        textValor = textValor.replace(".", "");
        textValor = textValor.replace(",", ".");

        System.out.println("Valor = " + textValor);

    }

}

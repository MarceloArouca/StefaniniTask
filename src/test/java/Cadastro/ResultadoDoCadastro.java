package Cadastro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoDoCadastro {
        WebDriver driver;
        final String RETORNAR_NOME_USUARIO = "//span[@id='nome-formulario']";
        final String RETORNAR_EMAIL_USUARIO = "//span[@id='email-formulario']";

        public ResultadoDoCadastro(WebDriver driver){
            this.driver = driver;
        }

        public String RetornarNome(){
            return driver.findElement(By.xpath(RETORNAR_NOME_USUARIO)).getText();
        }

        public String RetornarEmail(){
            return driver.findElement(By.xpath(RETORNAR_EMAIL_USUARIO)).getText();
        }
}

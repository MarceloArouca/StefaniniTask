package Cadastro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RealizarCadastro {
    WebDriver driver;
    final String CAMPO_NOME = "//input[@id='nomeFormulario']";
    final String CAMPO_EMAIL = "//input[@id='emailFormulario']";
    final String CAMPO_SENHA = "//input[@id='senhaFormulario']";
    final String FINALIZAR_CADASTRO = "//input[@id='finalizarFormulario']";

    public RealizarCadastro(WebDriver driver){
        this.driver = driver;
    }

    public void efetuarCadastro(String nome, String email, String senha){
        driver.findElement(By.xpath(CAMPO_NOME)).sendKeys(nome + Keys.ENTER);
        driver.findElement(By.xpath(CAMPO_EMAIL)).sendKeys(email + Keys.ENTER);
        driver.findElement(By.xpath(CAMPO_SENHA)).sendKeys(senha + Keys.ENTER);
        driver.findElement(By.xpath(FINALIZAR_CADASTRO)).click();
    }
}

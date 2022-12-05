package Etapas;


import Cadastro.RealizarCadastro;
import Cadastro.ResultadoDoCadastro;
import io.cucumber.java.Before;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EtapasCadastro {
WebDriver driver;

    @Before
    public void inicia(){
    System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @io.cucumber.java.pt.Dado("que usuario acessar link: {string}")
    public void queUsuarioAcessarLink(String arg0){
    driver.get(arg0);
    }

    @Quando("usuario preencher formulario nome: {string} email: {string} e senha:{string}")
    public void usuarioPreencherFormularioNomeEmailESenha(String nome, String email, String senha) {
        RealizarCadastro realizarCadastro = new RealizarCadastro(driver);
        realizarCadastro.efetuarCadastro(nome, email, senha);
    }

    @Entao("verificar dados do formulario: {string} {string}")
    public void verificarDadosDoFormulario(String nome, String email) {
        ResultadoDoCadastro resultadoDoCadastro = new ResultadoDoCadastro(driver);
        resultadoDoCadastro.RetornarNome();
        resultadoDoCadastro.RetornarEmail();
        Assert.assertEquals(nome, resultadoDoCadastro.RetornarNome());
        Assert.assertEquals(email, resultadoDoCadastro.RetornarEmail());
    }
}

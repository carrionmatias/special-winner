package com.selenium.pages;

import java.util.List;					  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
										 
import org.testng.Reporter;

public class tiendaMiaHomePages {
	WebDriver driver;

	public tiendaMiaHomePages(WebDriver ldriver) {
		driver = ldriver;
	
	}
	//Definimos los webElement en una clase publlica para prevenir que en un futuro cambie el localizador
	
	   //ENTRA A LA CAJA DE BUSQUEDA DE GOOGLE    
	   @FindBy(id = "APjFqb")
	    private WebElement searchgoogle;
	   
       //SELECCIONAMOS EL 3ER ELEMENTO DE GOOGLE
	    @FindBy(xpath = "//h3[contains(text(),'Comprar en USA desde tu hogar - tiendamia.com')]")
	    private WebElement firstResultLink;
        
	    //SELECCIONA EL ELEMENTO ARGENTINA
	    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[1]/a")
	    private WebElement SecondResultLink;
        
	    //PRIMERA PUBLICIDAD
	    @FindBy(xpath = "//body/div[2]/div[18]/div[1]/div[1]/a[1]")
	    private WebElement popupButton;
 
	    //SEGUNDA PUBLICIDAD
	    @FindBy(xpath = "//body/div[2]/div[22]/div[2]/button[1]")
	    private WebElement popup3Button;
 
	    //LOCALIZADORES LOGIN//
	    
	  //SELECTOR EN EL BOTON DE MI CUENTA PARA INGRESAR
	    @FindBy(className = "login-a")
	    private WebElement micuentaButton;

	  //SELECTOR EN EL BOTON ROJO DE LA LISTA DESPLEGADA
	    @FindBy(className = "lg_button")
	    private WebElement entrarButton;
  
	  //SELECTOR EL ELEMENTO EMAIL
	    @FindBy(xpath = "//body/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/input[1]")
	    private WebElement email;

	  //SELECTOR ELEMENTO PASWORD
	    @FindBy(id = "password-log")
	    private WebElement password;

	  //SELECTOR BOTON ROJO INGRESAR
	    @FindBy(id = "login-button")
	    private WebElement ingresarbutton;

	// Definimos los webElement en una clase publlica para prevenir que en un futuro
	// cambie el localizador																				 
	  //SELECTOR CAJA DE BUSQUEDA TIENDA MIA 
	@FindBy(xpath = "//body/div[2]/div[18]/div[1]/div[1]/a[1]")
	private WebElement popup1Button;
	// Selector SEGUNDA PUBLICIDAD
	@FindBy(xpath = "//body/div[2]/div[22]/div[2]/button[1]")
	private WebElement popup2Button;
	// Selector
	///////// localizadore de CRISTIAN////////
	// Selector caja de busqueda tienda mia					   
	// Selector es el boton lupa
	@FindBy(id = "search-lupa")
	private WebElement searchlupa;
	// Selector boton ordenar por:
	@FindBy(xpath = "//body/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/select[1]")
	private WebElement ordenarPor;
	///////LOCALIZADORES DE TIENDAS
	// Selector Boton Tienda Ebay
	@FindBy(id = "ebay-tab")
	private WebElement ebayButtom;
	// Selector Boton Tienda mcy
	@FindBy(id = "mcy-tab")
	private WebElement mcyButtom;
	///////LOCALIZADORES POR TODAS LAS CATEGORIAS
	// Selector todas las categorias
	@FindBy(className = "menu-categories")
	private WebElement categoriasDropDawn;
	// Selector Categoria calzado
	@FindBy(className = "menu-categories")
	private List<WebElement> todasLasCategoriasDropDawn;
	//Selector Categoria calzado
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[9]")
	private WebElement calzadosButtom;
	//Selector Categoria Deportivo
	@FindBy(xpath = "//a[@href='https://tiendamia.com/ar/categorias?amzc=deportivo-hombre']")
	private WebElement deportivoButtom;
		// ***** IDENTIFICAMOS LOS ELEMENTOS POR SU LOCATOR EJEMPLO ID O XPATH							 
	    @FindBy(name = "amz")
	    private WebElement cajadebusqueda2;


	

	// ***** IDENTIFICAMOS LOS ELEMENTOS POR SU LOCATOR EJEMPLO ID O XPATH

	
	public void ingresarDatoCajaBusqueda ( String dato){
		Reporter.log("Ingresar la palabra " + dato);
		searchgoogle.sendKeys(dato);
		Reporter.log("Presionar Enter");
		searchgoogle.sendKeys(Keys.ENTER);
		//searchgoogle.submit();
	}
	
	public boolean validarCajaTextoExista (){
		Reporter.log("Localizar y comprobar que la caja de busqueda se muestra");
		return searchgoogle.isDisplayed();
	}
	
	//ENTRA AL 3ER ELEMENTO H3 DE GOOGLE
	public void ingresarTercerElemento (){
		Reporter.log("Hacemos click en el enlace");
		firstResultLink.click();
	}
	//ENTRA A LA BANDERA ARGENTINA
	public void ingresarPais ( ){
		Reporter.log("Hacemos click en el elemento Argentina");
		SecondResultLink.click();
	}
	//////////////////////////////////CIERRE PUBLICIDAD/////////////////////////////////
	
	public void cerrarPopup1 (){
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(popupButton).click().build().perform();
	}
	
	public boolean validarPopup1Exista (){
		Reporter.log("Localizar y comprobar que el elemento popup1 exista");
		return popupButton.isDisplayed();
	}

	public void Cerrarpopup2 (){
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(popup3Button).click().build().perform();
	}
	
	public boolean validarPopup2Exista (){
		Reporter.log("Localizar y comprobar que el elemento popup2 exista");
		return popup3Button.isDisplayed();
	}
	//////////////////////////////////LOGIN CRISTIAN/////////////////////////////////

	public void buscarBotonMiCuenta (){
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(micuentaButton).click().build().perform();
	}
	
	public boolean validarBotonMiCuenta (){
		Reporter.log("Localizar y comprobar que el boton Mi Cuenta exista");
		return micuentaButton.isDisplayed();
	}
	
	public void ingresaraMiCuenta (){
		Reporter.log("Sebusca el boton de entrar");
		Actions actions = new Actions(driver);
		actions.moveToElement(entrarButton).click().build().perform();
	}
	
	public boolean validarBotonIngresar1 (){
		Reporter.log("Localizar y comprobar que el boton Entar exista");
		return entrarButton.isDisplayed();
	}
	
	public void ingresarCorreo ( String dato){
		Reporter.log("Se ingresa la direccion de correo " + dato);
		email.sendKeys(dato);
	}
	public boolean validarCorreo (){
		Reporter.log("Se visualiza el elemento elemento email");
		return email.isDisplayed();
	}

	public void ingresarPassword ( String dato){
		Reporter.log("Se ingresa password " + dato);
		password.sendKeys(dato);
	}
	public boolean validarPassword (){
		Reporter.log("Se visualiza el elemento elemento password");
		return password.isDisplayed();
	}
	
	public void presionarBotonIngresar ( ){
		Reporter.log("Se ingresa la direccion de correo ");
		ingresarbutton.click();
	}
	public boolean validarBotonIngresar2 (){
		Reporter.log("Se visualiza el elemento boton ingresa");
		return ingresarbutton.isDisplayed();
	}
	//////////////////////////////////BUSQUEDA/////////////////////////////////
	
	public void ingresarCajadeBusqueda2 ( String dato){
		Reporter.log("Se tipea la palabra " + dato);
		cajadebusqueda2.sendKeys(dato);
	}

	public boolean validarCajaDeBusqueda2 (){
		Reporter.log("Se visualiza el elemento boton ingresa");
		return cajadebusqueda2.isDisplayed();
	}
	
	public void presionarLupa ( ){
		Reporter.log("Hacemos click en lupa");
		searchlupa.click();
	}

	public boolean validarElementoSearchlupa (){
		Reporter.log("Verificamos que elemento se visualice");
		return searchlupa.isDisplayed();
	}
	
	////////////////////////////////// MATIAS////////////////////////////////
	public void clickCajadeBusqueda2() {
		Reporter.log("Se oreciona ENTER en la caja de busqueda ");
		cajadebusqueda2.sendKeys(Keys.ENTER);
	}							
//Metodos para Ordenar productos
	
	public void BotonOrdenarPor() {
		Reporter.log("Sebusca el boton de Ordenar Por:");
		Actions actions = new Actions(driver);
		actions.moveToElement(ordenarPor).click().build().perform();
	}

	public boolean validarBotonOrdenarPor() {
		Reporter.log("Localizar y comprobar que el boton Ordenar Por: funcione");
		return ordenarPor.isDisplayed();
	}
	   public void seleccionarOpcion(String opcion) {
	        // Hacer clic en el elemento principal para activar el menú desplegable
	        ordenarPor.click();

	        // Utilizar un objeto Select para interactuar con el elemento <select>
	        Select select = new Select(ordenarPor);

	        // Seleccionar la opción deseada por su texto visible
	        select.selectByVisibleText(opcion);
	    }	
	
//Metodos para busqueda por tienda, amazon viene por defecto
	   
		
		public void clickBottonTiendaEbay() {
			Reporter.log("Hacemos click en el enlace");
			ebayButtom.click();
		}

		public boolean validarBottonTiendaEbay() {
			Reporter.log("Se visualiza el elemento lupa");
			return ebayButtom.isDisplayed();
		}

		public void clickBottonTiendaMcy() {
			Reporter.log("Hacemos click en el enlace");
			mcyButtom.click();
		}

		public boolean validarBottonTiendaMcy() {
			Reporter.log("Se visualiza el elemento lupa");
			return mcyButtom.isDisplayed();
		}

/////Metodos para Ordenar productos
		
		public void clickBotonCategorias() {
			Reporter.log("Se busca el boton de Todas Las Categorias");
			Actions actions = new Actions(driver);
			actions.moveToElement(categoriasDropDawn).click().build().perform();
		}

		public boolean validarBotonCategorias() {
			Reporter.log("Localizar y comprobar que el boton Todas Las Categorias funcione");
			return categoriasDropDawn.isDisplayed();
		}
		
		
		public void seleccionarListaCalzado() {
			Reporter.log("Se busca el boton de Categoria Deportivo");
			Actions actions = new Actions(driver);
			actions.moveToElement(calzadosButtom).perform();
		}
		public void seleccionarListaDeportivo() throws InterruptedException {
			Reporter.log("Se busca el boton de Categoria Deportivo");
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.moveToElement(deportivoButtom).click().build().perform();
		}


}												   

package com.Developers.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.Developers.OngApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

@Component
public class controladorLogin implements Initializable {

	@FXML
	private PasswordField passwordtxt;

	@FXML
	private Label lbStatus;

	@FXML
	private TextField usuariotxt;

	@FXML
	private Button logintbt;
	@FXML
	private Button proyectobt;

	@FXML
	private Button sociobt;

	@FXML
	private Button voluntariobt;
	

    @FXML
    private AnchorPane principal;
    
    @Autowired
    private ApplicationContext springContext ;
  
    
	@FXML
	void login(ActionEvent event) throws IOException {

		// Variables ficticias para emular un inicio de sesión
		String usuario = "1";
		String password = "1";

		// Comprobamos si coinciden los datos del login
		if (usuariotxt.getText().equals(usuario) && passwordtxt.getText().equals(password)) {

			lbStatus.setText("Registro Correcto");
		
			// Abrimos ventana principal
			mostrarVistaPrincipal(event);

			// Cerramos ventana login
			cerrarVentana(event);

		} else {

			// Si no hemos escrito bien nuestra credenciales, nos muestra este otro
			lbStatus.setText("Registro Incorrecto");

		}

	}

	// Metodo abrir ventana principal
	public void mostrarVistaPrincipal(ActionEvent event) throws IOException {
		
		
		

		
	       FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/vista_principal.fxml"));
		   loader.setControllerFactory(springContext::getBean);
		   Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			
		}

	

	@FXML
	private void cerrarVentana(ActionEvent event) {

		Stage stage = (Stage) this.lbStatus.getScene().getWindow();
		stage.close();
	}

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Esbozo de método generado automáticamente

	}

}

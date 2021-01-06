package com.Developers.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import com.Developers.modelo.Voluntario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



@Controller
public class controladorPrincipal implements Initializable {

	@FXML
	private Button voluntariobt;

	@FXML
	private Button sociobt;

	@FXML
	private Button proyectobt;
	
    @FXML
    private AnchorPane principal;
    
    @FXML
    private ComboBox<Voluntario>comboVoluntario;
   
   
    @Autowired
    private ConfigurableApplicationContext springContext;
    //private Parent root;
   
	

    
	
	
	@FXML
	void irvoluntario(ActionEvent event) throws Exception {
		
			

		   FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/vista_voluntarios.fxml"));
		   loader.setControllerFactory(springContext::getBean);
		   Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
       
		
	}
	@FXML
	void irproyecto(ActionEvent event) throws IOException {
		

		   FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/vista_proyectos.fxml"));
		   loader.setControllerFactory(springContext::getBean);
		   Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
    
		 
		
	}
	

	@FXML
	 void irsocio(ActionEvent event) throws IOException {
		

		   FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/vista_socios.fxml"));
		   loader.setControllerFactory(springContext::getBean);
		   Parent root = loader.load();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
	}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}

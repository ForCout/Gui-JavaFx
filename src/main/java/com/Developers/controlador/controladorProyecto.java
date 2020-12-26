package com.Developers.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import com.Developers.modelo.Proyecto;
import com.Developers.repository.ProyectoRepository;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class controladorProyecto implements Initializable{
	 @FXML
	    private TextField finiciotf;

	    @FXML
	    private TextField sociotf;

	    @FXML
	    private Button modificarbt;

	    @FXML
	    private TextField paistf;

	    @FXML
	    private Button eliminarbt;

	    @FXML
	    private Button nuevobt;

	    @FXML
	    private Button anadirbt;

	    @FXML
	    private TextField nombretf;

	    @FXML
	    private TextField localizaciotf;

	    @FXML
	    private TextField financiadortf;

	    @FXML
	    private Button volverbt;

	    @FXML
	    private TextField financiaciontf;

	    @FXML
	    private ComboBox<Proyecto> comboP;

	    @FXML
	    private TextField ffinaltf;
	    
	    @Autowired
	    private ProyectoRepository proyectoRepository;

    @FXML
    void guardar(ActionEvent event) {
    	
    	Proyecto proyecto = new Proyecto();
    	
    	proyecto.setNombreProyecto(nombretf.getText());
    	proyecto.setPais(paistf.getText());
    	proyecto.setLocalizacion(localizaciotf.getText());
    	proyecto.setSocioLocal(sociotf.getText());
    	proyecto.setFinanciador(financiadortf.getText());
    	proyecto.setFinanciacionAportada(Integer.parseInt(financiaciontf.getText()));
    	proyecto.setFechaInicio(finiciotf.getText());
        proyecto.setFechaFinalizacion(ffinaltf.getText());   	
    	
    
		
		
       

    }

    @FXML
    void modificar(ActionEvent event) {

    }

    @FXML
    void nuevo(ActionEvent event) {
    	
    	nombretf.setText("");
		paistf.setText("");
		localizaciotf.setText("");
		sociotf.setText("");
		financiadortf.setText("");
		financiaciontf.setText("");
		finiciotf.setText("");
		ffinaltf.setText("");
		eliminarbt.setDisable(true);
		modificarbt.setDisable(true);

    	
    	

    }

    @FXML
    void eliminar(ActionEvent event) {
    	

    	proyectoRepository.delete(comboP.getValue());
    	comboP.setItems(FXCollections.observableArrayList(proyectoRepository.findAll()));
    }

    

    @FXML
    void volver(ActionEvent event) {
    	
    	 Stage stage = (Stage) this.nombretf.getScene().getWindow();
	     stage.close();


    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Esbozo de método generado automáticamente
		
	}

}


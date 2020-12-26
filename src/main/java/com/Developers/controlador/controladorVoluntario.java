package com.Developers.controlador;



import java.net.URL;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.Developers.modelo.Voluntario;
import com.Developers.repository.VoluntarioRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


@Controller
@Scope("prototype")
public class controladorVoluntario  implements Initializable{
	

    @FXML
    private AnchorPane comboVoluntario;

    @FXML
    private ComboBox<Voluntario>comboV ;

    @FXML
    private Button modificarbt;

    @FXML
    private TextField paistf;

    @FXML
    private TextField tipovoluntariotf;

    @FXML
    private TextField apellidostf;

    @FXML
    private Button guardarbt;

    @FXML
    private Button eliminarbt;

    @FXML
    private Button nuevobt;

    @FXML
    private TextField emailtf;

    @FXML
    private TextField nombretf;

    @FXML
    private TextField fingresotf;

    @FXML
    private Button volverbt;

    @FXML
    private TextField direcciontf;
    
   
   
   @Autowired
     private VoluntarioRepository voluntarioRepository ;
    
    	   
     
         
    
    
   
   
	
    ObservableList<Voluntario>listaVoluntarios = FXCollections.observableArrayList();
   
    

   @FXML
    public void guardar()  {
    	
    Voluntario voluntario = new Voluntario();
    
		
		
	
    	voluntario.setNombre(nombretf.getText());
    	voluntario.setApellidos(apellidostf.getText());
    	voluntario.setDireccion(direcciontf.getText());
    	voluntario.setCorreoElectronico(emailtf.getText());
    	voluntario.setTipoDeVoluntario(tipovoluntariotf.getText());
    	voluntario.setPais(paistf.getText());
    	voluntario.setFechaIngreso(fingresotf.getText());
    	
       
        voluntarioRepository.save(voluntario);
    	comboV.setItems(FXCollections.observableArrayList(voluntarioRepository.findAll()));
         
    }

    @FXML
    void modificar() {
    	/*
    	Voluntario voluntario = new Voluntario(); {
		nombretf.getText();
    	comboV.getSelectionModel(). getSelectedItem();{
    		voluntarioRepository.save(voluntario);
    	}	
    		 
    		
    		
    		
    		
    		
    		}
    		*/
    	}
    	
    	
    	
    	 
    	
    

    @FXML
    void nuevo(ActionEvent event) {
    	
    	nombretf.setText("");
		paistf.setText("");
		direcciontf.setText("");
		apellidostf.setText("");
		emailtf.setText("");
		fingresotf.setText("");
		tipovoluntariotf.setText("");
	


    }

    @FXML
    void eliminar(ActionEvent event) {
    	
    	voluntarioRepository.delete(comboV.getValue());
    	comboV.setItems(FXCollections.observableArrayList(voluntarioRepository.findAll()));
    }

    @FXML
    void volver(ActionEvent event) {
    	
    	Stage stage = (Stage) this.nombretf.getScene().getWindow();
	     stage.close();


    }
    
   

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		comboV.setItems(FXCollections.observableArrayList(voluntarioRepository.findAll()));
		
			
		
		
	}


}



	




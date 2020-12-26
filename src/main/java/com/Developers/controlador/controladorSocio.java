package com.Developers.controlador;


import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Developers.modelo.Socio;
import com.Developers.repository.SocioRepository;

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

@Component
public class controladorSocio implements Initializable{

    
   @Autowired
   private  SocioRepository socioRepository;

    @FXML
    private Button modificarbt;

    @FXML
    private TextField tipoCuotatf;

    @FXML
    private TextField apellidostf;

    @FXML
    private Button guardarbt;

    @FXML
    private AnchorPane principal;

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
    private ComboBox<Socio> comboS;

    @FXML
    private TextField direcciontf;

    
    ObservableList<Socio> socios = FXCollections.observableArrayList();
	
 

   	

 
    void guardar(ActionEvent event) {
    	
    	
    	Socio socio = new Socio();
    	
    
		socio.setNombre(nombretf.getText());
		socio.setApellidos(apellidostf.getText());
		socio.setDireccion(direcciontf.getText());
        socio.setEmail(emailtf.getText());
        socio.setTipoCuota(tipoCuotatf.getText());
        socio.setFecha_ingreso(fingresotf.getText());
        
        socioRepository.save(socio);


    }
    
    


    @FXML
    void modificar(ActionEvent event) {
    	
    	Socio socio = new Socio();
	    socio.setNombre(nombretf.getText());
	    socio.setApellidos(apellidostf.getText());
	   
		socio.setDireccion(direcciontf.getText());
        socio.setEmail(emailtf.getText());
        socio.setTipoCuota(tipoCuotatf.getText());
        socio.setFecha_ingreso(fingresotf.getText());
       comboS.getValue();


    }

    @FXML
    void nuevo(ActionEvent event) {
    	
    	nombretf.setText("");
		apellidostf.setText("");
		direcciontf.setText("");
		emailtf.setText("");
		fingresotf.setText("");
		tipoCuotatf.setText("");
		 modificarbt.setDisable(true);
		 eliminarbt.setDisable(true);


    }

    @FXML
    void eliminar(ActionEvent event) {
    	

    	socioRepository.delete(comboS.getValue());
    	comboS.setItems(FXCollections.observableArrayList(socioRepository.findAll()));
    }
    

    @FXML
    void volver(ActionEvent event) {
    	
    	 Stage stage = (Stage) this.nombretf.getScene().getWindow();
	     stage.close();

    }

  
     //  inicializarTablaSocio();
		 
    	//	 final ObservableList<Socio> tablasocioseList = tablasocio.getSelectionModel().getSelectedItems();
    	//	tablasocioseList.addListener(selectorTablasocio);

        
        
    
    
    
  
	/*

		private void ponerSocioSeleccionado() {
			final Socio socio = getTablaSocioSeleccionado();
			posicionSocioTabla = socios.indexOf(socio);
			
			if ( socio != null) {
				
				nombretf.setText(nombretf.getText());
				apellidostf.setText(apellidostf.getText());
				direcciontf.setText(direcciontf.getText());
		        emailtf.setText(emailtf.getText());
		        tipoCuotatf.setText(tipoCuotatf.getText());
		        fingresotf.setText(fingresotf.getText());
		        
		     
			}
			
			
		};
		
		private Socio getTablaSocioSeleccionado() {
			if(tablasocio != null ) {
				List<Socio> tabla = tablasocio.getSelectionModel().getSelectedItems();
				if(tabla.size()== 1) {
					final Socio competicionSeleccionada = tabla.get(0);
				}
			}
			
			return null;
		}
		

	

		
		

		
		 
		 
	
	

	private void inicializarTablaSocio() {
		nombrecolum.setCellValueFactory(new PropertyValueFactory<Socio, String>("nombre"));
		apellidoscolum.setCellValueFactory(new PropertyValueFactory<Socio, String>("apellidos"));
		direccioncolum.setCellValueFactory(new PropertyValueFactory<Socio, String>("direccion"));
		emailcolum.setCellValueFactory(new PropertyValueFactory<Socio, String>("email"));
		fechaingresocolum.setCellValueFactory(new PropertyValueFactory<Socio, String>("fecha_ingreso"));
		tipocuotacolum.setCellValueFactory(new PropertyValueFactory<Socio, String>("cuota"));
		
		socios = FXCollections.observableArrayList();
		tablasocio.setItems(socios);
		
		
	}
*/
    
 
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	     
	}




	

	

}


	



package com.Developers.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Developers.modelo.Proyecto;
import com.Developers.modelo.Voluntario;
import com.Developers.repository.ProyectoRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

@Controller
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
	    
	    @FXML
	    private Button guardarCambiostf;
	    
	    @Autowired
	    private ProyectoRepository proyectoRepository;
	    
	    ObservableList<Proyecto>listaProyectos = FXCollections.observableArrayList();

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
        
        proyectoRepository.save(proyecto);
        comboP.setItems(FXCollections.observableArrayList(proyectoRepository.findAll()));
    	
    
		
		
       

    }

    @FXML
    void modificar(ActionEvent event) {
    	
    	
    	SelectionModel<Proyecto> sm = comboP.getSelectionModel();

		String nombre = sm.getSelectedItem().getNombreProyecto();
		nombretf.setText(nombre);
		String pais = sm.getSelectedItem().getPais();
		paistf.setText(pais);
		String localizacion = sm.getSelectedItem().getLocalizacion();
		localizaciotf.setText(localizacion);
		String socioL = sm.getSelectedItem().getSocioLocal();
		sociotf.setText(socioL);
		String financiador = sm.getSelectedItem().getFinanciador();
		financiadortf.setText(financiador);
		Integer  financiacion = sm.getSelectedItem().getFinanciacionAportada();
		financiaciontf.setText(String.valueOf(financiacion));
	
		String fechaI = sm.getSelectedItem().getFechaInicio();
	    finiciotf.setText(fechaI);
	    String fechaf = sm.getSelectedItem().getFechaFinalizacion();
        ffinaltf.setText(fechaf);
        
		guardarCambiostf.setDisable(false);


    }
    
    @FXML
    void guardarCambios(ActionEvent event) {
    	

		Proyecto proyecto = new Proyecto();
		SelectionModel<Proyecto> sm = comboP.getSelectionModel();
		Long idLong = sm.getSelectedItem().getCodigoProyecto();
		
		proyecto.setCodigoProyecto(idLong);
		proyecto.setNombreProyecto(nombretf.getText());
    	proyecto.setPais(paistf.getText());
    	proyecto.setLocalizacion(localizaciotf.getText());
    	proyecto.setSocioLocal(sociotf.getText());
    	proyecto.setFinanciador(financiadortf.getText());
    	proyecto.setFinanciacionAportada(Integer.parseInt(financiaciontf.getText()));
    	proyecto.setFechaInicio(finiciotf.getText());
        proyecto.setFechaFinalizacion(ffinaltf.getText());  
        
        
        proyectoRepository.save(proyecto);
        comboP.setItems(FXCollections.observableArrayList(proyectoRepository.findAll()));
    	guardarCambiostf.setDisable(true);
        
        

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
		
		guardarCambiostf.setDisable(true);
		comboP.setItems(FXCollections.observableArrayList(proyectoRepository.findAll()));
		
	}

}


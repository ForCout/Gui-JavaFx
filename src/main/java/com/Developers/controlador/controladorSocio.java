package com.Developers.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import com.Developers.modelo.Socio;

import com.Developers.repository.SocioRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

@Controller
public class controladorSocio implements Initializable {

	

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

	@FXML
	private Button guardarCambiostf;

	@Autowired
	private SocioRepository socioRepository;
	
	ObservableList<Socio> listaSocios = FXCollections.observableArrayList();
	
	
	@FXML
    void guardar(ActionEvent event) {

		Socio socio = new Socio();

		socio.setNombre(nombretf.getText());
		socio.setApellidos(apellidostf.getText());
		socio.setDireccion(direcciontf.getText());
		socio.setEmail(emailtf.getText());
		socio.setTipoCuota(tipoCuotatf.getText());
		socio.setFecha_ingreso(fingresotf.getText());

		socioRepository.save(socio);
		comboS.setItems(FXCollections.observableArrayList(socioRepository.findAll()));

	}

	@FXML
	void modificar(ActionEvent event) {

		SelectionModel<Socio> sm = comboS.getSelectionModel();

		String nombre = sm.getSelectedItem().getNombre();
		nombretf.setText(nombre);
		String apellido = sm.getSelectedItem().getApellidos();
		apellidostf.setText(apellido);
		String direccion = sm.getSelectedItem().getDireccion();
		direcciontf.setText(direccion);
		String correo = sm.getSelectedItem().getEmail();
		emailtf.setText(correo);
		String tipoCuota = sm.getSelectedItem().getTipoCuota();
		tipoCuotatf.setText(tipoCuota);
		String fechaI = sm.getSelectedItem().getFecha_ingreso();
		fingresotf.setText(fechaI);

		guardarCambiostf.setDisable(false);

	}

	@FXML
	void guardarcambios(ActionEvent event) {

		Socio socio = new Socio();
		SelectionModel<Socio> sm = comboS.getSelectionModel();
		Long idLong = sm.getSelectedItem().getId();

		socio.setId(idLong);
		socio.setNombre(nombretf.getText());
		socio.setApellidos(apellidostf.getText());
		socio.setDireccion(direcciontf.getText());
		socio.setEmail(emailtf.getText());

		socio.setTipoCuota(tipoCuotatf.getText());
		socio.setFecha_ingreso(fingresotf.getText());

		socioRepository.save(socio);
		comboS.setItems(FXCollections.observableArrayList(socioRepository.findAll()));

		guardarCambiostf.setDisable(true);

	}

	@FXML
	void nuevo(ActionEvent event) {

		nombretf.setText("");
		apellidostf.setText("");
		direcciontf.setText("");
		emailtf.setText("");
		fingresotf.setText("");
		tipoCuotatf.setText("");
		
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		guardarCambiostf.setDisable(true);
		comboS.setItems(FXCollections.observableArrayList(socioRepository.findAll()));

	}

}

	



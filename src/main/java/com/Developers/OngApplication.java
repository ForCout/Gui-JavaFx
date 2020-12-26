package com.Developers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;





@SpringBootApplication
public class OngApplication extends Application {
	

	 
	    private Parent rootNode;
	    
	    @Autowired
	    private ApplicationContext springContext ;

	    @Override
	    public void init() throws Exception {
	    	
	    	 springContext = SpringApplication.run(OngApplication.class);
	    	    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vistas/login.fxml"));
	    	    fxmlLoader.setControllerFactory(springContext::getBean);
	    	    rootNode = fxmlLoader.load();
	   
	    }

	    @Override
	    public void start(Stage stage) throws Exception {
	    	
	    	stage.setScene(new Scene(rootNode));
	        
	        stage.show();
	      
	      
	    }

	  


	    public static void main(String[] args) {
	       // launch(Aa4OngEntreCulturasApplication.class, args);
	    	Application.launch(args);
	    	
	    }
	

    	  
      }
	


	
	
	
	
	
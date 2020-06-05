package br.com.regisnumata.api;

import javax.ws.rs.ApplicationPath;
// Opcao de importacao do extends Application
import javax.ws.rs.core.Application;

/**
 *  Classe de entrada da API (Json)
 *  Toda vez que informar a url =>  revenda/api/marca 
 * @author regisnumata
 *
 */


@ApplicationPath(value = "/api")
public class AppConfig extends Application {

	
	
	
	
}

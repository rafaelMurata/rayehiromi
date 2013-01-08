package br.com.atelierrayehiromi.rayehiromi.mb;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("app")
@ApplicationScoped
public class ApplicationController {

	public static final String applicationName = "Atelier Ray & Hiromi";
	
	public String getApplicationName() {
		return applicationName;
	}
}

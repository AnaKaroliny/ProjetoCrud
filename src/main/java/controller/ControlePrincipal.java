package controller;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ControlePrincipal {
	
	public void pagina() throws IOException{
		
		FacesContext.getCurrentInstance().getExternalContext()
        .redirect("ListarUsuarios");
		
	}

}

package controller;

import controller.annotation.ControllerAnnotation;
import controller.util.*;
import spark.*;

public class LoginController extends Controller {

	public LoginController() {
		super();
	}
	
	@ControllerAnnotation (method = HTTPMethod.post, path = "/")
	
	public void Login(Request req, Response res) {
		
	}
}
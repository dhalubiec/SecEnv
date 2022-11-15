package api1;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	

	@PreAuthorize("hasRole('admin')")
	@GetMapping(path = "/check/admin")
	public String mod() {
        return "You have admin privilages";
	}
	
	@PreAuthorize("hasRole('customer')")
	@GetMapping(path = "/check/customer")
	public String users() {
	    return  "You have customer privilages";
	}
	
	@GetMapping(path = "/anon")
	public String anon() {
		return "Hello! This page is accessible to everyone";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
//	@PreAuthorize("hasRole('subscriber')")
//	@GetMapping(path = "/subApi1")
//	public String sub(KeycloakAuthenticationToken authentication) {
////		SimpleKeycloakAccount account = (SimpleKeycloakAccount) authentication.getDetails(); 
////     	AccessToken token = account.getKeycloakSecurityContext().getToken();
////     	System.out.println(token.getRealmAccess().getRoles().toString());
//        return "yes you are sub of api 1";
//	}
	

}

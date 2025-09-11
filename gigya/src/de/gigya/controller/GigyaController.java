/**
 * 
 */
package de.gigya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.gigya.dto.GigyaLoginRequest;
import de.gigya.dto.GigyaLoginResponse;
import de.gigya.dto.GigyaProfileResponse;
import de.gigya.facade.GigyaFacade;
import de.gigya.services.GigyaService;

/**
 * @author shrutiagarwal01
 *
 */

@RestController
@RequestMapping("/gigya")
public class GigyaController
{
	@Autowired
GigyaFacade  gigyaFacade;
	
	@PostMapping("/login")
	public GigyaLoginResponse login(@RequestBody GigyaLoginRequest gigyaLoginRequest) {
		return gigyaFacade.login(gigyaLoginRequest);
	}
	
	@GetMapping("/profile/{uid}")
	public GigyaProfileResponse profile(@PathVariable String uid) {
		return gigyaFacade.getProfile(uid);
	}
	
	@PostMapping("/logout/{uid}")
	public boolean logout(@PathVariable String uid) {
		return gigyaFacade.logout(uid);
	}
	 

}

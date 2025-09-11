/**
 *
 */
package de.gigya.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import de.gigya.dto.GigyaLoginRequest;
import de.gigya.dto.GigyaLoginResponse;
import de.gigya.dto.GigyaProfileResponse;


/**
 * @author shrutiagarwal01
 *
 */
public interface GigyaService
{
	GigyaLoginResponse gigyaLogin(GigyaLoginRequest request);
	GigyaProfileResponse getProfile(String uid);
	boolean logout(String uid);
}

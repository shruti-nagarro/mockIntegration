/**
 * 
 */
package de.gigya.facade;

import de.gigya.dto.GigyaLoginRequest;
import de.gigya.dto.GigyaLoginResponse;
import de.gigya.dto.GigyaProfileResponse;

/**
 * 
 */
public interface GigyaFacade
{

	GigyaLoginResponse login(GigyaLoginRequest request);
   GigyaProfileResponse getProfile(String uid);
   boolean logout(String uid);
}

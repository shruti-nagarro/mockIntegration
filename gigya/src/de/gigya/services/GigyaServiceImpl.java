/**
 *
 */
package de.gigya.services;

import org.jvnet.hk2.annotations.Service;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import de.gigya.dto.GigyaLoginRequest;
import de.gigya.dto.GigyaLoginResponse;
import de.gigya.dto.GigyaProfileResponse;


/**
 * @author shrutiagarwal01
 *
 */
public class GigyaServiceImpl implements GigyaService
{
	@Autowired 
	private RestTemplate gigyaRestTemplate;

	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(GigyaServiceImpl.class);
   private static final String BASE_URL = "https://dummyjson.com";

	@Override
	public GigyaLoginResponse gigyaLogin(final GigyaLoginRequest request)

	{
		try {
			String url= BASE_URL+"/auth/login";
			HttpHeaders headers=new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			
			HttpEntity<GigyaLoginRequest> entity=new HttpEntity<GigyaLoginRequest>(request, headers);
		
			 ResponseEntity<GigyaLoginResponse> responseEntity= gigyaRestTemplate.exchange(url,HttpMethod.POST, entity, GigyaLoginResponse.class);
			 return responseEntity.getBody();
		}
		
		catch (HttpClientErrorException  e) {
         throw new RuntimeException("Login failed: " + e.getMessage(), e);

		}
		
	}

	@Override
	public GigyaProfileResponse getProfile(String uid)
	{
		
		try {
			String url=BASE_URL+"/users/"+uid;
			ResponseEntity<GigyaProfileResponse> response=gigyaRestTemplate.getForEntity(url, GigyaProfileResponse.class);
			return response.getBody();
		}
		catch (HttpClientErrorException e) {
throw new RuntimeException();
}
		// XXX Auto-generated method stub
			}

	@Override
	public boolean logout(String uid)
	{
		try {
			String url=BASE_URL+"/auth/logout";
			gigyaRestTemplate.postForEntity(url, null, Void.class);
			return true;
		}
		catch (Exception e) {

		return false;}
	}

}

package de.gigya.facade;

import org.springframework.beans.factory.annotation.Autowired;

import de.gigya.dto.GigyaLoginRequest;
import de.gigya.dto.GigyaLoginResponse;
import de.gigya.dto.GigyaProfileResponse;
import de.gigya.services.GigyaService;

public class DefaultGigyaFacade implements GigyaFacade
{
	
	@Autowired
	private GigyaService gigyaService;

	@Override
	public GigyaLoginResponse login(GigyaLoginRequest request)
	{
		return gigyaService.gigyaLogin(request);
	}

	@Override
	public GigyaProfileResponse getProfile(String uid)
	{
		return gigyaService.getProfile(uid);
	}

	@Override
	public boolean logout(String uid)
	{
		return gigyaService.logout(uid);
	}

}

/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.nagarro.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.nagarro.fulfilmentprocess.constants.NagaccFulfilmentProcessConstants;

public class NagaccFulfilmentProcessManager extends GeneratedNagaccFulfilmentProcessManager
{
	public static final NagaccFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (NagaccFulfilmentProcessManager) em.getExtension(NagaccFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}

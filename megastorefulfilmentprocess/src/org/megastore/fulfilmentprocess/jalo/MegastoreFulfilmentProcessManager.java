/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package org.megastore.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.megastore.fulfilmentprocess.constants.MegastoreFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class MegastoreFulfilmentProcessManager extends GeneratedMegastoreFulfilmentProcessManager
{
	public static final MegastoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MegastoreFulfilmentProcessManager) em.getExtension(MegastoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}

/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.tests.common.sif.g11n;

import java.nio.charset.Charset;

import org.ebayopensource.turmeric.runtime.common.types.G11nOptions;
import org.ebayopensource.turmeric.runtime.tests.common.sif.Test1Driver;
import org.ebayopensource.turmeric.runtime.tests.common.sif.g11n.BaseG11nTest;



/**
 *
 */
public class RemoteNoLocaleTest extends BaseG11nTest {

	public RemoteNoLocaleTest() throws Exception {
		super("configremote");
	}

	protected void setupDriver(Test1Driver driver) {
		Charset charset = Charset.forName("US-ASCII");
		G11nOptions options = new G11nOptions(charset, null, "EBAY-US");
		driver.setG11nOptions(options);
		driver.setVerifier(new BaseG11nTest.Verifier("US-ASCII", "en-US_US", "EBAY-US"));
	}
}

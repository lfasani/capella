/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.business.queries.preferences;

import org.eclipse.osgi.util.NLS;

/**
 * Externalization class.
 *
 */
public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.polarsys.capella.core.business.queries.preferences.messages"; //$NON-NLS-1$
  public static String CoreBusinessQueriesPreferencesPage_CoreBusinessQueriesPreferencesPage;
  public static String CoreBusinessQueriesPreferencesPage_PreferencesRegardingBusinessQueries;
  public static String CoreBusinessQueriesPreferencesPage_SkipAlreadyOwnedMinMaxDefaulNullValues;
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
    //Does nothing
  }
}
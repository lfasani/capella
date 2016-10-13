/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.platform.sirius.ui.navigator.handlers;

import org.polarsys.capella.core.platform.sirius.ui.navigator.helpers.FixDAnnotationsHelper;

public class FixDAnnotationsHandler extends AbstractFixDiagramsHandler {

  public FixDAnnotationsHandler() {
    setDialogConfirmationMessage("Are you sure you want to fix the annotations on diagrams");
    setJobName(Messages.FixDAnnotationsJobName);
    setFixHelper(new FixDAnnotationsHelper());
  }

}
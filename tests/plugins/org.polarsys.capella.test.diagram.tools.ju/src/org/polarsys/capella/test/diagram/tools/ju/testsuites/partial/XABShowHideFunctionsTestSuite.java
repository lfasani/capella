/*******************************************************************************
 * Copyright (c) 2019, THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.tools.ju.testsuites.partial;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.test.diagram.tools.ju.xab.showhide.functions.ShowHideFunctionsLA;
import org.polarsys.capella.test.diagram.tools.ju.xab.showhide.functions.ShowHideFunctionsOA;
import org.polarsys.capella.test.diagram.tools.ju.xab.showhide.functions.ShowHideFunctionsPAOnBehaviorComponents;
import org.polarsys.capella.test.diagram.tools.ju.xab.showhide.functions.ShowHideFunctionsPAOnDeployedComponents;
import org.polarsys.capella.test.framework.api.BasicTestArtefact;
import org.polarsys.capella.test.framework.api.BasicTestSuite;

import junit.framework.Test;

public class XABShowHideFunctionsTestSuite extends BasicTestSuite {

  public static Test suite() {
    return new XABShowHideFunctionsTestSuite();
  }

  @Override
  protected List<BasicTestArtefact> getTests() {
    List<BasicTestArtefact> tests = new ArrayList<>();
    tests.add(new ShowHideFunctionsOA());
    tests.add(new ShowHideFunctionsPAOnBehaviorComponents());
    tests.add(new ShowHideFunctionsPAOnDeployedComponents());
    tests.add(new ShowHideFunctionsLA());

    return tests;
  }

}

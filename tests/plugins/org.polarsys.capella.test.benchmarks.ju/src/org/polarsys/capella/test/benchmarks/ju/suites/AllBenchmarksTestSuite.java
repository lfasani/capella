/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.benchmarks.ju.suites;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.test.benchmarks.ju.closeSession.CloseSessionTestSuite;
import org.polarsys.capella.test.benchmarks.ju.createBigLFBD.CreateBigLFBDTestSuite;
import org.polarsys.capella.test.benchmarks.ju.insertAssociationOnBigCDB.InsertAssociationOnBigCDBTestSuite;
import org.polarsys.capella.test.benchmarks.ju.insertPLOnBigPAB.InsertPLOnBigPABTestSuite;
import org.polarsys.capella.test.benchmarks.ju.modelvalidation.ModelValidationTestSuite;
import org.polarsys.capella.test.benchmarks.ju.openBigPAB.OpenBigPABTestSuite;
import org.polarsys.capella.test.benchmarks.ju.openSession.OpenSessionTestSuite;
import org.polarsys.capella.test.benchmarks.ju.refreshAllDiagrams.RefreshAllDiagramsTestSuite;
import org.polarsys.capella.test.benchmarks.ju.refreshBigPAB.RefreshBigPABTestSuite;
import org.polarsys.capella.test.benchmarks.ju.saveSessionAfterModifications.SaveSessionAfterModificationsTestSuite;
import org.polarsys.capella.test.framework.api.BasicTestArtefact;
import org.polarsys.capella.test.framework.api.BasicTestSuite;

import junit.framework.Test;

public class AllBenchmarksTestSuite extends BasicTestSuite {

  /**
   * Returns the suite. This is required to unary launch this test.
   */
  public static Test suite() {
    return new AllBenchmarksTestSuite();
  }

  @Override
  protected List<BasicTestArtefact> getTests() {
    List<BasicTestArtefact> tests = new ArrayList<BasicTestArtefact>();
    tests.add(new OpenSessionTestSuite());
    tests.add(new CloseSessionTestSuite());
    tests.add(new OpenBigPABTestSuite());
    tests.add(new RefreshBigPABTestSuite());
    tests.add(new InsertPLOnBigPABTestSuite());
    tests.add(new InsertAssociationOnBigCDBTestSuite());
    tests.add(new CreateBigLFBDTestSuite());
    tests.add(new SaveSessionAfterModificationsTestSuite());
    tests.add(new ModelValidationTestSuite());
    tests.add(new RefreshAllDiagramsTestSuite());
    return tests;
  }
}

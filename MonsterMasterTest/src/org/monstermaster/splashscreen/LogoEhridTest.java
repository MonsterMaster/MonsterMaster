package org.monstermaster.splashscreen;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.MediumTest;

/**
 * @author horodysk
 */
public class LogoEhridTest extends ActivityUnitTestCase<LogoEhrid> {

    /***/
    public LogoEhridTest() {
        super(LogoEhrid.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(getInstrumentation().getTargetContext(), LogoEhrid.class);
        startActivity(intent, null, null);
    }

    /***/
    @MediumTest
    public void testActivityStarted() throws Exception {
        assertNotNull("Intent was null", getActivity());
    }

}

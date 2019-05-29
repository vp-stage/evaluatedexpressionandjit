package com.isolator.cases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.conf.ClockTypeOption;
import org.kie.internal.conf.ConstraintJittingThresholdOption;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
class WriterTest {

    private KieSession kSession;

    //@BeforeEach
    //void configSession() {
    //    // load up the knowledge base
    //    KieServices ks = KieServices.Factory.get();
    //    KieContainer kContainer = ks.getKieClasspathContainer();
    //    kSession = kContainer.newKieSession("ksession-rules");
    //    list = new Vector();
    //}

    @BeforeEach
    void configSessionOld() {
        // load up the knowledge base
        KieContainer kcontainer = KieServices.Factory.get().getKieClasspathContainer();
        KieBaseConfiguration kbaseConfig = KieServices.Factory.get().newKieBaseConfiguration();

        // disable JITTING in test as we get exceptions with masking static method invocations
        // such as ValidationUtils.isNullOrEmpty(interestedPartyNumber)
//        kbaseConfig.setOption(ConstraintJittingThresholdOption.get(-1));
        kbaseConfig.setOption(ConstraintJittingThresholdOption.get(0));

        KieBase kbase = kcontainer.newKieBase("rules", kbaseConfig);
        KieSessionConfiguration config = KieServices.Factory.get().newKieSessionConfiguration();
        config.setOption(ClockTypeOption.get("pseudo"));

        kSession = kbase.newKieSession(config, null);
    }


    private void doStuff(String stringValue) {
        for (int i = 0; i < 50; i++) {
            kSession.insert(
                    new Writer(i, " free memory: " + Runtime.getRuntime().freeMemory())
            );
            kSession.fireAllRules();
        }
    }

    @Test
    void testEvaluatedExpresionAndJITonRace00() {
        doStuff("testEvaluatedExpresionAndJITonRace00");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace01() {
        doStuff("testEvaluatedExpresionAndJITonRace01");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace02() {
        doStuff("testEvaluatedExpresionAndJITonRace02");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace03() {
        doStuff("testEvaluatedExpresionAndJITonRace03");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace04() {
        doStuff("testEvaluatedExpresionAndJITonRace04");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace05() {
        doStuff("testEvaluatedExpresionAndJITonRace05");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace06() {
        doStuff("testEvaluatedExpresionAndJITonRace06");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace07() {
        doStuff("testEvaluatedExpresionAndJITonRace07");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace08() {
        doStuff("testEvaluatedExpresionAndJITonRace08");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace09() {
        doStuff("testEvaluatedExpresionAndJITonRace09");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace10() {
        doStuff("testEvaluatedExpresionAndJITonRace10");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace11() {
        doStuff("testEvaluatedExpresionAndJITonRace11");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace12() {
        doStuff("testEvaluatedExpresionAndJITonRace12");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace13() {
        doStuff("testEvaluatedExpresionAndJITonRace13");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace14() {
        doStuff("testEvaluatedExpresionAndJITonRace14");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace15() {
        doStuff("testEvaluatedExpresionAndJITonRace15");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace16() {
        doStuff("testEvaluatedExpresionAndJITonRace16");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace17() {
        doStuff("testEvaluatedExpresionAndJITonRace17");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace18() {
        doStuff("testEvaluatedExpresionAndJITonRace18");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace19() {
        doStuff("testEvaluatedExpresionAndJITonRace19");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace20() {
        doStuff("testEvaluatedExpresionAndJITonRace20");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}

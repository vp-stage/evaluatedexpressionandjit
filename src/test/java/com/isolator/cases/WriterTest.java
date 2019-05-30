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

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
class WriterTest {

    private KieSession kSession;

    @BeforeEach
    void configSession() {
        // load up the knowledge base
        KieContainer kcontainer = KieServices.Factory.get().getKieClasspathContainer();
        KieBaseConfiguration kbaseConfig = KieServices.Factory.get().newKieBaseConfiguration();

        // disable JITTING in test as we get exceptions with masking static method invocations
        // such as ValidationUtils.isNullOrEmpty(interestedPartyNumber)
        // kbaseConfig.setOption(ConstraintJittingThresholdOption.get(-1));
        kbaseConfig.setOption(ConstraintJittingThresholdOption.get(0));

        KieBase kbase = kcontainer.newKieBase("rules", kbaseConfig);
        KieSessionConfiguration config = KieServices.Factory.get().newKieSessionConfiguration();
        config.setOption(ClockTypeOption.get("pseudo"));

        kSession = kbase.newKieSession(config, null);
    }


    private void insertTransactionWithWritersAndFire(String testName) {
        List<Writer> writers = IntStream.range(0, 50)
                .mapToObj(i -> new Writer(i, testName, "free memory: " + Runtime.getRuntime().freeMemory()))
                .collect(Collectors.toList());
        Transaction transaction = new Transaction(writers);

        kSession.insert(transaction);
        kSession.fireAllRules();
    }

    @Test
    void testEvaluatedExpresionAndJITonRace00() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace00");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace01() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace01");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace02() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace02");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace03() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace03");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace04() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace04");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace05() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace05");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace06() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace06");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace07() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace07");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace08() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace08");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace09() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace09");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace10() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace10");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace11() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace11");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace12() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace12");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace13() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace13");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace14() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace14");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace15() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace15");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace16() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace16");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace17() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace17");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace18() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace18");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace19() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace19");
    }

    @Test
    void testEvaluatedExpresionAndJITonRace20() {
        insertTransactionWithWritersAndFire("testEvaluatedExpresionAndJITonRace20");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}

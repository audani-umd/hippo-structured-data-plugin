package nl.openweb.structured.data.schema.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import nl.ivonet.beanunit.BuilderBeanAsserter;


import static nl.ivonet.beanunit.Asserter.resetToDefaultTypes;
import static nl.ivonet.beanunit.BuilderBeanAsserter.createObject;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Pim Schrama on 5/18/2016.
 */
public class AggregateRatingTest extends AbstractEntityTest {

    @Before
    public void setUp() throws Exception {
        registerBuilderBeanAsserterDefaults();
    }

    @After
    public void tearDown() throws Exception {
        resetToDefaultTypes();
    }

    @Test
    public void testAssertPojo() throws Exception {
        BuilderBeanAsserter.assertBean(AggregateRating.class, "context", "type", "image","bestRating","worstRating", "sameAs");
    }

    @Test
    public void testCreateObject() throws Exception {
        final AggregateRating thing = createObject(AggregateRating.class);
        assertNotNull(thing);
        assertEquals(AggregateRating.class.getSimpleName(), thing.getType());
    }

}
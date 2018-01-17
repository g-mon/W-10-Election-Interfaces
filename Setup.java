

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Setup.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Setup
{
    /**
     * Default constructor for test class Setup
     */
    public Setup()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void FirstTry()
    {
        Voter voter1 = new Voter("alice");
        Voter voter2 = new Voter("bob");
        Voter voter3 = new Voter("charlie");
        Voter voter4 = new Voter("deandra");
        Voter voter5 = new Voter("eric");
        Voter voter6 = new Voter("fiona");
        Voter voter7 = new Voter("george");
        Voter voter8 = new Voter("harriet");
        Party party1 = new Party("Conservatives");
        Party party2 = new Party("Labour");
        Party party3 = new Party("Liberal Democrats");
        Election election1 = new Election("General Election 2017");
        Constituency constituency1 = new Constituency("Aberdeen");
        Constituency constituency2 = new Constituency("Bristol");
        Constituency constituency3 = new Constituency("Cambridge");
        Candidate candidate1 = new Candidate("P");
    }
}


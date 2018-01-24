

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
        Voter voter9 = new Voter("izzy");
        Voter voter10 = new Voter("john");
        Voter voter11 = new Voter("latisha");
        Voter voter12 = new Voter("mandy");
        Voter voter13 = new Voter("norris");
        Voter voter14 = new Voter("oliver");
        Voter voter15 = new Voter("patrice");
        Voter voter16 = new Voter("queen");
        Voter voter17 = new Voter("robert");
        Voter voter18 = new Voter("samantha");
        
        
        Party party1 = new Party("Conservatives");
        Party party2 = new Party("Labour");
        Party party3 = new Party("Liberal Democrats");
        
        Election election1 = new Election("General Election 2017");
        
        Constituency constituency1 = new Constituency("Aberdeen");
        Constituency constituency2 = new Constituency("Bristol");
        Constituency constituency3 = new Constituency("Cambridge");
        
        election1.addConstituency(constituency1);
        election1.addConstituency(constituency2);
        election1.addConstituency(constituency3);
        
        PollingStation PollingStation1 = new PollingStation("AbPol1", "1 Aberdeen Street");
        PollingStation PollingStation2 = new PollingStation("AbPol2", "2 Aberdeen Street");
        PollingStation PollingStation3 = new PollingStation("BrPol1", "1 Bristol Street");
        PollingStation PollingStation4 = new PollingStation("BrPol2", "2 Bristol Street");
        PollingStation PollingStation5 = new PollingStation("CaPol1", "1 Cambridge Street");
        PollingStation PollingStation6 = new PollingStation("CaPol2", "2 Cambridge Street");
        
        constituency1.addPollingStation(PollingStation1);
        constituency1.addPollingStation(PollingStation2);
        constituency2.addPollingStation(PollingStation3);
        constituency2.addPollingStation(PollingStation4);
        constituency3.addPollingStation(PollingStation5);
        constituency3.addPollingStation(PollingStation6);
        
        PollingStation1.addVoter(voter1);
        PollingStation1.addVoter(voter2);
        PollingStation1.addVoter(voter3);
        PollingStation2.addVoter(voter4);
        PollingStation2.addVoter(voter5);
        PollingStation2.addVoter(voter6);
        PollingStation3.addVoter(voter7);
        PollingStation3.addVoter(voter8);
        PollingStation3.addVoter(voter9);
        PollingStation4.addVoter(voter10);
        PollingStation4.addVoter(voter11);
        PollingStation4.addVoter(voter12);
        PollingStation5.addVoter(voter13);
        PollingStation5.addVoter(voter14);
        PollingStation5.addVoter(voter15);
        PollingStation6.addVoter(voter16);
        PollingStation6.addVoter(voter17);
        PollingStation6.addVoter(voter18);
        
        
        Candidate candidate1 = new Candidate("AbCan1");
        Candidate candidate2 = new Candidate("AbCan2");
        Candidate candidate3 = new Candidate("AbCan3");
        candidate1.setParty(party1);
        candidate2.setParty(party2);
        candidate3.setParty(party3);
        constituency1.addCandidate(candidate1);
        constituency1.addCandidate(candidate2);
        constituency1.addCandidate(candidate3);
        
        Candidate candidate4 = new Candidate("BrCan1");
        Candidate candidate5 = new Candidate("BrCan2");
        Candidate candidate6 = new Candidate("BrCan3");
        candidate4.setParty(party1);
        candidate5.setParty(party2);
        candidate6.setParty(party3);
        constituency2.addCandidate(candidate4);
        constituency2.addCandidate(candidate5);
        constituency2.addCandidate(candidate6);
        
        Candidate candidate7 = new Candidate("CaCan1");
        Candidate candidate8 = new Candidate("CaCan2");
        Candidate candidate9 = new Candidate("CaCan3");
        candidate7.setParty(party1);
        candidate8.setParty(party2);
        candidate9.setParty(party3);
        constituency3.addCandidate(candidate7);
        constituency3.addCandidate(candidate8);
        constituency3.addCandidate(candidate9);
        
        PollingStation1.canVote(voter4);
        
       
        
        
    }
}


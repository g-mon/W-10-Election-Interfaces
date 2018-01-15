/*
import java.util.Set;
import java.util.HashSet;
public class Election implements ElectionInterface{
    private String name;
    private HashSet<ConstituencyInterface> consInEle = new HashSet<ConstituencyInterface>();
    private HashSet<PartyInterface> parsInEle = new HashSet<PartyInterface>();
    
    public Election(String eleName){
        name=eleName;
    }
    
    public Set<ConstituencyInterface> getConstituencies(){
        return consInEle;
    }
    
    public void addConstituency(ConstituencyInterface constituency){
        consInEle.add(constituency);
    }
    
    public String getName(){
        return name;
    }
    
    public Set<PartyInterface> getParties(){
        //noticed there is no add party method so must have to just return all the parties here, not sure how to do that
        //idea: for every consInEle, getCandidates, and for each candidate, getParty, adding these to some local set of competing parties, I believe it will filter out repeats automatically
        return parsInEle;
    }
    
    public int seatCount(PartyInterface party){
        //return the number of seats (constituencies) won by the given party
        //for each participating constituency check the winner, if it is the party add to total
        int count=0;
        
    }
    
    public PartyInterface winner(){
        //return party with most seats
        //for each party seatCount, winner is one with most
    }
    
    public CandidateInterface leader(){
        //return If the winning party has more than 50% of the seats then return that party's leader, otherwise return null
    }
}
*/
        
    
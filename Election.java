
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
        HashSet<PartyInterface> competingParties = new HashSet<PartyInterface>();
        HashSet<CandidateInterface> competingCands = new HashSet<CandidateInterface>();
        
        for(ConstituencyInterface con: consInEle){
            Set<CandidateInterface> cands = con.getCandidates();
            
            for(CandidateInterface c: cands){
                competingCands.add(c);
            }
        }
        
        for(CandidateInterface c: competingCands){
            PartyInterface p = c.getParty();
            competingParties.add(p);
        }
        
        return competingParties;
        
    }
    
    public int seatCount(PartyInterface party){
        //return the number of seats (constituencies) won by the given party
        //find winner of each constituency then check his party then if it matches add to vote count
        //for each constituency
        int count=0;
        for(ConstituencyInterface con: consInEle){
            CandidateInterface c = con.winner();
            PartyInterface p=c.getParty();
            if(p==party){
                count+=1;
            }
        }
        return count;
        
    }
    
    public PartyInterface winner(){
        //return party with most seats
        //for each party seatCount, winner is one with most
        Set<PartyInterface> compParties = getParties();
        PartyInterface leader;
        leader=null;
        for(PartyInterface p: compParties){
            if(seatCount(p)>seatCount(leader)){
                leader=p;
            }
        }
        return leader;
            
        
    }
    
    public CandidateInterface leader(){
        //return If the winning party has more than 50% of the seats then return that party's leader, otherwise return null
        //find winning party and number of seats
        double totalSeats = consInEle.size();
        double halfSeats = totalSeats/2;
        PartyInterface p = winner();
        CandidateInterface leader;
        leader=null;
        if(seatCount(p)>halfSeats){
            leader=p.getLeader();
        }
        return leader;
    }
}

        
    
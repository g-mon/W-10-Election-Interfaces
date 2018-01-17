
import java.util.Set;
import java.util.HashSet;
public class Constituency implements ConstituencyInterface{
    private String conName;
    private HashSet<CandidateInterface> candsInCon = new HashSet<CandidateInterface>();
    private HashSet<PollingStationInterface> stasInCon = new HashSet<PollingStationInterface>();
    
    public Constituency(String conName){
        this.conName=conName;
    }
    
    public Set<CandidateInterface> getCandidates(){
        return candsInCon;
    }
    
    public void addCandidate(CandidateInterface candidate){
        candsInCon.add(candidate);
    }
    
    public Set<PollingStationInterface> getPollingStations(){
        return stasInCon;
    }
    
    public void addPollingStation(PollingStationInterface pollingStation){
        stasInCon.add(pollingStation);
    }
    
    public String getName(){
        return conName;
    }
    
    public void setName(String name){
        conName=name;
    }
    
    public int voteCount(CandidateInterface candidate){
        //for each polling station in the constituency, get votes for that candidate   
        int count = 0;
        
        for(PollingStationInterface p: stasInCon){
            count+=p.voteCount(candidate);
        }
        return count;
    }
    
    public CandidateInterface winner(){
        //Run voteCount on each candidate, local variable for leader so far
        //Not sure how to initialise leader but this was covered in an earlier lecture, the one about iterators most likely, look to notes as I don't think null is satisfactory for some reason
        CandidateInterface leader;
        leader = null;
        for(CandidateInterface c: candsInCon){
            if(voteCount(c)>voteCount(leader)){
                leader=c;
            }
        }
        return leader;
    }
}


    
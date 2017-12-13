
public class Party implements PartyInterface{
    private String parName;
    private CandidateInterface parLeader;
    
    public Party(String parName){
        this.parName=parName;
    }
    
    public CandidateInterface getLeader(){
        return parLeader;
    }
    
    public void setLeader(CandidateInterface leader){
        parLeader=leader;
    }
    
    public String getName(){
        return parName;
    }
}

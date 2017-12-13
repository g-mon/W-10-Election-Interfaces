public class Candidate implements CandidateInterface{
    private String candName;
    private PartyInterface candParty;
    
    public Candidate(String candName){
        this.candName=candName;
    }
    
    public PartyInterface getParty(){
        return candParty;
    }
    
    public void setParty(PartyInterface party){
        candParty=party;
    }
    
    public String getName(){
        return candName;
    }
    
    public boolean isIndependent(){
        //true iff not associated with a party
        if(candParty==null){
            return true;
        }
        else{
            return false;
        }
    }
}

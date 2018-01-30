
import java.util.Set;
import java.util.HashSet;
public class PollingStation implements PollingStationInterface{
    private String staName;
    private String staAddress;
    private HashSet<VoterInterface> regdVoters = new HashSet<VoterInterface>();
    private HashSet<VoterInterface> votedVoters = new HashSet<VoterInterface>();
    private HashSet<VoteInterface> votesCast = new HashSet<VoteInterface>();
    
    public PollingStation(String staName){
        this.staName=staName;
        staAddress=null;
    }
    
    public Set<VoteInterface> getVotes(){
        //return all of the votes that have been cast so far
        return votesCast;
    }
    
    public boolean canVote(VoterInterface voter){
        //true iff voter is registered and has not voted yet
        //find them in regdVoters and they must not be in votedVoters, start the boolean true set it false if either condition violated
        boolean canVote=true;
        int count = 0;
        //check for htem in regdVoters
        for(VoterInterface v: regdVoters){
            if(v==voter){
                count=1;
            }
        }
        if(count!=1){
            canVote=false;
        }
       
        
        //check for them in votedVoters
        for(VoterInterface v: votedVoters){
            if(v==voter){
                canVote=false;
            }
        }

        
        return canVote;
    }
    
    public void vote(VoteInterface vote, VoterInterface voter){
        //is there something else to do here?
        
        //set the voter's alreadyVoted value to true for the sake of the canVote method
        votedVoters.add(voter);
        votesCast.add(vote);
        
    }
    
    public Set<VoterInterface> getVoters(){
        //return the registered voters
        return regdVoters;
    }
    
    public void addVoter(VoterInterface voter){
        regdVoters.add(voter);
    }
    
    public String getAddress(){
        return staAddress;
    }
    
    public void setAddress(String address){
        staAddress=address;
    }
    
    public String getName(){
        return staName;
    }
    
    public void setName(String name){
        staName=name;
    }
    
    public int voteCount(CandidateInterface candidate){
        //return votes cast, add one to total if it is for the given candidate
        int total=0;
        for(VoteInterface v: votesCast){
            if(v.getCandidate()==candidate){
                total+=1;
            }
        }
        return total;
        
    }
}

    
    
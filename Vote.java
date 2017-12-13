import java.util.ArrayList;
public class Vote implements VoteInterface{
    private ArrayList<CandidateInterface> addedCands= new ArrayList<CandidateInterface>();
    
    public Vote(){
    }
    
    public void addCandidate(CandidateInterface candidate){
        addedCands.add(candidate);
    }
    
    public boolean isSpoiled(){
        //false iff there is exactly one candidate selected
        int s=addedCands.size();
        if(s==1){
            return false;
        }
        else{
            return true;
        }
    }
    
    public CandidateInterface getCandidate(){
        //if vote not spoiled return selected candidate
        if(isSpoiled()==false){
            return addedCands.get(0);
        }
        else{
            return null;
        }
    }
}

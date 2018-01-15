public class Voter implements VoterInterface{
    private String votrName;
    private String poCo;

    
    public Voter(String votrName){
        this.votrName=votrName;

    }
    
    public String getPostcode(){
        return poCo;
    }
    
    public void setPostcode(String postcode){
        poCo=postcode;
    }
    
    public String getName(){
        return votrName;
    }
    
    public void setName(String name){
        votrName=name;
    }
    

    
}
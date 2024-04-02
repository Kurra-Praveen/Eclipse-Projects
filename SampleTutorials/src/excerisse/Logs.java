package excerisse;

public class Logs{
    
    private int time;
    private String user;
    private String resource;
    
    
    public int getTime(){
      return this.time;
    }
    public void setTime(int time){
       this.time=time;
    }
    
    public String getUser(){
      return this.user;
    }
    
    public void setUser(String user){
      this.user=user;
    }
    
    public void setResource(String resource){
       this.resource=resource;
    }
    
    public String getResource(){
      return this.resource;
    }
}
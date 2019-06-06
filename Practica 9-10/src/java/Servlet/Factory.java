
package servlet;


public class Factory {
    
    private static final Factory instance = new Factory();
    
    private Factory(){}
    
    public static Factory getInstance(){
        
        return instance;
    }
    
    
    public Usuario creatUser(String usertype){
   
       if ("admin".equals(usertype)){
       
       return new Administration() {
       
       };
       
                                    }
       
       if (usertype.equals("normal")){
       
       return new Usuario();
       
                                    }
      
       return null;
   
   }
}

public class charactergame {
    private String name;
    private int life_point;
    private int attackhitpoint;
    private int attackkickpoint;
    
    //constructor
    public charactergame(String name, int hit, int kick){
        this.life_point =100;
        this.name= name;
        this.attackhitpoint= hit;
        this.attackkickpoint= kick;
    }
    
    //function 
    
    public String getname(){
     return name;
}
    public int getlife_point(){
        return life_point;
    }
    
    public void hit(charactergame karA){
        karA.life_point = karA.life_point - this.attackhitpoint;
    }

    public void kick(charactergame karA){
        karA.life_point =karA.life_point - this.attackkickpoint;
    }

}

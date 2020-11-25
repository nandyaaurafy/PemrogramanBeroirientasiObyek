public class Tim {
   private String nama;
   private ArrayList<member> member;
   
   //constructor parameter 1
   public Tim (String nama){
       member = new ArrayList<>();
       this.nama = nama;
   }
   //tabah data
   public void addmember(member m){
       member.add(m);
   }
   //list data
   
   public void displayFullmember(){
       System.out.println ("\n===== member " + this.nama + " ====");
       for (member m : member){
                m.display();
                System.out.println();
       }
   }
    public void displayTrainer() {
        System.out.println("\n=== Trainer - " + this.nama + "===");
         for (member m: member){
             if(m instanceof Trainer ){
                Trainer trainer = (Trainer) m;
                trainer.display();
                System.out.println();
             }
         }
    }
   }
   

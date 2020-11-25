public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tim juragan14 = new Tim("juragan10");
        
        //deklarasi member 
        member orang_1 = new member("Nandya", 20);
        member orang_2 = new member ("Budi", 20);
        member orang_3 = new member ("Dea" , 30);
        
        //deklarasi trainer
        
        member orang_4 = new Trainer ("Dito",25, 7);
        member orang_5 = new Trainer ("Citra,",32, 6);
        member orang_6 = new Trainer ("Dina",27, 12);
        
        //menambahkan data 
        juragan10.addmember(orang_1);
        juragan10.addmember(orang_2);
        juragan10.addmember(orang_3);
        juragan10.addmember(orang_4);
        juragan10.addmember(orang_5);
        juragan10.addmember(orang_6);
        
        //output
        juragan10.displayFullmember();
        juragan10.displayTrainer();
    }
    
}

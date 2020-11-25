public class member {
    protected String nama;
    protected int umur;
 
    public member(String nama,int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    public void display(){
        System.out.println("nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
    }
}
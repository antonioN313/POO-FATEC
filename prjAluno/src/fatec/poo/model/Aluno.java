package fatec.poo.model;

public class Aluno {

   private int RA;
   private double ntPrv1;
   private double ntPrv2;
   private double ntTrab1;
   private double ntTrab2;
   
    public int getRA() {
        return RA;
    }
    public void setRA(int RA) {
        this.RA = RA;
    }
    
    //
    public double getntPrv1() {
        return ntPrv1;
    }
    public void setntPrv1(double ntPrv1) {
        this.ntPrv1 = ntPrv1;
    }
    
    //
    public double getntPrv2() {
        return ntPrv2;
    }
    public void setntPrv2(double ntPrv2) {
        this.ntPrv2 = ntPrv2;
    }

    //
    public double getntTrab1() {
        return ntTrab1;
    }
    public void setntTrab1(double ntTrab1) {
        this.ntTrab1 = ntTrab1;
    }

    //
    public double getntTrab2() {
        return ntTrab2;
    }
    public void setntTrab2(double ntTrab2) {
        this.ntTrab2 = ntTrab2;
    }
    
    //
   public double calcMediaProva(){
      return (0.75 * (getntPrv1() + 2*getntPrv2()))/3;
   }
   public double calcMediaTrab(){
       return (0.25 * (getntTrab1() + getntTrab2()))/2;
   }
   public double calcMediaFinal(){
       return calcMediaProva() + calcMediaTrab();
   }
}

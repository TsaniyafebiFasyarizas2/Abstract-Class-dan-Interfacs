public class Main {
    public static void main (String[] argv){
        SegitigaSamaKaki ssk = new SegitigaSamaKaki();
        ssk.alas = 10;
        ssk.tinggi = 4;
        ssk.hitungLuas();
        ssk.hitungKeliling();
        System.out.println("Luas SegitigaSamaKaki = "+ssk.luas);
        System.out.println("Keliling SegitigaSamaKaki = "+ssk.keliling);
        
        SegiEmpat se = new SegiEmpat();
        se.panjang = 5;
        se.lebar = 5;
        se.hitungLuas();
        se.hitungKeliling();
        System.out.println("Luas SegiEmpat = "+se.luas);
        System.out.println("keliling SegiEmpat = "+se.keliling);
        
        Lingkaran l = new Lingkaran();
        l.jariJari = 14;
        l.hitungLuas();
        l.hitungKeliling();
        System.out.println("Luas Lingkaran = "+l.luas);
        System.out.println("Keliling Lingkaran = "+l.keliling);
    }
}

abstract class BangunDatar{
    public double luas, keliling;
    public abstract void hitungLuas();
    
    public abstract void hitungKeliling();
}

class SegitigaSamaKaki extends BangunDatar {
    public int alas, tinggi;
    
    @Override
    public void hitungLuas(){
        this.luas = 0.5*alas*tinggi;
    }
    @Override
    public void hitungKeliling(){
        double simir = Math.sqrt(Math.pow(0.5*alas, 2)+Math.pow(tinggi, 2));
        this.keliling = (2*simir)+alas;
    }
}

class SegiEmpat extends BangunDatar{
    public int panjang, lebar;
    
    @Override
    public void hitungLuas(){
        this.luas = panjang*lebar;
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = (2*panjang) + 2*lebar;
        
    }

}

class Lingkaran extends BangunDatar {
    public int jariJari;
    
    @Override
    public void hitungLuas(){
        this.luas = Math.PI*jariJari*jariJari;
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = 2*Math.PI*jariJari;
    }
}
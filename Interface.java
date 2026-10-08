public class Main {
    public static void main(String[] argv){
        SegitigaSamaKaki ssk = new SegitigaSamaKaki();
        ssk.alas = 10;
        ssk.tinggi = 5;
        ssk.hitungLuas();
        ssk.hitungKeliling();
        System.out.println("Luas SegitigaSamaKaki = "+ssk.luas);
        System.out.println("keliling SegitigaSamaKaki = "+ssk.keliling);
        ssk.perbesar();
        ssk.hitungLuas();
        ssk.hitungKeliling();
        System.out.println("Luas SegitigaSamaKaki Setelah Diperbesar= "+ssk.luas);
        System.out.println("keliling SegitigaSamaKaki Setelah Diperbesar = "+ssk.keliling);
        ssk.perkecil();
        ssk.hitungLuas();
        ssk.hitungKeliling();
        System.out.println("Luas SegitigaSamaKaki Setelah Diperkecil = "+ssk.luas);
        System.out.println("keliling SegitigaSamaKaki Setelah Diperkecil = "+ssk.keliling);
    }
}

interface Resizeable {
    public void perbesar();
    public void perkecil();
}

abstract class BangunDatar {
    public double luas, keliling;
    
    public abstract void hitungLuas();
    public abstract void hitungKeliling();
}

class SegitigaSamaKaki extends BangunDatar implements Resizeable{
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
    
    @Override
    public void perbesar(){
        this.alas = this.alas*2;
        this.tinggi = this.tinggi*2;
    }
    
    @Override
    public void perkecil(){
        this.alas = this.alas/2;
        this.tinggi = this.tinggi/2;
    }
}

class SegiEmpat extends BangunDatar implements Resizeable{
    public int panjang, lebar;
    
    @Override
    public void hitungLuas(){
        this.luas = panjang*lebar;
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = (2*panjang) + 2*lebar;
    }
    
    @Override
    public void perbesar(){
        this.panjang = this.panjang*2;
        this.lebar = this.lebar*2;
    }
    
    @Override
    public void perkecil(){
        this.panjang = this.panjang/2;
        this.lebar = this.lebar/2;
    }
}


class Lingkaran extends BangunDatar implements Resizeable{
    public int jariJari;
    
    @Override
    public void hitungLuas(){
        this.luas = Math.PI*jariJari*jariJari;
    }
    
    @Override
    public void hitungKeliling(){
        this.keliling = 2*Math.PI*jariJari;
    }
    
    @Override
    public void perbesar(){
        this.jariJari = 2*this.jariJari;
    }
    
    @Override
    public void perkecil(){
        this.jariJari = (int) (0.5*this.jariJari);
    }
}
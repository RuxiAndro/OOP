public class Complex {
    private int Re;
    private int Im;

    Complex(int re,int im)
    {
        this.Im=im;
        this.Re=re;
    }

    public int getRe() {
        return Re;
    }

    public void setRe(int re) {
        Re = re;
    }

    public int getIm() {
        return Im;
    }

    public void setIm(int im) {
        Im = im;
    }

    public void adunare(Complex complex2)
    {
        this.Re=this.Re+complex2.Re;
        this.Im=this.Im+complex2.Im;
    }

    public void scadere(Complex complex2)
    {
        this.Re=this.Re-complex2.Re;
        this.Im=this.Im-complex2.Im;
    }

    public String toString()
    {
        return "Re: "+ this.Re +" Im: "+Im;
    }
}

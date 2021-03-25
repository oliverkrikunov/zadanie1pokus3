package zadanie1;

public class Hraci {
    int na_tahu,id,stoj;
    static int pocet_hracov;
    String meno;
    int pohyb;
    int ucet=5000;
    int pozicia=0;
    int hraci,x;
    public Hraci(int x,String name){
        this.id=id;
        this.meno =meno;
        this.stoj=0;
        this.pozicia=0;
        this.ucet=5000;
    }
    public void setHraci() {
        System.out.println("Pocet hracov :");
        x=KeyboardInput.readInt();
        int[] pole_hracov =new int[x];
        for (int i=0;i<x;i++) {
            System.out.print("Zadaj meno " + (i + 1) + " hraca ");
            pole_hracov[i] =KeyboardInput.readChar();
        } }
    public int getHraci() {
        return hraci;
    }
    public void setMeno(String meno) {
        this.meno = meno;
    }
    public String getMeno() {
        return meno;
    }

    public void setPozicia(int pozicia,int[] plocha,int nehnutelnost) {
        if(plocha[pozicia]== 100)
            this.ucet=+2000;
        if(plocha[pozicia]==99)
            this.stoj=1;
        if(plocha[pozicia]==98)
            this.pozicia = 6;
        if(plocha[pozicia]==97)
            this.ucet=-250*nehnutelnost;
        if(plocha[pozicia]==96)

        if(plocha[pozicia]==0){
            System.out.println("Nehnutelnost na predaj \ncena:1000€\npre kúpu stlac 1 inak 0");
            if (KeyboardInput.readInt()==1) {
                plocha[pozicia] = na_tahu;
                this.ucet=-1000; }
        }



    }
}

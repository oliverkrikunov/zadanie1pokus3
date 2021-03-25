package zadanie1;

public class Hraci {
    private int na_tahu,id,stoj;
    private static int pocet_hracov;
    private String meno;
    private int pohyb;
    private int ucet=5000;
    private int pozicia=0;

    public int getNa_tahu() {
        return na_tahu;
    }

    public void setNa_tahu(int na_tahu) {
        this.na_tahu = na_tahu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoj() {
        return stoj;
    }

    public void setStoj(int stoj) {
        this.stoj = stoj;
    }

    public static int getPocet_hracov() {
        return pocet_hracov;
    }

    public static void setPocet_hracov(int pocet_hracov) {
        Hraci.pocet_hracov = pocet_hracov;
    }

    public int getPohyb() {
        return pohyb;
    }

    public void setPohyb(int pohyb) {
        this.pohyb = pohyb;
    }

    public int getPozicia() {
        return pozicia;
    }

    public void setPozicia(int pozicia) {
        this.pozicia = pozicia;
    }

    public void setHraci(int hraci) {
        this.hraci = hraci;
    }

    public int getUcet() {
        return ucet;
    }

    public void setUcet(int ucet) {
        this.ucet = ucet;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int hraci,x;
    public Hraci(int x,String name){
        this.id=id;
        this.meno =meno;
        this.stoj=0;
        this.pozicia=0;
        this.ucet=5000;
    }

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

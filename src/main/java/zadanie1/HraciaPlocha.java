package zadanie1;

public class HraciaPlocha {
    int[] plocha =new int[24];
    public void setPlocha(){
        for(int i=0;i<24;i++) {
            if(i==0)
                plocha[i]=100;
            else if(i==6)
                plocha[i]=99;
            else if(i==12)
                plocha[i]=98;
            else if(i==18)
                plocha[i]=97;
            else if(i%5==0)
                plocha[i]=96;
            else
                plocha[i]=0;
        }
    }
    public int[] getPlocha() {
        return plocha;
    }
}

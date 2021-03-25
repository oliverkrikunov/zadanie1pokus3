package zadanie1;

public class karty {
    int hodnota=250;
    int[] balicek = new int[6];
    public void setBalicek(){
        for (int i=1;i<6;i++){
            if(i%2==0)
                balicek[i]=+hodnota*i;
            balicek[i]=-hodnota*i; }
    }
    public int[] getBalicek() {
        return balicek;
    }
}

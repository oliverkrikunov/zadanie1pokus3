package zadanie1;

import java.util.ArrayList;
import java.util.List;

public class monopoly {
    private int x;
    private List<Hraci> pole_hrac;
    public void setHraci() {
        System.out.println("Pocet hracov :");
        x=KeyboardInput.readInt();
        List<Hraci> hraci = new ArrayList();
        for (int i=0;i<x;i++) {
            System.out.print("Zadaj meno " + (i + 1) + " hraca ");
            pole_hrac.add(new Hraci(i,KeyboardInput.readString()));
        } }
        int hod,natahu=0;
        int[] pozicia = new int[x];
        HraciaPlocha plocha = new HraciaPlocha();

        while(1){
            hod=(int)(Math.random()*6)+1;
            if(natahu%x== pole_hrac.size()){
                pozicia[x]+=hod;


            }
    }

}

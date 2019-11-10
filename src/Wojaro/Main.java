package Wojaro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
Measurable k1=new Kulturysta("Tomasz","Nowak",Plec.M,85,170, LocalDate.of(1990,5,16));
        Measurable k2=new Kulturysta("Jacek","Beksinski",Plec.M,92,177, LocalDate.of(1995,7,13));
        Measurable k3=new Kulturysta("Paula","Paszko",Plec.K,60,168, LocalDate.of(1987,12,12));
        Measurable k4=new Kulturysta("Rafal","Blaszczyk",Plec.M,100,182, LocalDate.of(1993,12,16));
        Measurable k5=new Kulturysta("Roksana","Poleszczuk",Plec.K,65,172, LocalDate.of(1975,9,30));
        Measurable k6=new Kulturysta("Krzysztof","Ibisz",Plec.M,75,179, LocalDate.of(1972,8,19));
        Measurable k7=new Kulturysta("Karolina","Sipika",Plec.K,63,163, LocalDate.of(1990,5,25));
        Measurable k8=new Kulturysta("Emanuel","Urban",Plec.M,105,193, LocalDate.of(1989,11,23));
        Measurable k9=new Kulturysta("Aleksandra","Ziobro",Plec.K,70,170, LocalDate.of(1996,2,28));
        Measurable[] kulturysci={k1,k2,k3,k4,k5,k6,k7,k8,k9};
        System.out.println("Lista kulturystów:");
        System.out.println();
        for (int i=0;i<kulturysci.length;i++)
        System.out.println(kulturysci[i]);
        System.out.println();
        System.out.println("Największe PPM: "+largest(kulturysci).getMeasure()+" dla: "+largest(kulturysci).getImie());

}



    public static Kulturysta largest(Measurable[] kulturysci){
        Measurable maxPPM=kulturysci[0];
        for(int i=1;i<kulturysci.length;i++){
            if (kulturysci[i].getMeasure()>maxPPM.getMeasure()){
                maxPPM=kulturysci[i];
            }
        }
        return(Kulturysta) maxPPM;

    }

}

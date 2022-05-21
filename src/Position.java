public class Position {
    public static void main(String[] args){
        double a=-9.81;
        double t=10;
        double Vi=0;
        double Xi=0;
        double Xt;

        Xt = 0.5*a*t*t + Vi*t + Xi;
        System.out.println("the value of position (Xt) is:"+Xt+"m");


    }

}

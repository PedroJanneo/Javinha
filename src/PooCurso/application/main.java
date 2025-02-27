package POO.application;

import POO.Entities.Triangulo;

import java.security.cert.TrustAnchor;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
//        double xA,xB,xC, yA,yB,yC;
//
//        System.out.println("Entre com as medidas do triangulo X");
//        xA = sc.nextDouble();
//        xB = sc.nextDouble();
//        xC = sc.nextDouble();
//        System.out.println("Agora entre com as medidas do y");
//        yA = sc.nextDouble();
//        yB = sc.nextDouble();
//        yC = sc.nextDouble();
//
//

//
//        areaX = Math.sqrt(pX*(pX-xA) * (pX-xB) * (pX-xC));
//        areaY=  Math.sqrt(pY*(pY-yA) * (pY-yB) * (pY-yC));
//
//        System.out.printf("Area do triangulo X %.4f%n", areaX);
//        System.out.printf("Area do triangulo Y %.4f%n", areaY);
//
//        if (areaX > areaY){
//            System.out.println("Area X maior");
//        } else{
//        System.out.println("Area Y maior");
//        }

    Triangulo x,y;
    x = new Triangulo();
    y = new Triangulo();

    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();



       double areaX = x.area();
        double areaY= y.area();

        System.out.printf("Area do triangulo X %.4f%n", areaX);
        System.out.printf("Area do triangulo Y %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Area X maior");
        } else{
        System.out.println("Area Y maior");
        }





        sc.close();
    }
}

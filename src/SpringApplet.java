import javax.swing.*;

/**
 * Created by Tomasz on 05.04.2017.
 */
public class SpringApplet extends JApplet {
    public static void main(String []args)
    {
        Vector2D temp00= new Vector2D(1,50);
        Vector2D temp01= new Vector2D(50,1);
        Vector2D temp02= temp00.suma(temp01);
        Vector2D temp03= temp00.roznica(temp01);
        Vector2D temp04= temp00.ZnormalizowanyWektor();
        Vector2D temp05= temp01.ZnormalizowanyWektor();
        Vector2D temp06= temp02.ZnormalizowanyWektor();
        Vector2D temp07= temp03.ZnormalizowanyWektor();
        double dlugosc00= temp00.dlugosc();
        double dlugosc01= temp01.dlugosc();
        double dlugosc02= temp02.dlugosc();
        double dlugosc03= temp03.dlugosc();
        double dlugosc04= temp04.dlugosc();
        double dlugosc05= temp05.dlugosc();
        double dlugosc06= temp06.dlugosc();
        double dlugosc07= temp07.dlugosc();
        Vector2D temp08= temp00.mnozenie(5);
        Vector2D temp09= temp01.mnozenie(5);
        System.out.print("\n wektor 1 : x = "+temp00.x+" y = "+temp00.y);
        System.out.print("\n wektor 2 : x = "+temp01.x+" y = "+temp01.y);
        System.out.print("\n suma wektorów : x = "+temp02.x+" y = "+temp02.y);
        System.out.print("\n różnica wektorów : x = "+temp03.x+" y = "+temp03.y);
        System.out.print("\n znormalizowany 1 : x = "+temp04.x+" y = "+temp04.y);
        System.out.print("\n znormalizowany 2 : x = "+temp05.x+" y = "+temp05.y);
        System.out.print("\n znormalizowana suma : x = "+temp06.x+" y = "+temp06.y);
        System.out.print("\n znormalizowana różnica : x = "+temp07.x+" y = "+temp07.y);
        System.out.print("\n mnożenie przez stałą 1 : x = "+temp08.x+" y = "+temp08.y);
        System.out.print("\n mnożenie przez stałą 2 : x = "+temp09.x+" y = "+temp09.y);
        System.out.print("\n długość 1 : "+dlugosc00);
        System.out.print("\n długość 2 : "+dlugosc01);
        System.out.print("\n długość sumy : "+dlugosc02);
        System.out.print("\n długość różnicy : "+dlugosc03);
        System.out.print("\n długość znormalizowanego 1 : "+dlugosc04);
        System.out.print("\n długość znormalizowanego 2 : "+dlugosc05);
        System.out.print("\n długość znormalizowanej sumy : "+dlugosc06);
        System.out.print("\n długość znormalizowanej różnicy : "+dlugosc07);
    }
    public void init(){

    }
    public void paint(){

    }
}

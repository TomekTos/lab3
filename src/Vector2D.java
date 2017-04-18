/**
 * Created by Tomasz on 05.04.2017.
 */
import static java.lang.Math.sqrt;
public class Vector2D {
    public double x;
    public double y;
    public Vector2D(){
        x=0;
        y=0;
    }
    public Vector2D(double x1, double y1){
        this.x=x1;
        this.y=y1;
    }
    public Vector2D suma(Vector2D vector){
        Vector2D temp0 = new Vector2D(this.x + vector.x, this.y + vector.y);
        return temp0;
    }
    public Vector2D roznica(Vector2D vector){
        Vector2D temp1 = new Vector2D(this.x - vector.x, this.y - vector.y);
        return temp1;
    }
    public Vector2D mnozenie(double stala){
        Vector2D temp2 = new Vector2D(this.x * stala, this.y * stala);
        return temp2;
    }
    public double dlugosc()

    {
        double temp3 = this.x;
        double temp4 = this.y;
        double temp5 = sqrt(temp3 * temp3 + temp4 * temp4);
        return temp5;
    }
    public Vector2D ZnormalizowanyWektor()
    {
        double temp6 = this.dlugosc();
        Vector2D temp_znormalizowany= new Vector2D(this.x/temp6,this.y/temp6);
        return temp_znormalizowany;
    }
}


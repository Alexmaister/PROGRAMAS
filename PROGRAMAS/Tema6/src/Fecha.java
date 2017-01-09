/**
 * Created by aortiz on 02/12/2016.
 */
public class Fecha {
    private int d,m,a;
    private boolean validacion;
    public Fecha(){
        d=0;m=0;a=0;
    }
    public Fecha(int d,int m,int a) {
        validacion = false;
        if (m >= 1 && m <= 12)
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (d >= 1 && d <= 30)
                        validacion = true;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (d >= 1 && d <= 30)
                        validacion = true;
                    break;
                case 2:
                    if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0)))
                        if (d >= 1 && d <= 29)
                            validacion = true;
                        else if (d >= 1 && d <= 28)
                            validacion = true;
                    break;
            }
        if (validacion == true) {
            this.d = d;
            this.m = m;
            this.a = a;
        } else {
            this.d = 0;
            this.m = 0;
            this.a = 0;
        }
    }

    public int getDia(){
            return d;
        }
    public int getMes(){
        return m;
    }
    public int getAño(){
        return a;
    }
    public void setDia(int dia){
        d=dia;
    }
    public void setMes(int mes){
        m=mes;
    }
    public void setAño(int año){
        a=año;
    }

}

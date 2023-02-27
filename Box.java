import java.util.Objects;
import static java.util.Objects.hash;

class Box {

    private double var1;
    private double var2;
    private double var3;

    public double getVar1() {
        return var1;
    }
    public void setVar1(double var1) {
        this.var1 = var1;
    }
    public double getVar2(){
        return var2;
    }
    public void setVar2(double var2){
        this.var2 = var2;
    }
    public double getVar3(){
        return var3;
    }
    public void setVar3(double var3){ this.var3 = var3; }

    public Box(double var1, double var2, double var3){
        this.var1 = var1;
        this.var2= var2;
        this.var3 = var3;
    }


    double getVolume(){
        return var1*var2*var3;
    }

    @Override
    public String toString(){
        return "var1"+var1+"var2"+var2+"var3"+var3;
    }

    @Override
    public boolean equals(Object o){
        if(this ==o) return true;
        if(o==null|| getClass()!=o.getClass()) return false;
        Box box = (Box)o;
        return Double.compare(box.var1, var1)==0&&
                Double.compare(box.var2, var2)==0&&
                Double.compare(box.var3, var3)==0;
    }
    @Override
    public int hashCode(){
        return Objects.hash(var1, var2, var3);
    }

}

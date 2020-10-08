import java.text.DecimalFormat;

public class Point3D extends Point2D {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3D(){
        zCoord =yCoord=xCoord=0;
    }
    public Point3D(double x, double y, double z){
        xCoord=x;
        yCoord=y;
        zCoord=z;
    }
    public void setX(double x){
        xCoord=x;
    }
    public void setY(double y){
        yCoord=y;
    }
    public void setZ(double z){
        zCoord=z;
    }
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ(){
        return zCoord;
    }
    public boolean isCompare(Point3D ob1){
        if (ob1.getX()==this.getX()&&ob1.getY()==this.getY()&&ob1.getZ()==this.getZ()) return true;
        else return false;
    }
    public String distanceToX(Point3D ob1){
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        String result = decimalFormat.format(this.getX()- ob1.getX());
        return result;
    }
    public String distanceToY(Point3D ob1){
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        String result = decimalFormat.format(this.getY()- ob1.getY());
        return result;
    }
    public String distanceToZ(Point3D ob1){
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        String result = decimalFormat.format(this.getZ()- ob1.getZ());
        return result;
    }
}

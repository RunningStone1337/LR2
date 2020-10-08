public class Lab2 {
    public static void main(String[] args) {
        Point3D ob1 = new Point3D(0,4,1);
        Point3D ob2 = new Point3D(0,3, 0);
        Point3D ob3 = new Point3D(4,0,0);
        if (ob1.isCompare(ob2)||ob1.isCompare(ob3)||ob2.isCompare(ob3)) {
            System.out.println("Одна или более точек совпадают, невозможно вычислить.");
        }
        else {
            System.out.println(computeArea(ob1, ob2, ob3));
        }
    }
    public static double computeArea(Point3D ob1, Point3D ob2, Point3D ob3){
        Point3D v1 = new Point3D();
        v1.setX(ob2.getX()-ob1.getX());
        v1.setY(ob2.getY()-ob1.getY());
        v1.setZ(ob2.getZ()-ob1.getZ());
        Point3D v2 = new Point3D();
        v2.setX(ob3.getX()-ob1.getX());
        v2.setY(ob3.getY()-ob1.getY());
        v2.setZ(ob3.getZ()-ob1.getZ());
        double i =v1.getY()* v2.getZ()-v2.getY()*v1.getZ(), j = -(v1.getX()* v2.getZ()- v2.getX()* v1.getZ()), k=(v1.getX()*v2.getY()- v2.getX()* v1.getY());
        return Math.sqrt(i*i+j*j+k*k)/2;
    }
}

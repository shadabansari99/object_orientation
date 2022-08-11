package objects;

public class Rectangle {
    private double length;
    private double width;
        public Rectangle(double length,double width)
        {
            this.length=length;
            this.width=width;
        }

         public double getLength() {
            return length;
        }

       public void setLength(double length) {
          this.length = length;
        }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        System.out.println("Before Updating");
        System.out.println("Length: "+r.getLength());
        System.out.println("Width: "+r.getWidth());

        r.setLength(6);
        r.setWidth(14);

        System.out.println("\n After Updating");
        System.out.println("Length: "+r.getLength());
        System.out.println("Width: "+r.getWidth());
    }
}

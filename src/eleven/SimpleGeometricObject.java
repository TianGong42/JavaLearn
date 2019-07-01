package eleven;

/**
 * 父类中的私有数据域在改类之外不可访问的。不能在子类中直接使用。但是，
 * 如果父类中定义公共的访问器/修改器，那么可以通过这些公共的访问器/修改器来访问和修改它们
 */
public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }

    public SimpleGeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    /** 返回这个对象文字描述 */
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}

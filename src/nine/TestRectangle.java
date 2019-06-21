package nine;

public class TestRectangle {

    public static void main(String[] args){
        Rectangle RectangleOne = new Rectangle(4,40);
        Rectangle RectangleTwo = new Rectangle(3.5,35.9);

        System.out.println("长方形1的宽：" + RectangleOne.width + " 高： " + RectangleOne.height
                + " 面积 " + RectangleOne.getArea() + " 周长 " + RectangleOne.getPrimeter());
        System.out.println("长方形1的宽：" + RectangleTwo.width + " 高： " + RectangleTwo.height
                + " 面积 " + RectangleTwo.getArea() + " 周长 " + RectangleTwo.getPrimeter());
    }
}

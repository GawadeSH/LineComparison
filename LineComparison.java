public class LineComparison
{
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Program");
        LineComparison l=new LineComparison();
        l.length();
    }
    int x1 = 1, x2 = 4;         //point 1=(x1,y1)=(1,1)
    int y1 = 1, y2 = 4;         //point 2=(x2,y2)=(4,4)
    double len;

    void length() {
        len  = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("length is:-"+len);

    }

}

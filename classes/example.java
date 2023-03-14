class demobox
{
    double width;
    double height;
    double depth;
    void volume()
    {
        System.out.print("volume of the box is=");
        System.out.println(width*height*depth);
    }

}
class example1
{
    public static void main(String[] args)
    {
    demobox box1 =new demobox();
    demobox box2 = new demobox();
    box1.width=10;
    box2.width=15;
    box1.height=4;
    box2.height=7;
    box1.depth=90;
    box2.depth=56;
    box1.volume();
    box2.volume();
    }
}
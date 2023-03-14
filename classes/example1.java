class box
{
    double width;
    double height;
    double depth;

}
class example1

{
    public static void main(String args[])
    {
        box box1 = new box();
        box1.width=10;
        box1.height=20;
        box1.depth=15;
        double vol=box1.width*box1.height*box1.depth;
        System.out.println("the volume of the box1="+vol);
        box box2 =new box();
        box2.width = 20;
        box2.height = 30;
        box2.depth = 10;
        double vol2 = box2.width*box2.height*box2.depth;
        System.out.println("the volumeof the box2 is = "+vol2);

    }
    
}


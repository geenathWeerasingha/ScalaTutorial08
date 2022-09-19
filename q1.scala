object main extends App{

  case class Point(var x:Int, var y:Int) {
          def add(p:Point)= new Point(x+p.x, y+p.y);

          def move(a:Int,b:Int) ={
              this.x = this.x + a;
              this.y = this.y + b;
          }

          def distance(p:Point) = {
              var distX = x-p.x;
              var distY = y-p.y;
              var dist = distX*distX+distY*distY;
              scala.math.sqrt(dist)
          }

          def invert() = {
              var temp = this.x;
              this.x = this.y;
              this.y = temp;
          }
      }

    var p1 = Point(4,6);
    var p2 = Point(3,2);

    println(p1);
    println(p2 + "\n");

    println(p1.add(p2)+ "\n");

    p2.move(4,4);
    println(p2+ "\n");

    println(p1.distance(p2)+ "\n");

    p1.invert()
    println(p1)

}

public class Kart {
  private double distance;
  private int direction;
  private String kartName;

  public Kart(String kn, double dist, int dir){
    kartName = kn;
    distance = Math.abs(dist);
    direction = dir % 360;
  }

  public Kart(){
    this("MARIO", 1, 0);
  }

  public void move(double dist, int dir){
    double r1 = distance;
    double r2 = dist;
    double u1 = Math.toRadians(direction);
    double u2 = Math.toRadians(dir);
    distance = Math.sqrt(r1*r1 + r2*r2 + 2*r1*r2*Math.cos(u2-u1));
    double ang = Math.atan2(r1*Math.sin(u1) + r2*Math.sin(u2), r1*Math.cos(u1) + r2*Math.cos(u2));
    direction = Math.floorMod((int) Math.round(Math.toDegrees(ang)), 360);
  }

  public String toString(){
    String s = kartName + " - ";
    s += (double)Math.round(100*distance)/100;
    s += " metres away at heading ";
    if(direction < 100)
      s += "0";
    if(direction < 10)
      s += "0";
    s += direction;
    return s;
  }

  public double distTo(Kart other){

    double r1 = this.distance;
    double r2 = other.distance;
    double u1 = Math.toRadians(this.direction);
    double u2 = Math.toRadians(other.direction);
    double between = Math.sqrt(r1*r1 + r2*r2 - 2*r1*r2*Math.cos(u2-u1));
    return (double)Math.round(100*between)/100;
  }
}

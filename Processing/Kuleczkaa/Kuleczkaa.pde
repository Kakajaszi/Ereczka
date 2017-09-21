Kuleczka k1, k2, k3; //zarezerwuj miejsce w pamięci dla 3 obiekty
//klasy kuleczka

void setup()
{
  size(1280, 960);
  k1=new Kuleczka();
  k2=new Kuleczka();
  k3=new Kuleczka();
}
void draw()
{
  background(#FA0000);
  fill(random(255),random(255),random(255));
  frameRate(25);
  k1.draw();
  k1.spadaj();
  k2.draw();
  k2.spadaj();
  k3.draw();
  k3.spadaj();
  
  

}
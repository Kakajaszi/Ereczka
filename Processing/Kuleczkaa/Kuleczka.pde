class Kuleczka
{
  // własciwosci
  int x,y; //położenie kuleczki na ekranie 
  int r; //promień Kuleczki
  int wr,wg,wb; //r,b,g wnetrza Kuleczki
  int predkosc;
  
  //konstruktor
  Kuleczka()
  {
    r=(int)random(10,50); //losuje rozmiar z przedziału (5,20)
    x=(int)random(0,width);// losuje połozenie
    y=(int)random(0,height);//losuje połozenie
    predkosc=(int)random(2,10);
    wr=(int)random(256);
    wg=(int)random(256);
    wb=(int)random(256);
  }
  //metody
  void draw()
  {
     fill(wr,wg,wb);
  ellipse(x,y,r*2,r*2);  
 
  
  if(y>=height) y=0; 
  
  }
  void spadaj()
  {
    
    y=y+predkosc;
  }
  
  
}//koniec klasy Kuleczka
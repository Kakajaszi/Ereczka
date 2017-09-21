int x,y;
int r,g,b;
void setup()
{
  size(1280, 960);
  frameRate(100);
  
  x=100;
  y=200;
  r=(int)random(255);
  b=(int)random(255);
  g=(int)random(255);
}
void draw()

{
  background(r,b,g);
  fill(random(255), random(255), random(255));
  ellipse(x, y, 50, 50);
}
void keyPressed()
{
  if (key==' ')
  {
    
  r=(int)random(255);
  b=(int)random(255);
  g=(int)random(255);
  }
    if(key=='a') x=x-10;
    if(key=='d') x=x+10;
    if(key=='w') y=y-10;
    if(key=='s') y=y+10;
    
    if(y>=height) y=0; 
   else if(y<=0) y=height;
   
    
     
  if(x>=width) x=0;
 else  if(x<=0) x=width;
}
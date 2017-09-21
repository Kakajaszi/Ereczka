size(800, 600);
for (int i=0; i<50; i++)
{
  for (int j=0; j<50; j++)
  {
    fill(i*5);
    ellipse(i*10+5, 10*j+5, 10, 10);
  }
}
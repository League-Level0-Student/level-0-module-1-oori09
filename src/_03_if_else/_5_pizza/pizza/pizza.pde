
void setup() {
  size(600,600);
      fill(216, 216, 22);
  ellipse(300, 300, 300, 300);
  fill(206, 4, 11);
  ellipse(300,300, 250, 250);
  fill(245, 250 , 3);
  ellipse(300, 300, 200, 200);
}
void draw() {
  PImage corn = loadImage("corn.jpg");
  corn.resize(50, 50);
  image(corn, 300, 300);
  PImage peperoni = loadImage("peperoni.jpeg");
  peperoni.resize(50, 50);
  image(peperoni, 250, 250);
  if(mousePressed){
 image(peperoni, mouseX, mouseY);
 image(corn, mouseX +100, mouseY);
}
}

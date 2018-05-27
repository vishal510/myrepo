//this keyword
class Example2 {
	int x = 10;
void m1(int p) 
{
	p=50;
}
void m2(Example2 e) 
{
	e = new Example2();
}
void m3(Example2 e)
{

	e.x = 15;
}

void m4(Example2 e) 
{
    e.x = 17;
    e = new Example2();
    e.x = 18;
 
}
}

#include <iostream>
using namespace std;

class Complex;

class Calculate
{
public:
    Complex add(Complex, Complex);
};

class Complex
{
    int a, b;

    friend Complex Calculate ::add(Complex, Complex);
    // friend Complex;          // -->making whole class as friend

public:
    void setData(int n1, int n2)
    {
        a = n1;
        b = n2;
    }

    void getData()
    {
        cout << "The number is: " << a << " + " << b << "i" << endl;
    }
};

Complex Calculate ::add(Complex o1, Complex o2)
{
    {
        Complex sum;
        sum.setData((o1.a + o2.a), (o1.b + o2.b));
        return sum;
    }
}

int main(int argc, char const *argv[])
{
    Complex c1, c2, c3;
    c1.setData(1, 2);
    c1.getData();

    c2.setData(2, 1);
    c2.getData();

    c3 = Calculate().add(c1, c2);
    c3.getData();

    return 0;
}

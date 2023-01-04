#include <iostream>
using namespace std;

// using templates
template <class T>

class Vector
{
public:
    T *arr;
    int size;

    Vector(int sz)
    {
        size = sz;
        arr = new T[size];
    }

    T dotProduct(Vector v)
    {
        T sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum += arr[i] * v.arr[i];
        }
        return sum;
    }
};

int main(int argc, char const *argv[])
{
    Vector<int> v1(2);
    v1.arr[0] = 2;
    v1.arr[1] = 2;

    Vector<int> v2(2);
    v2.arr[0] = 2;
    v2.arr[1] = 0;

    int a = v1.dotProduct(v2);
    cout << "The dot product is: " << a << endl;

    return 0;
}

// Normal Code

/*

class Vector
{
public:
    int *arr;
    int size;

    Vector(int sz)
    {
        size = sz;
        arr = new int[size];
    }

    int dotProduct(Vector v)
    {
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum += arr[i] * v.arr[i];
        }
        return sum;
    }
};

int main(int argc, char const *argv[])
{
    Vector v1(2);
    v1.arr[0] = 2;
    v1.arr[1] = 2;

    Vector v2(2);
    v2.arr[0] = 2;
    v2.arr[1] = 0;

    int a = v1.dotProduct(v2);
    cout << "The dot product is: " << a << endl;

    return 0;
}
 */
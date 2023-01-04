#include <iostream>
using namespace std;

void Pattern()
{
    int n = 4;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }

        cout << endl;
    }
}

void mirrorOfPattern()
{

    int n = 4;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++)
        {
            cout << " ";
        }

        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }

        cout << endl;
    }
}

void reversePattern()
{
    int n = 4;
    for (int i = 1; i <= n; i++)
    {
        for (int j = n; j >= i; j--)
        {
            cout << "*";
        }
        cout << endl;
    }

    /*

    ****
    ***
    **
    *

     */
}

void mirrorReversePattern()
{
    int n = 4;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j < i; j++)
        {
            cout << " ";
        }
        for (int j = n; j >= i; j--)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void rectanglePattern()
{
    int n = 4;

    for (int i = 1; i <= 4; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void hollowRectangle()
{

    int n = 4;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (i == 1 || j == 1 || i == n || j == n)
            {
                cout << "* ";
            }
            else
            {
                cout << "  ";
            }
        }
        cout << endl;
    }
}

void trianglePattern()
{
    int n = 4;

    for (int i = 1; i <= n; i++)
    {
        for (int j = n; j > i; j--)
        {
            cout << " ";
        }
        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }
        for (int j = 1; j <= i; j++)
        {
            cout << "*";
        }

        cout << endl;
    }
}

void butterflyPattern() {}

int main(int argc, char const *argv[])
{

    return 0;
}

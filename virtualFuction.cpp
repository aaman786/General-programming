#include <iostream>
using namespace std;

class Human
{
    int skill = 0;

public:
    Human() {}
    Human(int skill)
    {
        this->skill = skill;
    }

    void getter()
    {
        cout << "The value of the skill is: " << skill << endl;
    }

    virtual void skills()
    {
        cout << "General skills only " << skill << endl;
    }
};

/*

       A   int a = 5;
      / \
a=5; C   D  a=5;
      \ /
       Z

  */

class Programmer : public Human
{
public:
    void skills()
    {
        cout << "C, C++, JAva" << endl;
    }
};

int main(int argc, char const *argv[])
{
    Human *hum;
    Programmer prog;

    Human human(4);
    human.getter();

    hum = &prog;
    hum->skills();
    return 0;
}

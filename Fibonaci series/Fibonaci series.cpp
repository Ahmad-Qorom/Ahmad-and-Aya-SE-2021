#include <iostream>
using namespace std;
int main()
{
	int n,next=0;
	int first = 0, second = 1;
	cin >> n;
	cout << "\n";
	for (int i = 0; i < n; i++)
	{
		if (i <= 1)
			next = i;
		else
		{
			next = first + second;
			first = second;
			second = next;
		}
		cout << next << " ";
	}
	return 0;
}
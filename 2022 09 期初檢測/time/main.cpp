#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
	int h1, m1, s1;
	int h2, m2, s2;
	cin >> h1 >> m1 >> s1;//第一行輸入
	cin >> h2 >> m2 >> s2;//第二行輸入
	s1 = s1 + h1 * 3600 + m1 * 60;
	s2 = s2 + h2 * 3600 + m2 * 60;
	if (s1 > s2) s2 += 86400;//如果時間2比時間1還大 表示跨了一天 但時長不超過24小時
	int delta = s2 - s1;
	int hour = delta / 3600;
	delta %= 3600;
	int minute = delta / 60;
	delta %= 60;
	int second = delta;
	cout << hour << " " << minute << " " << second << "\n";

	return 0;
}




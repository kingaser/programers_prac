#include <stdio.h>

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    
    if (n > 0 && m > 0) printf("%d\n", 1);
    else if (n < 0 && m > 0) printf("%d\n", 2);
    else if (n < 0 && m < 0) printf("%d\n", 3);
    else printf("%d\n", 4);
    
    return 0;
}
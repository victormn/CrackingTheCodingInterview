#include <stdio.h>

void reverseString(char *str)
{
	char *end = str;
	char temp;

    if(str) {
        while(*end) {
            ++end;
        }
        --end;
        while(str < end) {
            temp = *str;
            *str++ = *end;
            *end-- = temp;
        }
    }
}

int main(int argc, char const *argv[])
{
	
	// Inputs
	char in[5] = "abcd";

	// Function call and return

    reverseString(in);

	printf("%s\n", in);

	return 0;
}
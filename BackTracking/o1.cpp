#include <iostream>

bool isPrime(int number) {
    if (number <= 1) return false;
    for (int i = 2; i * i <= number; ++i) {
        if (number % i == 0) return false;
    }
    return true;
}

int main() {
    int number = 2;
    while (true) {
        if (isPrime(number)) {
            std::cout << number << " is prime." << std::endl;
        }
        ++number;
    }
    return 0;
}
//Task_1
//Number Guessing Game
#include <iostream>
#include <cstdlib>  
#include <ctime>    
int main() {
    std::srand(static_cast<unsigned int>(std::time(0)));
    int numberToGuess = std::rand() % 100 + 1;
    int userGuess;
    int attempts = 0;
    std::cout << "I'm thinking of a number between 1 and 100.\n";
    do {
        std::cout << "Take a guess: ";
        std::cin >> userGuess;
        attempts++;
        if (userGuess < numberToGuess) {
            std::cout << "Too low!\n";
        } else if (userGuess > numberToGuess) {
            std::cout << "Too high!\n";
        } else {
            std::cout << "Congratulations! You guessed the number in " << attempts << " attempts.\n";
        }
    } while (userGuess != numberToGuess);
    return 0;
}

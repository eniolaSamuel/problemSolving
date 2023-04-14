guess_number = 12
guess = int(input("Guess my day of birth: "))

while guess != guess_number:
    if guess != guess_number:
        print("Incorrect guess")

    guess = int(input("Guess my day of birth: "))

    if guess == guess_number:
        print("Correct guess")

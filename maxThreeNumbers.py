""" A script that requests three values from the user
    and then prints the maximum of the three values
    by calling your maxOfThree()* function.
    * The built-in Python function max() is not used.
    author: Fatih IZGI
    date: 13-Feb-2020
    version: python 3.6.9
"""

def maxOfThree(values: list) -> float:
    """ Returns the maximum value in the given list
    """
    max_value = values[0]  # the first value is assumed as the maximum value

    for value in values[1:]:    # compare the max_value with the other values in the list,
                                # except for the first one
        if value > max_value:   # if the comparing value is greater than the current max_value
            max_value = value   # update max_value
    return max_value


while True: # check if the input values are numbers
    try:
        value1 = float(input("Enter first value: "))
        break
    except ValueError:
        print("Value Error! The input you entered for the value1 is not a number!")

while True:
    try:
        value2 = float(input("Enter second value: "))
        break
    except ValueError:
        print("Value Error! The input you entered for the value2 is not a number!")

while True:
    try:
        value3 = float(input("Enter third value: "))
        break
    except ValueError:
        print("Value Error! The input you entered for the value3 is not a number!")

print(f"The maximum of {value1}, {value2} and {value3} is "
      f"{maxOfThree([value1, value2, value3])}") # call the function to return and print the max value

# Дано натуральное число N и последовательность из N элементов. Требуется вывести эту последовательность в обратном порядке.
# Примечание. В программе запрещается объявлять массивы и использовать циклы (даже для ввода и вывода).

# Input:    2 -> 3 4
# Output: 4 3

def foo(n):
    if n == 0:
        return ''
    temp = input()
    return foo(n - 1) + temp

print(foo(int(input('Vvedite chislo: '))))
# Напишите программу для печати всех уникальных значений в словаре. 

# Input:  [{"V":"S001"}, {"V":"S002"}, {"VI":"S001"}, {"VI":"S005"}, {"VII":"S005"}, {"V":"S009"}, {"VIII":"S007"}] 

# Output: {'S005', 'S002', 'S007', 'S001', 'S009'}

# Примечание: Список словарей задан изначально. Пользователь его не вводит

lst = [{"V": "S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI": "S005"}, {"VII": "S005"}, {"V":"S009"}, {"VIII":"S007"}]

lst2 = []

for dct in lst:
    for key in dct:
        lst2.append(dct[key])

print(set(lst2))
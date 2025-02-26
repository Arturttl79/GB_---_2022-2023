# * Задача 20: * В настольной игре Скрабл (Scrabble) каждая буква имеет определенную ценность. 
# В случае с английским алфавитом очки распределяются так:
# A, E, I, O, U, L, N, S, T, R – 1 очко; D, G – 2 очка; B, C, M, P – 3 очка; F, H, V, W, Y – 4 очка; 
# K – 5 очков; J, X – 8 очков; Q, Z – 10 очков. 
# А русские буквы оцениваются так: А, В, Е, И, Н, О, Р, С, Т – 1 очко; Д, К, Л, М, П, У – 2 очка; 
# Б, Г, Ё, Ь, Я – 3 очка; Й, Ы – 4 очка; Ж, З, Х, Ц, Ч – 5 очков; Ш, Э, Ю – 8 очков; Ф, Щ, Ъ – 10 очков. 
# Напишите программу, которая вычисляет стоимость введенного пользователем слова. Будем считать, что на вход 
# подается только одно слово, которое содержит либо только английские, либо только русские буквы.

# *Пример:*
# ноутбук
#     12

letters = [{'A': 1}, {'B': 3}, {'C': 3}, {'D': 2}, {'E': 1}, {'F': 4}, {'G': 2}, {'H': 4}, {'I': 1}, 
           {'J': 8}, {'K': 5}, {'L': 1}, {'M': 3}, {'N': 1}, {'O': 1}, {'P': 3}, {'Q': 10}, {'R': 1}, 
           {'S': 1}, {'T': 1}, {'U': 1}, {'V': 4}, {'W': 4}, {'X': 8}, {'Y': 4}, {'Z': 10}, 

           {'А': 1}, {'Б': 3}, {'В': 1}, {'Г': 3}, {'Д': 2}, {'Е': 1}, {'Ё': 3}, {'Ж': 5}, {'З': 5}, 
           {'И': 1}, {'Й': 4}, {'К': 2}, {'Л': 2}, {'М': 2}, {'Н': 1}, {'О': 1}, {'П': 2}, {'Р': 1}, 
           {'С': 1}, {'Т': 1}, {'У': 2}, {'Ф': 10}, {'Х': 5}, {'Ц': 5}, {'Ч': 5}, {'Ш': 8}, {'Щ': 10}, 
           {'Ъ': 10}, {'Ы': 4}, {'Ь': 3}, {'Э': 8}, {'Ю': 8}, {'Я': 3}]

name = list(input('Vvedite imya: '))
summ = 0

for i in range(len(name)):
    name[i] = name[i].capitalize()
    for item in letters:
        for key in item:
            if key == name[i]:
                summ += item[key]

print(summ)
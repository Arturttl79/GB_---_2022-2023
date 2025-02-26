# Винни-Пух попросил Вас посмотреть, есть ли в его стихах ритм. Поскольку разобраться в его кричалках не настолько
# просто, насколько легко он их придумывает, Вам стоит написать программу. Винни-Пух считает, что ритм есть,
# если число слогов (т.е. число гласных букв) в каждой фразе стихотворения одинаковое. Фраза может состоять из
# одного слова, если во фразе несколько слов, то они разделяются дефисами. Фразы отделяются друг от друга пробелами.
# Стихотворение  Винни-Пух вбивает в программу с клавиатуры. В ответе напишите “Парам пам-пам”,
# если с ритмом все в порядке и “Пам парам”, если с ритмом все не в порядке
# *Пример:*
# **Ввод:
# ** пара-ра-рам рам-пам-папам па-ра-па-да
# **Вывод:
# ** Парам пам-пам

vowel_letters = 'АЕЁИОУЫЭЮЯ'
    # Проверка на то, чтобы фраз было больше одного              сумма всех гласных букв в каждой фразе
if len(rhyme := input("Vvedite stih: ").upper().split()) > 1 and len(set([sum(i.count(vowel) for vowel in vowel_letters) for i in rhyme])) == 1:
    print('Парам пам-пам')
else:
    print('Пам парам')


# Выдает список с количеством гласных в каждой фразе
#  def count_vowels_in_rhyme(stih, vowels):
#      result = list()
#      for i in stih:
#          lst = list(i)
#          count = 0
#          for j in lst:
#              if j in vowels:
#                  count += 1
#          result.append(count)
#      return result


#  if len(set(count_vowels_in_rhyme(rhyme, vowel_letters))) == 1:
#      print('Парам пам-пам')
#  else:
#      print('Пам парам')

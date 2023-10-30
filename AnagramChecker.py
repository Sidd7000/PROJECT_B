def check_anagram(str1, str2):
    return sorted(str1.lower()) == sorted(str2.lower())

word1 = "listen"
word2 = "silent"
if check_anagram(word1, word2):
    print(f"'{word1}' and '{word2}' are anagrams.")
else:
    print(f"'{word1}' and '{word2}' are not anagrams.")

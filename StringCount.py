from collections import defaultdict

def count_words(sentence):
    words = sentence.split()
    word_count = defaultdict(int)
    
    for word in words:
        word_count[word] += 1
    
    return word_count

text = "This is a sentence. This sentence contains repeated words, this is one of them."
word_counts = count_words(text)
for word, count in word_counts.items():
    print(f"'{word}' occurs {count} time(s) in the text.")

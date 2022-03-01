from dataclasses import dataclass


# f = open('data.txt', 'w') overwrite
f = open('data.txt', 'a')  # append
# f.write('\nHello World!')
f.writelines('\nHello Zero to Pro!')
f.close()

# Read from the file words.txt and output the word frequency list to stdout.
cd $1
awk -F ' ' '{for(i=1;i<=NF;i++){print $i}}' words.txt|sort|uniq -c|sort -nr | awk -F ' ' '{printf("%s %s\n",$2,$1)}'
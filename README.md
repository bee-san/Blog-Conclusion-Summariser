# Blog-Conclusion-Summariser
Summaries a blog, TL;DR style.

# How to use
Step 1) Have a Ghost blog.
Step 2) Make sure it's the Casper theme (might work on others but only tested on Casper)
Step 3) Go to the bottom of a blog post and insert a HTML card
Step 4) paste this script
Step 5) profit :)

Note: the script is rather long, so I would suggest pasting the script, previewing the post, copy the TL;DR the script makes and pasting that instead of the card.

# Why it works
This uses an algorithm called TF-IDF. I've written about the algorithm extensively here:
https://skerritt.blog/tfidf/

I've modified the original algorithm. The modifications I've done are:
* Not scoring / ranking stop words. Words such as "and", "to", "before" etc.
* Preffering shorter, easier to understand words over larger, harder to understand words whilest not effecting fundamental keywords.

The second one is a little hard to explain, as this point in time I'm still figuring it out. I want the TL;DR to feature easier to understand words and sentences instead of long hard to understand sentences. Easy word will be multiplied by a factor depending on how easy it is to understand (at the moment, it's the length of the word * it's position in most used word dictionary). If the word appears in top 10 Term Frequency (it's talked about a lot) then it must be a keyword, therefore the keyword will be multiplied by some small factor. 

If you have a long keyword, such as "term-frequency" the algorithm shouldn't banish this word into oblivion. I would like to also implement some sort of system so the first 3 paragraphs have a slight importance on them too, as the keywords will likely appear in the first few paragraphs.

# ToDo

Maybe putting a negative weighting on numbers.

Also, sometimes one word TF-IDF scors rank highly, such as "data". Put a positive weighting on sentences that contain more words? for example, multiplying the sentence by 1.01?

Copy and paste blogSummary.js into 

Uses TFIDF
https://skerritt.blog/tfidf/


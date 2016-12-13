package com.example.jacksonmeyer.dailybread;

import java.util.Random;

public class QuoteBook {
        String[] mQuotes = {
                "'The future belongs to those who believe in the beauty of their dreams' -anonymous",
                "'Do something instead of killing time because time is killing you' -anonymous",
                "'A teacher holds a hand, opens a mind and touches a heart'–anonymous",
                "'If something is important enough, even if the odds are against you, you should still do It' -Elon Musk, CEO Tesla & SpaceX",
                "'The first step is to establish that something is possible; then probability will occur' -Elon Musk, CEO Tesla & SpaceX",
                "'It's OK to have your eggs in one basket as long as you control what happens to that basket'-Elon Musk, CEO Tesla & SpaceX",
                "'Persistence is very important. You should not give up unless you are forced to give up' -Elon Musk, CEO Tesla & SpaceX",
                "'You want to have a future where you're expecting things to be better, not one where you're expecting things to be worse' -Elon Musk, CEO Tesla & SpaceX",
                "'I think frugality drives innovation, just like other constraints do. One of the only ways to get out of a tight box is to invent your way out' –Jeff Bezos, CEO Amazon",
                "'What's dangerous is not to evolve'–Jeff Bezos, CEO Amazon",
                "'You know, we love stories and we love narrative; we love to get lost in an author's world' –Jeff Bezos, CEO Amazon",
                "'My view is there's no bad time to innovate'–Jeff Bezos, CEO Amazon",
                "'It's not an experiment if you know it's going to work'  –Jeff Bezos, CEO Amazon",
                "'There'll always be serendipity involved in discovery' –Jeff Bezos, CEO Amazon",
                "'Follow your heart' -anonymous",
                "'The future depends on what you do today' -anonymous",
                "'Say yes to new adventures' -anonymous",
                "'Hard work beats talent when talent doest work hard' -anonymous",
                "'Your dreams are the other side of your fears' -anonymous",
                "'A brave life is a challenge' -anonymous",
                "'Use brain and heart to do everything' -anonymous",
                "'There are no shortcuts' –Mark Cuban, BILLIONAIRE entrepeneur",
                "'Its okay to ask for help' –Chip Wilson, Lululemon Founder",
                "'Get into a business where you can be a big fish' Marcus Lemonis, CEO Camping world",
                "'Focus on signal over noise' –Elon Musk, CEO Tesla & SpaceX",
                "'A real Friend is one who walks in when the whole world walks out' -anonymous",
                "'Know your limits, but never accept them' -anonymous",
                "'Its all in how you look at things' -anonymous",
                "'Hug harder, Laugh Louder, Smile Bigger, Love Longer' -anonymous",
                "'The less you care, the happier you will be' -anonymous",
                "'If you kneel before God, you can stand before any man' -anonymous",
                "No matter how many times I break down there is a little part of me that says no, you’re not done yet, get back up.' -anonymous",
                "'You are always stronger than you are!' -anonymous",
                "'You got this day, make today the best day ever' –Jackson Meyer",
                "'Forget the risk and take the fall, if it’s what your want than its worth it all' -anonymous",
                "'If its still in your mind, its worth taking the risk' -anonymous",
                "'Look out the window and reflect about your life…just take 5 seconds, this Life can be awesome, or dull, you decide!' –Jackson Meyer",
                "'Give me six hours to chop down a tree and I will spend the first four sharpening the axe' –Abraham Lincoln",
                "'America will never be destroyed from the outside. If we falter and lose our freedoms, it will be because we destroyed ourselves' –Abraham Lincoln",
                "'Most folks are as happy as they make up their minds to be' –Abraham Lincoln",
                "'The best thing about the future is that it comes one day at a time' – Abraham Lincoln",
                "'Character is like a tree and reputation like a shadow. The shadow is what we think of it; the tree is the real thing' –Abraham Lincoln",
                "'You cannot escape the responsibility of tomorrow by evading it today.' –Abraham Lincoln",
                "'Things may come to those who wait, but only the things left by those who hustle.' – Abraham Lincoln",
                "a ship is always safe at the store, but that’s not what its made for' -Albert Einstein",
                "'Speak to everyone the same way, whether it is the garbage man or the president of the university' -Albert Einstein",
                "'Try not to become a person of success but a person of value' -Albert Einstein"};

    public String getQuote() {

        String quote = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mQuotes.length);
        quote = mQuotes[randomNumber];

        return quote;
    }
}


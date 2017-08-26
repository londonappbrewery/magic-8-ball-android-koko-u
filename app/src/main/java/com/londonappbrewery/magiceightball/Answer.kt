package com.londonappbrewery.magiceightball

import android.support.annotation.DrawableRes
import java.util.*

val random = Random()

enum class Answer(@DrawableRes val id: Int) {
    ASK_AGAIN_LATER(R.drawable.ask_again_later_ball),
    I_HAVE_NO_IDEA(R.drawable.i_have_no_idea_ball),
    NO(R.drawable.no_ball),
    THE_ANSWER_IS_YES(R.drawable.the_answer_is_yes_ball),
    YES(R.drawable.yes_ball)
}

fun makeDecision(): Answer {
    val answers = Answer.values()
    return answers[random.nextInt(answers.size)]
}
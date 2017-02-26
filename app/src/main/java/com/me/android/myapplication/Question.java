package com.me.android.myapplication;

/**
 * Created by ASUS on 2016/11/7.
 */
public class Question {

        private int mTextResId;
        private boolean mAnswerTrue;
        public Question(int textResId, boolean answerTrue){
            mTextResId = textResId;
            mAnswerTrue = answerTrue;
        }

        public int getTextResId() {
            return mTextResId;
        }

        public void setTextResId(int textResId) {
            mTextResId = textResId;
        }

        public boolean isAnswerTrue() {
            return mAnswerTrue;
        }

        public void setAnswerTrue(boolean answerTrue) {
            mAnswerTrue = answerTrue;
        }



    }



package com.example.lap3.model;

import java.util.List;

public class Lap3Response {

    /**
     * quiz : {"sport":[{"question":"Which one is correct team name in NBA?","options":["New York Bulls","Los Angeles Kings","Golden State Warriros","Huston Rocket"],"answer":"Huston Rocket"},{"question":"Which one is correct team name in NBA?","options":["New York Bulls","Los Angeles Kings","Golden State Warriros","Huston Rocket"],"answer":"Huston Rocket"}],"maths":[{"question":"5 + 7 = ?","options":["10","11","12","13"],"answer":"12"},{"question":"12 - 8 = ?","options":["1","2","3","4"],"answer":"4"}]}
     */

    private QuizBean quiz;

    public QuizBean getQuiz() {
        return quiz;
    }

    public void setQuiz(QuizBean quiz) {
        this.quiz = quiz;
    }

    public static class QuizBean {
        private List<SportBean> sport;
        private List<MathsBean> maths;

        public List<SportBean> getSport() {
            return sport;
        }

        public void setSport(List<SportBean> sport) {
            this.sport = sport;
        }

        public List<MathsBean> getMaths() {
            return maths;
        }

        public void setMaths(List<MathsBean> maths) {
            this.maths = maths;
        }

        public static class SportBean {
            /**
             * question : Which one is correct team name in NBA?
             * options : ["New York Bulls","Los Angeles Kings","Golden State Warriros","Huston Rocket"]
             * answer : Huston Rocket
             */

            private String question;
            private String answer;
            private List<String> options;

            public String getQuestion() {
                return question;
            }

            public void setQuestion(String question) {
                this.question = question;
            }

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }

            public List<String> getOptions() {
                return options;
            }

            public void setOptions(List<String> options) {
                this.options = options;
            }
        }

        public static class MathsBean {
            /**
             * question : 5 + 7 = ?
             * options : ["10","11","12","13"]
             * answer : 12
             */

            private String question;
            private String answer;
            private List<String> options;

            public String getQuestion() {
                return question;
            }

            public void setQuestion(String question) {
                this.question = question;
            }

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }

            public List<String> getOptions() {
                return options;
            }

            public void setOptions(List<String> options) {
                this.options = options;
            }
        }
    }
}

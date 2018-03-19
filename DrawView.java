package com.FireFerrariStudios.Think_You_Know_Ender_s_Game;

import android.content.Context;
import android.graphics.*;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Matthew Ferrari on 5/21/2016.
 */
public class DrawView extends View {
    private Bitmap backgroundBmp;
    private Bitmap answerscreenBmp;
    private Bitmap correctBmp;
    private Bitmap homeBmp;
    private  Bitmap doneBmp;
    int point1=0;
    int point2=0;
    int point3=0;
    int point4=0;
    int point5=0;
    int point6=0;
    int point7=0;
    int point8=0;
    int point9=0;
    int point10=0;
    int point11=0;
    int point12=0;
    int point13=0;
    int point14=0;
    int point15=0;
    int sY = -1;
    int sX = -1;
    int eX = -1;
    int eY = -1;
    public boolean playing;
    int questionnum;
    public boolean questionwrong = false;
    public boolean questionright = false;
    public boolean homescreen=true;
    public boolean question1 = false;
    public boolean question2 = false;
    public boolean question3 = false;
    public boolean question4 = false;
    public boolean question5 = false;
    public boolean question6 = false;
    public boolean question7 = false;
    public boolean question8 = false;
    public boolean question9 = false;
    public boolean question10 = false;
    public boolean question11 = false;
    public boolean question12 = false;
    public boolean question13 = false;
    public boolean question14 = false;
    public boolean question15 = false;
    public boolean endScreen = false;


    public boolean questionDone = false;

    public DrawView(Context context) {
        super(context);
        backgroundBmp = BitmapFactory.decodeResource(getResources(), R.drawable.background);
        answerscreenBmp = BitmapFactory.decodeResource(getResources(), R.drawable.answerscreen);
        correctBmp = BitmapFactory.decodeResource(getResources(), R.drawable.correct);
        homeBmp = BitmapFactory.decodeResource(getResources(), R.drawable.homescreen);
        doneBmp = BitmapFactory.decodeResource(getResources(), R.drawable.over);


    }



    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        RectF background = Draw.createRectF(0, 0, 100, 100, canvas);
        RectF home = Draw.createRectF(0,0,100,100, canvas);
        RectF correct = Draw.createRectF(20, 20, 80, 90, canvas);
        RectF answerscreen = Draw.createRectF(20, 20, 80, 90, canvas);
        RectF answerA1 = Draw.createRectF(32, 51, 72, 58, canvas);
        RectF answerB1 = Draw.createRectF(32, 59, 72, 67, canvas);
        RectF answerC1 = Draw.createRectF(32, 68, 72, 77, canvas);
        RectF answerD1 = Draw.createRectF(32, 79, 72, 87, canvas);
        RectF arrow = Draw.createRectF(62, 20, 80, 35, canvas);
        RectF number = Draw.createRectF(75, 30, 76, 36, canvas);
        Paint abig = new Paint();
        abig.setColor(Color.WHITE);
        abig.setTextSize(30);
        Paint cyan = new Paint();
        cyan.setColor(Color.rgb(0,102,204));
        Paint b = new Paint();
        b.setColor(Color.BLACK);
        b.setTextSize(30);
        Paint a = new Paint();
        a.setColor(Color.WHITE);
        a.setTextSize(25);
        Paint amed = new Paint();
        amed.setColor(Color.WHITE);
        amed.setTextSize(27);
        Paint amedi = new Paint();
        amedi.setColor(Color.WHITE);
        amedi.setTextSize(25);
        Paint abigr = new Paint();
        abigr.setColor(Color.WHITE);
        abigr.setTextSize(38);
        Paint asma = new Paint();
        asma.setColor(Color.WHITE);
        asma.setTextSize(23);
        RectF play = Draw.createRectF(67,40,97,53, canvas);
        RectF paypal = Draw.createRectF(67,62,97,85,canvas);
        RectF homebutton=Draw.createRectF(85,84,96,97, canvas);
        RectF cricle1=Draw.createRectF(15,17,18,20, canvas);RectF cricle2=Draw.createRectF(19,17,22,20, canvas);
        RectF cricle3=Draw.createRectF(23,17,26,20, canvas);RectF cricle4=Draw.createRectF(27,17,30,20, canvas);
        RectF cricle5=Draw.createRectF(31,17,34,20, canvas);RectF cricle6=Draw.createRectF(35,17,38,20, canvas);
        RectF cricle7=Draw.createRectF(39,17,42,20, canvas);RectF cricle8=Draw.createRectF(43,17,46,20, canvas);
        RectF cricle9=Draw.createRectF(47,17,50,20, canvas);RectF cricle10=Draw.createRectF(51,17,54,20, canvas);
        RectF cricle11=Draw.createRectF(55,17,58,20, canvas);RectF cricle12=Draw.createRectF(59,17,62,20, canvas);
        RectF cricle13=Draw.createRectF(63,17,66,20, canvas);RectF cricle14=Draw.createRectF(67,17,70,20, canvas);
        RectF cricle15=Draw.createRectF(71,17,74,20, canvas);
        Paint GREEN = new Paint();
        GREEN.setColor(Color.GREEN);
        Paint Black = new Paint();
        Black.setColor(Color.BLACK);
        Paint GRAY = new Paint();
        GRAY.setColor(Color.GRAY);


        //---------------------------------------------Homescreen-------------------------------------------------------------------


        if(homescreen) {

            playing=false;
            canvas.drawBitmap(homeBmp, null, home, null);
            if (play.contains(sX,sY)){
                canvas.drawBitmap(backgroundBmp, null, background, null);
                homescreen=false;
                sX=-1;
                sY=-1;
                question1=true;
            }


        }


//---------------------------------------------HOME-------------------------------------------------------------------


        if((homebutton.contains(sX,sY)|| homebutton.contains(eX,eY)) && playing){homescreen=true;question1 = false;question2 = false;question3 = false;
            question6 = false;question7 = false;question8 = false;question9 = false;question10 = false;question11 = false;question12 = false;question13=false;
            questionDone = false;questionwrong = false;questionright = false;questionnum=0;point1=0;point2=0;point3=0;point4=0;point5=0;question5 = false;
            point6=0;point7=0;point8=0;point9=0;point10=0;point11=0;point12=0;point13=0;point14=0;point15=0;sY = -1;sX = -1;eX = -1;eY = -1;playing=false;question4 = false;question14=false;
            question15=false;question13 = false;question14 = false;question15 = false;invalidate();
        }

// ---------------------------------------------QUESTION #1-------------------------------------------------------------------
        if (question1) {
            playing=true;
            questionnum=1;

            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("What is Ender's real name?", 35, 40, abig, canvas);
            Draw.drawText("Jackson", 34, 55, a, canvas);
            Draw.drawText("Andrew", 34, 65, a, canvas);
            Draw.drawText("George", 34, 74, a, canvas);
            Draw.drawText("None of the above", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, GRAY,canvas);
            Draw.drawCircle(cricle3, GRAY,canvas);
            Draw.drawCircle(cricle4, GRAY,canvas);
            Draw.drawCircle(cricle5, GRAY,canvas);
            Draw.drawCircle(cricle6, GRAY,canvas);
            Draw.drawCircle(cricle7, GRAY,canvas);
            Draw.drawCircle(cricle8, GRAY,canvas);
            Draw.drawCircle(cricle9, GRAY,canvas);
            Draw.drawCircle(cricle10,GRAY,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            invalidate();

            if (answerA1.contains(sX, sY) || answerC1.contains(sX, sY) || answerD1.contains(sX, sY)) {

                questionwrong = true;
            }

            if (answerB1.contains(sX, sY)) {
                questionright = true;
            }


            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Andrew", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point1 = 1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question2 = true;
                question1 = false;
                questionnum = 2;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

//---------------------------------------------QUESTION #2-------------------------------------------------------------------

        if (question2) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("Who uses Locke as a pseudonym?", 32, 40, amed, canvas);
            Draw.drawText("Ender", 34, 55, a, canvas);
            Draw.drawText("Valentine", 34, 65, a, canvas);
            Draw.drawText("Colnel Graff", 34, 74, a, canvas);
            Draw.drawText("Peter", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, GRAY,canvas);
            Draw.drawCircle(cricle4, GRAY,canvas);
            Draw.drawCircle(cricle5, GRAY,canvas);
            Draw.drawCircle(cricle6, GRAY,canvas);
            Draw.drawCircle(cricle7, GRAY,canvas);
            Draw.drawCircle(cricle8, GRAY,canvas);
            Draw.drawCircle(cricle9, GRAY,canvas);
            Draw.drawCircle(cricle10,GRAY,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);


            if (answerA1.contains(sX, sY) || answerC1.contains(sX, sY) || answerB1.contains(sX, sY)) {
                questionwrong = true;
            }

            if (answerD1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Peter", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point2=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question3 = true;
                question2 = false;
                questionnum = 3;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;

            }
        }

//---------------------------------------------QUESTION #3-------------------------------------------------------------------
        if (question3) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("Bonzo Madrid is the leader of what army?", 31, 40, amedi, canvas);
            Draw.drawText("Rat", 34, 55, a, canvas);
            Draw.drawText("Dragon", 34, 65, a, canvas);
            Draw.drawText("Salamander", 34, 74, a, canvas);
            Draw.drawText("Phoenix", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, GRAY,canvas);
            Draw.drawCircle(cricle5, GRAY,canvas);
            Draw.drawCircle(cricle6, GRAY,canvas);
            Draw.drawCircle(cricle7, GRAY,canvas);
            Draw.drawCircle(cricle8, GRAY,canvas);
            Draw.drawCircle(cricle9, GRAY,canvas);
            Draw.drawCircle(cricle10,GRAY,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);


            if (answerA1.contains(sX, sY) || answerB1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerC1.contains(sX, sY)) {
                questionright = true;

            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Salamander", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point3=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question4 = true;
                question3 = false;
                questionnum = 4;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

//---------------------------------------------QUESTION #4-------------------------------------------------------------------
        if (question4) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("Why was Dragon Army retired?", 34, 40, abig, canvas);
            Draw.drawText("Their uniforms were destored", 34, 55, a, canvas);
            Draw.drawText("They lost all of their battles", 34, 65, a, canvas);
            Draw.drawText("The dragon ran away", 34, 74, a, canvas);
            Draw.drawText("Not enough people to sustain the army", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, GRAY,canvas);
            Draw.drawCircle(cricle6, GRAY,canvas);
            Draw.drawCircle(cricle7, GRAY,canvas);
            Draw.drawCircle(cricle8, GRAY,canvas);
            Draw.drawCircle(cricle9, GRAY,canvas);
            Draw.drawCircle(cricle10,GRAY,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);


            if (answerA1.contains(sX, sY) || answerC1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerB1.contains(sX, sY)) {
                questionright = true;

            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("They lost all of their battles", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point4=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question5 = true;
                question4 = false;
                questionnum = 5;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }
//---------------------------------------------QUESTION #5-------------------------------------------------------------------

        if (question5) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("Who helps Ender learn how to fight?", 32, 40, amed, canvas);
            Draw.drawText("Petra", 34, 55, a, canvas);
            Draw.drawText("Colonel Graff", 34, 65, a, canvas);
            Draw.drawText("Valentine", 34, 74, a, canvas);
            Draw.drawText("Alai", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, GRAY,canvas);
            Draw.drawCircle(cricle7, GRAY,canvas);
            Draw.drawCircle(cricle8, GRAY,canvas);
            Draw.drawCircle(cricle9, GRAY,canvas);
            Draw.drawCircle(cricle10,GRAY,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerB1.contains(sX, sY) || answerC1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerA1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Petra", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point5=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question6 = true;
                question5 = false;
                questionnum = 6;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

//---------------------------------------------QUESTION #6-------------------------------------------------------------------
        if (question6) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("Who is the Speaker of the Dead?", 32, 40, abig, canvas);
            Draw.drawText("Ender", 34, 55, a, canvas);
            Draw.drawText("Petra", 34, 65, a, canvas);
            Draw.drawText("Bonzo", 34, 74, a, canvas);
            Draw.drawText("Alai", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, GRAY,canvas);
            Draw.drawCircle(cricle8, GRAY,canvas);
            Draw.drawCircle(cricle9, GRAY,canvas);
            Draw.drawCircle(cricle10,GRAY,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerB1.contains(sX, sY) || answerC1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerA1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Ender", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point6=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question7 = true;
                question6 = false;
                questionnum = 7;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }



        //---------------------------------------------QUESTION #7-------------------------------------------------------------------
        if (question7) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("Who takes over Earth after the 3rd invasion?", 30, 40, a, canvas);
            Draw.drawText("The Bugger Queen", 34, 55, a, canvas);
            Draw.drawText("Peter", 34, 65, a, canvas);
            Draw.drawText("Colonel Graff", 34, 74, a, canvas);
            Draw.drawText("Bean", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, Black,canvas);
            Draw.drawCircle(cricle8, GRAY,canvas);
            Draw.drawCircle(cricle9, GRAY,canvas);
            Draw.drawCircle(cricle10,GRAY,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerA1.contains(sX, sY) || answerC1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerB1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Peter", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point7=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question8 = true;
                question7 = false;
                questionnum = 8;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

        //---------------------------------------------QUESTION #8-------------------------------------------------------------------
        if (question8) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("What category does John Wiggin", 35, 38, a, canvas);
            Draw.drawText("read in the newspaper?", 38, 44, a, canvas);
            Draw.drawText("Category on Locke", 34, 55, a, canvas);
            Draw.drawText("Category on the IF", 34, 65, a, canvas);
            Draw.drawText("Category on Demosthnes", 34, 74, a, canvas);
            Draw.drawText("Category on the Buggers", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, Black,canvas);
            Draw.drawCircle(cricle8, Black,canvas);
            Draw.drawCircle(cricle9, GRAY,canvas);
            Draw.drawCircle(cricle10,GRAY,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerB1.contains(sX, sY) || answerA1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerC1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Category on Demosthnes", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point8=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question9 = true;
                question8 = false;
                questionnum = 9;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

        //---------------------------------------------QUESTION #9-------------------------------------------------------------------
        if (question9) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("Who is paid to be nice to the launchies?", 32, 40, a, canvas);
            Draw.drawText("Anderson", 34, 55, a, canvas);
            Draw.drawText("Dap", 34, 65, a, canvas);
            Draw.drawText("Rackham", 34, 74, a, canvas);
            Draw.drawText("Bernard", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, Black,canvas);
            Draw.drawCircle(cricle8, Black,canvas);
            Draw.drawCircle(cricle9, Black,canvas);
            Draw.drawCircle(cricle10,GRAY,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerA1.contains(sX, sY) || answerC1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerB1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Dap", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point9=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question10 = true;
                question9 = false;
                questionnum = 10;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

        //---------------------------------------------QUESTION #10-------------------------------------------------------------------
        if (question10) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15),80, 18, b, canvas);
            Draw.drawText("/15", 82, 18, b, canvas);
            Draw.drawText("What word/phrase does Alai whisper", 34, 37, a, canvas);
            Draw.drawText("to Ender when he is being transferred?", 34, 43, a, canvas);
            Draw.drawText("Mazel tov", 34, 55, a, canvas);
            Draw.drawText("Let the lord be with you", 34, 65, a, canvas);
            Draw.drawText("Adios mi amor", 34, 74, a, canvas);
            Draw.drawText("Salaam", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, Black,canvas);
            Draw.drawCircle(cricle8, Black,canvas);
            Draw.drawCircle(cricle9, Black,canvas);
            Draw.drawCircle(cricle10,Black,canvas);
            Draw.drawCircle(cricle11,GRAY,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerB1.contains(sX, sY) || answerC1.contains(sX, sY) || answerA1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerD1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Salaam", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point10=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question10 = false;
                question11=true;
                questionnum = 11;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }
        //---------------------------------------------QUESTION #11-------------------------------------------------------------------

        if (question11) {

            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 84, 18, b, canvas);
            Draw.drawText("Where do the Wiggins move?", 34, 40, abig, canvas);
            Draw.drawText("Georgia", 34, 55, a, canvas);
            Draw.drawText("Rocky Mountains", 34, 65, a, canvas);
            Draw.drawText("Florida", 34, 74, a, canvas);
            Draw.drawText("North Carolina", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, Black,canvas);
            Draw.drawCircle(cricle8, Black,canvas);
            Draw.drawCircle(cricle9, Black,canvas);
            Draw.drawCircle(cricle10,Black,canvas);
            Draw.drawCircle(cricle11,Black,canvas);
            Draw.drawCircle(cricle12,GRAY,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerB1.contains(sX, sY) || answerC1.contains(sX, sY) || answerA1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerD1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("North Carolina", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point11=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question12 = true;
                question11 = false;
                questionnum = 12;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

        //---------------------------------------------QUESTION #12-------------------------------------------------------------------
        if (question12) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 84, 18, b, canvas);
            Draw.drawText("What does Ender find funny on the ship?", 32, 40, a, canvas);
            Draw.drawText("That he broke Bernard's arm", 34, 55, a, canvas);
            Draw.drawText("Graff's hair", 34, 65, a, canvas);
            Draw.drawText("Gravity", 34, 74, a, canvas);
            Draw.drawText("The other launchies", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, Black,canvas);
            Draw.drawCircle(cricle8, Black,canvas);
            Draw.drawCircle(cricle9, Black,canvas);
            Draw.drawCircle(cricle10,Black,canvas);
            Draw.drawCircle(cricle11,Black,canvas);
            Draw.drawCircle(cricle12,Black,canvas);
            Draw.drawCircle(cricle13,GRAY,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerB1.contains(sX, sY) || answerA1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerC1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Gravity", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point12=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question13 = true;
                question12 = false;
                questionnum = 13;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

        //---------------------------------------------QUESTION #13-------------------------------------------------------------------
        if (question13) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 84, 18, b, canvas);
            Draw.drawText("What does Alai call Shen?", 36, 40, abig, canvas);
            Draw.drawText("A bugger lover", 34, 55, a, canvas);
            Draw.drawText("A butt wiggler", 34, 65, a, canvas);
            Draw.drawText("A jew", 34, 74, a, canvas);
            Draw.drawText("A stiff board", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, Black,canvas);
            Draw.drawCircle(cricle8, Black,canvas);
            Draw.drawCircle(cricle9, Black,canvas);
            Draw.drawCircle(cricle10,Black,canvas);
            Draw.drawCircle(cricle11,Black,canvas);
            Draw.drawCircle(cricle12,Black,canvas);
            Draw.drawCircle(cricle13,Black,canvas);
            Draw.drawCircle(cricle14,GRAY,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerC1.contains(sX, sY) || answerA1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerB1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("A butt wiggler", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point13=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question14 = true;
                question13 = false;
                questionnum = 14;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

        //---------------------------------------------QUESTION #14-------------------------------------------------------------------
        if (question14) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 84, 18, b, canvas);
            Draw.drawText("Who leaves Ender a note warning him of danger?", 30, 40, asma, canvas);
            Draw.drawText("Alai", 34, 55, a, canvas);
            Draw.drawText("Petra", 34, 65, a, canvas);
            Draw.drawText("Dink", 34, 74, a, canvas);
            Draw.drawText("Bean", 34, 84, a, canvas);
            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, Black,canvas);
            Draw.drawCircle(cricle8, Black,canvas);
            Draw.drawCircle(cricle9, Black,canvas);
            Draw.drawCircle(cricle10,Black,canvas);
            Draw.drawCircle(cricle11,Black,canvas);
            Draw.drawCircle(cricle12,Black,canvas);
            Draw.drawCircle(cricle13,Black,canvas);
            Draw.drawCircle(cricle14,Black,canvas);
            Draw.drawCircle(cricle15,GRAY,canvas);

            if (answerB1.contains(sX, sY) || answerA1.contains(sX, sY) || answerD1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerC1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Dink", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point14=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question15 = true;
                question14 = false;
                questionnum = 15;
                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

        //---------------------------------------------QUESTION #15-------------------------------------------------------------------
        if (question15) {
            canvas.drawBitmap(backgroundBmp, null, background, null);
            Draw.drawText(String.valueOf(questionnum), number, b, canvas);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 80, 18, b, canvas);
            Draw.drawText("/15", 84, 18, b, canvas);
            Draw.drawText("What does Ender do to focus?", 36, 40, a, canvas);
            Draw.drawText("Go home", 34, 55, a, canvas);
            Draw.drawText("Eat", 34, 65, a, canvas);
            Draw.drawText("Sing his favorite songs", 34, 74, a, canvas);
            Draw.drawText("Count", 34, 84, a, canvas);

            Draw.drawCircle(cricle1, Black,canvas);
            Draw.drawCircle(cricle2, Black,canvas);
            Draw.drawCircle(cricle3, Black,canvas);
            Draw.drawCircle(cricle4, Black,canvas);
            Draw.drawCircle(cricle5, Black,canvas);
            Draw.drawCircle(cricle6, Black,canvas);
            Draw.drawCircle(cricle7, Black,canvas);
            Draw.drawCircle(cricle8, Black,canvas);
            Draw.drawCircle(cricle9, Black,canvas);
            Draw.drawCircle(cricle10,Black,canvas);
            Draw.drawCircle(cricle11,Black,canvas);
            Draw.drawCircle(cricle12,Black,canvas);
            Draw.drawCircle(cricle13,Black,canvas);
            Draw.drawCircle(cricle14,Black,canvas);
            Draw.drawCircle(cricle15,Black,canvas);
            if (answerB1.contains(sX, sY) || answerA1.contains(sX, sY) || answerC1.contains(sX, sY)) {
                questionwrong = true;
            }
            if (answerD1.contains(sX, sY)) {
                questionright = true;
            }

            if (questionwrong) {
                canvas.drawBitmap(answerscreenBmp, null, answerscreen, null);
                Draw.drawText("Count", 45, 80, b, canvas);
                questionDone = true;
                questionwrong = false;
                invalidate();

            }

            if (questionright) {
                canvas.drawBitmap(correctBmp, null, correct, null);
                point15=1;
                questionDone = true;
                questionright = false;
                invalidate();
            }

            if (questionDone && arrow.contains(eX, eY)) {
                questionDone = false;
                question15 = false;

                endScreen=true;

                sX = -1;
                sY = -1;
                eX = -1;
                eY = -1;
            }
        }

//---------------------------------------------QUESTION #DONE-------------------------------------------------------------------

        if(endScreen){
            canvas.drawBitmap(doneBmp, null, background, null);
            Draw.drawText(String.valueOf(point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15), 88, 47, abigr, canvas);


            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==0){
                Draw.drawText("Wow, 0/15... That takes skill", 65, 59, a, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==1){
                Draw.drawText("Wow, 1/15... That's just awful", 65, 59, a, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==2){
                Draw.drawText("Wow, 2/15... Your odds are better", 65, 59, a, canvas);
                Draw.drawText("guessing", 68, 65, amedi, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==3){
                Draw.drawText("Wow, 3/15... Take a break and play", 65, 59, a, canvas);
                Draw.drawText("outside", 70, 65, amedi, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==4){
                Draw.drawText("Wow, 4/15... I could do better without", 65, 59, a, canvas);
                Draw.drawText("reading the book", 67, 65, amedi, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==5){
                Draw.drawText("Wow, 5/15... My grandma could do", 65, 59, a, canvas);
                Draw.drawText("better", 70, 65, a, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==6){
                Draw.drawText("Wow, 6/15... I bet that you guessed", 65, 59, a, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==7){
                Draw.drawText("Wow, 7/15... Take a break and play", 65, 59, a, canvas);
                Draw.drawText("outside", 70, 65, amedi, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==8){
                Draw.drawText("Wow, 8/15... Go work on your reading", 65, 59, a, canvas);
                Draw.drawText("comprehension", 68, 65, amedi, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==9){
                Draw.drawText("Wow, 9/15... This book is a third grade", 65, 59, a, canvas);
                Draw.drawText("reading level", 65, 59, a, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==10){
                Draw.drawText("Wow, 10/15... I'm sorry", 65, 59, a, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==11){
                Draw.drawText("Wow, 11/15... I could do better without", 65, 59, a, canvas);
                Draw.drawText("reading the book", 69, 65, amedi, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==12){
                Draw.drawText("Wow, 12/15... My grandma could do", 65, 59, a, canvas);
                Draw.drawText("better", 70, 65, a, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==13){
                Draw.drawText("Wow, 13/15... I bet that you guessed", 65, 59, a, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==14){
                Draw.drawText("Wow, 14/15... Go work on your reading", 65, 59, a, canvas);
                Draw.drawText("comprehension", 68, 65, amedi, canvas);
            }
            if (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10+point11+point12+point13+point14+point15==15){
                Draw.drawText("Wow, 15/15... This book is a third grade", 65, 59, a, canvas);
                Draw.drawText("reading level", 69, 65, amedi, canvas);
            }


            if (paypal.contains(sX,sY)){
                endScreen=false; homescreen=true;question1 = false;question2 = false;question3 = false;
                question6 = false;question7 = false;question8 = false;question9 = false;question10 = false;question11 = false;question12 = false;question13=false;
                questionDone = false;questionwrong = false;questionright = false;questionnum=0;point1=0;point2=0;point3=0;point4=0;point5=0;question5 = false;
                point6=0;point7=0;point8=0;point9=0;point10=0;point11=0;point12=0;point13=0;point14=0;point15=0;sY = -1;sX = -1;eX = -1;eY = -1;playing=false;question4 = false;question14=false;
                question15=false; invalidate();}



        }

    }
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        if(!questionDone) {
            sX = (int) event.getX();
            sY = (int) event.getY();
        }
        if(questionDone){
            eX = (int) event.getX();
            eY = (int) event.getY();
        }



        if (action == MotionEvent.ACTION_DOWN) {
            invalidate();
        }
        return false;
    }
}

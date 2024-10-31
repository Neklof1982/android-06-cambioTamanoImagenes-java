package com.example.a06_practica_cambiotamanofiguras;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ImageView view1 = findViewById(R.id.imageView1);
        ImageView view2 = findViewById(R.id.imageView2);



    }
    public boolean onTouchEvent(MotionEvent event) {

        int x = (int) event.getX();
        int y = (int) event.getY();

        ImageView view1 = findViewById(R.id.imageView1);
        ImageView view2 = findViewById(R.id.imageView2);


        if (true) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_UP:

                    int top = (int) view1.getX();
                    int izq = (int) view1.getY();
                    int width = view1.getWidth();
                    int heith = view1.getHeight();

                    if (x >= top && x <= top + width && y >= izq && y <= izq + heith) {

                        view1.setPivotX(0);
                        view1.setPivotY(0);
                        view2.setPivotX(0);
                        view2.setPivotY(0);

                        view1.setScaleX((float) 1.2);
                        view1.setScaleY((float)1.2);
                        view2.setScaleX((float) 1);
                        view2.setScaleY((float)1);



                        view1.getLayoutParams().height = heith;
                        view1.getLayoutParams().width =width;

                        Toast toast1 = Toast.makeText(this,"Puedes presionar la pantalla", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 100);
                        toast1.show();
                        //Toast.makeText(this, "Puedes presionar la pantalla" + top + "  " + izq, Toast.LENGTH_SHORT).show();
                    } else {
                        view1.setScaleX((float) 1.0);
                        view1.setScaleY((float)1.0);

                    }

                    int top2 = (int) view2.getX();
                    int izq2 = (int) view2.getY();
                    int width2 = view2.getWidth();
                    int heith2 = view2.getHeight();

                    if (x >= top2 && x <= top2 + width2 && y >= izq2 && y <= izq2 + heith2) {

                        view2.setPivotX(0);
                        view2.setPivotY(0);
                        view1.setPivotX(0);
                        view1.setPivotY(0);

                        view1.setScaleX((float) 1);
                        view1.setScaleY((float) 1);
                        view2.setScaleX((float) 1.2);
                        view2.setScaleY((float)1.2);

                        view2.getLayoutParams().height = heith2;
                        view2.getLayoutParams().width =width2;

                        //Toast toast2 = Toast.makeText(this,"Puedes presionar la pantallita", Toast.LENGTH_SHORT);
                        //toast2.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 100);
                        //toast2.show();

                    } else {
                        view2.setScaleX((float) 1.0);
                        view2.setScaleY((float)1.0);

                    }



            break;
                case MotionEvent.ACTION_DOWN:
                    //do something

                     top2 = (int) view2.getX();
                     izq2 = (int) view2.getY();
                     width2 = view2.getWidth();
                     heith2 = view2.getHeight();

                    if (x >= top2 && x <= top2 + width2 && y >= izq2 && y <= izq2 + heith2) {

                        view2.setPivotX(0);
                        view2.setPivotY(0);
                        view1.setPivotX(0);
                        view1.setPivotY(0);

                        view1.setScaleX((float) 1);
                        view1.setScaleY((float) 1);
                        view2.setScaleX((float) 1.2);
                        view2.setScaleY((float)1.2);

                        view2.getLayoutParams().height = heith2;
                        view2.getLayoutParams().width =width2;

                        Toast toast2 = Toast.makeText(this,"Puedes presionar la pantallita", Toast.LENGTH_SHORT);
                        toast2.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 100);
                        toast2.show();

                    }


                    break;

                case MotionEvent.ACTION_MOVE:
                    //do something


                    // movimiento del dedo imagen arriba
                    top = (int) view1.getY();
                    izq = (int) view1.getX();
                    width = view1.getWidth();
                    heith = view1.getHeight();

                    // movimiento del dedo imagen abajo
                    top2 = (int) view2.getY();
                    izq2 = (int) view2.getX();
                    width2 = view2.getWidth();
                    heith2 = view2.getHeight();

                    // Si esta sobre view 1
                    if (x >= top && x <= top + width && y >= izq && y <= izq + heith){
                        // Agrandar view1 y reducir view2
                        view1.setScaleX((float)1.2);
                        view1.setScaleY((float)1.2);
                        view2.setScaleX((float) 1.0);
                        view2.setScaleY((float) 1.0);
                    }
                    // Verifica si el dedo está sobre view2
                    else if (x >= izq2 && x <= izq2 + width2 && y >= top2 && y <= top2 + heith2) {
                        // Agrandar view2 y reducir view1
                        view2.setScaleX((float) 1.2);
                        view2.setScaleY((float)1.2);
                        view1.setScaleX((float) 1.0);
                        view1.setScaleY((float) 1.0);
                    }
                    /*
                    Toast toast2 = Toast.makeText(this,"Puedes subir el dedo la pantalla", Toast.LENGTH_SHORT);
                    toast2.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 500);
                    toast2.show();
                    */
                    break;
                    //Toast.makeText(this, "Puedes subir el dedo la pantalla", Toast.LENGTH_SHORT).show();



                default:
                    break;
            }


        }

        return true;

    }
}



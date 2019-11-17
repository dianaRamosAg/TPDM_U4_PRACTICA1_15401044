package mx.edu.ittepic.tpdm_u4_practica1_15401044

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import java.util.*

class Lienzo   (p:MainActivity) : View(p){

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        val imagen = BitmapFactory.decodeResource(resources,R.drawable.luna3)
        setBackgroundColor(Color.rgb(35,55,77))
        //====================Luna=======================
        c.drawBitmap(imagen,1100f,110f,p)
        //===================Estrellas===================
        var x=0
        var y=0
        (0..40).forEach() {
            x=(100..5000).random ()
            y=(0..500).random ()

            x=x+9
            y=y+11
            p.color = Color.rgb(255, 255, 255)
            c.drawCircle(x.toFloat(), y.toFloat(), 20f, p)
        }
        //===================Montañas====================
        p.color=Color.rgb(205,221,238)
        c.drawCircle(2000f,1200f,850f,p)

        p.color=Color.rgb(205,221,238)
        //p.color=Color.GREEN
        c.drawCircle(600f,1200f,650f,p)

        //==================Casas========================
        p.color=Color.rgb(187,144,113)
        c.drawRect(350f,700f,700f,880f,p)
        p.color=Color.LTGRAY
        c.drawRect(550f,800f,600f,880f,p)
        c.drawRect(400f,730f,500f,780f,p)
        p.color=Color.BLACK
        c.drawRect(600f,650f,650f,700f,p)
        //==============Casa 2=========================
        p.color=Color.rgb(187,144,113)
        c.drawRect(150f,950f,500f,1130f,p)
        p.color=Color.LTGRAY
        c.drawRect(350f,1050f,400f,1130f,p)
        c.drawRect(200f,980f,300f,1030f,p)
       p.color=Color.BLACK
        c.drawRect(400f,900f,450f,950f,p)
        //==============Casa 3=========================
        p.color=Color.rgb(187,144,113)
        c.drawRect(700f,900f,1050f,1080f,p)
        p.color=Color.LTGRAY
        c.drawRect(900f,1000f,950f,1080f,p)
        c.drawRect(750f,930f,850f,980f,p)
        p.color=Color.BLACK
        c.drawRect(950f,850f,1000f,900f,p)
//==============Casa 4=========================
        p.color=Color.rgb(187,144,113)
        c.drawRect(1500f,700f,1850f,880f,p)
        p.color=Color.LTGRAY
        c.drawRect(1700f,800f,1750f,880f,p)
        c.drawRect(1550f,730f,1650f,780f,p)
        p.color=Color.BLACK
        c.drawRect(1750f,650f,1800f,700f,p)
//==============arbol 1=========================

        p.color=Color.BLACK
        c.drawRect(150f,800f,200f,880f,p)
        p.color=Color.GREEN
        c.drawOval(100f,750f,250f,800f,p)
        c.drawOval(110f,700f,240f,750f,p)
        c.drawOval(150f,650f,200f,700f,p)
//==============arbol 2=========================

        p.color=Color.BLACK
        c.drawRect(1950f,1130f,2000f,1210f,p)
        p.color=Color.GREEN
        c.drawOval(1900f,1080f,2050f,1130f,p)
        c.drawOval(1910f,1030f,2040f,1080f,p)
        c.drawOval(1950f,980f,2000f,1030f,p)

//==============arbol 3=========================

        p.color=Color.BLACK
        c.drawRect(2300f,980f,2350f,1060f,p)
        p.color=Color.GREEN
        c.drawOval(2250f,930f,2400f,980f,p)
        c.drawOval(2260f,880f,2390f,930f,p)
        c.drawOval(2300f,830f,2350f,880f,p)

        //==============arbo 4 =========================

        p.color=Color.BLACK
        c.drawRect(2120f,800f,2170f,880f,p)
        p.color=Color.GREEN
        c.drawOval(2070f,750f,2220f,800f,p)
        c.drawOval(2080f,700f,2200f,750f,p)
        c.drawOval(2120f,650f,2170f,700f,p)

//
    }
}
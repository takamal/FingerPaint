package sample.application.fingerpaint;

import java.security.PublicKey;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.MotionEvent;

public class FingerPaintActivity extends Activity implements OnTouchListener{
	
	public Canvas canvas;
	public Paint paint;
	public Path path;
	public Bitmap bitmap;
	public Float x1;
	public Float y1;
	public Integer w;
	public Integer h;
	
//	抽象メソッドをオーバーライドしていないのでエラーがでる。
	public boolean onTouch (View v, MotionEvent event){
		return Boolean.valueOf(true);
		//プリミティブのブーリアンをボクシング、参照型のブーリアン型に変えて戻り値にする。
	}
}

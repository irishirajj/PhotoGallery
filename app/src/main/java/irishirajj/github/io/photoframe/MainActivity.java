package irishirajj.github.io.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView pic;
    TextView status;
    int currentImage=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void prev(View v){
        String idx ="pic"+currentImage;
        int x =this.getResources().getIdentifier(idx, "id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);
        currentImage=(7+currentImage-1)%7;
        String idy="pic"+currentImage;
        int y = this.getResources().getIdentifier(idy,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        status=findViewById(R.id.status);
        status.setText(pic.getContentDescription().toString());
    }
    public void next(View v){
        String idx ="pic"+currentImage;
        int x =this.getResources().getIdentifier(idx, "id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);
        currentImage=(currentImage+1)%7;
        String idy="pic"+currentImage;
        int y = this.getResources().getIdentifier(idy,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
        status=findViewById(R.id.status);
        status.setText(pic.getContentDescription().toString());

    }
}
package com.yuxuan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView block;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.btn_goto).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "https://m.sogou.com/web/id=8389ba1f-248a-4f5c-b29c-676f565f3b85/keyword=Miami%20University%20%E5%AE%98%E7%BD%91/sec=251PB-fcpYC9WYLt3a8_XA../jump_from=1_01_22_01/entryScene=001/entryTime=1680074284160/tc?clk=2&url=http%3A%2F%2Fwww.mid.muohio.edu%2F&pcurl=http%3A%2F%2Fwww.mid.muohio.edu%2F&pid=sogou-mobb-ba7c5aeabab9e58d&dp=1&rcer=g9PEmODOBvITXzvvR&jump_from=1_01_22_01&entryTime=1680074284160&entryScene=001&is_per=0&pno=1&vrid=30000000&wml=1&linkid=summary&clickTime=1680074297001&mcv=30&pcl=337,504&sed=0&ml=8&sct=98";
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//            }
//        });

        block = findViewById(R.id.img_block);

        findViewById(R.id.btn_up).setOnClickListener(v -> {
            int x = (int)block.getX();
            int y = (int)block.getY() - 10;
            block.layout(x, y, x + block.getWidth(), y + block.getHeight());
        });

        findViewById(R.id.btn_down).setOnClickListener(v -> {
            int x = (int)block.getX();
            int y = (int)block.getY() + 10;
            block.layout(x, y , x + block.getWidth(), y + block.getHeight());
        });

        findViewById(R.id.btn_left).setOnClickListener(v -> {
            int x = (int)block.getX() - 10;
            int y = (int)block.getY();
            block.layout(x, y , x + block.getWidth(), y + block.getHeight());
        });

        findViewById(R.id.btn_right).setOnClickListener(v -> {
            int x = (int)block.getX() + 10;
            int y = (int)block.getY();
            block.layout(x, y , x + block.getWidth(), y + block.getHeight());
        });
    }
}
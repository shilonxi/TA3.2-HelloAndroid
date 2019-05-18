package android.shilon.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;
    //定义变量

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //调用父类的onCreate构造函数
        //savedInstanceState是保存当前Activity的状态信息
        setContentView(R.layout.main_layout);
        //设置一个Activity的显示界面
        //R.java可以理解成是当前Android应用的资源字典
        textView=findViewById(R.id.hello);
        editText=findViewById(R.id.input);
        button=findViewById(R.id.button);
        //获取实例
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //重写注解
            public void onClick(View view) {
                String string=editText.getText().toString();
                //得到当前编辑文本的内容
                textView.setText(string);
                //显示内容
            }
        });
        //匿名内部类作为事件监听器类
    }
}

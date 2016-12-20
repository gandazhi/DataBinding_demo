package com.gandazhi.databinding_demo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gandazhi.databinding_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user = new User("gandazhi");
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * DataBinding类生成的规则
         * 如下xml文件为activity_main
         * 下划线前的首字母大写，下划线之后的首字母大写
         * 所有生成的类都会有Binding后缀
         */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user);
        //binding.setVariable(BR.user,user);
        binding.setPresenter(new Presenter());
    }

    public class Presenter {
        public void onClick_tv(View view) {
            Toast.makeText(MainActivity.this, "onClick", Toast.LENGTH_LONG).show();
            user.setBtn_name("改变TextView");
        }
        public void onClick_btn(View view){
            user.setName("new demo");
        }

    }
}

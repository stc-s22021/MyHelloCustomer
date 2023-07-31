package jp.suntech.s22021.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ボタン・オブジェクトの用意
        Button btClick=findViewById(R.id.btClick);
        //リスナオブジェクトの用意
        HellowListener listener=new HellowListener();
        btClick.setOnClickListener(listener);

        //クリアボタンであるButtonobjectを取得
        Button btClear=findViewById(R.id.btClear);
        //クリアボタンにリスナを追加
        btClear.setOnClickListener(listener);

        //クリアボタン2であるButtonobjectを取得
        Button btClear2=findViewById(R.id.btClear2);
        //クリアボタン2にリスナを追加
        btClear2.setOnClickListener(listener);




    }
    //ボタンクリックした時のリスナクラス
    private class HellowListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText  input =findViewById(R.id.etName);
            EditText  input2 =findViewById(R.id.etName2);

            TextView output=findViewById(R.id.tvOutput);
            TextView output2=findViewById(R.id.tvOutput);

            int id= v.getId();


            if (id==R.id.btClick){

                String inputStr=input.getText().toString();

                String inputStr2=input2.getText().toString();

                String inputText = (inputStr2+"にお住いの"+inputStr+"さん、こんにちは！");
                Snackbar.make(v,inputText, Snackbar.LENGTH_LONG).show();
                //output.setText(inputStr2+"にお住いの"+inputStr+"さん、こんにちは！");

            }

            else if(id==R.id.btClear){
                input.setText("");

                output.setText("");

            }
            else if(id==R.id.btClear2){
                input2.setText("");

                output2.setText("");

            }



        }
    }


}
package com.example.ctp_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        final AlertDialog.Builder mydialog = new AlertDialog.Builder(this);
        mydialog.setTitle("Thông Báo");

        Button btn_Thoat = (Button)findViewById(R.id.btn_Thoat);
        Button btn_DangNhap = (Button)findViewById(R.id.btn_DangNhap);
        final CheckBox cb_LuuThongTin = (CheckBox)findViewById(R.id.cb_LuuThongTin);

        btn_DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(cb_LuuThongTin.isChecked()){
                    s = "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu";
                }
                else{
                    s = "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu";
                }

                mydialog.setMessage(s);
                AlertDialog alertDialog = mydialog.create();
                alertDialog.show();
            }
        });

        btn_Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydialog.setMessage("Bạn có muốn thoát không");
                mydialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                mydialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alertDialog = mydialog.create();
                alertDialog.show();
            }
        });
    }
}

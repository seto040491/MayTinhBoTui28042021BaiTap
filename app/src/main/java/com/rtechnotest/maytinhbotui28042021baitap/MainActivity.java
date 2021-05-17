package com.rtechnotest.maytinhbotui28042021baitap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mSoThuNhat, mSoThuHai;
    TextView mKetQua;
    Button mCong, mTru, mNhan, mChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mSoThuNhat = findViewById(R.id.editTextSoThuNhat);
    mSoThuHai = findViewById(R.id.editTextSoThuHai);
    mKetQua = findViewById(R.id.editTextKetQua);
    mCong = findViewById(R.id.editTextCong);
    mTru = findViewById(R.id.editTextTru);
    mNhan = findViewById(R.id.editTextNhan);
    mChia = findViewById(R.id.editTextChia);

    mCong.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String textSoThuNhat = mSoThuNhat.getText().toString();
            String textSoThuHai = mSoThuHai.getText().toString();
            if (textSoThuNhat.isEmpty() || textSoThuNhat.length() == 0 || textSoThuNhat.equals("") || textSoThuNhat  == null) {
                Toast.makeText(MainActivity.this, "Hãy nhập số thứ nhất", Toast.LENGTH_SHORT).show();
            } else if (textSoThuHai.isEmpty() || textSoThuHai.length() == 0 || textSoThuHai.equals("") || textSoThuHai == null) {
                Toast.makeText(MainActivity.this, "Hãy nhập số thứ hai", Toast.LENGTH_SHORT).show();
            } else {
                int valueSoThuNhhat = Integer.parseInt(textSoThuNhat);
                int valueSoThuHai = Integer.parseInt(textSoThuHai);
                int ketQua = valueSoThuNhhat + valueSoThuHai;
                mKetQua.setText("Kết Quả = " + ketQua);
            }
        }
    });
        mTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textSoThuNhat = mSoThuNhat.getText().toString();
                String textSoThuHai = mSoThuHai.getText().toString();
                if (textSoThuNhat.isEmpty() || textSoThuNhat.length() == 0 || textSoThuNhat.equals("") || textSoThuNhat  == null) {
                    Toast.makeText(MainActivity.this, "Hãy nhập số thứ nhất", Toast.LENGTH_SHORT).show();
                } else if (textSoThuHai.isEmpty() || textSoThuHai.length() == 0 || textSoThuHai.equals("") || textSoThuHai == null) {
                    Toast.makeText(MainActivity.this, "Hãy nhập số thứ hai", Toast.LENGTH_SHORT).show();
                } else {
                    int valueSoThuNhhat = Integer.parseInt(textSoThuNhat);
                    int valueSoThuHai = Integer.parseInt(textSoThuHai);
                    int ketQua = valueSoThuNhhat - valueSoThuHai;
                    mKetQua.setText("Kết Quả = " + ketQua);
                }
            }
        });
        mNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textSoThuNhat = mSoThuNhat.getText().toString();
                String textSoThuHai = mSoThuHai.getText().toString();
                if (textSoThuNhat.isEmpty() || textSoThuNhat.length() == 0 || textSoThuNhat.equals("") || textSoThuNhat  == null) {
                    Toast.makeText(MainActivity.this, "Hãy nhập số thứ nhất", Toast.LENGTH_SHORT).show();
                } else if (textSoThuHai.isEmpty() || textSoThuHai.length() == 0 || textSoThuHai.equals("") || textSoThuHai == null) {
                    Toast.makeText(MainActivity.this, "Hãy nhập số thứ hai", Toast.LENGTH_SHORT).show();
                } else {
                    int valueSoThuNhhat = Integer.parseInt(textSoThuNhat);
                    int valueSoThuHai = Integer.parseInt(textSoThuHai);
                    int ketQua = valueSoThuNhhat * valueSoThuHai;
                    mKetQua.setText("Kết Quả = " + ketQua);
                }
            }
        });
        mChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textSoThuNhat = mSoThuNhat.getText().toString();
                String textSoThuHai = mSoThuHai.getText().toString();
                if (textSoThuNhat.isEmpty() || textSoThuNhat.length() == 0 || textSoThuNhat.equals("") || textSoThuNhat  == null) {
                    Toast.makeText(MainActivity.this, "Hãy nhập số thứ nhất", Toast.LENGTH_SHORT).show();
                } else if (textSoThuHai.isEmpty() || textSoThuHai.length() == 0 || textSoThuHai.equals("") || textSoThuHai == null) {
                    Toast.makeText(MainActivity.this, "Hãy nhập số thứ hai", Toast.LENGTH_SHORT).show();
                } else {
                    int valueSoThuNhhat = Integer.parseInt(textSoThuNhat);
                    int valueSoThuHai = Integer.parseInt(textSoThuHai);
                    if (valueSoThuHai != 0) {
                        int ketQua = valueSoThuNhhat / valueSoThuHai;
                        mKetQua.setText("Kết Quả = " + ketQua);}
                    else
                        Toast.makeText(MainActivity.this, "Không thể chia cho 0", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
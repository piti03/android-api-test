package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // define viewBinding
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       binding = ActivityMainBinding.inflate(getLayoutInflater());
       View view = binding.getRoot();
        super.onCreate(savedInstanceState);

    // Define some strings

        // set the bottom off
        binding.button.setOnClickListener(v -> {
            String username = binding.request1.getText().toString();
            String password = binding.request2.getText().toString();
            if(username.isEmpty() && password.isEmpty()){
                Toast.makeText(this, "Please fill the parameters! first", Toast.LENGTH_SHORT).show();
            }else {
                
                // you must write your codes here....
                @SuppressLint("DefaultLocale") String URL = String.format("https://localhost/myweb?username=%s&password=%s",username,password);
                RequestQueue requestQueue = Volley.newRequestQueue(this);
                StringRequest stringRequest = new StringRequest(Request.Method.GET, URL,
                        response -> {
                            binding.result.setText(response);
                        }, error -> {
                            binding.result.setText(error.toString());
                });
                requestQueue.add(stringRequest);



            }
        });



        setContentView(view);
    }

}
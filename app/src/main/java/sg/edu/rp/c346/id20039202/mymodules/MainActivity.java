package sg.edu.rp.c346.id20039202.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvModule1;
    TextView tvModule2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvModule1 = findViewById(R.id.textViewModule1);
        tvModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerMyModules.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcademicYear", "2021");
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);

            }
        });

        tvModule2 = findViewById(R.id.textViewModule2);
        tvModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerMyModules.class);
                intent.putExtra("ModuleCode", "C203");
                intent.putExtra("ModuleName", "Web Development in PHP");
                intent.putExtra("AcademicYear", "2021");
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W67M");
                startActivity(intent);

            }
        });
    }
}
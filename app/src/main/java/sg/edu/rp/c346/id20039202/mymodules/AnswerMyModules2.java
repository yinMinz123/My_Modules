package sg.edu.rp.c346.id20039202.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerMyModules2 extends AppCompatActivity {
    TextView tvModuleCode;
    TextView tvModuleName;
    TextView tvAcademicYear;
    TextView tvSemester;
    TextView tvModuleCredit;
    TextView tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_my_modules2);

        tvModuleCode = findViewById(R.id.textViewModuleCode);
        tvModuleName = findViewById(R.id.textViewModuleName);
        tvAcademicYear = findViewById(R.id.textViewAcademicYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvModuleCredit = findViewById(R.id.textViewModuleCredit);
        tvVenue = findViewById(R.id.textViewVenue);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        String ModuleCode = intentReceived.getStringExtra("ModuleCode");
        String ModuleName = intentReceived.getStringExtra("ModuleName");
        int AcademicYear = intentReceived.getIntExtra("AcademicYear", 2021);
        int Semester = intentReceived.getIntExtra("Semester", 1);
        int ModuleCredit = intentReceived.getIntExtra("ModuleCredit", 4);
        String Venue = intentReceived.getStringExtra("Venue");

        tvModuleCode.setText("Module Code: " + ModuleCode);
        tvModuleName.setText("Module Name: " + ModuleName);
        tvAcademicYear.setText("Academic Year: " + AcademicYear);
        tvSemester.setText("Semester: " + Semester);
        tvModuleCredit.setText("Module Credit: " + ModuleCredit);
        tvVenue.setText("Venue: " + Venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}
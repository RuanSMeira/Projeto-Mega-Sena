package br.gov.sp.cps.ProjMegaSena;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public TextView[] gerarLista(){
        TextView txtNum1 = findViewById(R.id.txtNum1);
        TextView txtNum2 = findViewById(R.id.txtNum2);
        TextView txtNum3 = findViewById(R.id.txtNum3);
        TextView txtNum4 = findViewById(R.id.txtNum4);
        TextView txtNum5 = findViewById(R.id.txtNum5);
        TextView txtNum6 = findViewById(R.id.txtNum6);

        return new TextView[]{txtNum1, txtNum2, txtNum3, txtNum4, txtNum5, txtNum6};
    }

    public void sorteioNumeros(View view){
        TextView[] textViews = gerarLista();

        for (int i = 0; i < textViews.length; i++) {
            int numeroSorteado = (int) (Math.random() * 60) + 1;
            textViews[i].setText(String.valueOf(numeroSorteado));
        }
    }

    public void limparNumeros(View view) {
        TextView[] textViews = gerarLista();

        for (int i = 0; i < textViews.length; i++) {
            if (!textViews[i].getText().toString().equals("--")) {
                textViews[i].setText("--");
            }
        }
    }

}
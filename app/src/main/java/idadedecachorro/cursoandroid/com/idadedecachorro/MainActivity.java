package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoDigitado = caixaTexto.getText().toString();

                if (textoDigitado.isEmpty()){
                    resultadoIdade.setText("Nenhum numero digitado.");
                } else {
                    Integer resultado = Integer.parseInt(textoDigitado) * 7;
                    resultadoIdade.setText("A idade do cachorro em anos humanos é: " + resultado + " anos");
                }
            }
        });
    }
}

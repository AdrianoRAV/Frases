package com.mora.frasesparadia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {

                "As montanhas da vida não existem apenas para que você chegue no topo, mas para que você aprenda o valor da escalada.",
                "A vida pode até te derrubar, mas é você quem escolhe a hora de se levantar.\n" +
                        "Mr. Han - Karate Kid (2010)",
                "É melhor ser verdadeiro e solitário do que viver em falsidade e estar sempre acompanhado.",
                "Na minha vida até agora, descobri que na verdade só há dois tipos de pessoas: aqueles que estão com você, e aqueles que estão contra você. Aprenda a reconhecê-los, pois eles são frequentemente e facilmente confundidos um com o outro.\n" +
                        "Lemmy Kilmister - Motörhead",
                "Ser feliz não é ter uma vida perfeita, mas sim reconhecer que vale a pena viver apesar de todos os desafios e perdas.",
                "Aprendi que não devo me importar com comentários que não vão mudar minha vida.\n" +
                        "Jô Soares",
                "A vida tem sons, que pra gente ouvir precisa aprender a começar de novo. É como tocar o mesmo violão e nele compor uma nova canção.\n" +
                        "Roupa Nova",
                "Na vida irás encontrar três tipos de pessoas: aquelas que irão mudar a tua vida, aquelas que irão prejudicar a tua vida, aquelas que serão a tua vida.",
                "A vida é basicamente uma montanha russa. Tem seus altos e baixos, e o mais importante: você tem que fazer o ingresso valer a pena.",
                "O mundo está nas mãos daqueles que têm a coragem de sonhar e de correr o risco de viver seus sonhos.\n" +
                        "Paulo Coelho",
                "Deus sabe quem colocar na sua vida, da mesma forma que sabe quem tirar.",
                "Não viva para que sua presença seja notada, mas para que sua falta seja sentida.\n" +
                        "Bob Marley",
                "Um novo dia é uma página em branco na sua vida. Escreva apenas o que vale a pena. Bom dia!",
                "Passamos a vida procurando em pessoas o que só podemos encontrar em Deus.",
                "...bom mesmo é ir à luta com determinação, abraçar a vida com paixão, perder com classe e vencer com ousadia, porque o mundo pertence a quem se atreve e a vida é muito pra ser insignificante.\n" +
                        "Augusto Branco",
                "A vida é como andar de bicicleta. Para ter equilíbrio, você tem que se manter em movimento...\n" +
                        "Albert Einstein",
                "O segredo do perdão é olhar sem julgamento.\n" +
                        "O segredo da fé é procurar as provas.\n" +
                        "O segredo do carisma é olhar com amor.\n" +
                        "O segredo da saúde é a alegria.\n" +
                        "O segredo da força é a vontade.\n" +
                        "O segredo do amor é a inteligência.\n" +
                        "O segredo do destino feliz é ficar no melhor.\n" +
                        "O segredo do equilíbrio é buscar o espiritual.\n" +
                        "A vida tem seus segredos, mas, para quem está atento, fica fácil descobri-los.\n" +
                        "Zíbia Gasparetto",
                "Viva o hoje, pois o ontem já se foi, e o amanhã talvez não venha.",
                "Não corra atrás de um alguém que demonstra viver bem sem você.",
                "Deus nos concede, a cada dia, uma página de vida nova no livro do tempo. Aquilo que colocarmos nela, corre por nossa conta.",

        };
        int numero = new Random().nextInt(20);//0 1 2 3 4 5 ...

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }

}
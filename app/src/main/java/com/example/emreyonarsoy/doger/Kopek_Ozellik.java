package com.example.emreyonarsoy.doger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Kopek_Ozellik extends AppCompatActivity {
TextView mDetailTv;
ImageView imageView;
TextView diger_adlar;
TextView renkler;
TextView cikis_yeri;
TextView cikis_tarihi;
TextView familya;
TextView orjinal_islevi;
TextView gunumuzdeki_islevi;
TextView ortalama_omru;
TextView kilo;
TextView boy;
TextView aciklama;
ScrollView scrollView2;
ScrollView scrollView3;
ScrollView scrollView4;
ActionBar actionBar;

ImageView egzersiz_ihtiyaci;
ImageView enerji;
ImageView taranma_ihtiyaci;
ImageView egitilebilirlik;
ImageView oyunculuk;
ImageView sicakkanlilik;
ImageView korunma;
ImageView kopeklerle_dostluk;
ImageView hayvanlarla_dostluk;
ImageView cocuklarla_dostluk;
ImageView yabancilarla_dostluk;
ImageView sicaga_dayaniklilik;
ImageView soguga_dayaniklilik;
ImageView bekcilik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopek__ozellik);

        actionBar = getSupportActionBar();
        mDetailTv = findViewById(R.id.textDogName);

        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("actionBarTitle");
        actionBar.setTitle(mActionBarTitle);
        mDetailTv.setText(mContent);
        ozellik();
    }



    public void genel_calistir(View view){
        scrollView2 = findViewById(R.id.scrollView2);
        scrollView3 = findViewById(R.id.scrollView3);
        scrollView4 = findViewById(R.id.scrollView4);

        if (scrollView2.getVisibility() == View.INVISIBLE){
            scrollView3.setVisibility(View.INVISIBLE);
            scrollView4.setVisibility(View.INVISIBLE);
            scrollView2.setVisibility(View.VISIBLE);
        }
    }


    public void seviyeler_calistir(View view){
        scrollView2 = findViewById(R.id.scrollView2);
        scrollView3 = findViewById(R.id.scrollView3);
        scrollView4 = findViewById(R.id.scrollView4);

        if (scrollView4.getVisibility()== View.INVISIBLE ){
            scrollView2.setVisibility(View.INVISIBLE);
            scrollView3.setVisibility(View.INVISIBLE);
            scrollView4.setVisibility(View.VISIBLE);
        }
    }


    public void aciklama_calistir(View view){
        scrollView2 = findViewById(R.id.scrollView2);
        scrollView3 = findViewById(R.id.scrollView3);
        scrollView4 = findViewById(R.id.scrollView4);

        if (scrollView3.getVisibility() == View.INVISIBLE ){
            scrollView2.setVisibility(View.INVISIBLE);
            scrollView4.setVisibility(View.INVISIBLE);
            scrollView3.setVisibility(View.VISIBLE);

        }
    }


    public void ozellik(){

        /*-------------------------------------- TANITIMLAR --------------------------------------*/
            mDetailTv = findViewById(R.id.textDogName);
            imageView = findViewById(R.id.imageView);

            diger_adlar = findViewById(R.id.diger_adlar);
            renkler = findViewById(R.id.renkler);
            cikis_yeri = findViewById(R.id.cikis_yeri);
            cikis_tarihi = findViewById(R.id.cikis_tarihi);
            familya = findViewById(R.id.familya);
            orjinal_islevi = findViewById(R.id.orjinal_islevi);
            gunumuzdeki_islevi = findViewById(R.id.gunumuzdeki_islevi);
            ortalama_omru = findViewById(R.id.ortalama_omru);
            kilo = findViewById(R.id.kilo);
            boy = findViewById(R.id.boy);
            aciklama = findViewById(R.id.aciklama);

            egzersiz_ihtiyaci = findViewById(R.id.egzersiz_ihtiyaci);
            enerji = findViewById(R.id.enerji);
            taranma_ihtiyaci = findViewById(R.id.taranma_ihtiyaci);
            egitilebilirlik = findViewById(R.id.egitilebilirlik);
            oyunculuk = findViewById(R.id.oyunculuk);
            sicakkanlilik = findViewById(R.id.sicakkanlilik);
            korunma = findViewById(R.id.korunma);
            kopeklerle_dostluk = findViewById(R.id.kopeklerle_dostluk);
            hayvanlarla_dostluk = findViewById(R.id.hayvanlarla_dostluk);
            cocuklarla_dostluk = findViewById(R.id.cocuklarla_dostluk);
            yabancilarla_dostluk = findViewById(R.id.yabancilarla_dostluk);
            sicaga_dayaniklilik = findViewById(R.id.sicaga_dayaniklilik);
            soguga_dayaniklilik = findViewById(R.id.soguga_dayaniklilik);
            bekcilik = findViewById(R.id.bekcilik);
        /*-------------------------------------- TANITIMLAR --------------------------------------*/


        if (mDetailTv.getText().equals("Affenpinscher")){

            imageView.setImageResource(R.drawable.affenpinscher);
            /*------------- GENEL BAŞLANGIÇ -------------*/
                diger_adlar.setText("Maymun Pinscher, Maymun Pinçhır");
                renkler.setText("Siyah; gri; gümü; siyah ve bronz");
                cikis_yeri.setText("Almanya");
                cikis_tarihi.setText("1600'ler");
                familya.setText("Terrier, pinscher");
                orjinal_islevi.setText("Böcek, küçük haşere ve fare avı, kucak köpeği");
                gunumuzdeki_islevi.setText("Arkadaş, rehber");
                ortalama_omru.setText("12-14 yıl");
                kilo.setText("3-4/3-4 kg");
                boy.setText("3-29/23-29 cm");
            /*------------- GENEL BİTİŞ -------------*/
            /*///////////////////////////////////////////////////////////////////////////////////////////////*/
            /*------------- SEVİYELER BAŞLANGIÇ -------------*/
                egzersiz_ihtiyaci.setImageResource(R.drawable.yuzde60);
                enerji.setImageResource(R.drawable.yuzde80);
                taranma_ihtiyaci.setImageResource(R.drawable.yuzde80);
                egitilebilirlik.setImageResource(R.drawable.yuzde40);
                oyunculuk.setImageResource(R.drawable.yuzde80);
                sicakkanlilik.setImageResource(R.drawable.yuzde80);
                korunma.setImageResource(R.drawable.yuzde40);
                kopeklerle_dostluk.setImageResource(R.drawable.yuzde60);
                hayvanlarla_dostluk.setImageResource(R.drawable.yuzde60);
                cocuklarla_dostluk.setImageResource(R.drawable.yuzde60);
                yabancilarla_dostluk.setImageResource(R.drawable.yuzde60);
                sicaga_dayaniklilik.setImageResource(R.drawable.yuzde60);
                soguga_dayaniklilik.setImageResource(R.drawable.yuzde40);
                bekcilik.setImageResource(R.drawable.yuzde100);
            /*------------- SEVİYELER BİTİŞ -------------*/
            /*///////////////////////////////////////////////////////////////////////////////////////////////*/
            /*------------- AÇIKLAMA BAŞLANGIÇ-------------*/
                aciklama.setText("Terrierler ile akrabalıkları vardır.Almanca \"Affen\" kelimesi maymun, \"pinscher\" ise terrier anlamına gelmektedir. \n" +
                    "Fransada ise bu ırk bıyıklı küçük şeytan anlamına gelen \"diablotin moustachu\" olarak bilinmektedir. \n" +
                    "Bilinen en eski süs köpekleridirler ancak kökenleri tam olarak bilinmemektedir. Orta Avrupa'da 17.yüzyılda mutfak ve ahırları farelerden korumakla görevliydiler.\n" +
                    "Tam bir kucak köpeği oldukları için bayanlar tarafından tercih edilen bu ırk zaman içinde Pug ,German Pincher ve German Silky Pincherle çiftleşerek daha da geliştirilmiştir.\n" +
                    "1936'da Affenpinscher AKC tarafından ırk olarak kabul edilmiştir.Günümüze Amerika'da ve anavatanı kabul edilen Almanya'da bile nadir görülen bir köpek haline gelmiştir.\n" +
                    "Apartman yaşamına uygundurlar,dışarıda oyun oynamaktan hoşlanırlar fakat ev dışında yaşayamazlar.\n" +
                    "Aktif ve enerjik bir köpektir egzersiz ihtiyaçları günlük kısa yürüyüşler ile karşılanabilir.Merakklı cesur inatçı ve hareketlidirler.\n" +
                    "Fare ve sıçan avlamayı severler,ilgi çekmeyi tırmanmayı ve havlamayı severler.\n" +
                    "Diğer köpeklerle ve hayvanlarla iyi geçinirler.Sahiplerine ve dostlarına karşı sadıktırlar.Tehdit oluşturan durumlarda atılgan ve korkusuzdurlar.");
            /*------------- AÇIKLAMA BİTİŞ -------------*/
            /*///////////////////////////////////////////////////////////////////////////////////////////////*/

        }
        if (mDetailTv.getText().equals("Afgan Tazısı")){

            imageView.setImageResource(R.drawable.afgan_tazisi_icon);
            /*------------- GENEL BAŞLANGIÇ -------------*/
            diger_adlar.setText("");
            renkler.setText("");
            cikis_yeri.setText("");
            cikis_tarihi.setText("");
            familya.setText("");
            orjinal_islevi.setText("");
            gunumuzdeki_islevi.setText("");
            ortalama_omru.setText("");
            kilo.setText("");
            boy.setText("");
            /*------------- GENEL BİTİŞ -------------*/
            /*///////////////////////////////////////////////////////////////////////////////////////////////*/
            /*------------- SEVİYELER BAŞLANGIÇ -------------*/
            egzersiz_ihtiyaci.setImageResource(R.drawable.yuzde60);
            enerji.setImageResource(R.drawable.yuzde80);
            taranma_ihtiyaci.setImageResource(R.drawable.yuzde80);
            egitilebilirlik.setImageResource(R.drawable.yuzde40);
            oyunculuk.setImageResource(R.drawable.yuzde80);
            sicakkanlilik.setImageResource(R.drawable.yuzde80);
            korunma.setImageResource(R.drawable.yuzde40);
            kopeklerle_dostluk.setImageResource(R.drawable.yuzde60);
            hayvanlarla_dostluk.setImageResource(R.drawable.yuzde60);
            cocuklarla_dostluk.setImageResource(R.drawable.yuzde60);
            yabancilarla_dostluk.setImageResource(R.drawable.yuzde60);
            sicaga_dayaniklilik.setImageResource(R.drawable.yuzde60);
            soguga_dayaniklilik.setImageResource(R.drawable.yuzde40);
            bekcilik.setImageResource(R.drawable.yuzde100);
            /*------------- SEVİYELER BİTİŞ -------------*/
            /*///////////////////////////////////////////////////////////////////////////////////////////////*/
            /*------------- AÇIKLAMA BAŞLANGIÇ-------------*/
            aciklama.setText("");
            /*------------- AÇIKLAMA BİTİŞ -------------*/
            /*///////////////////////////////////////////////////////////////////////////////////////////////*/

        }
        if (mDetailTv.getText().equals("Aidi")){

        }
        if (mDetailTv.getText().equals("Ainu")){

        }
    }
}

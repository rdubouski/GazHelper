package com.xramzzzesx.gazhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WhatToDoText extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_to_do_text);

        textView = (TextView) findViewById(R.id.text_help);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            if (bundle.get("btn").toString().equals("btn_gkv")) {
                textView.setText("•\tустановить все краны на внутриквартирном газопроводе и газоиспользующем оборудовании в положение «закрыто»;\n" +
                        "•\tорганизовать постоянное проветривание помещения (открыть окна, двери);\n" +
                        "•\t не зажигать спичек, не включать и не выключать электроприборы, электроосвещение, не пользоваться электрозвонком, домофоном,  телефонами, не курить;\n" +
                        "•\tпозвонить 104\n");
            }
            if (bundle.get("btn").toString().equals("btn_gp")) {
                textView.setText("•\tдождитесь (организуйте дежурство до приезда аварийной бригады)\n" +
                        "•\tне зажигать спичек, не включать и не выключать электроприборы, электроосвещение, не пользоваться электрозвонком, домофоном, телефонами, не курить\n" +
                        "•\tв подъезде ( открыть окна, двери- проветривание)\n" +
                        "•\tоколо подъезда ( двери в подъезд, подвал-закрыть)\n" +
                        "•\tесли в подвале  предупредить людей, если они находятся в подвале, о немедленном выходе из него\n" +
                        "•\tпозвонить 104\n");
            }
            if (bundle.get("btn").toString().equals("btn_gpod")) {
                textView.setText("•\tдождитесь (организуйте дежурство до приезда аварийной бригады)\n" +
                        "•\tне зажигать спичек, не включать и не выключать электроприборы, электроосвещение, не пользоваться электрозвонком, домофоном, телефонами, не курить\n" +
                        "•\tв подъезде ( открыть окна, двери- проветривание)\n" +
                        "•\tоколо подъезда ( двери в подъезд, подвал-закрыть)\n" +
                        "•\tесли в подвале  предупредить людей, если они находятся в подвале, о немедленном выходе из него\n" +
                        "•\tпозвонить 104\n");
            }
            if (bundle.get("btn").toString().equals("btn_gy")) {
                textView.setText("•\tудалить посторонних лиц из загазованной зоны,\n" +
                        "•\tорганизовать дежурство до приезда специальной аварийной автомашины;\n" +
                        "•\tне допускать курения,\n" +
                        "•\tпользования открытым огнем;\n" +
                        "•\tмобильным телефоном.\n" +
                        "•\tпозвонить 104\n");
            }
            if (bundle.get("btn").toString().equals("btn_gbk")) {
                textView.setText("Скоро появится!");
            }
            if (bundle.get("btn").toString().equals("btn_gby")) {
                textView.setText("Скоро появится!");
            }
            if (bundle.get("btn").toString().equals("btn_nogk")) {
                textView.setText("Скоро появится!");
            }
            if (bundle.get("btn").toString().equals("btn_one")) {
                textView.setText("Скоро появится!");
            }
            if (bundle.get("btn").toString().equals("btn_medic")) {
                textView.setText("Скоро появится!");
            }
        }

    }
}
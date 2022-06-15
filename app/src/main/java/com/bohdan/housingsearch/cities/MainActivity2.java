package com.bohdan.housingsearch.cities;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bohdan.housingsearch.R;


public class MainActivity2 extends Activity implements View.OnClickListener {


    TextView tv3, tv4, tv5, rooms1, numbstoreys1, floors1, typehouses1, textView;
    WebView webview;
    String s2, s3, s4, s5, s6, s7;
    Button find;
    ImageView imageView3, imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("name").toString();
        tv3 = (TextView) findViewById(R.id.tv3);
        tv3.setText(name + " в якому місті ви шукаєте житло в аренду?");
        tv4 = (TextView) findViewById(R.id.tv4);
        tv4.setOnCreateContextMenuListener(this);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv5.setOnCreateContextMenuListener(this);
        tv5.setVisibility(View.INVISIBLE);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        rooms1 = (TextView) findViewById(R.id.rooms1);
        rooms1.setVisibility(View.INVISIBLE);
        rooms1.setOnCreateContextMenuListener(this);
        numbstoreys1 = (TextView) findViewById(R.id.numbstoreys1);
        numbstoreys1.setVisibility(View.INVISIBLE);
        numbstoreys1.setOnCreateContextMenuListener(this);
        floors1 = (TextView) findViewById(R.id.floors1);
        floors1.setVisibility(View.INVISIBLE);
        floors1.setOnCreateContextMenuListener(this);
        typehouses1 = (TextView) findViewById(R.id.typehouses1);
        typehouses1.setVisibility(View.INVISIBLE);
        typehouses1.setOnCreateContextMenuListener(this);
        find = (Button) findViewById(R.id.find);
        find.setOnClickListener(this);
        webview = findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);

    }

    private class MyWebViewClient extends WebViewClient {
        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v.getId() == R.id.tv4)
            getMenuInflater().inflate(R.menu.cities, menu);
        if (v.getId() == R.id.tv5)
            getMenuInflater().inflate(R.menu.types, menu);
        if (v.getId() == R.id.rooms1)
            getMenuInflater().inflate(R.menu.rooms, menu);
        if (v.getId() == R.id.numbstoreys1)
            getMenuInflater().inflate(R.menu.numberofstoreys, menu);
        if (v.getId() == R.id.floors1)
            getMenuInflater().inflate(R.menu.floor, menu);
        if (v.getId() == R.id.typehouses1)
            getMenuInflater().inflate(R.menu.typehouse, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.city1:
                tv4.setText(R.string.dnieper);
                s2 = "Дніпро";
                tv5.setVisibility(View.VISIBLE);
                break;
            case R.id.city2:
                tv4.setText(R.string.zaporizhzhia);
                s2 = "Запоріжжя";
                tv5.setVisibility(View.VISIBLE);
                break;
            case R.id.city3:
                tv4.setText(R.string.nikolaev);
                s2 = "Миколаїв";
                tv5.setVisibility(View.VISIBLE);
                break;
            case R.id.city4:
                tv4.setText(R.string.poltava);
                s2 = "Полтава";
                tv5.setVisibility(View.VISIBLE);
                break;
            case R.id.city5:
                tv4.setText(R.string.kharkov);
                s2 = "Харків";
                tv5.setVisibility(View.VISIBLE);
                break;
            case R.id.type1:
                tv5.setText(R.string.apartaments);
                s3 = "Квартира";
                rooms1.setVisibility(View.VISIBLE);
                numbstoreys1.setVisibility(View.VISIBLE);
                floors1.setVisibility(View.VISIBLE);
                typehouses1.setVisibility(View.INVISIBLE);
                break;
            case R.id.type2:
                tv5.setText(R.string.houses);
                s3 = "Дім";
                rooms1.setVisibility(View.VISIBLE);
                typehouses1.setVisibility(View.VISIBLE);
                floors1.setVisibility(View.INVISIBLE);
                numbstoreys1.setVisibility(View.VISIBLE);
                break;
            case R.id.room1:
                rooms1.setText("1");
                s4 = "1";
                break;
            case R.id.room2:
                rooms1.setText("2");
                s4 = "2";
                break;
            case R.id.room3:
                rooms1.setText("3");
                s4 = "3";
                break;
            case R.id.numstoreys5:
                numbstoreys1.setText("1");
                s5 = "1";
                break;
            case R.id.numstoreys6:
                numbstoreys1.setText("2");
                s5 = "2";
                break;
            case R.id.numstoreys1:
                numbstoreys1.setText("3");
                s5 = "3";
                break;
            case R.id.numstoreys2:
                numbstoreys1.setText("4");
                s5 = "4";
                break;
            case R.id.numstoreys3:
                numbstoreys1.setText("5");
                s5 = "5";
                break;
            case R.id.numstoreys4:
                numbstoreys1.setText("6");
                s5 = "6";
                break;
            case R.id.floor1:
                floors1.setText("1");
                s6 = "1";
                break;
            case R.id.floor2:
                floors1.setText("2");
                s6 = "2";
                break;
            case R.id.floor3:
                floors1.setText("3");
                s6 = "3";
                break;
            case R.id.floor4:
                floors1.setText("4");
                s6 = "4";
                break;
            case R.id.floor5:
                floors1.setText("5");
                s6 = "5";
                break;
            case R.id.floor6:
                floors1.setText("6");
                s6 = "6";
                break;
            case R.id.typehouse1:
                typehouses1.setText("Дім");
                s7 = "Дім";
                break;
            case R.id.typehouse2:
                typehouses1.setText("Дача");
                s7 = "Дача";
                break;
            case R.id.typehouse3:
                typehouses1.setText("Котедж");
                s7 = "Котедж";
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        if (s2 == "Дніпро") {
            if (s3 == "Квартира") {
                if (s4 == "1") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/d/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/dnepr/?currency=UAH&search%5Bfilter_float_floor:from%5D=1&search%5Bfilter_float_floor:to%5D=1&search%5Bfilter_float_total_floors:from%5D=3&search%5Bfilter_float_total_floors:to%5D=3&search%5Bfilter_enum_number_of_rooms_string%5D%5B0%5D=odnokomnatnye");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/d/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/dnepr/?currency=UAH&search%5Bfilter_float_floor:from%5D=2&search%5Bfilter_float_floor:to%5D=2&search%5Bfilter_float_total_floors:from%5D=3&search%5Bfilter_float_total_floors:to%5D=3&search%5Bfilter_enum_number_of_rooms_string%5D%5B0%5D=odnokomnatnye");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/d/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/dnepr/?currency=UAH&search%5Bfilter_float_floor:from%5D=3&search%5Bfilter_float_floor:to%5D=3&search%5Bfilter_float_total_floors:from%5D=3&search%5Bfilter_float_total_floors:to%5D=3&search%5Bfilter_enum_number_of_rooms_string%5D%5B0%5D=odnokomnatnye");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/dnepr/?search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/dnepr/?search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/dnepr/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                }
            } else if (s3 == "Дім") {
                if (s4 == "1") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Коттедж") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/dnepr/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                }
            }
        } else if (s2 == "Запоріжжя") {
            if (s3 == "Квартира") {
                if (s4 == "1") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else {
                    if (s5 == "3") {
                        if (s5 == "3") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "4") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "5") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "4") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "6") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "4") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "5") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/zaporozhe/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        }
                    }
                }
            } else if (s3 == "Дім") {
                if (s4 == "1") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Коттедж") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                }

            } else {
                if (s7 == "Дім") {
                    if (s5 == "1") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "2") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "3") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "4") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "5") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    }
                } else if (s7 == "Дача") {
                    if (s5 == "1") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "2") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "3") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "4") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "5") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    }
                } else {
                    if (s5 == "1") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "2") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "3") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "4") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else if (s5 == "5") {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    } else {
                        webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/zaporozhe/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                        webview.setWebViewClient(new MyWebViewClient());
                    }
                }
            }
        } else if (s2 == "Миколаїв") {
            if (s3 == "Квартира") {
                if (s4 == "1") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else {
                    if (s5 == "3") {
                        if (s5 == "3") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "4") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "5") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "4") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "6") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "4") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "5") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/nikolaev_106/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        }
                    }
                }
            } else if (s3 == "Дім") {
                if (s4 == "1") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Коттедж") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/nikolaev_106/?search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                }
            }
        } else if (s2 == "Полтава") {
            if (s3 == "Квартира") {
                if (s4 == "1") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/poltava/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else {
                    if (s5 == "3") {
                        if (s5 == "3") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "4") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "5") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "4") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "6") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "4") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "5") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/poltava/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        }
                    }
                }
            } else if (s3 == "Дім") {
                if (s4 == "1") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Коттедж") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/poltava/?search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }


                    }
                }
            }
        } else if (s2 == "Харків") {
            if (s3 == "Квартира") {
                if (s4 == "1") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/1-komnata/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s5 == "3") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "4") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "5") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s5 == "6") {
                        if (s6 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s6 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/2-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else {
                    if (s5 == "3") {
                        if (s5 == "3") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "4") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "5") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "4") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        } else if (s5 == "6") {
                            if (s6 == "1") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=1&search%5Bfilter_float_floor%3Ato%5D=1&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "2") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=2&search%5Bfilter_float_floor%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "3") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Ato%5D=3&search%5Bfilter_float_floor%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "4") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=4&search%5Bfilter_float_floor%3Ato%5D=4&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else if (s6 == "5") {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=5&search%5Bfilter_float_floor%3Ato%5D=5&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            } else {
                                webview.loadUrl("https://www.olx.ua/nedvizhimost/kvartiry/dolgosrochnaya-arenda-kvartir/3-komnaty/kharkov/?search%5Bfilter_float_floor%3Afrom%5D=6&search%5Bfilter_float_floor%3Ato%5D=6&search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6");
                                webview.setWebViewClient(new MyWebViewClient());
                            }
                        }
                    }
                }
            } else if (s3 == "Дім") {
                if (s4 == "1") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=1&search%5Bfilter_float_number_of_rooms%3Ato%5D=1");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else if (s4 == "2") {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=2&search%5Bfilter_float_number_of_rooms%3Ato%5D=2");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    }
                } else {
                    if (s7 == "Дім") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dom/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else if (s7 == "Дача") {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/dacha/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }
                    } else {
                        if (s5 == "1") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=1&search%5Bfilter_float_total_floors%3Ato%5D=1&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "2") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=2&search%5Bfilter_float_total_floors%3Ato%5D=2&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "3") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=3&search%5Bfilter_float_total_floors%3Ato%5D=3&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "4") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=4&search%5Bfilter_float_total_floors%3Ato%5D=4&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else if (s5 == "5") {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=5&search%5Bfilter_float_total_floors%3Ato%5D=5&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        } else {
                            webview.loadUrl("https://www.olx.ua/nedvizhimost/doma/arenda-domov/kottedzh/kharkov/?search%5Bfilter_float_total_floors%3Afrom%5D=6&search%5Bfilter_float_total_floors%3Ato%5D=6&search%5Bfilter_float_number_of_rooms%3Afrom%5D=3&search%5Bfilter_float_number_of_rooms%3Ato%5D=3");
                            webview.setWebViewClient(new MyWebViewClient());
                        }

                    }
                }
            }
        }
    }
}




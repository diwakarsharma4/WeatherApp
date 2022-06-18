package com.diwakar.app.weather;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Today extends Fragment {

    EditText city;
    TextView timdat,ctname,temp,feelslike,wthrtype;
    ImageView img0;

    //mini
    TextView mntemp1,mntemp2,mntemp3,mntemp4,mntemp5,mntemp6,mntemp7,mntemp8,mntemp9,mntemp10,mntemp11,mntemp12,mntemp13,mntemp14,mntemp15,mntemp16,mntemp17,mntemp18,mntemp19,mntemp20,mntemp21,mntemp22,mntemp23,mntemp24,
            mntp1,mntp2,mntp3,mntp4,mntp5,mntp6,mntp7,mntp8,mntp9,mntp10,mntp11,mntp12,mntp13,mntp14,mntp15,mntp16,mntp17,mntp18,mntp19,mntp20,mntp21,mntp22,mntp23,mntp24;
    ImageView mnimg1,mnimg2,mnimg3,mnimg4,mnimg5,mnimg6,mnimg7,mnimg8,mnimg9,mnimg10,mnimg11,mnimg12,mnimg13,mnimg14,mnimg15,mnimg16,mnimg17,mnimg18,mnimg19,mnimg20,mnimg21,mnimg22,mnimg23,mnimg24;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_today, container, false);


       timdat = view.findViewById(R.id.timdat);
        ctname = view.findViewById(R.id.ctname);
        temp = view.findViewById(R.id.temp);
        feelslike = view.findViewById(R.id.feelslike);
        wthrtype = view.findViewById(R.id.wthrtype);
        img0 = view.findViewById(R.id.img0);

        //mini
        mntemp1 = view.findViewById(R.id.mntemp1);
        mntemp2 = view.findViewById(R.id.mntemp2);
        mntemp3 = view.findViewById(R.id.mntemp3);
        mntemp4 = view.findViewById(R.id.mntemp4);
        mntemp5 = view.findViewById(R.id.mntemp5);
        mntemp6 = view.findViewById(R.id.mntemp6);
        mntemp7 = view.findViewById(R.id.mntemp7);
        mntemp8 = view.findViewById(R.id.mntemp8);
        mntemp9 = view.findViewById(R.id.mntemp9);
        mntemp10 = view.findViewById(R.id.mntemp10);
        mntemp11 = view.findViewById(R.id.mntemp11);
        mntemp12 = view.findViewById(R.id.mntemp12);
        mntemp13 = view.findViewById(R.id.mntemp13);
        mntemp14 = view.findViewById(R.id.mntemp14);
        mntemp15 = view.findViewById(R.id.mntemp15);
        mntemp16 = view.findViewById(R.id.mntemp16);
        mntemp17 = view.findViewById(R.id.mntemp17);
        mntemp18 = view.findViewById(R.id.mntemp18);
        mntemp19 = view.findViewById(R.id.mntemp19);
        mntemp20 = view.findViewById(R.id.mntemp20);
        mntemp21 = view.findViewById(R.id.mntemp21);
        mntemp22 = view.findViewById(R.id.mntemp22);
        mntemp23 = view.findViewById(R.id.mntemp23);
        mntemp24 = view.findViewById(R.id.mntemp24);

        mntp1 = view.findViewById(R.id.mntp1);
        mntp2 = view.findViewById(R.id.mntp2);
        mntp3 = view.findViewById(R.id.mntp3);
        mntp4 = view.findViewById(R.id.mntp4);
        mntp5 = view.findViewById(R.id.mntp5);
        mntp6 = view.findViewById(R.id.mntp6);
        mntp7 = view.findViewById(R.id.mntp7);
        mntp8 = view.findViewById(R.id.mntp8);
        mntp9 = view.findViewById(R.id.mntp9);
        mntp10 = view.findViewById(R.id.mntp10);
        mntp11 = view.findViewById(R.id.mntp11);
        mntp12 = view.findViewById(R.id.mntp12);
        mntp13 = view.findViewById(R.id.mntp13);
        mntp14 = view.findViewById(R.id.mntp14);
        mntp15 = view.findViewById(R.id.mntp15);
        mntp16 = view.findViewById(R.id.mntp16);
        mntp17 = view.findViewById(R.id.mntp17);
        mntp18 = view.findViewById(R.id.mntp18);
        mntp19 = view.findViewById(R.id.mntp19);
        mntp20 = view.findViewById(R.id.mntp20);
        mntp21 = view.findViewById(R.id.mntp21);
        mntp22 = view.findViewById(R.id.mntp22);
        mntp23 = view.findViewById(R.id.mntp23);
        mntp24 = view.findViewById(R.id.mntp24);


        mnimg1 = view.findViewById(R.id.mnimg1);
        mnimg2 = view.findViewById(R.id.mnimg2);
        mnimg3 = view.findViewById(R.id.mnimg3);
        mnimg4 = view.findViewById(R.id.mnimg4);
        mnimg5 = view.findViewById(R.id.mnimg5);
        mnimg6 = view.findViewById(R.id.mnimg6);
        mnimg7 = view.findViewById(R.id.mnimg7);
        mnimg8 = view.findViewById(R.id.mnimg8);
        mnimg9 = view.findViewById(R.id.mnimg9);
        mnimg10 = view.findViewById(R.id.mnimg10);
        mnimg11 = view.findViewById(R.id.mnimg11);
        mnimg12 = view.findViewById(R.id.mnimg12);
        mnimg13 = view.findViewById(R.id.mnimg13);
        mnimg14 = view.findViewById(R.id.mnimg14);
        mnimg15 = view.findViewById(R.id.mnimg15);
        mnimg16 = view.findViewById(R.id.mnimg16);
        mnimg17 = view.findViewById(R.id.mnimg17);
        mnimg18 = view.findViewById(R.id.mnimg18);
        mnimg19 = view.findViewById(R.id.mnimg19);
        mnimg20 = view.findViewById(R.id.mnimg20);
        mnimg21 = view.findViewById(R.id.mnimg21);
        mnimg22 = view.findViewById(R.id.mnimg22);
        mnimg23 = view.findViewById(R.id.mnimg23);
        mnimg24 = view.findViewById(R.id.mnimg24);


        if(getArguments()!=null){
            String cityname = getArguments().getString("key");
            timdat.setText(cityname);


            RequestQueue queue = Volley.newRequestQueue(getActivity().getApplicationContext());
            String url = "https://api.weatherapi.com/v1/forecast.json?key=63282ae97e0345b3916122120211909&q="+cityname.toLowerCase()+"&days=7&aqi=no&alerts=no";
            JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null, new Response.Listener<JSONObject>() {

                @Override
                public void onResponse(JSONObject response) {

                    try {
                        JSONObject location = (JSONObject) response.get("location");

                        String dttm = location.getString("localtime");
                        timdat.setText(dttm);

                        String name= location.getString("name");
                        ctname.setText(name);

                        JSONObject current = (JSONObject) response.get("current");

                        String crrnttemp = current.getString("temp_c");
                        temp.setText(crrnttemp+" °C");

                        String feels = current.getString("feelslike_c");
                        feelslike.setText("Feels Like "+feels+" °C");

                        String imgurl = current.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl).into(img0);

                        String type = current.getJSONObject("condition").getString("text");
                        wthrtype.setText(type);

                        JSONArray mn = (JSONArray) response.getJSONObject("forecast").getJSONArray("forecastday").getJSONObject(0).getJSONArray("hour");

                        //1miniinfo
                        JSONObject mn1 = mn.getJSONObject(0);
                        String temp1 = mn1.getString("temp_c");
                        mntemp1.setText(temp1+" °C");

                        String imgurl1 = mn1.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl1).into(mnimg1);

                        String tp1 = mn1.getJSONObject("condition").getString("text");
                        mntp1.setText(tp1);

                        //2miniinfo
                        JSONObject mn2 = mn.getJSONObject(1);
                        String temp2 = mn2.getString("temp_c");
                        mntemp2.setText(temp2+" °C");

                        String imgurl2 = mn2.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl2).into(mnimg2);

                        String tp2 = mn2.getJSONObject("condition").getString("text");
                        mntp2.setText(tp2);

                        //3miniinfo
                        JSONObject mn3 = mn.getJSONObject(2);
                        String temp3 = mn1.getString("temp_c");
                        mntemp3.setText(temp3+" °C");

                        String imgurl3 = mn1.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl3).into(mnimg3);

                        String tp3 = mn3.getJSONObject("condition").getString("text");
                        mntp3.setText(tp3);

                        //4miniinfo
                        JSONObject mn4 = mn.getJSONObject(3);
                        String temp4 = mn4.getString("temp_c");
                        mntemp4.setText(temp4+" °C");

                        String imgurl4 = mn4.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl4).into(mnimg4);

                        String tp4 = mn4.getJSONObject("condition").getString("text");
                        mntp4.setText(tp4);

                        //5miniinfo
                        JSONObject mn5 = mn.getJSONObject(4);
                        String temp5 = mn5.getString("temp_c");
                        mntemp5.setText(temp5+" °C");

                        String imgurl5 = mn5.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl5).into(mnimg5);

                        String tp5 = mn5.getJSONObject("condition").getString("text");
                        mntp5.setText(tp5);

                        //6miniinfo
                        JSONObject mn6 = mn.getJSONObject(5);
                        String temp6 = mn6.getString("temp_c");
                        mntemp6.setText(temp6+" °C");

                        String imgurl6 = mn6.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl6).into(mnimg6);

                        String tp6 = mn6.getJSONObject("condition").getString("text");
                        mntp6.setText(tp6);

                        //7miniinfo
                        JSONObject mn7 = mn.getJSONObject(6);
                        String temp7 = mn7.getString("temp_c");
                        mntemp7.setText(temp7+" °C");

                        String imgurl7 = mn7.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl7).into(mnimg7);

                        String tp7 = mn7.getJSONObject("condition").getString("text");
                        mntp7.setText(tp7);

                        //8miniinfo
                        JSONObject mn8 = mn.getJSONObject(7);
                        String temp8 = mn8.getString("temp_c");
                        mntemp8.setText(temp8+" °C");

                        String imgurl8 = mn8.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl8).into(mnimg8);

                        String tp8 = mn8.getJSONObject("condition").getString("text");
                        mntp8.setText(tp8);

                        //9miniinfo
                        JSONObject mn9 = mn.getJSONObject(8);
                        String temp9 = mn9.getString("temp_c");
                        mntemp9.setText(temp9+" °C");

                        String imgurl9 = mn9.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl9).into(mnimg9);

                        String tp9 = mn9.getJSONObject("condition").getString("text");
                        mntp9.setText(tp9);

                        //10miniinfo
                        JSONObject mn10 = mn.getJSONObject(9);
                        String temp10 = mn10.getString("temp_c");
                        mntemp10.setText(temp10+" °C");

                        String imgurl10 = mn10.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl10).into(mnimg10);

                        String tp10 = mn10.getJSONObject("condition").getString("text");
                        mntp10.setText(tp10);

                        //11miniinfo
                        JSONObject mn11 = mn.getJSONObject(10);
                        String temp11 = mn11.getString("temp_c");
                        mntemp11.setText(temp11+" °C");

                        String imgurl11 = mn11.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl11).into(mnimg11);

                        String tp11 = mn11.getJSONObject("condition").getString("text");
                        mntp11.setText(tp11);

                        //12miniinfo
                        JSONObject mn12 = mn.getJSONObject(11);
                        String temp12 = mn12.getString("temp_c");
                        mntemp12.setText(temp12+" °C");

                        String imgurl12 = mn12.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl12).into(mnimg12);

                        String tp12 = mn12.getJSONObject("condition").getString("text");
                        mntp12.setText(tp12);

                        //13miniinfo
                        JSONObject mn13 = mn.getJSONObject(12);
                        String temp13 = mn13.getString("temp_c");
                        mntemp13.setText(temp13+" °C");

                        String imgurl13 = mn13.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl13).into(mnimg13);

                        String tp13 = mn13.getJSONObject("condition").getString("text");
                        mntp13.setText(tp13);

                        //miniinfo14
                        JSONObject mn14 = mn.getJSONObject(13);
                        String temp14 = mn14.getString("temp_c");
                        mntemp14.setText(temp14+" °C");

                        String imgurl14 = mn14.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl14).into(mnimg14);

                        String tp14 = mn14.getJSONObject("condition").getString("text");
                        mntp14.setText(tp14);

                        //15miniinfo
                        JSONObject mn15 = mn.getJSONObject(14);
                        String temp15 = mn15.getString("temp_c");
                        mntemp15.setText(temp15+" °C");

                        String imgurl15 = mn15.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl15).into(mnimg15);

                        String tp15 = mn15.getJSONObject("condition").getString("text");
                        mntp15.setText(tp15);

                        //16miniinfo
                        JSONObject mn16 = mn.getJSONObject(15);
                        String temp16 = mn16.getString("temp_c");
                        mntemp16.setText(temp16+" °C");

                        String imgurl16 = mn16.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl16).into(mnimg16);

                        String tp16 = mn16.getJSONObject("condition").getString("text");
                        mntp16.setText(tp16);

                        //17miniinfo
                        JSONObject mn17 = mn.getJSONObject(16);
                        String temp17 = mn17.getString("temp_c");
                        mntemp17.setText(temp17+" °C");

                        String imgurl17 = mn17.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl17).into(mnimg17);

                        String tp17 = mn17.getJSONObject("condition").getString("text");
                        mntp17.setText(tp17);

                        //18miniinfo
                        JSONObject mn18 = mn.getJSONObject(17);
                        String temp18 = mn18.getString("temp_c");
                        mntemp18.setText(temp18+" °C");

                        String imgurl18 = mn18.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl18).into(mnimg18);

                        String tp18 = mn18.getJSONObject("condition").getString("text");
                        mntp18.setText(tp18);

                        //19miniinfo
                        JSONObject mn19 = mn.getJSONObject(18);
                        String temp19 = mn19.getString("temp_c");
                        mntemp19.setText(temp19+" °C");

                        String imgurl19 = mn19.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl19).into(mnimg19);

                        String tp19 = mn19.getJSONObject("condition").getString("text");
                        mntp19.setText(tp19);

                        //20miniinfo
                        JSONObject mn20 = mn.getJSONObject(19);
                        String temp20 = mn20.getString("temp_c");
                        mntemp20.setText(temp20+" °C");

                        String imgurl20 = mn20.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl20).into(mnimg20);

                        String tp20 = mn20.getJSONObject("condition").getString("text");
                        mntp20.setText(tp20);

                        //21miniinfo
                        JSONObject mn21 = mn.getJSONObject(20);
                        String temp21 = mn21.getString("temp_c");
                        mntemp21.setText(temp21+" °C");

                        String imgurl21 = mn21.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl21).into(mnimg21);

                        String tp21 = mn21.getJSONObject("condition").getString("text");
                        mntp21.setText(tp21);

                        //22miniinfo
                        JSONObject mn22 = mn.getJSONObject(21);
                        String temp22 = mn22.getString("temp_c");
                        mntemp22.setText(temp22+" °C");

                        String imgurl22 = mn22.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl22).into(mnimg22);

                        String tp22 = mn22.getJSONObject("condition").getString("text");
                        mntp22.setText(tp22);

                        //23miniinfo
                        JSONObject mn23 = mn.getJSONObject(22);
                        String temp23 = mn23.getString("temp_c");
                        mntemp23.setText(temp23+" °C");

                        String imgurl23 = mn23.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl23).into(mnimg23);

                        String tp23 = mn23.getJSONObject("condition").getString("text");
                        mntp23.setText(tp23);

                        //24miniinfo
                        JSONObject mn24 = mn.getJSONObject(23);
                        String temp24 = mn24.getString("temp_c");
                        mntemp24.setText(temp24+" °C");

                        String imgurl24 = mn24.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl24).into(mnimg24);

                        String tp24 = mn24.getJSONObject("condition").getString("text");
                        mntp24.setText(tp24);


                    } catch (JSONException e) {
                        temp.setText(e.getMessage());
                        e.printStackTrace();
                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                    temp.setText(error.toString());
                    Toast.makeText(getActivity().getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
                }
            });
            queue.add(request);

        }
        return view;
    }
}
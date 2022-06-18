package com.diwakar.app.weather;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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


public class Tomorrow extends Fragment {

    TextView tmrtimdat,tmrctname,tmrtemp,tmrfeelslike,tmrwthrtype;
    ImageView tmrimg0;

    //mini
    TextView tmrmntemp1,tmrmntemp2,tmrmntemp3,tmrmntemp4,tmrmntemp5,tmrmntemp6,tmrmntemp7,tmrmntemp8,tmrmntemp9,tmrmntemp10,tmrmntemp11,tmrmntemp12,tmrmntemp13,tmrmntemp14,tmrmntemp15,tmrmntemp16,tmrmntemp17,tmrmntemp18,tmrmntemp19,tmrmntemp20,tmrmntemp21,tmrmntemp22,tmrmntemp23,tmrmntemp24,
            tmrmntp1,tmrmntp2,tmrmntp3,tmrmntp4,tmrmntp5,tmrmntp6,tmrmntp7,tmrmntp8,tmrmntp9,tmrmntp10,tmrmntp11,tmrmntp12,tmrmntp13,tmrmntp14,tmrmntp15,tmrmntp16,tmrmntp17,tmrmntp18,tmrmntp19,tmrmntp20,tmrmntp21,tmrmntp22,tmrmntp23,tmrmntp24;
    ImageView tmrmnimg1,tmrmnimg2,tmrmnimg3,tmrmnimg4,tmrmnimg5,tmrmnimg6,tmrmnimg7,tmrmnimg8,tmrmnimg9,tmrmnimg10,tmrmnimg11,tmrmnimg12,tmrmnimg13,tmrmnimg14,tmrmnimg15,tmrmnimg16,tmrmnimg17,tmrmnimg18,tmrmnimg19,tmrmnimg20,tmrmnimg21,tmrmnimg22,tmrmnimg23,tmrmnimg24;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_tomorrow, container, false);


        tmrtimdat = view.findViewById(R.id.tmrtimdat);
        tmrctname = view.findViewById(R.id.tmrctname);
        tmrtemp = view.findViewById(R.id.tmrtemp);
        tmrfeelslike = view.findViewById(R.id.tmrfeelslike);
        tmrwthrtype = view.findViewById(R.id.tmrwthrtype);
        tmrimg0 = view.findViewById(R.id.tmrimg0);

        //mini
        tmrmntemp1 = view.findViewById(R.id.tmrmntemp1);
        tmrmntemp2 = view.findViewById(R.id.tmrmntemp2);
        tmrmntemp3 = view.findViewById(R.id.tmrmntemp3);
        tmrmntemp4 = view.findViewById(R.id.tmrmntemp4);
        tmrmntemp5 = view.findViewById(R.id.tmrmntemp5);
        tmrmntemp6 = view.findViewById(R.id.tmrmntemp6);
        tmrmntemp7 = view.findViewById(R.id.tmrmntemp7);
        tmrmntemp8 = view.findViewById(R.id.tmrmntemp8);
        tmrmntemp9 = view.findViewById(R.id.tmrmntemp9);
        tmrmntemp10 = view.findViewById(R.id.tmrmntemp10);
        tmrmntemp11 = view.findViewById(R.id.tmrmntemp11);
        tmrmntemp12 = view.findViewById(R.id.tmrmntemp12);
        tmrmntemp13 = view.findViewById(R.id.tmrmntemp13);
        tmrmntemp14 = view.findViewById(R.id.tmrmntemp14);
        tmrmntemp15 = view.findViewById(R.id.tmrmntemp15);
        tmrmntemp16 = view.findViewById(R.id.tmrmntemp16);
        tmrmntemp17 = view.findViewById(R.id.tmrmntemp17);
        tmrmntemp18 = view.findViewById(R.id.tmrmntemp18);
        tmrmntemp19 = view.findViewById(R.id.tmrmntemp19);
        tmrmntemp20 = view.findViewById(R.id.tmrmntemp20);
        tmrmntemp21 = view.findViewById(R.id.tmrmntemp21);
        tmrmntemp22 = view.findViewById(R.id.tmrmntemp22);
        tmrmntemp23 = view.findViewById(R.id.tmrmntemp23);
        tmrmntemp24 = view.findViewById(R.id.tmrmntemp24);

        tmrmntp1 = view.findViewById(R.id.tmrmntp1);
        tmrmntp2 = view.findViewById(R.id.tmrmntp2);
        tmrmntp3 = view.findViewById(R.id.tmrmntp3);
        tmrmntp4 = view.findViewById(R.id.tmrmntp4);
        tmrmntp5 = view.findViewById(R.id.tmrmntp5);
        tmrmntp6 = view.findViewById(R.id.tmrmntp6);
        tmrmntp7 = view.findViewById(R.id.tmrmntp7);
        tmrmntp8 = view.findViewById(R.id.tmrmntp8);
        tmrmntp9 = view.findViewById(R.id.tmrmntp9);
        tmrmntp10 = view.findViewById(R.id.tmrmntp10);
        tmrmntp11 = view.findViewById(R.id.tmrmntp11);
        tmrmntp12 = view.findViewById(R.id.tmrmntp12);
        tmrmntp13 = view.findViewById(R.id.tmrmntp13);
        tmrmntp14 = view.findViewById(R.id.tmrmntp14);
        tmrmntp15 = view.findViewById(R.id.tmrmntp15);
        tmrmntp16 = view.findViewById(R.id.tmrmntp16);
        tmrmntp17 = view.findViewById(R.id.tmrmntp17);
        tmrmntp18 = view.findViewById(R.id.tmrmntp18);
        tmrmntp19 = view.findViewById(R.id.tmrmntp19);
        tmrmntp20 = view.findViewById(R.id.tmrmntp20);
        tmrmntp21 = view.findViewById(R.id.tmrmntp21);
        tmrmntp22 = view.findViewById(R.id.tmrmntp22);
        tmrmntp23 = view.findViewById(R.id.tmrmntp23);
        tmrmntp24 = view.findViewById(R.id.tmrmntp24);


        tmrmnimg1 = view.findViewById(R.id.tmrmnimg1);
        tmrmnimg2 = view.findViewById(R.id.tmrmnimg2);
        tmrmnimg3 = view.findViewById(R.id.tmrmnimg3);
        tmrmnimg4 = view.findViewById(R.id.tmrmnimg4);
        tmrmnimg5 = view.findViewById(R.id.tmrmnimg5);
        tmrmnimg6 = view.findViewById(R.id.tmrmnimg6);
        tmrmnimg7 = view.findViewById(R.id.tmrmnimg7);
        tmrmnimg8 = view.findViewById(R.id.tmrmnimg8);
        tmrmnimg9 = view.findViewById(R.id.tmrmnimg9);
        tmrmnimg10 = view.findViewById(R.id.tmrmnimg10);
        tmrmnimg11 = view.findViewById(R.id.tmrmnimg11);
        tmrmnimg12 = view.findViewById(R.id.tmrmnimg12);
        tmrmnimg13 = view.findViewById(R.id.tmrmnimg13);
        tmrmnimg14 = view.findViewById(R.id.tmrmnimg14);
        tmrmnimg15 = view.findViewById(R.id.tmrmnimg15);
        tmrmnimg16 = view.findViewById(R.id.tmrmnimg16);
        tmrmnimg17 = view.findViewById(R.id.tmrmnimg17);
        tmrmnimg18 = view.findViewById(R.id.tmrmnimg18);
        tmrmnimg19 = view.findViewById(R.id.tmrmnimg19);
        tmrmnimg20 = view.findViewById(R.id.tmrmnimg20);
        tmrmnimg21 = view.findViewById(R.id.tmrmnimg21);
        tmrmnimg22 = view.findViewById(R.id.tmrmnimg22);
        tmrmnimg23 = view.findViewById(R.id.tmrmnimg23);
        tmrmnimg24 = view.findViewById(R.id.tmrmnimg24);

        if(getArguments()!=null){
            String cityname = getArguments().getString("key");
            tmrtimdat.setText(cityname);

            RequestQueue queue = Volley.newRequestQueue(getActivity().getApplicationContext());
            String url = "https://api.weatherapi.com/v1/forecast.json?key=63282ae97e0345b3916122120211909&q="+cityname.toLowerCase()+"&days=7&aqi=no&alerts=no";
            JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null, new Response.Listener<JSONObject>() {

                @Override
                public void onResponse(JSONObject response) {

                    try {
                        JSONObject location = (JSONObject) response.get("location");

                        String dttm = location.getString("localtime");
                        tmrtimdat.setText(dttm);

                        String name= location.getString("name");
                        tmrctname.setText(name);

                        JSONObject current = (JSONObject) response.get("current");

                        String crrnttemp = current.getString("temp_c");
                        tmrtemp.setText(crrnttemp+" °C");

                        String feels = current.getString("feelslike_c");
                        tmrfeelslike.setText("Feels Like "+feels+" °C");

                        String imgurl = current.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl).into(tmrimg0);

                        String type = current.getJSONObject("condition").getString("text");
                        tmrwthrtype.setText(type);

                        JSONArray mn = (JSONArray) response.getJSONObject("forecast").getJSONArray("forecastday").getJSONObject(1).getJSONArray("hour");

                        //1miniinfo
                        JSONObject mn1 = mn.getJSONObject(0);
                        String temp1 = mn1.getString("temp_c");
                        tmrmntemp1.setText(temp1+" °C");

                        String imgurl1 = mn1.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl1).into(tmrmnimg1);

                        String tp1 = mn1.getJSONObject("condition").getString("text");
                        tmrmntp1.setText(tp1);

                        //2miniinfo
                        JSONObject mn2 = mn.getJSONObject(1);
                        String temp2 = mn2.getString("temp_c");
                        tmrmntemp2.setText(temp2+" °C");

                        String imgurl2 = mn2.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl2).into(tmrmnimg2);

                        String tp2 = mn2.getJSONObject("condition").getString("text");
                        tmrmntp2.setText(tp2);

                        //3miniinfo
                        JSONObject mn3 = mn.getJSONObject(2);
                        String temp3 = mn1.getString("temp_c");
                        tmrmntemp3.setText(temp3+" °C");

                        String imgurl3 = mn1.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl3).into(tmrmnimg3);

                        String tp3 = mn3.getJSONObject("condition").getString("text");
                        tmrmntp3.setText(tp3);

                        //4miniinfo
                        JSONObject mn4 = mn.getJSONObject(3);
                        String temp4 = mn4.getString("temp_c");
                        tmrmntemp4.setText(temp4+" °C");

                        String imgurl4 = mn4.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl4).into(tmrmnimg4);

                        String tp4 = mn4.getJSONObject("condition").getString("text");
                        tmrmntp4.setText(tp4);

                        //5miniinfo
                        JSONObject mn5 = mn.getJSONObject(4);
                        String temp5 = mn5.getString("temp_c");
                        tmrmntemp5.setText(temp5+" °C");

                        String imgurl5 = mn5.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl5).into(tmrmnimg5);

                        String tp5 = mn5.getJSONObject("condition").getString("text");
                        tmrmntp5.setText(tp5);

                        //6miniinfo
                        JSONObject mn6 = mn.getJSONObject(5);
                        String temp6 = mn6.getString("temp_c");
                        tmrmntemp6.setText(temp6+" °C");

                        String imgurl6 = mn6.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl6).into(tmrmnimg6);

                        String tp6 = mn6.getJSONObject("condition").getString("text");
                        tmrmntp6.setText(tp6);

                        //7miniinfo
                        JSONObject mn7 = mn.getJSONObject(6);
                        String temp7 = mn7.getString("temp_c");
                        tmrmntemp7.setText(temp7+" °C");

                        String imgurl7 = mn7.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl7).into(tmrmnimg7);

                        String tp7 = mn7.getJSONObject("condition").getString("text");
                        tmrmntp7.setText(tp7);

                        //8miniinfo
                        JSONObject mn8 = mn.getJSONObject(7);
                        String temp8 = mn8.getString("temp_c");
                        tmrmntemp8.setText(temp8+" °C");

                        String imgurl8 = mn8.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl8).into(tmrmnimg8);

                        String tp8 = mn8.getJSONObject("condition").getString("text");
                        tmrmntp8.setText(tp8);

                        //9miniinfo
                        JSONObject mn9 = mn.getJSONObject(8);
                        String temp9 = mn9.getString("temp_c");
                        tmrmntemp9.setText(temp9+" °C");

                        String imgurl9 = mn9.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl9).into(tmrmnimg9);

                        String tp9 = mn9.getJSONObject("condition").getString("text");
                        tmrmntp9.setText(tp9);

                        //10miniinfo
                        JSONObject mn10 = mn.getJSONObject(9);
                        String temp10 = mn10.getString("temp_c");
                        tmrmntemp10.setText(temp10+" °C");

                        String imgurl10 = mn10.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl10).into(tmrmnimg10);

                        String tp10 = mn10.getJSONObject("condition").getString("text");
                        tmrmntp10.setText(tp10);

                        //11miniinfo
                        JSONObject mn11 = mn.getJSONObject(10);
                        String temp11 = mn11.getString("temp_c");
                        tmrmntemp11.setText(temp11+" °C");

                        String imgurl11 = mn11.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl11).into(tmrmnimg11);

                        String tp11 = mn11.getJSONObject("condition").getString("text");
                        tmrmntp11.setText(tp11);

                        //12miniinfo
                        JSONObject mn12 = mn.getJSONObject(11);
                        String temp12 = mn12.getString("temp_c");
                        tmrmntemp12.setText(temp12+" °C");

                        String imgurl12 = mn12.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl12).into(tmrmnimg12);

                        String tp12 = mn12.getJSONObject("condition").getString("text");
                        tmrmntp12.setText(tp12);

                        //13miniinfo
                        JSONObject mn13 = mn.getJSONObject(12);
                        String temp13 = mn13.getString("temp_c");
                        tmrmntemp13.setText(temp13+" °C");

                        String imgurl13 = mn13.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl13).into(tmrmnimg13);

                        String tp13 = mn13.getJSONObject("condition").getString("text");
                        tmrmntp13.setText(tp13);

                        //miniinfo14
                        JSONObject mn14 = mn.getJSONObject(13);
                        String temp14 = mn14.getString("temp_c");
                        tmrmntemp14.setText(temp14+" °C");

                        String imgurl14 = mn14.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl14).into(tmrmnimg14);

                        String tp14 = mn14.getJSONObject("condition").getString("text");
                        tmrmntp14.setText(tp14);

                        //15miniinfo
                        JSONObject mn15 = mn.getJSONObject(14);
                        String temp15 = mn15.getString("temp_c");
                        tmrmntemp15.setText(temp15+" °C");

                        String imgurl15 = mn15.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl15).into(tmrmnimg15);

                        String tp15 = mn15.getJSONObject("condition").getString("text");
                        tmrmntp15.setText(tp15);

                        //16miniinfo
                        JSONObject mn16 = mn.getJSONObject(15);
                        String temp16 = mn16.getString("temp_c");
                        tmrmntemp16.setText(temp16+" °C");

                        String imgurl16 = mn16.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl16).into(tmrmnimg16);

                        String tp16 = mn16.getJSONObject("condition").getString("text");
                        tmrmntp16.setText(tp16);

                        //17miniinfo
                        JSONObject mn17 = mn.getJSONObject(16);
                        String temp17 = mn17.getString("temp_c");
                        tmrmntemp17.setText(temp17+" °C");

                        String imgurl17 = mn17.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl17).into(tmrmnimg17);

                        String tp17 = mn17.getJSONObject("condition").getString("text");
                        tmrmntp17.setText(tp17);

                        //18miniinfo
                        JSONObject mn18 = mn.getJSONObject(17);
                        String temp18 = mn18.getString("temp_c");
                        tmrmntemp18.setText(temp18+" °C");

                        String imgurl18 = mn18.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl18).into(tmrmnimg18);

                        String tp18 = mn18.getJSONObject("condition").getString("text");
                        tmrmntp18.setText(tp18);

                        //19miniinfo
                        JSONObject mn19 = mn.getJSONObject(18);
                        String temp19 = mn19.getString("temp_c");
                        tmrmntemp19.setText(temp19+" °C");

                        String imgurl19 = mn19.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl19).into(tmrmnimg19);

                        String tp19 = mn19.getJSONObject("condition").getString("text");
                        tmrmntp19.setText(tp19);

                        //20miniinfo
                        JSONObject mn20 = mn.getJSONObject(19);
                        String temp20 = mn20.getString("temp_c");
                        tmrmntemp20.setText(temp20+" °C");

                        String imgurl20 = mn20.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl20).into(tmrmnimg20);

                        String tp20 = mn20.getJSONObject("condition").getString("text");
                        tmrmntp20.setText(tp20);

                        //21miniinfo
                        JSONObject mn21 = mn.getJSONObject(20);
                        String temp21 = mn21.getString("temp_c");
                        tmrmntemp21.setText(temp21+" °C");

                        String imgurl21 = mn21.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl21).into(tmrmnimg21);

                        String tp21 = mn21.getJSONObject("condition").getString("text");
                        tmrmntp21.setText(tp21);

                        //22miniinfo
                        JSONObject mn22 = mn.getJSONObject(21);
                        String temp22 = mn22.getString("temp_c");
                        tmrmntemp22.setText(temp22+" °C");

                        String imgurl22 = mn22.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl22).into(tmrmnimg22);

                        String tp22 = mn22.getJSONObject("condition").getString("text");
                        tmrmntp22.setText(tp22);

                        //23miniinfo
                        JSONObject mn23 = mn.getJSONObject(22);
                        String temp23 = mn23.getString("temp_c");
                        tmrmntemp23.setText(temp23+" °C");

                        String imgurl23 = mn23.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl23).into(tmrmnimg23);

                        String tp23 = mn23.getJSONObject("condition").getString("text");
                        tmrmntp23.setText(tp23);

                        //24miniinfo
                        JSONObject mn24 = mn.getJSONObject(23);
                        String temp24 = mn24.getString("temp_c");
                        tmrmntemp24.setText(temp24+" °C");

                        String imgurl24 = mn24.getJSONObject("condition").getString("icon");
                        Picasso.get().load("https:"+imgurl24).into(tmrmnimg24);

                        String tp24 = mn24.getJSONObject("condition").getString("text");
                        tmrmntp24.setText(tp24);


                    } catch (JSONException e) {
                        tmrtemp.setText(e.getMessage());
                        e.printStackTrace();
                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                    tmrtemp.setText(error.toString());
                    Toast.makeText(getActivity().getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
                }
            });
            queue.add(request);
        }
        return view;
    }

}
package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Two extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        initData();
        adapter();
    }

    private List<String> datas;
    private void initData() {
        datas = new ArrayList<>();
        datas.add("Android应用程序开发");
        datas.add("移动应用程序测试");
        datas.add("高等数学");
        datas.add("高职英语");
        datas.add("Java程序设计语言");
        datas.add("Android游戏开发");
        datas.add("心理健康");
        datas.add("体育");

    }

    private void adapter() {
        listView = findViewById(R.id.lv_list);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                datas
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = (String) parent.getItemAtPosition(position);
                if ("Android应用程序开发".equals(data)){
                    Intent intent = new Intent(Two.this,Three.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","《Android应用开发》为Android应用开发的入门课程，以深入浅出、循序渐进的方式讲述Android开发，并且结合实际例子讲解各个知识点。主要内容包括：机器部署；Java和XML简介；使用Eclipse的高效开发；应用框架概览；UI和图形设计；添加交互；内容提供程序、Intent、IntentFilter；用Java和XML基础知识构建高级应用等。");
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else if ("移动应用程序测试".equals(data)){
                    Intent intent = new Intent(Two.this,Three.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","移动应用测试是指对移动应用进行测试，包括自动化测试和人工测试等。");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("高等数学".equals(data)){
                    Intent intent = new Intent(Two.this,Three.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","广义地说，初等数学之外的数学都是高等数学，也有将中学较深入的代数、几何以及简单的集合论初步、逻辑初步称为中等数学的，将其作为中小学阶段的初等数学与大学阶段的高等数学的过渡。");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("高职英语".equals(data)){
                    Intent intent = new Intent(Two.this,Three.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","《高职英语》力图囊括高职学生毕业后在实际工作中可能用上的英语，力求以更多的、较为实用的“行业英语”知识来武装学生，使学生所学即所用。当前，许多高职院校使用的英语教材或注重英语语言知识的训练，或偏重应付各种等级考试，而与学生毕业后的实际工作有较大的距离，使得学生所学并非所用，偏离了高职教育的方向。");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("Java程序设计语言".equals(data)){
                    Intent intent = new Intent(Two.this,Three.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","Java语言是一种目前正在全世界得到迅速传播与广泛应用的面向对象的计算机程序设计语言。本书共分三篇17章。基础篇介绍了Java作为一种程序设计语言所具有的基本组成、语法规则、例外和线程等内容。");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("Android游戏开发".equals(data)){
                    Intent intent = new Intent(Two.this,Three.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","本书讨论如何将pc 上的3d 游戏移植到android 平台。作者从必备的技能和软件工具入手，逐步介绍如何从头构建纯java 游戏，如何混合使用opengl 3d 图形和jni，并以真实的pc 游戏wolfenstein 3d和doom 为例，介绍如何融合java 的优雅设计和c 的强大功能，使混合游戏达到最佳性能。");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("心理健康".equals(data)){
                    Intent intent = new Intent(Two.this,Three.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","心理健康是指心理的各个方面及活动过程处于一种良好或正常的状态。心理健康的理想状态是保持性格完美、智力正常、认知正确、情感适当、意志合理、态度积极、行为恰当、适应良好的状态。");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }else if ("体育".equals(data)){
                    Intent intent = new Intent(Two.this,Three.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("class","体育（physical education，缩写PE或P.E.），是一种复杂的社会文化现象，它以身体与智力活动为基本手段，根据人体生长发育、技能形成和机能提高等规律，达到促进全面发育、提高身体素质与全面教育水平、增强体质与提高运动能力、改善生活方式与提高生活质量的一种有意识、有目的、有组织的社会活动。");
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
            }
        });
    }
}
